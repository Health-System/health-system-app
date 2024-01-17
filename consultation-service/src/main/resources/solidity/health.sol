pragma solidity ^0.8.0;

contract HealthPlatform {
    address public administrator;
    mapping(address => bool) public doctors;
    mapping(address => bool) public patients;

    struct MedicalRecord {
        uint256 recordId;
        address patient;
        string diagnosis;
        string prescription;
    }

    mapping(uint256 => MedicalRecord) public medicalRecords;
    uint256 public recordCount;

    struct Appointment {
        uint256 appointmentId;
        address doctor;
        address patient;
        uint256 timestamp;
        bool completed;
    }

    mapping(uint256 => Appointment) public appointments;
    uint256 public appointmentCount;

    modifier onlyAdministrator() {
        require(msg.sender == administrator, "Only administrator can call this function");
        _;
    }

    modifier onlyDoctor() {
        require(doctors[msg.sender], "Only doctors can call this function");
        _;
    }

    modifier onlyPatient() {
        require(patients[msg.sender], "Only patients can call this function");
        _;
    }

    constructor() public{
        administrator = msg.sender;
    }

    function addDoctor(address _doctor) public onlyAdministrator {
        doctors[_doctor] = true;
    }

    function addPatient(address _patient) public onlyAdministrator {
        patients[_patient] = true;
    }

    function addMedicalRecord(address _patient, string memory _diagnosis, string memory _prescription) public onlyDoctor {
        recordCount++;
        medicalRecords[recordCount] = MedicalRecord(recordCount, _patient, _diagnosis, _prescription);
    }

    function scheduleAppointment(address _doctor, address _patient, uint256 _timestamp) public onlyDoctor {
        appointmentCount++;
        appointments[appointmentCount] = Appointment(appointmentCount, _doctor, _patient, _timestamp, false);
    }

    function completeAppointment(uint256 _appointmentId) public onlyDoctor {
        appointments[_appointmentId].completed = true;
    }
}