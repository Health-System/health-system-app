package ma.ensias.contracts;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
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
    private static final String BINARY = "608060405234801561000f575f80fd5b505f80546001600160a01b03191633179055610a778061002e5f395ff3fe608060405234801561000f575f80fd5b50600436106100b1575f3560e01c80637b2c72e31161006e5780637b2c72e3146101cb578063900407bc146101de578063a9583c22146101f5578063aa0ced9014610217578063eebc3fb21461022a578063f53d0a8e14610233575f80fd5b80630869cfbc146100b557806312dc9013146100ec5780634095b1171461016d5780634780468f146101825780636d263ceb146101955780637564a13c146101a8575b5f80fd5b6100d76100c336600461064c565b60026020525f908152604090205460ff1681565b60405190151581526020015b60405180910390f35b6101376100fa36600461066c565b60056020525f90815260409020805460018201546002830154600384015460049094015492936001600160a01b0392831693929091169160ff1685565b604080519586526001600160a01b039485166020870152929093169184019190915260608301521515608082015260a0016100e3565b61018061017b36600461066c565b61025d565b005b61018061019036600461064c565b6102b1565b6101806101a336600461064c565b610300565b6101bb6101b636600461066c565b61034c565b6040516100e394939291906106c6565b6101806101d936600461070c565b61048a565b6101e760045481565b6040519081526020016100e3565b6100d761020336600461064c565b60016020525f908152604090205460ff1681565b6101806102253660046107e2565b610564565b6101e760065481565b5f54610245906001600160a01b031681565b6040516001600160a01b0390911681526020016100e3565b335f9081526001602052604090205460ff166102945760405162461bcd60e51b815260040161028b90610851565b60405180910390fd5b5f908152600560205260409020600401805460ff19166001179055565b5f546001600160a01b031633146102da5760405162461bcd60e51b815260040161028b90610894565b6001600160a01b03165f908152600160208190526040909120805460ff19169091179055565b5f546001600160a01b031633146103295760405162461bcd60e51b815260040161028b90610894565b6001600160a01b03165f908152600260205260409020805460ff19166001179055565b60036020525f908152604090208054600182015460028301805492936001600160a01b039092169261037d906108dd565b80601f01602080910402602001604051908101604052809291908181526020018280546103a9906108dd565b80156103f45780601f106103cb576101008083540402835291602001916103f4565b820191905f5260205f20905b8154815290600101906020018083116103d757829003601f168201915b505050505090806003018054610409906108dd565b80601f0160208091040260200160405190810160405280929190818152602001828054610435906108dd565b80156104805780601f1061045757610100808354040283529160200191610480565b820191905f5260205f20905b81548152906001019060200180831161046357829003601f168201915b5050505050905084565b335f9081526001602052604090205460ff166104b85760405162461bcd60e51b815260040161028b90610851565b60068054905f6104c783610915565b90915550506040805160a0810182526006548082526001600160a01b039586166020808401918252958716838501908152606084019586525f608085018181529381526005909752939095209151825593516001820180546001600160a01b031990811692881692909217905591516002820180549093169516949094179055516003830155516004909101805460ff1916911515919091179055565b335f9081526001602052604090205460ff166105925760405162461bcd60e51b815260040161028b90610851565b60048054905f6105a183610915565b9091555050604080516080810182526004548082526001600160a01b038681166020808501918252848601888152606086018890525f9485526003909152949092208351815591516001830180546001600160a01b03191691909216179055915190919060028201906106149082610985565b50606082015160038201906106299082610985565b505050505050565b80356001600160a01b0381168114610647575f80fd5b919050565b5f6020828403121561065c575f80fd5b61066582610631565b9392505050565b5f6020828403121561067c575f80fd5b5035919050565b5f81518084525f5b818110156106a75760208185018101518683018201520161068b565b505f602082860101526020601f19601f83011685010191505092915050565b8481526001600160a01b03841660208201526080604082018190525f906106ef90830185610683565b82810360608401526107018185610683565b979650505050505050565b5f805f6060848603121561071e575f80fd5b61072784610631565b925061073560208501610631565b9150604084013590509250925092565b634e487b7160e01b5f52604160045260245ffd5b5f82601f830112610768575f80fd5b813567ffffffffffffffff8082111561078357610783610745565b604051601f8301601f19908116603f011681019082821181831017156107ab576107ab610745565b816040528381528660208588010111156107c3575f80fd5b836020870160208301375f602085830101528094505050505092915050565b5f805f606084860312156107f4575f80fd5b6107fd84610631565b9250602084013567ffffffffffffffff80821115610819575f80fd5b61082587838801610759565b9350604086013591508082111561083a575f80fd5b5061084786828701610759565b9150509250925092565b60208082526023908201527f4f6e6c7920646f63746f72732063616e2063616c6c20746869732066756e637460408201526234b7b760e91b606082015260800190565b60208082526029908201527f4f6e6c792061646d696e6973747261746f722063616e2063616c6c207468697360408201526810333ab731ba34b7b760b91b606082015260800190565b600181811c908216806108f157607f821691505b60208210810361090f57634e487b7160e01b5f52602260045260245ffd5b50919050565b5f6001820161093257634e487b7160e01b5f52601160045260245ffd5b5060010190565b601f82111561098057805f5260205f20601f840160051c8101602085101561095e5750805b601f840160051c820191505b8181101561097d575f815560010161096a565b50505b505050565b815167ffffffffffffffff81111561099f5761099f610745565b6109b3816109ad84546108dd565b84610939565b602080601f8311600181146109e6575f84156109cf5750858301515b5f19600386901b1c1916600185901b178555610629565b5f85815260208120601f198616915b82811015610a14578886015182559484019460019091019084016109f5565b5085821015610a3157878501515f19600388901b60f8161c191681555b5050505050600190811b0190555056fea2646970667358221220d5051bbcf7b1cc696a7cdb71109ce337651182716e130e32b0ae3a89b1aa21bc64736f6c63430008170033";

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
    protected HealthPlatform(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected HealthPlatform(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected HealthPlatform(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected HealthPlatform(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
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
