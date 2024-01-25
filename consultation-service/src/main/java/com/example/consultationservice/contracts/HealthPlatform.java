package com.example.consultationservice.contracts;

import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.6.0.
 */


public class HealthPlatform extends Contract {
    private static final String BINARY = "608060405234801561001057600080fd5b50336000806101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506111ea806100606000396000f3fe608060405234801561001057600080fd5b50600436106100b45760003560e01c80637b2c72e3116100715780637b2c72e3146101a4578063900407bc146101c0578063a9583c22146101de578063aa0ced901461020e578063eebc3fb21461022a578063f53d0a8e14610248576100b4565b80630869cfbc146100b957806312dc9013146100e95780634095b1171461011d5780634780468f146101395780636d263ceb146101555780637564a13c14610171575b600080fd5b6100d360048036038101906100ce9190610bdd565b610266565b6040516100e09190610e4a565b60405180910390f35b61010360048036038101906100fe9190610cd4565b610286565b604051610114959493929190610ec0565b60405180910390f35b61013760048036038101906101329190610cd4565b610309565b005b610153600480360381019061014e9190610bdd565b6103c7565b005b61016f600480360381019061016a9190610bdd565b6104af565b005b61018b60048036038101906101869190610cd4565b610598565b60405161019b9493929190610f13565b60405180910390f35b6101be60048036038101906101b99190610c06565b6106f8565b005b6101c86108d3565b6040516101d59190610ea5565b60405180910390f35b6101f860048036038101906101f39190610bdd565b6108d9565b6040516102059190610e4a565b60405180910390f35b61022860048036038101906102239190610c55565b6108f9565b005b610232610a7e565b60405161023f9190610ea5565b60405180910390f35b610250610a84565b60405161025d9190610e2f565b60405180910390f35b60026020528060005260406000206000915054906101000a900460ff1681565b60056020528060005260406000206000915090508060000154908060010160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff16908060020160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff16908060030154908060040160009054906101000a900460ff16905085565b600160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff16610395576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161038c90610e65565b60405180910390fd5b60016005600083815260200190815260200160002060040160006101000a81548160ff02191690831515021790555050565b60008054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff1614610455576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161044c90610e85565b60405180910390fd5b60018060008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060006101000a81548160ff02191690831515021790555050565b60008054906101000a900473ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff163373ffffffffffffffffffffffffffffffffffffffff161461053d576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161053490610e85565b60405180910390fd5b6001600260008373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060006101000a81548160ff02191690831515021790555050565b60036020528060005260406000206000915090508060000154908060010160009054906101000a900473ffffffffffffffffffffffffffffffffffffffff16908060020180546105e79061106d565b80601f01602080910402602001604051908101604052809291908181526020018280546106139061106d565b80156106605780601f1061063557610100808354040283529160200191610660565b820191906000526020600020905b81548152906001019060200180831161064357829003601f168201915b5050505050908060030180546106759061106d565b80601f01602080910402602001604051908101604052809291908181526020018280546106a19061106d565b80156106ee5780601f106106c3576101008083540402835291602001916106ee565b820191906000526020600020905b8154815290600101906020018083116106d157829003601f168201915b5050505050905084565b600160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff16610784576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161077b90610e65565b60405180910390fd5b600660008154809291906107979061109f565b91905055506040518060a0016040528060065481526020018473ffffffffffffffffffffffffffffffffffffffff1681526020018373ffffffffffffffffffffffffffffffffffffffff168152602001828152602001600015158152506005600060065481526020019081526020016000206000820151816000015560208201518160010160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff16021790555060408201518160020160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506060820151816003015560808201518160040160006101000a81548160ff021916908315150217905550905050505050565b60045481565b60016020528060005260406000206000915054906101000a900460ff1681565b600160003373ffffffffffffffffffffffffffffffffffffffff1673ffffffffffffffffffffffffffffffffffffffff16815260200190815260200160002060009054906101000a900460ff16610985576040517f08c379a000000000000000000000000000000000000000000000000000000000815260040161097c90610e65565b60405180910390fd5b600460008154809291906109989061109f565b9190505550604051806080016040528060045481526020018473ffffffffffffffffffffffffffffffffffffffff168152602001838152602001828152506003600060045481526020019081526020016000206000820151816000015560208201518160010160006101000a81548173ffffffffffffffffffffffffffffffffffffffff021916908373ffffffffffffffffffffffffffffffffffffffff1602179055506040820151816002019080519060200190610a58929190610aa8565b506060820151816003019080519060200190610a75929190610aa8565b50905050505050565b60065481565b60008054906101000a900473ffffffffffffffffffffffffffffffffffffffff1681565b828054610ab49061106d565b90600052602060002090601f016020900481019282610ad65760008555610b1d565b82601f10610aef57805160ff1916838001178555610b1d565b82800160010185558215610b1d579182015b82811115610b1c578251825591602001919060010190610b01565b5b509050610b2a9190610b2e565b5090565b5b80821115610b47576000816000905550600101610b2f565b5090565b6000610b5e610b5984610f97565b610f66565b905082815260208101848484011115610b7657600080fd5b610b8184828561102b565b509392505050565b600081359050610b9881611186565b92915050565b600082601f830112610baf57600080fd5b8135610bbf848260208601610b4b565b91505092915050565b600081359050610bd78161119d565b92915050565b600060208284031215610bef57600080fd5b6000610bfd84828501610b89565b91505092915050565b600080600060608486031215610c1b57600080fd5b6000610c2986828701610b89565b9350506020610c3a86828701610b89565b9250506040610c4b86828701610bc8565b9150509250925092565b600080600060608486031215610c6a57600080fd5b6000610c7886828701610b89565b935050602084013567ffffffffffffffff811115610c9557600080fd5b610ca186828701610b9e565b925050604084013567ffffffffffffffff811115610cbe57600080fd5b610cca86828701610b9e565b9150509250925092565b600060208284031215610ce657600080fd5b6000610cf484828501610bc8565b91505092915050565b610d0681610fe3565b82525050565b610d1581610ff5565b82525050565b6000610d2682610fc7565b610d308185610fd2565b9350610d4081856020860161103a565b610d4981611175565b840191505092915050565b6000610d61602383610fd2565b91507f4f6e6c7920646f63746f72732063616e2063616c6c20746869732066756e637460008301527f696f6e00000000000000000000000000000000000000000000000000000000006020830152604082019050919050565b6000610dc7602983610fd2565b91507f4f6e6c792061646d696e6973747261746f722063616e2063616c6c207468697360008301527f2066756e6374696f6e00000000000000000000000000000000000000000000006020830152604082019050919050565b610e2981611021565b82525050565b6000602082019050610e446000830184610cfd565b92915050565b6000602082019050610e5f6000830184610d0c565b92915050565b60006020820190508181036000830152610e7e81610d54565b9050919050565b60006020820190508181036000830152610e9e81610dba565b9050919050565b6000602082019050610eba6000830184610e20565b92915050565b600060a082019050610ed56000830188610e20565b610ee26020830187610cfd565b610eef6040830186610cfd565b610efc6060830185610e20565b610f096080830184610d0c565b9695505050505050565b6000608082019050610f286000830187610e20565b610f356020830186610cfd565b8181036040830152610f478185610d1b565b90508181036060830152610f5b8184610d1b565b905095945050505050565b6000604051905081810181811067ffffffffffffffff82111715610f8d57610f8c611146565b5b8060405250919050565b600067ffffffffffffffff821115610fb257610fb1611146565b5b601f19601f8301169050602081019050919050565b600081519050919050565b600082825260208201905092915050565b6000610fee82611001565b9050919050565b60008115159050919050565b600073ffffffffffffffffffffffffffffffffffffffff82169050919050565b6000819050919050565b82818337600083830152505050565b60005b8381101561105857808201518184015260208101905061103d565b83811115611067576000848401525b50505050565b6000600282049050600182168061108557607f821691505b6020821081141561109957611098611117565b5b50919050565b60006110aa82611021565b91507fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff8214156110dd576110dc6110e8565b5b600182019050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052601160045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b6000601f19601f8301169050919050565b61118f81610fe3565b811461119a57600080fd5b50565b6111a681611021565b81146111b157600080fd5b5056fea2646970667358221220e5fb17d4eaaf734d18778955c57b9a5a285816b3ca8e58bee8f216c2ac1d4aee64736f6c63430008000033";

