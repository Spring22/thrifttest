import cn.kkworld.futuresservice.cmsTrade.CMSApi;
import cn.kkworld.futuresservice.cmsTrade.CThostFtdcQryInstrumentField;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;

/**
 * Created by Administrator on 2016/10/18 0018.
 */
public class ThriftTestA {

    public static void main(String[] args){
        cmsTest();
    }

    private static void cmsTest() {
        int iRequestID = 0;
        int result = 0;
        try {
            TSocket socket = new TSocket("127.0.0.1", 9095);
//            TTransport transport = new TFramedTransport(socket);
            TProtocol protocol = new TBinaryProtocol(socket);
            CMSApi.Client client = new CMSApi.Client(protocol);
            socket.open();
            //1.创建登陆对象
            cn.kkworld.futuresservice.cmsTrade.CThostFtdcReqUserLoginField loginField = new cn.kkworld.futuresservice.cmsTrade.CThostFtdcReqUserLoginField();
            loginField.setTradingDay("");
            //正式环境账号
//            String investorID = "10900129";
//            String brokerID = "0089";
//            String password = "860625";
            //simnow仿真交易账号
//            String investorID = "069116";
//            String brokerID = "9999";
//            String password = "123456";
            //测试环境账号
//            String investorID = "1111";
//            String brokerID = "8000";
//            String password = "1111";
            //金瑞
            String investorID = "1608006";
            String brokerID = "8888";
            String password = "123456";

            loginField.setUserID(investorID);
            loginField.setBrokerID(brokerID); //经济公司ID
            loginField.setPassword(password);
//            client.init();
            Thread.sleep(1000);
//          调用登陆方法
            result = client.reqUserLogin(loginField, ++iRequestID);
            socket.setTimeout(1000);    //毫秒级
            System.out.println("reqUserLogin:"+result);
            Thread.sleep(5000);
//            System.out.println("version:"+ client.getApiVersion());
            //请求查询合约
            CThostFtdcQryInstrumentField instrumentField = new CThostFtdcQryInstrumentField();
            instrumentField.setInstrumentID("");
            result = client.reqQryInstrument(instrumentField, ++iRequestID);
            System.out.println("reqQryInstrument:"+ result);
//            //查询用户持仓
//            CThostFtdcQryInvestorPositionField positionField = new CThostFtdcQryInvestorPositionField();
//            positionField.setBrokerID(brokerID);
//            positionField.setInvestorID(investorID);
//            positionField.setInstrumentID("c1701");
//            result = client.reqQryInvestorPosition(positionField, ++iRequestID);
//            System.out.println("reqQryInvestorPosition:" + result);
//            //查询用户资金账户
//            cn.kkworld.futuresservice.cmsTrade.CThostFtdcQryTradingAccountField tradingAccountField = new cn.kkworld.futuresservice.cmsTrade.CThostFtdcQryTradingAccountField();
//            tradingAccountField.setBrokerID(brokerID);
//            tradingAccountField.setInvestorID(investorID);
//            tradingAccountField.setCurrencyID("CNY");
//            result = client.reqQryTradingAccount(tradingAccountField, ++iRequestID);
            System.out.println("reqQryTradingAccount:" + result);
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
