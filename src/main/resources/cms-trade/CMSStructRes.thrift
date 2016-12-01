include "CMSDataType.thrift"
include "CMSStructReq.thrift"
namespace java cn.kkworld.futuresservice.cmsTrade
namespace cpp cmsapi

/**
 * 响应参数结构体定义文件
 *
 */
 
///登录请求响应
struct UserLoginResponse {
    ///用户登录应答
    1:CMSStructReq.CThostFtdcRspUserLoginField cThostFtdcRspUserLoginField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///登出请求响应
struct UserLogoutResponse {
    ///用户登出请求
    1:CMSStructReq.CThostFtdcUserLogoutField cThostFtdcUserLogoutField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///错误应答
struct ErrorResponse {
    ///响应信息
    1:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    2:i32 nRequestID;
    3:bool bIsLast;
}

///订阅行情应答
struct SubMarketDataResponse {
    ///指定的合约
    1:CMSStructReq.CThostFtdcSpecificInstrumentField cThostFtdcSpecificInstrumentField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}
 
///客户端认证响应
struct AuthenticateFieldResponse {
    ///客户端认证响应
    1:CMSStructReq.CThostFtdcRspAuthenticateField cThostFtdcRspAuthenticateField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///用户口令更新请求响应
struct UserPasswordUpdateFieldResponse {
    ///用户口令变更
    1:CMSStructReq.CThostFtdcUserPasswordUpdateField cThostFtdcUserPasswordUpdateField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///资金账户口令更新请求响应
struct TradingAccountPasswordUpdateFieldResponse {
    ///资金账户口令变更域
    1:CMSStructReq.CThostFtdcTradingAccountPasswordUpdateField cThostFtdcTradingAccountPasswordUpdateField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}


///报单录入请求响应
struct InputOrderFieldResponse {
    ///输入报单
    1:CMSStructReq.CThostFtdcInputOrderField cThostFtdcInputOrderField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///预埋单录入请求响应
struct ParkedOrderFieldResponse {
    ///预埋单
    1:CMSStructReq.CThostFtdcParkedOrderField cThostFtdcParkedOrderField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///预埋撤单录入请求响应
struct ParkedOrderActionFieldResponse {
    ///输入预埋单操作
    1:CMSStructReq.CThostFtdcParkedOrderActionField cThostFtdcParkedOrderActionField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///报单操作请求响应
struct InputOrderActionFieldResponse {
    ///输入报单操作
    1:CMSStructReq.CThostFtdcInputOrderActionField cThostFtdcInputOrderActionField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///查询最大报单数量响应
struct QueryMaxOrderVolumeFieldResponse {
    ///查询最大报单数量
    1:CMSStructReq.CThostFtdcQueryMaxOrderVolumeField cThostFtdcQueryMaxOrderVolumeField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///投资者结算结果确认响应
struct SettlementInfoConfirmFieldResponse {
    ///投资者结算结果确认信息
    1:CMSStructReq.CThostFtdcSettlementInfoConfirmField cThostFtdcSettlementInfoConfirmField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///删除预埋单响应
struct RemoveParkedOrderFieldResponse {
    ///删除预埋单
    1:CMSStructReq.CThostFtdcRemoveParkedOrderField cThostFtdcRemoveParkedOrderField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///删除预埋撤单响应
struct RemoveParkedOrderActionFieldResponse {
    ///删除预埋撤单
    1:CMSStructReq.CThostFtdcRemoveParkedOrderActionField cThostFtdcRemoveParkedOrderActionField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///执行宣告录入请求响应
struct InputExecOrderFieldResponse {
    ///输入的执行宣告
    1:CMSStructReq.CThostFtdcInputExecOrderField CThostFtdcInputExecOrderField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///执行宣告操作请求响应
struct InputExecOrderActionFieldResponse {
    ///输入执行宣告操作
    1:CMSStructReq.CThostFtdcInputExecOrderActionField cThostFtdcInputExecOrderActionField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///询价录入请求响应
struct InputForQuoteFieldResponse {
    ///输入的询价
    1:CMSStructReq.CThostFtdcInputForQuoteField cThostFtdcInputForQuoteField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///报价录入请求响应
struct InputQuoteFieldResponse {
    ///输入的报价
    1:CMSStructReq.CThostFtdcInputQuoteField CThostFtdcInputQuoteField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///报价操作请求响应
struct InputQuoteActionFieldResponse {
    ///输入报价操作
    1:CMSStructReq.CThostFtdcInputQuoteActionField cThostFtdcInputQuoteActionField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询报单响应
struct OrderFieldResponse {
    ///报单
    1:CMSStructReq.CThostFtdcOrderField cThostFtdcOrderField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询成交响应
struct TradeFieldResponse {
    ///成交
    1:CMSStructReq.CThostFtdcTradeField cThostFtdcTradeField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询投资者持仓响应
struct InvestorPositionFieldResponse {
    ///投资者持仓
    1:CMSStructReq.CThostFtdcInvestorPositionField cThostFtdcInvestorPositionField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询资金账户响应
struct TradingAccountFieldResponse {
    ///资金账户
    1:CMSStructReq.CThostFtdcTradingAccountField cThostFtdcTradingAccountField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询投资者响应
struct InvestorFieldResponse {
    ///投资者
    1:CMSStructReq.CThostFtdcInvestorField cThostFtdcInvestorField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询交易编码响应
struct TradingCodeFieldResponse {
    ///交易编码
    1:CMSStructReq.CThostFtdcTradingCodeField cThostFtdcTradingCodeField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询合约保证金率响应
struct InstrumentMarginRateFieldResponse {
    ///合约保证金率
    1:CMSStructReq.CThostFtdcInstrumentMarginRateField cThostFtdcInstrumentMarginRateField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询合约手续费率响应
struct InstrumentCommissionRateFieldResponse {
    ///合约手续费率
    1:CMSStructReq.CThostFtdcInstrumentCommissionRateField cThostFtdcInstrumentCommissionRateField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询交易所响应
struct ExchangeFieldResponse {
    ///交易所
    1:CMSStructReq.CThostFtdcExchangeField cThostFtdcExchangeField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询产品响应
struct ProductFieldResponse {
    ///产品
    1:CMSStructReq.CThostFtdcProductField cThostFtdcProductField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询合约响应
struct InstrumentFieldResponse {
    ///合约
    1:CMSStructReq.CThostFtdcInstrumentField cThostFtdcInstrumentField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询行情响应
struct DepthMarketDataFieldResponse {
    ///深度行情
    1:CMSStructReq.CThostFtdcDepthMarketDataField cThostFtdcDepthMarketDataField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询投资者结算结果响应
struct SettlementInfoFieldResponse {
    ///投资者结算结果
    1:CMSStructReq.CThostFtdcSettlementInfoField cThostFtdcSettlementInfoField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询转帐银行响应
struct TransferBankFieldResponse {
    ///转帐银行
    1:CMSStructReq.CThostFtdcTransferBankField cThostFtdcTransferBankField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询投资者持仓明细响应
struct InvestorPositionDetailFieldResponse {
    ///转帐银行
    1:CMSStructReq.CThostFtdcInvestorPositionDetailField cThostFtdcInvestorPositionDetailField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询客户通知响应
struct NoticeFieldResponse {
    ///客户通知
    1:CMSStructReq.CThostFtdcNoticeField cThostFtdcNoticeField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询投资者组合持仓明细响应
struct InvestorPositionCombineDetailFieldResponse {
    ///投资者组合持仓明细
    1:CMSStructReq.CThostFtdcInvestorPositionCombineDetailField cThostFtdcInvestorPositionCombineDetailField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///查询保证金监管系统经纪公司资金账户密钥响应
struct CFMMCTradingAccountKeyFieldResponse {
    ///保证金监管系统经纪公司资金账户密钥
    1:CMSStructReq.CThostFtdcCFMMCTradingAccountKeyField cThostFtdcCFMMCTradingAccountKeyField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询仓单折抵信息响应
struct EWarrantOffsetFieldResponse {
    ///仓单折抵信息
    1:CMSStructReq.CThostFtdcEWarrantOffsetField cThostFtdcEWarrantOffsetField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询投资者品种/跨品种保证金响应
struct InvestorProductGroupMarginFieldResponse {
    ///投资者品种/跨品种保证金
    1:CMSStructReq.CThostFtdcInvestorProductGroupMarginField cThostFtdcInvestorProductGroupMarginField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询交易所保证金率响应
struct ExchangeMarginRateFieldResponse {
    ///交易所保证金率
    1:CMSStructReq.CThostFtdcExchangeMarginRateField cThostFtdcExchangeMarginRateField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询交易所调整保证金率响应
struct ExchangeMarginRateAdjustFieldResponse {
    ///交易所保证金率调整
    1:CMSStructReq.CThostFtdcExchangeMarginRateAdjustField cThostFtdcExchangeMarginRateAdjustField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询汇率响应
struct ExchangeRateFieldResponse {
    ///交易所保证金率调整
    1:CMSStructReq.CThostFtdcExchangeRateField cThostFtdcExchangeRateField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询二级代理操作员银期权限响应
struct SecAgentACIDMapFieldResponse {
    ///二级代理操作员银期权限
    1:CMSStructReq.CThostFtdcSecAgentACIDMapField cThostFtdcSecAgentACIDMapField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询期权交易成本响应
struct OptionInstrTradeCostFieldResponse {
    ///期权交易成本
    1:CMSStructReq.CThostFtdcOptionInstrTradeCostField cThostFtdcOptionInstrTradeCostField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询期权合约手续费响应
struct OptionInstrCommRateFieldResponse {
    ///当前期权合约手续费的详细内容
    1:CMSStructReq.CThostFtdcOptionInstrCommRateField cThostFtdcOptionInstrCommRateField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询执行宣告响应
struct ExecOrderFieldResponse {
    ///执行宣告
    1:CMSStructReq.CThostFtdcExecOrderField cThostFtdcExecOrderField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询询价响应
struct ForQuoteFieldResponse {
    ///询价
    1:CMSStructReq.CThostFtdcForQuoteField cThostFtdcForQuoteField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询报价响应
struct QuoteFieldResponse {
    ///报价
    1:CMSStructReq.CThostFtdcQuoteField cThostFtdcQuoteField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询转帐流水响应
struct TransferSerialFieldResponse {
    ///银期转账交易流水表
    1:CMSStructReq.CThostFtdcTransferSerialField cThostFtdcTransferSerialField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询银期签约关系响应
struct AccountregisterFieldResponse {
    ///客户开销户信息表
    1:CMSStructReq.CThostFtdcAccountregisterField cThostFtdcAccountregisterField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///报单录入错误回报
struct InputOrderFieldErrResponse {
    ///报单录入请求响应
    1:CMSStructReq.CThostFtdcInputOrderField cThostFtdcInputOrderField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
}

///报单操作错误回报
struct OrderActionFieldResponse {
    ///报单操作
    1:CMSStructReq.CThostFtdcOrderActionField cThostFtdcOrderActionField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
}

///执行宣告录入错误回报
struct InputExecOrderFieldErrResponse {
    ///输入的执行宣告
    1:CMSStructReq.CThostFtdcInputExecOrderField cThostFtdcInputExecOrderField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
}

///执行宣告录入错误回报
struct ExecOrderActionFieldResponse {
    ///执行宣告操作
    1:CMSStructReq.CThostFtdcExecOrderActionField cThostFtdcExecOrderActionField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
}

///询价录入错误回报
struct InputForQuoteFieldErrResponse {
    ///输入的询价
    1:CMSStructReq.CThostFtdcInputForQuoteField cThostFtdcInputForQuoteField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
}

///报价录入错误回报
struct InputQuoteFieldErrResponse {
    ///输入的报价
    1:CMSStructReq.CThostFtdcInputQuoteField cThostFtdcInputQuoteField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
}

///报价操作错误回报
struct QuoteActionFieldResponse {
    ///报价操作
    1:CMSStructReq.CThostFtdcQuoteActionField cThostFtdcQuoteActionField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
}

///请求查询签约银行响应
struct ContractBankFieldResponse {
    ///查询签约银行响应
    1:CMSStructReq.CThostFtdcContractBankField cThostFtdcContractBankField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询交易通知响应
struct TradingNoticeFieldResponse {
    ///用户事件通知
    1:CMSStructReq.CThostFtdcTradingNoticeField cThostFtdcTradingNoticeField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询经纪公司交易参数响应
struct BrokerTradingParamsFieldResponse {
    ///经纪公司交易参数
    1:CMSStructReq.CThostFtdcBrokerTradingParamsField cThostFtdcBrokerTradingParamsField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询经纪公司交易算法响应
struct BrokerTradingAlgosFieldResponse {
    ///经纪公司交易算法
    1:CMSStructReq.CThostFtdcBrokerTradingAlgosField cThostFtdcBrokerTradingAlgosField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///请求查询监控中心用户令牌
struct QueryCFMMCTradingAccountTokenFieldResponse {
    ///查询监控中心用户令牌
    1:CMSStructReq.CThostFtdcQueryCFMMCTradingAccountTokenField cThostFtdcQueryCFMMCTradingAccountTokenField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///期货发起银行资金转期货错误回报/期货发起期货资金转银行错误回报
struct ReqTransferFieldErrResponse {
    ///转账请求
    1:CMSStructReq.CThostFtdcReqTransferField cThostFtdcReqTransferField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
}

///系统运行时期货端手工发起冲正银行转期货错误回报/系统运行时期货端手工发起冲正期货转银行错误回报
struct ReqRepealFieldResponse {
    ///冲正请求
    1:CMSStructReq.CThostFtdcReqRepealField cThostFtdcReqRepealField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
}

///期货发起查询银行余额错误回报
struct ReqQueryAccountFieldErrResponse {
    ///查询账户信息请求
    1:CMSStructReq.CThostFtdcReqQueryAccountField cThostFtdcReqQueryAccountField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
}

///期货发起银行资金转期货应答/期货发起期货资金转银行应答
struct ReqTransferFieldResponse {
    ///转账请求
    1:CMSStructReq.CThostFtdcReqTransferField cThostFtdcReqTransferField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;
}

///期货发起查询银行余额应答
struct ReqQueryAccountFieldResponse {
    ///查询账户信息请求
    1:CMSStructReq.CThostFtdcReqQueryAccountField cThostFtdcReqQueryAccountField;
    ///响应信息
    2:CMSStructReq.CThostFtdcRspInfoField cThostFtdcRspInfoField;
    3:i32 nRequestID;
    4:bool bIsLast;    
}


