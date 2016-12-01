include "CMSStructReq.thrift"
include "CMSTrader2Api.thrift"

namespace java cn.kkworld.futuresservice.cmsTrade
namespace cpp cmsapi

service TraderPart1Service extends CMSTrader2Api.TraderPart2Service{

	//CThostFtdcTraderApi part one
    void release(),
    void init(),
    i32 join(),
    string getTradingDay(),
    void registerFront(1:string pszFrontAddress),
    void registerNameServer(1:string pszNsAddress),
    void registerFensUserInfo(1:CMSStructReq.CThostFtdcFensUserInfoField pFensUserInfo),
	  i32 reqAuthenticate(1:CMSStructReq.CThostFtdcReqAuthenticateField pReqAuthenticateField,2:i32 nRequestID),
	  i32 reqUserLogin(1:CMSStructReq.CThostFtdcReqUserLoginField pReqUserLoginField,2:i32 nRequestID),
	  i32 reqUserLogout(1:CMSStructReq.CThostFtdcUserLogoutField pUserLogout,2:i32 nRequestID),
	  i32 reqUserPasswordUpdate(1:CMSStructReq.CThostFtdcUserPasswordUpdateField pUserPasswordUpdate,2:i32 nRequestID),
	  i32 reqTradingAccountPasswordUpdate(1:CMSStructReq.CThostFtdcTradingAccountPasswordUpdateField pTradingAccountPasswordUpdate, 2:i32 nRequestID),
	  i32 reqOrderInsert(1:CMSStructReq.CThostFtdcInputOrderField pInputOrder, 2:i32 nRequestID),
	  i32 reqParkedOrderInsert(1:CMSStructReq.CThostFtdcParkedOrderField pParkedOrder, 2:i32 nRequestID),
	  i32 reqParkedOrderAction(1:CMSStructReq.CThostFtdcParkedOrderActionField pParkedOrderAction, 2:i32 nRequestID),
	  i32 reqOrderAction(1:CMSStructReq.CThostFtdcInputOrderActionField pInputOrderAction, 2:i32 nRequestID),
	  i32 reqQueryMaxOrderVolume(1:CMSStructReq.CThostFtdcQueryMaxOrderVolumeField pQueryMaxOrderVolume, 2:i32  nRequestID),
	  i32 reqSettlementInfoConfirm(1:CMSStructReq.CThostFtdcSettlementInfoConfirmField pSettlementInfoConfirm, 2:i32 nRequestID),
	  i32 reqRemoveParkedOrder(1:CMSStructReq.CThostFtdcRemoveParkedOrderField pRemoveParkedOrder, 2:i32 nRequestID),
	  i32 reqRemoveParkedOrderAction(1:CMSStructReq.CThostFtdcRemoveParkedOrderActionField pRemoveParkedOrderAction, 2:i32 nRequestID),
	  i32 reqExecOrderInsert(1:CMSStructReq.CThostFtdcInputExecOrderField pInputExecOrder, 2:i32 nRequestID),
	  i32 reqExecOrderAction(1:CMSStructReq.CThostFtdcInputExecOrderActionField pInputExecOrderAction, 2:i32 nRequestID),
	  i32 reqForQuoteInsert(1:CMSStructReq.CThostFtdcInputForQuoteField pInputForQuote, 2:i32 nRequestID),
	  i32 reqQuoteInsert(1:CMSStructReq.CThostFtdcInputQuoteField pInputQuote, 2:i32 nRequestID),
	  i32 reqQuoteAction(1:CMSStructReq.CThostFtdcInputQuoteActionField pInputQuoteAction, 2:i32 nRequestID),
	  i32 reqQryOrder(1:CMSStructReq.CThostFtdcQryOrderField pQryOrder, 2:i32 nRequestID),
	  i32 reqQryTrade(1:CMSStructReq.CThostFtdcQryTradeField pQryTrade, 2:i32 nRequestID),
	  i32 reqQryInvestorPosition(1:CMSStructReq.CThostFtdcQryInvestorPositionField pQryInvestorPosition, 2:i32 nRequestID),
	  i32 reqQryTradingAccount(1:CMSStructReq.CThostFtdcQryTradingAccountField pQryTradingAccount, 2:i32 nRequestID),
	  i32 reqQryInvestor(1:CMSStructReq.CThostFtdcQryInvestorField pQryInvestor,  2:i32 nRequestID),
	  i32 reqQryTradingCode(1:CMSStructReq.CThostFtdcQryTradingCodeField pQryTradingCode,  2:i32 nRequestID),
	  i32 reqQryInstrumentMarginRate(1:CMSStructReq.CThostFtdcQryInstrumentMarginRateField pQryInstrumentMarginRate, 2:i32 nRequestID),
	  i32 reqQryInstrumentCommissionRate(1:CMSStructReq.CThostFtdcQryInstrumentCommissionRateField pQryInstrumentCommissionRate,  2:i32 nRequestID),
	  i32 reqQryExchange(1:CMSStructReq.CThostFtdcQryExchangeField pQryExchange, 2:i32 nRequestID),
	  i32 reqQryProduct(1:CMSStructReq.CThostFtdcQryProductField pQryProduct, 2:i32 nRequestID),
	  i32 reqQryInstrument(1:CMSStructReq.CThostFtdcQryInstrumentField pQryInstrument, 2:i32 nRequestID),
	  i32 reqQryDepthMarketData(1:CMSStructReq.CThostFtdcQryDepthMarketDataField pQryDepthMarketData, 2:i32 nRequestID),
	  i32 reqQrySettlementInfo(1:CMSStructReq.CThostFtdcQrySettlementInfoField pQrySettlementInfo, 2:i32 nRequestID),
	  i32 reqQryTransferBank(1:CMSStructReq.CThostFtdcQryTransferBankField pQryTransferBank, 2:i32 nRequestID),
	  i32 reqQryInvestorPositionDetail(1:CMSStructReq.CThostFtdcQryInvestorPositionDetailField pQryInvestorPositionDetail, 2:i32 nRequestID),

}