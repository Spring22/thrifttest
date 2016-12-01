include "CMSStructReq.thrift"

namespace java cn.kkworld.futuresservice.cmsTrade
namespace cpp cmsapi

service TraderPart2Service {

	//CThostFtdcTraderApi part two
    i32 reqQryNotice(1:CMSStructReq.CThostFtdcQryNoticeField pQryNotice, 2:i32 nRequestID),
    i32 reqQrySettlementInfoConfirm(1:CMSStructReq.CThostFtdcQrySettlementInfoConfirmField pQrySettlementInfoConfirm, 2:i32 nRequestID),
    i32 reqQryInvestorPositionCombineDetail(1:CMSStructReq.CThostFtdcQryInvestorPositionCombineDetailField pQryInvestorPositionCombineDetail, 2:i32 nRequestID),
    i32 reqQryCFMMCTradingAccountKey(1:CMSStructReq.CThostFtdcQryCFMMCTradingAccountKeyField pQryCFMMCTradingAccountKey, 2:i32 nRequestID),
    i32 reqQryEWarrantOffset(1:CMSStructReq.CThostFtdcQryEWarrantOffsetField pQryEWarrantOffset, 2:i32 nRequestID),
    i32 reqQryInvestorProductGroupMargin(1:CMSStructReq.CThostFtdcQryInvestorProductGroupMarginField pQryInvestorProductGroupMargin, 2:i32  nRequestID),
    i32 reqQryExchangeMarginRate(1:CMSStructReq.CThostFtdcQryExchangeMarginRateField pQryExchangeMarginRate,  2:i32 nRequestID),
    i32 reqQryExchangeMarginRateAdjust(1:CMSStructReq.CThostFtdcQryExchangeMarginRateAdjustField pQryExchangeMarginRateAdjust, 2:i32 nRequestID),
    i32 reqQryExchangeRate(1:CMSStructReq.CThostFtdcQryExchangeRateField pQryExchangeRate, 2:i32 nRequestID),
    i32 reqQrySecAgentACIDMap(1:CMSStructReq.CThostFtdcQrySecAgentACIDMapField pQrySecAgentACIDMap, 2:i32 nRequestID),
    i32 reqQryOptionInstrTradeCost(1:CMSStructReq.CThostFtdcQryOptionInstrTradeCostField pQryOptionInstrTradeCost, 2:i32 nRequestID),
    i32 reqQryOptionInstrCommRate(1:CMSStructReq.CThostFtdcQryOptionInstrCommRateField pQryOptionInstrCommRate, 2:i32 nRequestID),
    i32 reqQryExecOrder(1:CMSStructReq.CThostFtdcQryExecOrderField pQryExecOrder, 2:i32 nRequestID),
    i32 reqQryForQuote(1:CMSStructReq.CThostFtdcQryForQuoteField pQryForQuote, 2:i32 nRequestID),
    i32 reqQryQuote(1:CMSStructReq.CThostFtdcQryQuoteField pQryQuote, 2:i32 nRequestID),
    i32 reqQryTransferSerial(1:CMSStructReq.CThostFtdcQryTransferSerialField pQryTransferSerial, 2:i32 nRequestID),
    i32 reqQryAccountregister(1:CMSStructReq.CThostFtdcQryAccountregisterField pQryAccountregister, 2:i32 nRequestID),
    i32 reqQryContractBank(1:CMSStructReq.CThostFtdcQryContractBankField pQryContractBank, 2:i32 nRequestID),
    i32 reqQryParkedOrder(1:CMSStructReq.CThostFtdcQryParkedOrderField pQryParkedOrder, 2:i32 nRequestID),
    i32 reqQryParkedOrderAction(1:CMSStructReq.CThostFtdcQryParkedOrderActionField pQryParkedOrderAction,  2:i32 nRequestID),
    i32 reqQryTradingNotice(1:CMSStructReq.CThostFtdcQryTradingNoticeField pQryTradingNotice, 2:i32 nRequestID),
    i32 reqQryBrokerTradingParams(1:CMSStructReq.CThostFtdcQryBrokerTradingParamsField pQryBrokerTradingParams, 2:i32 nRequestID),
    i32 reqQryBrokerTradingAlgos(1:CMSStructReq.CThostFtdcQryBrokerTradingAlgosField pQryBrokerTradingAlgos, 2:i32 nRequestID),
    i32 reqQueryCFMMCTradingAccountToken(1:CMSStructReq.CThostFtdcQueryCFMMCTradingAccountTokenField pQueryCFMMCTradingAccountToken, 2:i32 nRequestID),
    i32 reqFromBankToFutureByFuture(1:CMSStructReq.CThostFtdcReqTransferField pReqTransfer, 2:i32 nRequestID),
    i32 reqFromFutureToBankByFuture(1:CMSStructReq.CThostFtdcReqTransferField pReqTransfer, 2:i32 nRequestID),
    i32 reqQueryBankAccountMoneyByFuture(1:CMSStructReq.CThostFtdcReqQueryAccountField pReqQueryAccount, 2:i32 nRequestID)

}