    public static final String FUNC_ADDDOCTOR = "addDoctor";

    public static final String FUNC_ADDMEDICALRECORD = "addMedicalRecord";

    public static final String FUNC_ADDPATIENT = "addPatient";

    public static final String FUNC_ADMINISTRATOR = "administrator";

    public static final String FUNC_APPOINTMENTCOUNT = "appointmentCount";

    public static final String FUNC_APPOINTMENTS = "appointments";

    public static final String FUNC_COMPLETEAPPOINTMENT = "completeAppointment";

    public static final String FUNC_DOCTORS = "doctors";

    public static final String FUNC_MEDICALRECORDS = "medicalRecords";

    public static final String FUNC_PATIENTS = "patients";

    public static final String FUNC_RECORDCOUNT = "recordCount";

    public static final String FUNC_SCHEDULEAPPOINTMENT = "scheduleAppointment";


    @Deprecated
    public HealthPlatform(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public HealthPlatform(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    public HealthPlatform(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public HealthPlatform(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<HealthPlatform> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(HealthPlatform.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    public static RemoteCall<HealthPlatform> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(HealthPlatform.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<HealthPlatform> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(HealthPlatform.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<HealthPlatform> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(HealthPlatform.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public RemoteCall<TransactionReceipt> addDoctor(String _doctor) {
        final Function function = new Function(
                FUNC_ADDDOCTOR, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_doctor)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> addMedicalRecord(String _patient, String _diagnosis, String _prescription) {
        final Function function = new Function(
                FUNC_ADDMEDICALRECORD, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_patient), 
                new org.web3j.abi.datatypes.Utf8String(_diagnosis), 
                new org.web3j.abi.datatypes.Utf8String(_prescription)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> addPatient(String _patient) {
        final Function function = new Function(
                FUNC_ADDPATIENT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_patient)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> administrator() {
        final Function function = new Function(
                FUNC_ADMINISTRATOR, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> appointmentCount() {
        final Function function = new Function(
                FUNC_APPOINTMENTCOUNT, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> appointments(BigInteger param0) {
        final Function function = new Function(
                FUNC_APPOINTMENTS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> completeAppointment(BigInteger _appointmentId) {
        final Function function = new Function(
                FUNC_COMPLETEAPPOINTMENT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(_appointmentId)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> doctors(String param0) {
        final Function function = new Function(
                FUNC_DOCTORS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(param0)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> medicalRecords(BigInteger param0) {
        final Function function = new Function(
                FUNC_MEDICALRECORDS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.generated.Uint256(param0)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> patients(String param0) {
        final Function function = new Function(
                FUNC_PATIENTS, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(param0)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> recordCount() {
        final Function function = new Function(
                FUNC_RECORDCOUNT, 
                Arrays.<Type>asList(), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<TransactionReceipt> scheduleAppointment(String _doctor, String _patient, BigInteger _timestamp) {
        final Function function = new Function(
                FUNC_SCHEDULEAPPOINTMENT, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Address(_doctor), 
                new org.web3j.abi.datatypes.Address(_patient), 
                new org.web3j.abi.datatypes.generated.Uint256(_timestamp)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static HealthPlatform load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new HealthPlatform(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static HealthPlatform load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new HealthPlatform(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static HealthPlatform load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new HealthPlatform(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static HealthPlatform load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new HealthPlatform(contractAddress, web3j, transactionManager, contractGasProvider);
    }
}
