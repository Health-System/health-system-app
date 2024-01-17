package ma.ensias;


import ma.ensias.contracts.HealthPlatform;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.RawTransactionManager;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.Transfer;
import org.web3j.utils.Convert;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Main {

    private final static String PRIVATE_KEY = "0xe181af94aa8da83ae8e60c7a1217c7ff39b1d2af09ec4cb5554ca7928352f076";
    private final static BigInteger GAS_LIMIT = BigInteger.valueOf(6721975L);
    private final static BigInteger GAS_PRICE = BigInteger.valueOf(20000000000L);
    private final static String RECIPIENT = "0x858553C306114dcF727BE8db8EC308f330c15760";

//    private final static String CONTRACT_ADDRESS = "";



    public static void main(String[] args) throws Exception {


        try {
            new Main();
        } catch (Exception e) {
            e.printStackTrace();
        }

//        Credentials credentials = getCredentialsFromPrivateKey();
//
//
//        Web3j web3j = Web3j.build(new HttpService());
//        TransactionManager transactionManager = new RawTransactionManager(
//                web3j,
//                getCredentialsFromPrivateKey()
//        );
//
//        String deployed = new Main().deployContract(web3j, credentials);
//
//        System.out.println(deployed);

    }


    private Main() throws Exception {
        Web3j web3j = Web3j.build(new HttpService());

        Credentials credentials = getCredentialsFromPrivateKey();

//        HealthPlatform healthPlatform = loadContract(CONTRACT_ADDRESS, web3j, credentials);

        TransactionManager transactionManager = new RawTransactionManager(
                web3j,
                getCredentialsFromPrivateKey()
        );

        String deployed = deployContract(web3j, credentials);

        System.out.println(deployed);
    }



    private void transferEthereum(Web3j web3j, Credentials credentials) throws Exception {
        TransactionManager transactionManager = new RawTransactionManager(
                web3j,
                credentials
        );

        Transfer transfer = new Transfer(web3j, transactionManager);

        TransactionReceipt transactionReceipt = transfer.sendFunds(
                RECIPIENT,
                BigDecimal.ONE,
                Convert.Unit.ETHER,
                GAS_PRICE,
                GAS_LIMIT
        ).send();

        System.out.print("Transaction = " + transactionReceipt.getTransactionHash());
    }




    private static Credentials getCredentialsFromPrivateKey() {
        return Credentials.create(PRIVATE_KEY);
    }


    private String deployContract(Web3j web3j, Credentials credentials) throws Exception {
        return HealthPlatform.deploy(web3j, credentials,GAS_PRICE, GAS_LIMIT)
                .send()
                .getContractAddress();
    }


//    private HealthPlatform loadContract(String contractAddress, Web3j web3j, Credentials credentials) {
//        return HealthPlatform.load(contractAddress, web3j, credentials, gasProvider);
//    }


}