include "CMSDataType.thrift"

namespace java cn.kkworld.futuresservice.cmsTrade
namespace cpp cmsapi

/**
 * 请求参数结构体定义文件
 *
 */

///信息分发
struct CThostFtdcDisseminationField {
    //序列系列号
    1: CMSDataType.TThostFtdcSequenceSeriesType sequenceSeries;
    //序列号
    2: CMSDataType.TThostFtdcSequenceNoType sequenceNo;
}

///用户登录请求
struct CThostFtdcReqUserLoginField {
    ///交易日
    1: CMSDataType.TThostFtdcDateType tradingDay;
    ///经纪公司代码
    2: CMSDataType.TThostFtdcBrokerIDType brokerID;
    ///用户代码
    3: CMSDataType.TThostFtdcUserIDType userID;
    ///密码
    4: CMSDataType.TThostFtdcPasswordType password;
    ///用户端产品信息
    5: CMSDataType.TThostFtdcProductInfoType userProductInfo;
    ///接口端产品信息
    6: CMSDataType.TThostFtdcProductInfoType interfaceProductInfo;
    ///协议信息
    7: CMSDataType.TThostFtdcProtocolInfoType protocolInfo;
    ///Mac地址
    8: CMSDataType.TThostFtdcMacAddressType macAddress;
    ///动态密码
    9: CMSDataType.TThostFtdcPasswordType oneTimePassword;
    ///终端IP地址
    10: CMSDataType.TThostFtdcIPAddressType clientIPAddress;
}

///用户登录应答
struct CThostFtdcRspUserLoginField
{
	///交易日
	1: CMSDataType.TThostFtdcDateType	tradingDay;
	///登录成功时间
	2: CMSDataType.TThostFtdcTimeType	loginTime;
	///经纪公司代码
	3: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///用户代码
	4: CMSDataType.TThostFtdcUserIDType	userID;
	///交易系统名称
	5: CMSDataType.TThostFtdcSystemNameType	systemName;
	///前置编号
	6: CMSDataType.TThostFtdcFrontIDType	rontID;
	///会话编号
	7: CMSDataType.TThostFtdcSessionIDType	sessionID;
	///最大报单引用
	8: CMSDataType.TThostFtdcOrderRefType	maxOrderRef;
	///上期所时间
	9: CMSDataType.TThostFtdcTimeType	shfeTime;
	///大商所时间
	10: CMSDataType.TThostFtdcTimeType	dceTime;
	///郑商所时间
	11: CMSDataType.TThostFtdcTimeType	czceTime;
	///中金所时间
	12: CMSDataType.TThostFtdcTimeType	ffexTime;
	///能源中心时间
	13: CMSDataType.TThostFtdcTimeType	ineTime;
}

///用户登出请求
struct CThostFtdcUserLogoutField
{
	///经纪公司代码
	1: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///用户代码
	2: CMSDataType.TThostFtdcUserIDType	userID;
}

///强制交易员退出
struct CThostFtdcForceUserLogoutField
{
	///经纪公司代码
	1: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///用户代码
	2: CMSDataType.TThostFtdcUserIDType	userID;
}

///客户端认证请求
struct CThostFtdcReqAuthenticateField
{
	///经纪公司代码
	1: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///用户代码
	2: CMSDataType.TThostFtdcUserIDType	userID;
	///用户端产品信息
	3: CMSDataType.TThostFtdcProductInfoType	userProductInfo;
	///认证码
	4: CMSDataType.TThostFtdcAuthCodeType	authCode;
}

///客户端认证响应
struct CThostFtdcRspAuthenticateField
{
	///经纪公司代码
	1: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///用户代码
	2: CMSDataType.TThostFtdcUserIDType	userID;
	///用户端产品信息
	3: CMSDataType.TThostFtdcProductInfoType	userProductInfo;
}

///客户端认证信息
struct CThostFtdcAuthenticationInfoField
{
	///经纪公司代码
	1: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///用户代码
	2: CMSDataType.TThostFtdcUserIDType	userID;
	///用户端产品信息
	3: CMSDataType.TThostFtdcProductInfoType	userProductInfo;
	///认证信息
	4: CMSDataType.TThostFtdcAuthInfoType	authInfo;
	///是否为认证结果
	5: CMSDataType.TThostFtdcBoolType	isResult;
}

///银期转帐报文头
struct CThostFtdcTransferHeaderField
{
	///版本号，常量，1.0
	1: CMSDataType.TThostFtdcVersionType	version;
	///交易代码，必填
	2: CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///交易日期，必填，格式：yyyymmdd
	3: CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易时间，必填，格式：hhmmss
	4: CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///发起方流水号，N/A
	5: CMSDataType.TThostFtdcTradeSerialType	tradeSerial;
	///期货公司代码，必填
	6: CMSDataType.TThostFtdcFutureIDType	futureID;
	///银行代码，根据查询银行得到，必填
	7: CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分中心代码，根据查询银行得到，必填
	8: CMSDataType.TThostFtdcBankBrchIDType	bankBrchID;
	///操作员，N/A
	9: CMSDataType.TThostFtdcOperNoType	operNo;
	///交易设备类型，N/A
	10: CMSDataType.TThostFtdcDeviceIDType	deviceID;
	///记录数，N/A
	11: CMSDataType.TThostFtdcRecordNumType	recordNum;
	///会话编号，N/A
	12: CMSDataType.TThostFtdcSessionIDType	sessionID;
	///请求编号，N/A
	13: CMSDataType.TThostFtdcRequestIDType	requestID;
}

///银行资金转期货请求，TradeCode=202001
struct CThostFtdcTransferBankToFutureReqField
{
	///期货资金账户
	1: CMSDataType.TThostFtdcAccountIDType	futureAccount;
	///密码标志
	2: CMSDataType.TThostFtdcFuturePwdFlagType	futurePwdFlag;
	///密码
	3: CMSDataType.TThostFtdcFutureAccPwdType	futureAccPwd;
	///转账金额
	4: CMSDataType.TThostFtdcMoneyType	tradeAmt;
	///客户手续费
	5: CMSDataType.TThostFtdcMoneyType	custFee;
	///币种：RMB-人民币 USD-美圆 HKD-港元
	6: CMSDataType.TThostFtdcCurrencyCodeType	currencyCode;
}

///银行资金转期货请求响应
struct CThostFtdcTransferBankToFutureRspField
{
	///响应代码
	1: CMSDataType.TThostFtdcRetCodeType	retCode;
	///响应信息
	2: CMSDataType.TThostFtdcRetInfoType	retInfo;
	///资金账户
	3: CMSDataType.TThostFtdcAccountIDType	futureAccount;
	///转帐金额
	4: CMSDataType.TThostFtdcMoneyType	tradeAmt;
	///应收客户手续费
	5: CMSDataType.TThostFtdcMoneyType	custFee;
	///币种
	6: CMSDataType.TThostFtdcCurrencyCodeType	currencyCode;
}

///期货资金转银行请求，TradeCode=202002
struct CThostFtdcTransferFutureToBankReqField
{
	///期货资金账户
	1: CMSDataType.TThostFtdcAccountIDType	futureAccount;
	///密码标志
	2: CMSDataType.TThostFtdcFuturePwdFlagType	futurePwdFlag;
	///密码
	3: CMSDataType.TThostFtdcFutureAccPwdType	futureAccPwd;
	///转账金额
	4: CMSDataType.TThostFtdcMoneyType	tradeAmt;
	///客户手续费
	5: CMSDataType.TThostFtdcMoneyType	custFee;
	///币种：RMB-人民币 USD-美圆 HKD-港元
	6: CMSDataType.TThostFtdcCurrencyCodeType	currencyCode;
}

///期货资金转银行请求响应
struct CThostFtdcTransferFutureToBankRspField
{
	///响应代码
	1: CMSDataType.TThostFtdcRetCodeType	retCode;
	///响应信息
	2: CMSDataType.TThostFtdcRetInfoType	retInfo;
	///资金账户
	3: CMSDataType.TThostFtdcAccountIDType	futureAccount;
	///转帐金额
	4: CMSDataType.TThostFtdcMoneyType	tradeAmt;
	///应收客户手续费
	5: CMSDataType.TThostFtdcMoneyType	custFee;
	///币种
	6: CMSDataType.TThostFtdcCurrencyCodeType	currencyCode;
}

///查询银行资金请求，TradeCode=204002
struct CThostFtdcTransferQryBankReqField
{
	///期货资金账户
	1: CMSDataType.TThostFtdcAccountIDType	futureAccount;
	///密码标志
	2: CMSDataType.TThostFtdcFuturePwdFlagType	futurePwdFlag;
	///密码
	3: CMSDataType.TThostFtdcFutureAccPwdType	futureAccPwd;
	///币种：RMB-人民币 USD-美圆 HKD-港元
	4: CMSDataType.TThostFtdcCurrencyCodeType	currencyCode;
}

///查询银行资金请求响应
struct CThostFtdcTransferQryBankRspField
{
	///响应代码
	1: CMSDataType.TThostFtdcRetCodeType	retCode;
	///响应信息
	2: CMSDataType.TThostFtdcRetInfoType	retInfo;
	///资金账户
	3: CMSDataType.TThostFtdcAccountIDType	futureAccount;
	///银行余额
	4: CMSDataType.TThostFtdcMoneyType	tradeAmt;
	///银行可用余额
	5: CMSDataType.TThostFtdcMoneyType	useAmt;
	///银行可取余额
	6: CMSDataType.TThostFtdcMoneyType	fetchAmt;
	///币种
	7: CMSDataType.TThostFtdcCurrencyCodeType	currencyCode;
}

///查询银行交易明细请求，TradeCode=204999
struct CThostFtdcTransferQryDetailReqField
{
	///期货资金账户
	1: CMSDataType.TThostFtdcAccountIDType	futureAccount;
}

///查询银行交易明细请求响应
struct CThostFtdcTransferQryDetailRspField
{
	///交易日期
	1: CMSDataType.TThostFtdcDateType	tradeDate;
	///交易时间
	2: CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///交易代码
	3: CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///期货流水号
	4: CMSDataType.TThostFtdcTradeSerialNoType	futureSerial;
	///期货公司代码
	5: CMSDataType.TThostFtdcFutureIDType	futureID;
	///资金帐号
	6: CMSDataType.TThostFtdcFutureAccountType	futureAccount;
	///银行流水号
	7: CMSDataType.TThostFtdcTradeSerialNoType	bankSerial;
	///银行代码
	8: CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分中心代码
	9: CMSDataType.TThostFtdcBankBrchIDType	bankBrchID;
	///银行账号
	10: CMSDataType.TThostFtdcBankAccountType	bankAccount;
	///证件号码
	11: CMSDataType.TThostFtdcCertCodeType	certCode;
	///货币代码
	12: CMSDataType.TThostFtdcCurrencyCodeType	currencyCode;
	///发生金额
	13: CMSDataType.TThostFtdcMoneyType	txAmount;
	///有效标志
	14: CMSDataType.TThostFtdcTransferValidFlagType	flag;
}

///响应信息
struct CThostFtdcRspInfoField
{
	///错误代码
	1: CMSDataType.TThostFtdcErrorIDType	errorID;
	///错误信息
	2: CMSDataType.TThostFtdcErrorMsgType	errorMsg;
}

///交易所
struct CThostFtdcExchangeField
{
	///交易所代码
	1: CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///交易所名称
	2: CMSDataType.TThostFtdcExchangeNameType	exchangeName;
	///交易所属性
	3: CMSDataType.TThostFtdcExchangePropertyType	exchangeProperty;
}

///产品
struct CThostFtdcProductField
{
	///产品代码
	1: CMSDataType.TThostFtdcInstrumentIDType	productID;
	///产品名称
	2: CMSDataType.TThostFtdcProductNameType	productName;
	///交易所代码
	3: CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///产品类型
	4: CMSDataType.TThostFtdcProductClassType	productClass;
	///合约数量乘数
	5: CMSDataType.TThostFtdcVolumeMultipleType	volumeMultiple;
	///最小变动价位
	6: CMSDataType.TThostFtdcPriceType	priceTick;
	///市价单最大下单量
	7: CMSDataType.TThostFtdcVolumeType	maxMarketOrderVolume;
	///市价单最小下单量
	8: CMSDataType.TThostFtdcVolumeType	minMarketOrderVolume;
	///限价单最大下单量
	9: CMSDataType.TThostFtdcVolumeType	maxLimitOrderVolume;
	///限价单最小下单量
	10: CMSDataType.TThostFtdcVolumeType	minLimitOrderVolume;
	///持仓类型
	11: CMSDataType.TThostFtdcPositionTypeType	positionType;
	///持仓日期类型
	12: CMSDataType.TThostFtdcPositionDateTypeType	positionDateType;
	///平仓处理类型
	13: CMSDataType.TThostFtdcCloseDealTypeType	closeDealType;
	///交易币种类型
	14: CMSDataType.TThostFtdcCurrencyIDType	tradeCurrencyID;
	///质押资金可用范围
	15: CMSDataType.TThostFtdcMortgageFundUseRangeType	mortgageFundUseRange;
	///交易所产品代码
	16: CMSDataType.TThostFtdcInstrumentIDType	exchangeProductID;
	///合约基础商品乘数
	17: CMSDataType.TThostFtdcUnderlyingMultipleType	underlyingMultiple;
}

///合约
struct CThostFtdcInstrumentField
{
	///合约代码
	1: CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///交易所代码
	2: CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///合约名称
	3: CMSDataType.TThostFtdcInstrumentNameType	instrumentName;
	///合约在交易所的代码
	4: CMSDataType.TThostFtdcExchangeInstIDType	exchangeInstID;
	///产品代码
	5: CMSDataType.TThostFtdcInstrumentIDType	productID;
	///产品类型
	6: CMSDataType.TThostFtdcProductClassType	productClass;
	///交割年份
	7: CMSDataType.TThostFtdcYearType	deliveryYear;
	///交割月
	8: CMSDataType.TThostFtdcMonthType	deliveryMonth;
	///市价单最大下单量
	9: CMSDataType.TThostFtdcVolumeType	maxMarketOrderVolume;
	///市价单最小下单量
	10: CMSDataType.TThostFtdcVolumeType	minMarketOrderVolume;
	///限价单最大下单量
	11: CMSDataType.TThostFtdcVolumeType	maxLimitOrderVolume;
	///限价单最小下单量
	12: CMSDataType.TThostFtdcVolumeType	minLimitOrderVolume;
	///合约数量乘数
	13: CMSDataType.TThostFtdcVolumeMultipleType	volumeMultiple;
	///最小变动价位
	14: CMSDataType.TThostFtdcPriceType	priceTick;
	///创建日
	15: CMSDataType.TThostFtdcDateType	createDate;
	///上市日
	16: CMSDataType.TThostFtdcDateType	openDate;
	///到期日
	17: CMSDataType.TThostFtdcDateType	expireDate;
	///开始交割日
	18: CMSDataType.TThostFtdcDateType	startDelivDate;
	///结束交割日
	19: CMSDataType.TThostFtdcDateType	endDelivDate;
	///合约生命周期状态
	20: CMSDataType.TThostFtdcInstLifePhaseType	instLifePhase;
	///当前是否交易
	21: CMSDataType.TThostFtdcBoolType	isTrading;
	///持仓类型
	22: CMSDataType.TThostFtdcPositionTypeType	positionType;
	///持仓日期类型
	23: CMSDataType.TThostFtdcPositionDateTypeType	positionDateType;
	///多头保证金率
	24: CMSDataType.TThostFtdcRatioType	longMarginRatio;
	///空头保证金率
	25: CMSDataType.TThostFtdcRatioType	shortMarginRatio;
	///是否使用大额单边保证金算法
	26: CMSDataType.TThostFtdcMaxMarginSideAlgorithmType	maxMarginSideAlgorithm;
	///基础商品代码
	27: CMSDataType.TThostFtdcInstrumentIDType	underlyingInstrID;
	///执行价
	28: CMSDataType.TThostFtdcPriceType	strikePrice;
	///期权类型
	29: CMSDataType.TThostFtdcOptionsTypeType	optionsType;
	///合约基础商品乘数
	30: CMSDataType.TThostFtdcUnderlyingMultipleType	underlyingMultiple;
	///组合类型
	31: CMSDataType.TThostFtdcCombinationTypeType	combinationType;
}

///经纪公司
struct CThostFtdcBrokerField
{
	///经纪公司代码
	1: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///经纪公司简称
	2: CMSDataType.TThostFtdcBrokerAbbrType	brokerAbbr;
	///经纪公司名称
	3: CMSDataType.TThostFtdcBrokerNameType	brokerName;
	///是否活跃
	4: CMSDataType.TThostFtdcBoolType	isActive;
}

///交易所交易员
struct CThostFtdcTraderField
{
	///交易所代码
	1: CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///交易所交易员代码
	2: CMSDataType.TThostFtdcTraderIDType	traderID;
	///会员代码
	3: CMSDataType.TThostFtdcParticipantIDType	participantID;
	///密码
	4: CMSDataType.TThostFtdcPasswordType	password;
	///安装数量
	5: CMSDataType.TThostFtdcInstallCountType	installCount;
	///经纪公司代码
	6: CMSDataType.TThostFtdcBrokerIDType	brokerID;
}

///投资者
struct CThostFtdcInvestorField
{
	///投资者代码
	1: CMSDataType.TThostFtdcInvestorIDType	investorID;
	///经纪公司代码
	2: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者分组代码
	3: CMSDataType.TThostFtdcInvestorIDType	investorGroupID;
	///投资者名称
	4: CMSDataType.TThostFtdcPartyNameType	investorName;
	///证件类型
	5: CMSDataType.TThostFtdcIdCardTypeType	identifiedCardType;
	///证件号码
	6: CMSDataType.TThostFtdcIdentifiedCardNoType	identifiedCardNo;
	///是否活跃
	7: CMSDataType.TThostFtdcBoolType	isActive;
	///联系电话
	8: CMSDataType.TThostFtdcTelephoneType	telephone;
	///通讯地址
	9: CMSDataType.TThostFtdcAddressType	address;
	///开户日期
	10: CMSDataType.TThostFtdcDateType	openDate;
	///手机
	11: CMSDataType.TThostFtdcMobileType	mobile;
	///手续费率模板代码
	12: CMSDataType.TThostFtdcInvestorIDType	commModelID;
	///保证金率模板代码
	13: CMSDataType.TThostFtdcInvestorIDType	marginModelID;
}

///交易编码
struct CThostFtdcTradingCodeField
{
	///投资者代码
	1: CMSDataType.TThostFtdcInvestorIDType	investorID;
	///经纪公司代码
	2: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///交易所代码
	3: CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///客户代码
	4: CMSDataType.TThostFtdcClientIDType	clientID;
	///是否活跃
	5: CMSDataType.TThostFtdcBoolType	isActive;
	///交易编码类型
	6: CMSDataType.TThostFtdcClientIDTypeType	clientIDType;
}

///会员编码和经纪公司编码对照表
struct CThostFtdcPartBrokerField
{
	///经纪公司代码
	1: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///交易所代码
	2: CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///会员代码
	3: CMSDataType.TThostFtdcParticipantIDType	participantID;
	///是否活跃
	4: CMSDataType.TThostFtdcBoolType	isActive;
}

///管理用户
struct CThostFtdcSuperUserField
{
	///用户代码
	1: CMSDataType.TThostFtdcUserIDType	userID;
	///用户名称
	2: CMSDataType.TThostFtdcUserNameType	userName;
	///密码
	3: CMSDataType.TThostFtdcPasswordType	password;
	///是否活跃
	4: CMSDataType.TThostFtdcBoolType	isActive;
}

///管理用户功能权限
struct CThostFtdcSuperUserFunctionField
{
	///用户代码
	1: CMSDataType.TThostFtdcUserIDType	userID;
	///功能代码
	2: CMSDataType.TThostFtdcFunctionCodeType	functionCode;
}

///投资者组
struct CThostFtdcInvestorGroupField
{
	///经纪公司代码
	1: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者分组代码
	2: CMSDataType.TThostFtdcInvestorIDType	investorGroupID;
	///投资者分组名称
	3: CMSDataType.TThostFtdcInvestorGroupNameType	investorGroupName;
}

///资金账户
struct CThostFtdcTradingAccountField
{
	///经纪公司代码
	1: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者帐号
	2: CMSDataType.TThostFtdcAccountIDType	accountID;
	///上次质押金额
	3: CMSDataType.TThostFtdcMoneyType	preMortgage;
	///上次信用额度
	4: CMSDataType.TThostFtdcMoneyType	preCredit;
	///上次存款额
	5: CMSDataType.TThostFtdcMoneyType	preDeposit;
	///上次结算准备金
	6: CMSDataType.TThostFtdcMoneyType	preBalance;
	///上次占用的保证金
	7: CMSDataType.TThostFtdcMoneyType	preMargin;
	///利息基数
	8: CMSDataType.TThostFtdcMoneyType	interestBase;
	///利息收入
	9: CMSDataType.TThostFtdcMoneyType	interest;
	///入金金额
	10: CMSDataType.TThostFtdcMoneyType	deposit;
	///出金金额
	11: CMSDataType.TThostFtdcMoneyType	withdraw;
	///冻结的保证金
	12: CMSDataType.TThostFtdcMoneyType	frozenMargin;
	///冻结的资金
	13: CMSDataType.TThostFtdcMoneyType	frozenCash;
	///冻结的手续费
	14: CMSDataType.TThostFtdcMoneyType	frozenCommission;
	///当前保证金总额
	15: CMSDataType.TThostFtdcMoneyType	currMargin;
	///资金差额
	16: CMSDataType.TThostFtdcMoneyType	cashIn;
	///手续费
	17: CMSDataType.TThostFtdcMoneyType	commission;
	///平仓盈亏
	18: CMSDataType.TThostFtdcMoneyType	closeProfit;
	///持仓盈亏
	19: CMSDataType.TThostFtdcMoneyType	positionProfit;
	///期货结算准备金
	20: CMSDataType.TThostFtdcMoneyType	balance;
	///可用资金
	21: CMSDataType.TThostFtdcMoneyType	available;
	///可取资金
	22: CMSDataType.TThostFtdcMoneyType	withdrawQuota;
	///基本准备金
	23: CMSDataType.TThostFtdcMoneyType	reserve;
	///交易日
	24: CMSDataType.TThostFtdcDateType	tradingDay;
	///结算编号
	25: CMSDataType.TThostFtdcSettlementIDType	settlementID;
	///信用额度
	26: CMSDataType.TThostFtdcMoneyType	credit;
	///质押金额
	27: CMSDataType.TThostFtdcMoneyType	mortgage;
	///交易所保证金
	28: CMSDataType.TThostFtdcMoneyType	exchangeMargin;
	///投资者交割保证金
	29: CMSDataType.TThostFtdcMoneyType	deliveryMargin;
	///交易所交割保证金
	30: CMSDataType.TThostFtdcMoneyType	exchangeDeliveryMargin;
	///保底期货结算准备金
	31: CMSDataType.TThostFtdcMoneyType	reserveBalance;
	///币种代码
	32: CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///上次货币质入金额
	33: CMSDataType.TThostFtdcMoneyType	preFundMortgageIn;
	///上次货币质出金额
	34: CMSDataType.TThostFtdcMoneyType	preFundMortgageOut;
	///货币质入金额
	35: CMSDataType.TThostFtdcMoneyType	fundMortgageIn;
	///货币质出金额
	36: CMSDataType.TThostFtdcMoneyType	fundMortgageOut;
	///货币质押余额
	37: CMSDataType.TThostFtdcMoneyType	fundMortgageAvailable;
	///可质押货币金额
	38: CMSDataType.TThostFtdcMoneyType	mortgageableFund;
	///特殊产品占用保证金
	39: CMSDataType.TThostFtdcMoneyType	specProductMargin;
	///特殊产品冻结保证金
	40: CMSDataType.TThostFtdcMoneyType	specProductFrozenMargin;
	///特殊产品手续费
	41: CMSDataType.TThostFtdcMoneyType	specProductCommission;
	///特殊产品冻结手续费
	42: CMSDataType.TThostFtdcMoneyType	specProductFrozenCommission;
	///特殊产品持仓盈亏
	43: CMSDataType.TThostFtdcMoneyType	specProductPositionProfit;
	///特殊产品平仓盈亏
	44: CMSDataType.TThostFtdcMoneyType	specProductCloseProfit;
	///根据持仓盈亏算法计算的特殊产品持仓盈亏
	45: CMSDataType.TThostFtdcMoneyType	specProductPositionProfitByAlg;
	///特殊产品交易所保证金
	46: CMSDataType.TThostFtdcMoneyType	specProductExchangeMargin;
}

///投资者持仓
struct CThostFtdcInvestorPositionField
{
	///合约代码
	1: CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///经纪公司代码
	2: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	3: CMSDataType.TThostFtdcInvestorIDType	investorID;
	///持仓多空方向
	4: CMSDataType.TThostFtdcPosiDirectionType	posiDirection;
	///投机套保标志
	5: CMSDataType.TThostFtdcHedgeFlagType	hedgeFlag;
	///持仓日期
	6: CMSDataType.TThostFtdcPositionDateType	positionDate;
	///上日持仓
	7: CMSDataType.TThostFtdcVolumeType	ydPosition;
	///今日持仓
	8: CMSDataType.TThostFtdcVolumeType	position;
	///多头冻结
	9: CMSDataType.TThostFtdcVolumeType	longFrozen;
	///空头冻结
	10: CMSDataType.TThostFtdcVolumeType	shortFrozen;
	///开仓冻结金额
	11: CMSDataType.TThostFtdcMoneyType	longFrozenAmount;
	///开仓冻结金额
	12: CMSDataType.TThostFtdcMoneyType	shortFrozenAmount;
	///开仓量
	13: CMSDataType.TThostFtdcVolumeType	openVolume;
	///平仓量
	14: CMSDataType.TThostFtdcVolumeType	closeVolume;
	///开仓金额
	15: CMSDataType.TThostFtdcMoneyType	openAmount;
	///平仓金额
	16: CMSDataType.TThostFtdcMoneyType	closeAmount;
	///持仓成本
	17: CMSDataType.TThostFtdcMoneyType	positionCost;
	///上次占用的保证金
	18: CMSDataType.TThostFtdcMoneyType	preMargin;
	///占用的保证金
	19: CMSDataType.TThostFtdcMoneyType	useMargin;
	///冻结的保证金
	21: CMSDataType.TThostFtdcMoneyType	frozenMargin;
	///冻结的资金
	22: CMSDataType.TThostFtdcMoneyType	frozenCash;
	///冻结的手续费
	23: CMSDataType.TThostFtdcMoneyType	frozenCommission;
	///资金差额
	24: CMSDataType.TThostFtdcMoneyType	cashIn;
	///手续费
	25: CMSDataType.TThostFtdcMoneyType	commission;
	///平仓盈亏
	26: CMSDataType.TThostFtdcMoneyType	closeProfit;
	///持仓盈亏
	27: CMSDataType.TThostFtdcMoneyType	positionProfit;
	///上次结算价
	28: CMSDataType.TThostFtdcPriceType	preSettlementPrice;
	///本次结算价
	29: CMSDataType.TThostFtdcPriceType	settlementPrice;
	///交易日
	30: CMSDataType.TThostFtdcDateType	tradingDay;
	///结算编号
	31: CMSDataType.TThostFtdcSettlementIDType	settlementID;
	///开仓成本
	32: CMSDataType.TThostFtdcMoneyType	openCost;
	///交易所保证金
	33: CMSDataType.TThostFtdcMoneyType	exchangeMargin;
	///组合成交形成的持仓
	34: CMSDataType.TThostFtdcVolumeType	combPosition;
	///组合多头冻结
	35: CMSDataType.TThostFtdcVolumeType	combLongFrozen;
	///组合空头冻结
	36: CMSDataType.TThostFtdcVolumeType	combShortFrozen;
	///逐日盯市平仓盈亏
	37: CMSDataType.TThostFtdcMoneyType	closeProfitByDate;
	///逐笔对冲平仓盈亏
	38: CMSDataType.TThostFtdcMoneyType	closeProfitByTrade;
	///今日持仓
	39: CMSDataType.TThostFtdcVolumeType	todayPosition;
	///保证金率
	40: CMSDataType.TThostFtdcRatioType	marginRateByMoney;
	///保证金率(按手数)
	41: CMSDataType.TThostFtdcRatioType	marginRateByVolume;
	///执行冻结
	42: CMSDataType.TThostFtdcVolumeType	strikeFrozen;
	///执行冻结金额
	43: CMSDataType.TThostFtdcMoneyType	strikeFrozenAmount;
	///放弃执行冻结
	44: CMSDataType.TThostFtdcVolumeType	abandonFrozen;
}

///合约保证金率
struct CThostFtdcInstrumentMarginRateField
{
	///合约代码
	1: CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///投资者范围
	2: CMSDataType.TThostFtdcInvestorRangeType	investorRange;
	///经纪公司代码
	3: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	4: CMSDataType.TThostFtdcInvestorIDType	investorID;
	///投机套保标志
	5: CMSDataType.TThostFtdcHedgeFlagType	hedgeFlag;
	///多头保证金率
	6: CMSDataType.TThostFtdcRatioType	longMarginRatioByMoney;
	///多头保证金费
	7: CMSDataType.TThostFtdcMoneyType	longMarginRatioByVolume;
	///空头保证金率
	8: CMSDataType.TThostFtdcRatioType	shortMarginRatioByMoney;
	///空头保证金费
	9: CMSDataType.TThostFtdcMoneyType	shortMarginRatioByVolume;
	///是否相对交易所收取
	10: CMSDataType.TThostFtdcBoolType	isRelative;
}

///合约手续费率
struct CThostFtdcInstrumentCommissionRateField
{
	///合约代码
	1: CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///投资者范围
	2: CMSDataType.TThostFtdcInvestorRangeType	investorRange;
	///经纪公司代码
	3: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	4: CMSDataType.TThostFtdcInvestorIDType	investorID;
	///开仓手续费率
	5: CMSDataType.TThostFtdcRatioType	openRatioByMoney;
	///开仓手续费
	6: CMSDataType.TThostFtdcRatioType	openRatioByVolume;
	///平仓手续费率
	7: CMSDataType.TThostFtdcRatioType	closeRatioByMoney;
	///平仓手续费
	8: CMSDataType.TThostFtdcRatioType	closeRatioByVolume;
	///平今手续费率
	9: CMSDataType.TThostFtdcRatioType	closeTodayRatioByMoney;
	///平今手续费
	10: CMSDataType.TThostFtdcRatioType	closeTodayRatioByVolume;
}

///深度行情
struct CThostFtdcDepthMarketDataField
{
	///交易日
	1: CMSDataType.TThostFtdcDateType	tradingDay;
	///合约代码
	2: CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///交易所代码
	3: CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///合约在交易所的代码
	4: CMSDataType.TThostFtdcExchangeInstIDType	exchangeInstID;
	///最新价
	5: CMSDataType.TThostFtdcPriceType	lastPrice;
	///上次结算价
	6: CMSDataType.TThostFtdcPriceType	preSettlementPrice;
	///昨收盘
	7: CMSDataType.TThostFtdcPriceType	preClosePrice;
	///昨持仓量
	8: CMSDataType.TThostFtdcLargeVolumeType	preOpenInterest;
	///今开盘
	9: CMSDataType.TThostFtdcPriceType	openPrice;
	///最高价
	10: CMSDataType.TThostFtdcPriceType	highestPrice;
	///最低价
	11: CMSDataType.TThostFtdcPriceType	lowestPrice;
	///数量
	12: CMSDataType.TThostFtdcVolumeType	volume;
	///成交金额
	13: CMSDataType.TThostFtdcMoneyType	turnover;
	///持仓量
	14: CMSDataType.TThostFtdcLargeVolumeType	openInterest;
	///今收盘
	15: CMSDataType.TThostFtdcPriceType	closePrice;
	///本次结算价
	16: CMSDataType.TThostFtdcPriceType	settlementPrice;
	///涨停板价
	17: CMSDataType.TThostFtdcPriceType	upperLimitPrice;
	///跌停板价
	18: CMSDataType.TThostFtdcPriceType	lowerLimitPrice;
	///昨虚实度
	19: CMSDataType.TThostFtdcRatioType	preDelta;
	///今虚实度
	20: CMSDataType.TThostFtdcRatioType	currDelta;
	///最后修改时间
	21: CMSDataType.TThostFtdcTimeType	updateTime;
	///最后修改毫秒
	22: CMSDataType.TThostFtdcMillisecType	updateMillisec;
	///申买价一
	23: CMSDataType.TThostFtdcPriceType	bidPrice1;
	///申买量一
	24: CMSDataType.TThostFtdcVolumeType	bidVolume1;
	///申卖价一
	25: CMSDataType.TThostFtdcPriceType	askPrice1;
	///申卖量一
	26: CMSDataType.TThostFtdcVolumeType	askVolume1;
	///申买价二
	27: CMSDataType.TThostFtdcPriceType	bidPrice2;
	///申买量二
	28: CMSDataType.TThostFtdcVolumeType	bidVolume2;
	///申卖价二
	29: CMSDataType.TThostFtdcPriceType	askPrice2;
	///申卖量二
	30: CMSDataType.TThostFtdcVolumeType	askVolume2;
	///申买价三
	31: CMSDataType.TThostFtdcPriceType	bidPrice3;
	///申买量三
	32: CMSDataType.TThostFtdcVolumeType	bidVolume3;
	///申卖价三
	33: CMSDataType.TThostFtdcPriceType	askPrice3;
	///申卖量三
	34: CMSDataType.TThostFtdcVolumeType	askVolume3;
	///申买价四
	35: CMSDataType.TThostFtdcPriceType	bidPrice4;
	///申买量四
	36: CMSDataType.TThostFtdcVolumeType	bidVolume4;
	///申卖价四
	37: CMSDataType.TThostFtdcPriceType	askPrice4;
	///申卖量四
	38: CMSDataType.TThostFtdcVolumeType	askVolume4;
	///申买价五
	39: CMSDataType.TThostFtdcPriceType	bidPrice5;
	///申买量五
	40: CMSDataType.TThostFtdcVolumeType	bidVolume5;
	///申卖价五
	41: CMSDataType.TThostFtdcPriceType	askPrice5;
	///申卖量五
	42: CMSDataType.TThostFtdcVolumeType	askVolume5;
	///当日均价
	43: CMSDataType.TThostFtdcPriceType	averagePrice;
	///业务日期
	44: CMSDataType.TThostFtdcDateType	actionDay;
}

///投资者合约交易权限
struct CThostFtdcInstrumentTradingRightField
{
	///合约代码
	1: CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///投资者范围
	2: CMSDataType.TThostFtdcInvestorRangeType	investorRange;
	///经纪公司代码
	3: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	4: CMSDataType.TThostFtdcInvestorIDType	investorID;
	///交易权限
	5: CMSDataType.TThostFtdcTradingRightType	tradingRight;
}

///经纪公司用户
struct CThostFtdcBrokerUserField
{
	///经纪公司代码
	1: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///用户代码
	2: CMSDataType.TThostFtdcUserIDType	userID;
	///用户名称
	3: CMSDataType.TThostFtdcUserNameType	userName;
	///用户类型
	4: CMSDataType.TThostFtdcUserTypeType	userType;
	///是否活跃
	5: CMSDataType.TThostFtdcBoolType	isActive;
	///是否使用令牌
	6: CMSDataType.TThostFtdcBoolType	isUsingOTP;
}

///经纪公司用户口令
struct CThostFtdcBrokerUserPasswordField
{
	///经纪公司代码
	1: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///用户代码
	2: CMSDataType.TThostFtdcUserIDType	userID;
	///密码
	3: CMSDataType.TThostFtdcPasswordType	password;
}

///经纪公司用户功能权限
struct CThostFtdcBrokerUserFunctionField
{
	///经纪公司代码
	1: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///用户代码
	2: CMSDataType.TThostFtdcUserIDType	userID;
	///经纪公司功能代码
	3: CMSDataType.TThostFtdcBrokerFunctionCodeType	brokerFunctionCode;
}

///交易所交易员报盘机
struct CThostFtdcTraderOfferField
{
	///交易所代码
	1: CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///交易所交易员代码
	2: CMSDataType.TThostFtdcTraderIDType	traderID;
	///会员代码
	3: CMSDataType.TThostFtdcParticipantIDType	participantID;
	///密码
	4: CMSDataType.TThostFtdcPasswordType	password;
	///安装编号
	5: CMSDataType.TThostFtdcInstallIDType	installID;
	///本地报单编号
	6: CMSDataType.TThostFtdcOrderLocalIDType	orderLocalID;
	///交易所交易员连接状态
	7: CMSDataType.TThostFtdcTraderConnectStatusType	traderConnectStatus;
	///发出连接请求的日期
	8: CMSDataType.TThostFtdcDateType	connectRequestDate;
	///发出连接请求的时间
	9: CMSDataType.TThostFtdcTimeType	connectRequestTime;
	///上次报告日期
	10: CMSDataType.TThostFtdcDateType	lastReportDate;
	///上次报告时间
	11: CMSDataType.TThostFtdcTimeType	lastReportTime;
	///完成连接日期
	12: CMSDataType.TThostFtdcDateType	connectDate;
	///完成连接时间
	13: CMSDataType.TThostFtdcTimeType	connectTime;
	///启动日期
	14: CMSDataType.TThostFtdcDateType	startDate;
	///启动时间
	15: CMSDataType.TThostFtdcTimeType	startTime;
	///交易日
	16: CMSDataType.TThostFtdcDateType	tradingDay;
	///经纪公司代码
	17: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///本席位最大成交编号
	18: CMSDataType.TThostFtdcTradeIDType	maxTradeID;
	///本席位最大报单备拷
	19: CMSDataType.TThostFtdcReturnCodeType	maxOrderMessageReference;
}

///投资者结算结果
struct CThostFtdcSettlementInfoField
{
	///交易日
	1: CMSDataType.TThostFtdcDateType	tradingDay;
	///结算编号
	2: CMSDataType.TThostFtdcSettlementIDType	settlementID;
	///经纪公司代码
	3: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	4: CMSDataType.TThostFtdcInvestorIDType	investorID;
	///序号
	5: CMSDataType.TThostFtdcSequenceNoType	sequenceNo;
	///消息正文
	6: CMSDataType.TThostFtdcContentType	content;
}

///合约保证金率调整
struct CThostFtdcInstrumentMarginRateAdjustField
{
	///合约代码
	1: CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///投资者范围
	2: CMSDataType.TThostFtdcInvestorRangeType	investorRange;
	///经纪公司代码
	3: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	4: CMSDataType.TThostFtdcInvestorIDType	investorID;
	///投机套保标志
	5: CMSDataType.TThostFtdcHedgeFlagType	hedgeFlag;
	///多头保证金率
	6: CMSDataType.TThostFtdcRatioType	longMarginRatioByMoney;
	///多头保证金费
	7: CMSDataType.TThostFtdcMoneyType	longMarginRatioByVolume;
	///空头保证金率
	8: CMSDataType.TThostFtdcRatioType	shortMarginRatioByMoney;
	///空头保证金费
	9: CMSDataType.TThostFtdcMoneyType	shortMarginRatioByVolume;
	///是否相对交易所收取
	10: CMSDataType.TThostFtdcBoolType	isRelative;
}

///交易所保证金率
struct CThostFtdcExchangeMarginRateField
{
	///经纪公司代码
	1: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///合约代码
	2: CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///投机套保标志
	3: CMSDataType.TThostFtdcHedgeFlagType	hedgeFlag;
	///多头保证金率
	4: CMSDataType.TThostFtdcRatioType	longMarginRatioByMoney;
	///多头保证金费
	5: CMSDataType.TThostFtdcMoneyType	longMarginRatioByVolume;
	///空头保证金率
	6: CMSDataType.TThostFtdcRatioType	shortMarginRatioByMoney;
	///空头保证金费
	7: CMSDataType.TThostFtdcMoneyType	shortMarginRatioByVolume;
}

///交易所保证金率调整
struct CThostFtdcExchangeMarginRateAdjustField
{
	///经纪公司代码
	1: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///合约代码
	2: CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///投机套保标志
	3: CMSDataType.TThostFtdcHedgeFlagType	hedgeFlag;
	///跟随交易所投资者多头保证金率
	4: CMSDataType.TThostFtdcRatioType	longMarginRatioByMoney;
	///跟随交易所投资者多头保证金费
	5: CMSDataType.TThostFtdcMoneyType	longMarginRatioByVolume;
	///跟随交易所投资者空头保证金率
	6: CMSDataType.TThostFtdcRatioType	shortMarginRatioByMoney;
	///跟随交易所投资者空头保证金费
	7: CMSDataType.TThostFtdcMoneyType	shortMarginRatioByVolume;
	///交易所多头保证金率
	8: CMSDataType.TThostFtdcRatioType	exchLongMarginRatioByMoney;
	///交易所多头保证金费
	9: CMSDataType.TThostFtdcMoneyType	exchLongMarginRatioByVolume;
	///交易所空头保证金率
	10: CMSDataType.TThostFtdcRatioType	exchShortMarginRatioByMoney;
	///交易所空头保证金费
	11: CMSDataType.TThostFtdcMoneyType	exchShortMarginRatioByVolume;
	///不跟随交易所投资者多头保证金率
	12: CMSDataType.TThostFtdcRatioType	noLongMarginRatioByMoney;
	///不跟随交易所投资者多头保证金费
	13: CMSDataType.TThostFtdcMoneyType	noLongMarginRatioByVolume;
	///不跟随交易所投资者空头保证金率
	14: CMSDataType.TThostFtdcRatioType	noShortMarginRatioByMoney;
	///不跟随交易所投资者空头保证金费
	15: CMSDataType.TThostFtdcMoneyType	noShortMarginRatioByVolume;
}

///汇率
struct CThostFtdcExchangeRateField
{
	///经纪公司代码
	1: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///源币种
	2: CMSDataType.TThostFtdcCurrencyIDType	fromCurrencyID;
	///源币种单位数量
	3: CMSDataType.TThostFtdcCurrencyUnitType	fromCurrencyUnit;
	///目标币种
	4: CMSDataType.TThostFtdcCurrencyIDType	toCurrencyID;
	///汇率
	5: CMSDataType.TThostFtdcExchangeRateType	exchangeRate;
}

///结算引用
struct CThostFtdcSettlementRefField
{
	///交易日
	1: CMSDataType.TThostFtdcDateType	tradingDay;
	///结算编号
	2: CMSDataType.TThostFtdcSettlementIDType	settlementID;
}

///当前时间
struct CThostFtdcCurrentTimeField
{
	///当前日期
	1: CMSDataType.TThostFtdcDateType	currDate;
	///当前时间
	2: CMSDataType.TThostFtdcTimeType	currTime;
	///当前时间（毫秒）
	3: CMSDataType.TThostFtdcMillisecType	currMillisec;
	///业务日期
	4: CMSDataType.TThostFtdcDateType	actionDay;
}

///通讯阶段
struct CThostFtdcCommPhaseField
{
	///交易日
	1: CMSDataType.TThostFtdcDateType	tradingDay;
	///通讯时段编号
	2: CMSDataType.TThostFtdcCommPhaseNoType	commPhaseNo;
	///系统编号
	3: CMSDataType.TThostFtdcSystemIDType	systemID;
}

///登录信息
struct CThostFtdcLoginInfoField
{
	///前置编号
	1: CMSDataType.TThostFtdcFrontIDType	frontID;
	///会话编号
	2: CMSDataType.TThostFtdcSessionIDType	sessionID;
	///经纪公司代码
	3: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///用户代码
	4: CMSDataType.TThostFtdcUserIDType	userID;
	///登录日期
	5: CMSDataType.TThostFtdcDateType	loginDate;
	///登录时间
	6: CMSDataType.TThostFtdcTimeType	loginTime;
	///IP地址
	7: CMSDataType.TThostFtdcIPAddressType	iPAddress;
	///用户端产品信息
	8: CMSDataType.TThostFtdcProductInfoType	userProductInfo;
	///接口端产品信息
	9: CMSDataType.TThostFtdcProductInfoType	interfaceProductInfo;
	///协议信息
	10: CMSDataType.TThostFtdcProtocolInfoType	protocolInfo;
	///系统名称
	11: CMSDataType.TThostFtdcSystemNameType	systemName;
	///密码
	12: CMSDataType.TThostFtdcPasswordType	password;
	///最大报单引用
	13: CMSDataType.TThostFtdcOrderRefType	maxOrderRef;
	///上期所时间
	14: CMSDataType.TThostFtdcTimeType	shfeTime;
	///大商所时间
	15: CMSDataType.TThostFtdcTimeType	dceTime;
	///郑商所时间
	16: CMSDataType.TThostFtdcTimeType	czceTime;
	///中金所时间
	17: CMSDataType.TThostFtdcTimeType	ffexTime;
	///Mac地址
	18: CMSDataType.TThostFtdcMacAddressType	macAddress;
	///动态密码
	19: CMSDataType.TThostFtdcPasswordType	oneTimePassword;
	///能源中心时间
	20: CMSDataType.TThostFtdcTimeType	ineTime;
}

///登录信息
struct CThostFtdcLogoutAllField
{
	///前置编号
	1: CMSDataType.TThostFtdcFrontIDType	frontID;
	///会话编号
	2: CMSDataType.TThostFtdcSessionIDType	sessionID;
	///系统名称
	3: CMSDataType.TThostFtdcSystemNameType	systemName;
}

///前置状态
struct CThostFtdcFrontStatusField
{
	///前置编号
	1: CMSDataType.TThostFtdcFrontIDType	frontID;
	///上次报告日期
	2: CMSDataType.TThostFtdcDateType	lastReportDate;
	///上次报告时间
	3: CMSDataType.TThostFtdcTimeType	lastReportTime;
	///是否活跃
	4: CMSDataType.TThostFtdcBoolType	isActive;
}

///用户口令变更
struct CThostFtdcUserPasswordUpdateField
{
	///经纪公司代码
	1: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///用户代码
	2: CMSDataType.TThostFtdcUserIDType	userID;
	///原来的口令
	3: CMSDataType.TThostFtdcPasswordType	oldPassword;
	///新的口令
	4: CMSDataType.TThostFtdcPasswordType	newPassword;
}

///输入报单
struct CThostFtdcInputOrderField
{
	///经纪公司代码
	1: CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2: CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3: CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///报单引用
	4: CMSDataType.TThostFtdcOrderRefType	orderRef;
	///用户代码
	5: CMSDataType.TThostFtdcUserIDType	userID;
	///报单价格条件
	6: CMSDataType.TThostFtdcOrderPriceTypeType	orderPriceType;
	///买卖方向
	7: CMSDataType.TThostFtdcDirectionType	direction;
	///组合开平标志
	8: CMSDataType.TThostFtdcCombOffsetFlagType	combOffsetFlag;
	///组合投机套保标志
	9: CMSDataType.TThostFtdcCombHedgeFlagType	combHedgeFlag;
	///价格
	10: CMSDataType.TThostFtdcPriceType	limitPrice;
	///数量
	11: CMSDataType.TThostFtdcVolumeType	volumeTotalOriginal;
	///有效期类型
	12: CMSDataType.TThostFtdcTimeConditionType	timeCondition;
	///GTD日期
	13: CMSDataType.TThostFtdcDateType	gtdDate;
	///成交量类型
	14: CMSDataType.TThostFtdcVolumeConditionType	volumeCondition;
	///最小成交量
	15: CMSDataType.TThostFtdcVolumeType	minVolume;
	///触发条件
	16: CMSDataType.TThostFtdcContingentConditionType	contingentCondition;
	///止损价
	17: CMSDataType.TThostFtdcPriceType	stopPrice;
	///强平原因
	18: CMSDataType.TThostFtdcForceCloseReasonType	forceCloseReason;
	///自动挂起标志
	19: CMSDataType.TThostFtdcBoolType	isAutoSuspend;
	///业务单元
	20: CMSDataType.TThostFtdcBusinessUnitType	businessUnit;
	///请求编号
	21: CMSDataType.TThostFtdcRequestIDType	requestID;
	///用户强评标志
	22: CMSDataType.TThostFtdcBoolType	userForceClose;
	///互换单标志
	23: CMSDataType.TThostFtdcBoolType	isSwapOrder;
}

///Fens用户信息
struct CThostFtdcFensUserInfoField
{
 ///经纪公司代码
 1:CMSDataType.TThostFtdcBrokerIDType brokerID;
 ///用户代码
 2:CMSDataType.TThostFtdcUserIDType userID;
 ///登录模式
 3:CMSDataType.TThostFtdcLoginModeType loginMode;
}

///报单
struct CThostFtdcOrderField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType instrumentID;
	///报单引用
	4:CMSDataType.TThostFtdcOrderRefType orderRef;
	///用户代码
	5:CMSDataType.TThostFtdcUserIDType	userID;
	///报单价格条件
	6:CMSDataType.TThostFtdcOrderPriceTypeType	orderPriceType;
	///买卖方向
	7:CMSDataType.TThostFtdcDirectionType	direction;
	///组合开平标志
	8:CMSDataType.TThostFtdcCombOffsetFlagType	combOffsetFlag;
	///组合投机套保标志
	9:CMSDataType.TThostFtdcCombHedgeFlagType	combHedgeFlag;
	///价格
	10:CMSDataType.TThostFtdcPriceType	limitPrice;
	///数量
	11:CMSDataType.TThostFtdcVolumeType	volumeTotalOriginal;
	///有效期类型
	12:CMSDataType.TThostFtdcTimeConditionType	timeCondition;
	///GTD日期
	13:CMSDataType.TThostFtdcDateType	gTDDate;
	///成交量类型
	14:CMSDataType.TThostFtdcVolumeConditionType	volumeCondition;
	///最小成交量
	15:CMSDataType.TThostFtdcVolumeType	minVolume;
	///触发条件
	16:CMSDataType.TThostFtdcContingentConditionType	contingentCondition;
	///止损价
	17:CMSDataType.TThostFtdcPriceType	stopPrice;
	///强平原因
	18:CMSDataType.TThostFtdcForceCloseReasonType	forceCloseReason;
	///自动挂起标志
	19:CMSDataType.TThostFtdcBoolType isAutoSuspend;
	///业务单元
	20:CMSDataType.TThostFtdcBusinessUnitType businessUnit;
	///请求编号
	21:CMSDataType.TThostFtdcRequestIDType	requestID;
	///本地报单编号
	22:CMSDataType.TThostFtdcOrderLocalIDType orderLocalID;
	///交易所代码
	23:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///会员代码
	24:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///客户代码
	25:CMSDataType.TThostFtdcClientIDType	clientID;
	///合约在交易所的代码
	26:CMSDataType.TThostFtdcExchangeInstIDType	exchangeInstID;
	///交易所交易员代码
	27:CMSDataType.TThostFtdcTraderIDType	traderID;
	///安装编号
	28:CMSDataType.TThostFtdcInstallIDType	installID;
	///报单提交状态
	29:CMSDataType.TThostFtdcOrderSubmitStatusType	orderSubmitStatus;
	///报单提示序号
	30:CMSDataType.TThostFtdcSequenceNoType	notifySequence;
	///交易日
	31:CMSDataType.TThostFtdcDateType	tradingDay;
	///结算编号
	32:CMSDataType.TThostFtdcSettlementIDType	settlementID;
	///报单编号
	33:CMSDataType.TThostFtdcOrderSysIDType	orderSysID;
	///报单来源
	34:CMSDataType.TThostFtdcOrderSourceType	orderSource;
	///报单状态
	35:CMSDataType.TThostFtdcOrderStatusType	orderStatus;
	///报单类型
	36:CMSDataType.TThostFtdcOrderTypeType	orderType;
	///今成交数量
	37:CMSDataType.TThostFtdcVolumeType	volumeTraded;
	///剩余数量
	38:CMSDataType.TThostFtdcVolumeType	volumeTotal;
	///报单日期
	39:CMSDataType.TThostFtdcDateType	insertDate;
	///委托时间
	40:CMSDataType.TThostFtdcTimeType	insertTime;
	///激活时间
	41:CMSDataType.TThostFtdcTimeType	activeTime;
	///挂起时间
	42:CMSDataType.TThostFtdcTimeType	suspendTime;
	///最后修改时间
	43:CMSDataType.TThostFtdcTimeType	updateTime;
	///撤销时间
	44:CMSDataType.TThostFtdcTimeType	cancelTime;
	///最后修改交易所交易员代码
	45:CMSDataType.TThostFtdcTraderIDType	activeTraderID;
	///结算会员编号
	46:CMSDataType.TThostFtdcParticipantIDType	clearingPartID;
	///序号
	47:CMSDataType.TThostFtdcSequenceNoType	sequenceNo;
	///前置编号
	48:CMSDataType.TThostFtdcFrontIDType	frontID;
	///会话编号
	49:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///用户端产品信息
	50:CMSDataType.TThostFtdcProductInfoType	userProductInfo;
	///状态信息
	51:CMSDataType.TThostFtdcErrorMsgType	statusMsg;
	///用户强评标志
	52:CMSDataType.TThostFtdcBoolType	userForceClose;
	///操作用户代码
	53:CMSDataType.TThostFtdcUserIDType	activeUserID;
	///经纪公司报单编号
	54:CMSDataType.TThostFtdcSequenceNoType	brokerOrderSeq;
	///相关报单
	55:CMSDataType.TThostFtdcOrderSysIDType	relativeOrderSysID;
	///郑商所成交数量
	56:CMSDataType.TThostFtdcVolumeType	zCETotalTradedVolume;
	///互换单标志
	57:CMSDataType.TThostFtdcBoolType	isSwapOrder;
}

///交易所报单
struct CThostFtdcExchangeOrderField
{
	///报单价格条件
	1:CMSDataType.TThostFtdcOrderPriceTypeType	orderPriceType;
	///买卖方向
	2:CMSDataType.TThostFtdcDirectionType	direction;
	///组合开平标志
	3:CMSDataType.TThostFtdcCombOffsetFlagType	combOffsetFlag;
	///组合投机套保标志
	4:CMSDataType.TThostFtdcCombHedgeFlagType	combHedgeFlag;
	///价格
	5:CMSDataType.TThostFtdcPriceType	limitPrice;
	///数量
	6:CMSDataType.TThostFtdcVolumeType	volumeTotalOriginal;
	///有效期类型
	7:CMSDataType.TThostFtdcTimeConditionType	timeCondition;
	///GTD日期
	8:CMSDataType.TThostFtdcDateType	gTDDate;
	///成交量类型
	9:CMSDataType.TThostFtdcVolumeConditionType	volumeCondition;
	///最小成交量
	10:CMSDataType.TThostFtdcVolumeType	minVolume;
	///触发条件
	11:CMSDataType.TThostFtdcContingentConditionType	contingentCondition;
	///止损价
	12:CMSDataType.TThostFtdcPriceType	stopPrice;
	///强平原因
	13:CMSDataType.TThostFtdcForceCloseReasonType	forceCloseReason;
	///自动挂起标志
	14:CMSDataType.TThostFtdcBoolType	isAutoSuspend;
	///业务单元
	15:CMSDataType.TThostFtdcBusinessUnitType	businessUnit;
	///请求编号
	16:CMSDataType.TThostFtdcRequestIDType	requestID;
	///本地报单编号
	17:CMSDataType.TThostFtdcOrderLocalIDType	orderLocalID;
	///交易所代码
	18:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///会员代码
	19:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///客户代码
	20:CMSDataType.TThostFtdcClientIDType	clientID;
	///合约在交易所的代码
	21:CMSDataType.TThostFtdcExchangeInstIDType	exchangeInstID;
	///交易所交易员代码
	22:CMSDataType.TThostFtdcTraderIDType	traderID;
	///安装编号
	23:CMSDataType.TThostFtdcInstallIDType	installID;
	///报单提交状态
	24:CMSDataType.TThostFtdcOrderSubmitStatusType	orderSubmitStatus;
	///报单提示序号
	25:CMSDataType.TThostFtdcSequenceNoType	notifySequence;
	///交易日
	26:CMSDataType.TThostFtdcDateType	tradingDay;
	///结算编号
	27:CMSDataType.TThostFtdcSettlementIDType	settlementID;
	///报单编号
	28:CMSDataType.TThostFtdcOrderSysIDType	orderSysID;
	///报单来源
	29:CMSDataType.TThostFtdcOrderSourceType	orderSource;
	///报单状态
	30:CMSDataType.TThostFtdcOrderStatusType	orderStatus;
	///报单类型
	31:CMSDataType.TThostFtdcOrderTypeType	orderType;
	///今成交数量
	32:CMSDataType.TThostFtdcVolumeType	volumeTraded;
	///剩余数量
	33:CMSDataType.TThostFtdcVolumeType	volumeTotal;
	///报单日期
	34:CMSDataType.TThostFtdcDateType	insertDate;
	///委托时间
	35:CMSDataType.TThostFtdcTimeType	insertTime;
	///激活时间
	36:CMSDataType.TThostFtdcTimeType	activeTime;
	///挂起时间
	37:CMSDataType.TThostFtdcTimeType	suspendTime;
	///最后修改时间
	38:CMSDataType.TThostFtdcTimeType	updateTime;
	///撤销时间
	39:CMSDataType.TThostFtdcTimeType	cancelTime;
	///最后修改交易所交易员代码
	40:CMSDataType.TThostFtdcTraderIDType	activeTraderID;
	///结算会员编号
	41:CMSDataType.TThostFtdcParticipantIDType	clearingPartID;
	///序号
	42:CMSDataType.TThostFtdcSequenceNoType	sequenceNo;
}

///交易所报单插入失败
struct CThostFtdcExchangeOrderInsertErrorField
{
	///交易所代码
	1:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///会员代码
	2:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///交易所交易员代码
	3:CMSDataType.TThostFtdcTraderIDType	traderID;
	///安装编号
	4:CMSDataType.TThostFtdcInstallIDType	installID;
	///本地报单编号
	5:CMSDataType.TThostFtdcOrderLocalIDType	orderLocalID;
	///错误代码
	6:CMSDataType.TThostFtdcErrorIDType	errorID;
	///错误信息
	7:CMSDataType.TThostFtdcErrorMsgType	errorMsg;
}

///输入报单操作
struct CThostFtdcInputOrderActionField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///报单操作引用
	3:CMSDataType.TThostFtdcOrderActionRefType	orderActionRef;
	///报单引用
	4:CMSDataType.TThostFtdcOrderRefType	orderRef;
	///请求编号
	5:CMSDataType.TThostFtdcRequestIDType	requestID;
	///前置编号
	6:CMSDataType.TThostFtdcFrontIDType	frontID;
	///会话编号
	7:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///交易所代码
	8:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///报单编号
	9:CMSDataType.TThostFtdcOrderSysIDType	orderSysID;
	///操作标志
	10:CMSDataType.TThostFtdcActionFlagType	sctionFlag;
	///价格
	11:CMSDataType.TThostFtdcPriceType	limitPrice;
	///数量变化
	12:CMSDataType.TThostFtdcVolumeType	volumeChange;
	///用户代码
	13:CMSDataType.TThostFtdcUserIDType	userID;
	///合约代码
	14:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
}

///报单操作
struct CThostFtdcOrderActionField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///报单操作引用
	3:CMSDataType.TThostFtdcOrderActionRefType	orderActionRef;
	///报单引用
	4:CMSDataType.TThostFtdcOrderRefType	orderRef;
	///请求编号
	5:CMSDataType.TThostFtdcRequestIDType	requestID;
	///前置编号
	6:CMSDataType.TThostFtdcFrontIDType	frontID;
	///会话编号
	7:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///交易所代码
	8:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///报单编号
	9:CMSDataType.TThostFtdcOrderSysIDType	orderSysID;
	///操作标志
	10:CMSDataType.TThostFtdcActionFlagType	actionFlag;
	///价格
	11:CMSDataType.TThostFtdcPriceType	limitPrice;
	///数量变化
	12:CMSDataType.TThostFtdcVolumeType	volumeChange;
	///操作日期
	13:CMSDataType.TThostFtdcDateType	actionDate;
	///操作时间
	14:CMSDataType.TThostFtdcTimeType	actionTime;
	///交易所交易员代码
	15:CMSDataType.TThostFtdcTraderIDType	traderID;
	///安装编号
	16:CMSDataType.TThostFtdcInstallIDType	installID;
	///本地报单编号
	17:CMSDataType.TThostFtdcOrderLocalIDType	orderLocalID;
	///操作本地编号
	18:CMSDataType.TThostFtdcOrderLocalIDType	actionLocalID;
	///会员代码
	19:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///客户代码
	20:CMSDataType.TThostFtdcClientIDType	clientID;
	///业务单元
	21:CMSDataType.TThostFtdcBusinessUnitType	businessUnit;
	///报单操作状态
	22:CMSDataType.TThostFtdcOrderActionStatusType	orderActionStatus;
	///用户代码
	23:CMSDataType.TThostFtdcUserIDType	userID;
	///状态信息
	24:CMSDataType.TThostFtdcErrorMsgType	dtatusMsg;
	///合约代码
	25:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
}

///交易所报单操作
struct CThostFtdcExchangeOrderActionField
{
	///交易所代码
	1:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///报单编号
	2:CMSDataType.TThostFtdcOrderSysIDType	OrderSysID;
	///操作标志
	3:CMSDataType.TThostFtdcActionFlagType	ActionFlag;
	///价格
	4:CMSDataType.TThostFtdcPriceType	LimitPrice;
	///数量变化
	5:CMSDataType.TThostFtdcVolumeType	VolumeChange;
	///操作日期
	6:CMSDataType.TThostFtdcDateType	ActionDate;
	///操作时间
	7:CMSDataType.TThostFtdcTimeType	ActionTime;
	///交易所交易员代码
	8:CMSDataType.TThostFtdcTraderIDType	TraderID;
	///安装编号
	9:CMSDataType.TThostFtdcInstallIDType	InstallID;
	///本地报单编号
	10:CMSDataType.TThostFtdcOrderLocalIDType	OrderLocalID;
	///操作本地编号
	11:CMSDataType.TThostFtdcOrderLocalIDType	ActionLocalID;
	///会员代码
	12:CMSDataType.TThostFtdcParticipantIDType	ParticipantID;
	///客户代码
	13:CMSDataType.TThostFtdcClientIDType	ClientID;
	///业务单元
	14:CMSDataType.TThostFtdcBusinessUnitType	BusinessUnit;
	///报单操作状态
	15:CMSDataType.TThostFtdcOrderActionStatusType	OrderActionStatus;
	///用户代码
	16:CMSDataType.TThostFtdcUserIDType	UserID;
}

///交易所报单操作失败
struct CThostFtdcExchangeOrderActionErrorField
{
	///交易所代码
	1:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///报单编号
	2:CMSDataType.TThostFtdcOrderSysIDType	orderSysID;
	///交易所交易员代码
	3:CMSDataType.TThostFtdcTraderIDType	traderID;
	///安装编号
	4:CMSDataType.TThostFtdcInstallIDType	installID;
	///本地报单编号
	5:CMSDataType.TThostFtdcOrderLocalIDType	orderLocalID;
	///操作本地编号
	6:CMSDataType.TThostFtdcOrderLocalIDType	actionLocalID;
	///错误代码
	7:CMSDataType.TThostFtdcErrorIDType	errorID;
	///错误信息
	8:CMSDataType.TThostFtdcErrorMsgType	errorMsg;
}

///交易所成交
struct CThostFtdcExchangeTradeField
{
	///交易所代码
	1:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///成交编号
	2:CMSDataType.TThostFtdcTradeIDType	tradeID;
	///买卖方向
	3:CMSDataType.TThostFtdcDirectionType	direction;
	///报单编号
	4:CMSDataType.TThostFtdcOrderSysIDType	orderSysID;
	///会员代码
	5:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///客户代码
	6:CMSDataType.TThostFtdcClientIDType	clientID;
	///交易角色
	7:CMSDataType.TThostFtdcTradingRoleType	tradingRole;
	///合约在交易所的代码
	8:CMSDataType.TThostFtdcExchangeInstIDType	exchangeInstID;
	///开平标志
	9:CMSDataType.TThostFtdcOffsetFlagType	offsetFlag;
	///投机套保标志
	10:CMSDataType.TThostFtdcHedgeFlagType	hedgeFlag;
	///价格
	11:CMSDataType.TThostFtdcPriceType	price;
	///数量
	12:CMSDataType.TThostFtdcVolumeType	volume;
	///成交时期
	13:CMSDataType.TThostFtdcDateType	tradeDate;
	///成交时间
	14:CMSDataType.TThostFtdcTimeType	tradeTime;
	///成交类型
	15:CMSDataType.TThostFtdcTradeTypeType	tradeType;
	///成交价来源
	16:CMSDataType.TThostFtdcPriceSourceType	priceSource;
	///交易所交易员代码
	17:CMSDataType.TThostFtdcTraderIDType	traderID;
	///本地报单编号
	18:CMSDataType.TThostFtdcOrderLocalIDType	orderLocalID;
	///结算会员编号
	19:CMSDataType.TThostFtdcParticipantIDType	clearingPartID;
	///业务单元
	20:CMSDataType.TThostFtdcBusinessUnitType	businessUnit;
	///序号
	21:CMSDataType.TThostFtdcSequenceNoType	dequenceNo;
	///成交来源
	22:CMSDataType.TThostFtdcTradeSourceType	tradeSource;
}

///成交
struct CThostFtdcTradeField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///报单引用
	4:CMSDataType.TThostFtdcOrderRefType	orderRef;
	///用户代码
	5:CMSDataType.TThostFtdcUserIDType	userID;
	///交易所代码
	6:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///成交编号
	7:CMSDataType.TThostFtdcTradeIDType	tradeID;
	///买卖方向
	8:CMSDataType.TThostFtdcDirectionType	direction;
	///报单编号
	9:CMSDataType.TThostFtdcOrderSysIDType	orderSysID;
	///会员代码
	10:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///客户代码
	11:CMSDataType.TThostFtdcClientIDType	clientID;
	///交易角色
	12:CMSDataType.TThostFtdcTradingRoleType	tradingRole;
	///合约在交易所的代码
	13:CMSDataType.TThostFtdcExchangeInstIDType	exchangeInstID;
	///开平标志
	14:CMSDataType.TThostFtdcOffsetFlagType	offsetFlag;
	///投机套保标志
	15:CMSDataType.TThostFtdcHedgeFlagType	fedgeFlag;
	///价格
	16:CMSDataType.TThostFtdcPriceType	price;
	///数量
	17:CMSDataType.TThostFtdcVolumeType	volume;
	///成交时期
	18:CMSDataType.TThostFtdcDateType	tradeDate;
	///成交时间
	19:CMSDataType.TThostFtdcTimeType	tradeTime;
	///成交类型
	20:CMSDataType.TThostFtdcTradeTypeType	tradeType;
	///成交价来源
	21:CMSDataType.TThostFtdcPriceSourceType	priceSource;
	///交易所交易员代码
	22:CMSDataType.TThostFtdcTraderIDType	traderID;
	///本地报单编号
	23:CMSDataType.TThostFtdcOrderLocalIDType	orderLocalID;
	///结算会员编号
	24:CMSDataType.TThostFtdcParticipantIDType	clearingPartID;
	///业务单元
	25:CMSDataType.TThostFtdcBusinessUnitType	businessUnit;
	///序号
	26:CMSDataType.TThostFtdcSequenceNoType	sequenceNo;
	///交易日
	27:CMSDataType.TThostFtdcDateType	tradingDay;
	///结算编号
	28:CMSDataType.TThostFtdcSettlementIDType	settlementID;
	///经纪公司报单编号
	29:CMSDataType.TThostFtdcSequenceNoType	brokerOrderSeq;
	///成交来源
	30:CMSDataType.TThostFtdcTradeSourceType	tradeSource;
}

///用户会话
struct CThostFtdcUserSessionField
{
	///前置编号
	1:CMSDataType.TThostFtdcFrontIDType	frontID;
	///会话编号
	2:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///经纪公司代码
	3:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///用户代码
	4:CMSDataType.TThostFtdcUserIDType	userID;
	///登录日期
	5:CMSDataType.TThostFtdcDateType	loginDate;
	///登录时间
	6:CMSDataType.TThostFtdcTimeType	loginTime;
	///IP地址
	7:CMSDataType.TThostFtdcIPAddressType	iPAddress;
	///用户端产品信息
	8:CMSDataType.TThostFtdcProductInfoType	userProductInfo;
	///接口端产品信息
	9:CMSDataType.TThostFtdcProductInfoType	interfaceProductInfo;
	///协议信息
	10:CMSDataType.TThostFtdcProtocolInfoType	protocolInfo;
	///Mac地址
	11:CMSDataType.TThostFtdcMacAddressType	macAddress;
}

///查询最大报单数量
struct CThostFtdcQueryMaxOrderVolumeField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///买卖方向
	4:CMSDataType.TThostFtdcDirectionType	direction;
	///开平标志
	5:CMSDataType.TThostFtdcOffsetFlagType	offsetFlag;
	///投机套保标志
	6:CMSDataType.TThostFtdcHedgeFlagType	hedgeFlag;
	///最大允许报单数量
	7:CMSDataType.TThostFtdcVolumeType	maxVolume;
}

///投资者结算结果确认信息
struct CThostFtdcSettlementInfoConfirmField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///确认日期
	3:CMSDataType.TThostFtdcDateType	confirmDate;
	///确认时间
	4:CMSDataType.TThostFtdcTimeType	confirmTime;
}

///出入金同步
struct CThostFtdcSyncDepositField
{
	///出入金流水号
	1:CMSDataType.TThostFtdcDepositSeqNoType	depositSeqNo;
	///经纪公司代码
	2:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	3:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///入金金额
	4:CMSDataType.TThostFtdcMoneyType	deposit;
	///是否强制进行
	5:CMSDataType.TThostFtdcBoolType	isForce;
	///币种代码
	6:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
}

///货币质押同步
struct CThostFtdcSyncFundMortgageField
{
	///货币质押流水号
	1:CMSDataType.TThostFtdcDepositSeqNoType	mortgageSeqNo;
	///经纪公司代码
	2:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	3:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///源币种
	4:CMSDataType.TThostFtdcCurrencyIDType	fromCurrencyID;
	///质押金额
	5:CMSDataType.TThostFtdcMoneyType	mortgageAmount;
	///目标币种
	6:CMSDataType.TThostFtdcCurrencyIDType	toCurrencyID;
}

///经纪公司同步
struct CThostFtdcBrokerSyncField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
}

///正在同步中的投资者
struct CThostFtdcSyncingInvestorField
{
	///投资者代码
	1:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///经纪公司代码
	2:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者分组代码
	3:CMSDataType.TThostFtdcInvestorIDType	investorGroupID;
	///投资者名称
	4:CMSDataType.TThostFtdcPartyNameType	investorName;
	///证件类型
	5:CMSDataType.TThostFtdcIdCardTypeType	identifiedCardType;
	///证件号码
	6:CMSDataType.TThostFtdcIdentifiedCardNoType	identifiedCardNo;
	///是否活跃
	7:CMSDataType.TThostFtdcBoolType	isActive;
	///联系电话
	8:CMSDataType.TThostFtdcTelephoneType	telephone;
	///通讯地址
	9:CMSDataType.TThostFtdcAddressType	address;
	///开户日期
	10:CMSDataType.TThostFtdcDateType	openDate;
	///手机
	11:CMSDataType.TThostFtdcMobileType	mobile;
	///手续费率模板代码
	12:CMSDataType.TThostFtdcInvestorIDType	commModelID;
	///保证金率模板代码
	13:CMSDataType.TThostFtdcInvestorIDType	marginModelID;
}

///正在同步中的交易代码
struct CThostFtdcSyncingTradingCodeField
{
	///投资者代码
	1:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///经纪公司代码
	2:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///交易所代码
	3:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///客户代码
	4:CMSDataType.TThostFtdcClientIDType	clientID;
	///是否活跃
	5:CMSDataType.TThostFtdcBoolType	isActive;
	///交易编码类型
	6:CMSDataType.TThostFtdcClientIDTypeType	clientIDType;
}

///正在同步中的投资者分组
struct CThostFtdcSyncingInvestorGroupField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者分组代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorGroupID;
	///投资者分组名称
	3:CMSDataType.TThostFtdcInvestorGroupNameType	investorGroupName;
}

///正在同步中的交易账号
struct CThostFtdcSyncingTradingAccountField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者帐号
	2:CMSDataType.TThostFtdcAccountIDType	accountID;
	///上次质押金额
	3:CMSDataType.TThostFtdcMoneyType	preMortgage;
	///上次信用额度
	4:CMSDataType.TThostFtdcMoneyType	preCredit;
	///上次存款额
	5:CMSDataType.TThostFtdcMoneyType	preDeposit;
	///上次结算准备金
	6:CMSDataType.TThostFtdcMoneyType	preBalance;
	///上次占用的保证金
	7:CMSDataType.TThostFtdcMoneyType	preMargin;
	///利息基数
	8:CMSDataType.TThostFtdcMoneyType	interestBase;
	///利息收入
	9:CMSDataType.TThostFtdcMoneyType	interest;
	///入金金额
	10:CMSDataType.TThostFtdcMoneyType	deposit;
	///出金金额
	11:CMSDataType.TThostFtdcMoneyType	withdraw;
	///冻结的保证金
	12:CMSDataType.TThostFtdcMoneyType	frozenMargin;
	///冻结的资金
	13:CMSDataType.TThostFtdcMoneyType	frozenCash;
	///冻结的手续费
	14:CMSDataType.TThostFtdcMoneyType	frozenCommission;
	///当前保证金总额
	15:CMSDataType.TThostFtdcMoneyType	currMargin;
	///资金差额
	16:CMSDataType.TThostFtdcMoneyType	cashIn;
	///手续费
	17:CMSDataType.TThostFtdcMoneyType	commission;
	///平仓盈亏
	18:CMSDataType.TThostFtdcMoneyType	closeProfit;
	///持仓盈亏
	19:CMSDataType.TThostFtdcMoneyType	positionProfit;
	///期货结算准备金
	20:CMSDataType.TThostFtdcMoneyType	balance;
	///可用资金
	21:CMSDataType.TThostFtdcMoneyType	available;
	///可取资金
	22:CMSDataType.TThostFtdcMoneyType	withdrawQuota;
	///基本准备金
	23:CMSDataType.TThostFtdcMoneyType	reserve;
	///交易日
	24:CMSDataType.TThostFtdcDateType	tradingDay;
	///结算编号
	25:CMSDataType.TThostFtdcSettlementIDType	settlementID;
	///信用额度
	26:CMSDataType.TThostFtdcMoneyType	credit;
	///质押金额
	27:CMSDataType.TThostFtdcMoneyType	mortgage;
	///交易所保证金
	28:CMSDataType.TThostFtdcMoneyType	exchangeMargin;
	///投资者交割保证金
	29:CMSDataType.TThostFtdcMoneyType	deliveryMargin;
	///交易所交割保证金
	30:CMSDataType.TThostFtdcMoneyType	exchangeDeliveryMargin;
	///保底期货结算准备金
	31:CMSDataType.TThostFtdcMoneyType	reserveBalance;
	///币种代码
	32:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///上次货币质入金额
	33:CMSDataType.TThostFtdcMoneyType	preFundMortgageIn;
	///上次货币质出金额
	34:CMSDataType.TThostFtdcMoneyType	preFundMortgageOut;
	///货币质入金额
	35:CMSDataType.TThostFtdcMoneyType	fundMortgageIn;
	///货币质出金额
	36:CMSDataType.TThostFtdcMoneyType	fundMortgageOut;
	///货币质押余额
	37:CMSDataType.TThostFtdcMoneyType	fundMortgageAvailable;
	///可质押货币金额
	38:CMSDataType.TThostFtdcMoneyType	mortgageableFund;
	///特殊产品占用保证金
	39:CMSDataType.TThostFtdcMoneyType	specProductMargin;
	///特殊产品冻结保证金
	40:CMSDataType.TThostFtdcMoneyType	specProductFrozenMargin;
	///特殊产品手续费
	41:CMSDataType.TThostFtdcMoneyType	specProductCommission;
	///特殊产品冻结手续费
	42:CMSDataType.TThostFtdcMoneyType	specProductFrozenCommission;
	///特殊产品持仓盈亏
	43:CMSDataType.TThostFtdcMoneyType	specProductPositionProfit;
	///特殊产品平仓盈亏
	44:CMSDataType.TThostFtdcMoneyType	specProductCloseProfit;
	///根据持仓盈亏算法计算的特殊产品持仓盈亏
	45:CMSDataType.TThostFtdcMoneyType	specProductPositionProfitByAlg;
	///特殊产品交易所保证金
	46:CMSDataType.TThostFtdcMoneyType	specProductExchangeMargin;
}

///正在同步中的投资者持仓
struct CThostFtdcSyncingInvestorPositionField
{
	///合约代码
	1:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///经纪公司代码
	2:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	3:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///持仓多空方向
	4:CMSDataType.TThostFtdcPosiDirectionType	posiDirection;
	///投机套保标志
	5:CMSDataType.TThostFtdcHedgeFlagType	hedgeFlag;
	///持仓日期
	6:CMSDataType.TThostFtdcPositionDateType	positionDate;
	///上日持仓
	7:CMSDataType.TThostFtdcVolumeType	ydPosition;
	///今日持仓
	8:CMSDataType.TThostFtdcVolumeType	position;
	///多头冻结
	9:CMSDataType.TThostFtdcVolumeType	longFrozen;
	///空头冻结
	10:CMSDataType.TThostFtdcVolumeType	shortFrozen;
	///开仓冻结金额
	11:CMSDataType.TThostFtdcMoneyType	longFrozenAmount;
	///开仓冻结金额
	12:CMSDataType.TThostFtdcMoneyType	shortFrozenAmount;
	///开仓量
	13:CMSDataType.TThostFtdcVolumeType	openVolume;
	///平仓量
	14:CMSDataType.TThostFtdcVolumeType	closeVolume;
	///开仓金额
	15:CMSDataType.TThostFtdcMoneyType	openAmount;
	///平仓金额
	16:CMSDataType.TThostFtdcMoneyType	closeAmount;
	///持仓成本
	17:CMSDataType.TThostFtdcMoneyType	positionCost;
	///上次占用的保证金
	18:CMSDataType.TThostFtdcMoneyType	preMargin;
	///占用的保证金
	19:CMSDataType.TThostFtdcMoneyType	useMargin;
	///冻结的保证金
	20:CMSDataType.TThostFtdcMoneyType	frozenMargin;
	///冻结的资金
	21:CMSDataType.TThostFtdcMoneyType	frozenCash;
	///冻结的手续费
	22:CMSDataType.TThostFtdcMoneyType	frozenCommission;
	///资金差额
	23:CMSDataType.TThostFtdcMoneyType	cashIn;
	///手续费
	24:CMSDataType.TThostFtdcMoneyType	commission;
	///平仓盈亏
	25:CMSDataType.TThostFtdcMoneyType	closeProfit;
	///持仓盈亏
	26:CMSDataType.TThostFtdcMoneyType	positionProfit;
	///上次结算价
	27:CMSDataType.TThostFtdcPriceType	preSettlementPrice;
	///本次结算价
	28:CMSDataType.TThostFtdcPriceType	settlementPrice;
	///交易日
	29:CMSDataType.TThostFtdcDateType	tradingDay;
	///结算编号
	30:CMSDataType.TThostFtdcSettlementIDType	settlementID;
	///开仓成本
	31:CMSDataType.TThostFtdcMoneyType	openCost;
	///交易所保证金
	32:CMSDataType.TThostFtdcMoneyType	exchangeMargin;
	///组合成交形成的持仓
	33:CMSDataType.TThostFtdcVolumeType	combPosition;
	///组合多头冻结
	34:CMSDataType.TThostFtdcVolumeType	combLongFrozen;
	///组合空头冻结
	35:CMSDataType.TThostFtdcVolumeType	combShortFrozen;
	///逐日盯市平仓盈亏
	36:CMSDataType.TThostFtdcMoneyType	closeProfitByDate;
	///逐笔对冲平仓盈亏
	37:CMSDataType.TThostFtdcMoneyType	closeProfitByTrade;
	///今日持仓
	38:CMSDataType.TThostFtdcVolumeType	todayPosition;
	///保证金率
	39:CMSDataType.TThostFtdcRatioType	marginRateByMoney;
	///保证金率(按手数)
	40:CMSDataType.TThostFtdcRatioType	marginRateByVolume;
	///执行冻结
	41:CMSDataType.TThostFtdcVolumeType	strikeFrozen;
	///执行冻结金额
	42:CMSDataType.TThostFtdcMoneyType	strikeFrozenAmount;
	///放弃执行冻结
	43:CMSDataType.TThostFtdcVolumeType	abandonFrozen;
}

///正在同步中的合约保证金率
struct CThostFtdcSyncingInstrumentMarginRateField
{
	///合约代码
	1:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///投资者范围
	2:CMSDataType.TThostFtdcInvestorRangeType	investorRange;
	///经纪公司代码
	3:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	4:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///投机套保标志
	5:CMSDataType.TThostFtdcHedgeFlagType	hedgeFlag;
	///多头保证金率
	6:CMSDataType.TThostFtdcRatioType	longMarginRatioByMoney;
	///多头保证金费
	7:CMSDataType.TThostFtdcMoneyType	longMarginRatioByVolume;
	///空头保证金率
	8:CMSDataType.TThostFtdcRatioType	shortMarginRatioByMoney;
	///空头保证金费
	9:CMSDataType.TThostFtdcMoneyType	shortMarginRatioByVolume;
	///是否相对交易所收取
	10:CMSDataType.TThostFtdcBoolType	isRelative;
}

///正在同步中的合约手续费率
struct CThostFtdcSyncingInstrumentCommissionRateField
{
	///合约代码
	1:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///投资者范围
	2:CMSDataType.TThostFtdcInvestorRangeType	investorRange;
	///经纪公司代码
	3:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	4:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///开仓手续费率
	5:CMSDataType.TThostFtdcRatioType	openRatioByMoney;
	///开仓手续费
	6:CMSDataType.TThostFtdcRatioType	openRatioByVolume;
	///平仓手续费率
	7:CMSDataType.TThostFtdcRatioType	closeRatioByMoney;
	///平仓手续费
	8:CMSDataType.TThostFtdcRatioType	closeRatioByVolume;
	///平今手续费率
	9:CMSDataType.TThostFtdcRatioType	closeTodayRatioByMoney;
	///平今手续费
	10:CMSDataType.TThostFtdcRatioType	closeTodayRatioByVolume;
}

///正在同步中的合约交易权限
struct CThostFtdcSyncingInstrumentTradingRightField
{
	///合约代码
	1:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///投资者范围
	2:CMSDataType.TThostFtdcInvestorRangeType	investorRange;
	///经纪公司代码
	3:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	4:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///交易权限
	5:CMSDataType.TThostFtdcTradingRightType	tradingRight;
}

///查询报单
struct CThostFtdcQryOrderField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///交易所代码
	4:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///报单编号
	5:CMSDataType.TThostFtdcOrderSysIDType	orderSysID;
	///开始时间
	6:CMSDataType.TThostFtdcTimeType	insertTimeStart;
	///结束时间
	7:CMSDataType.TThostFtdcTimeType	insertTimeEnd;
}

///查询成交
struct CThostFtdcQryTradeField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///交易所代码
	4:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///成交编号
	5:CMSDataType.TThostFtdcTradeIDType	tradeID;
	///开始时间
	6:CMSDataType.TThostFtdcTimeType	tradeTimeStart;
	///结束时间
	7:CMSDataType.TThostFtdcTimeType	tradeTimeEnd;
}

///查询投资者持仓
struct CThostFtdcQryInvestorPositionField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
}

///查询资金账户
struct CThostFtdcQryTradingAccountField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///币种代码
	3:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
}

///查询投资者
struct CThostFtdcQryInvestorField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
}

///查询交易编码
struct CThostFtdcQryTradingCodeField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///交易所代码
	3:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///客户代码
	4:CMSDataType.TThostFtdcClientIDType	clientID;
	///交易编码类型
	5:CMSDataType.TThostFtdcClientIDTypeType	clientIDType;
}

///查询投资者组
struct CThostFtdcQryInvestorGroupField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
}

///查询合约保证金率
struct CThostFtdcQryInstrumentMarginRateField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///投机套保标志
	4:CMSDataType.TThostFtdcHedgeFlagType	hedgeFlag;
}

///查询手续费率
struct CThostFtdcQryInstrumentCommissionRateField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
}

///查询合约交易权限
struct CThostFtdcQryInstrumentTradingRightField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
}

///查询经纪公司
struct CThostFtdcQryBrokerField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
}

///查询交易员
struct CThostFtdcQryTraderField
{
	///交易所代码
	1:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///会员代码
	2:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///交易所交易员代码
	3:CMSDataType.TThostFtdcTraderIDType	traderID;
}

///查询管理用户功能权限
struct CThostFtdcQrySuperUserFunctionField
{
	///用户代码
	1:CMSDataType.TThostFtdcUserIDType	userID;
}

///查询用户会话
struct CThostFtdcQryUserSessionField
{
	///前置编号
	1:CMSDataType.TThostFtdcFrontIDType	frontID;
	///会话编号
	2:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///经纪公司代码
	3:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///用户代码
	4:CMSDataType.TThostFtdcUserIDType	userID;
}

///查询经纪公司会员代码
struct CThostFtdcQryPartBrokerField
{
	///交易所代码
	1:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///经纪公司代码
	2:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///会员代码
	3:CMSDataType.TThostFtdcParticipantIDType	participantID;
}

///查询前置状态
struct CThostFtdcQryFrontStatusField
{
	///前置编号
	1:CMSDataType.TThostFtdcFrontIDType	frontID;
}

///查询交易所报单
struct CThostFtdcQryExchangeOrderField
{
	///会员代码
	1:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///客户代码
	2:CMSDataType.TThostFtdcClientIDType	clientID;
	///合约在交易所的代码
	3:CMSDataType.TThostFtdcExchangeInstIDType	exchangeInstID;
	///交易所代码
	4:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///交易所交易员代码
	5:CMSDataType.TThostFtdcTraderIDType	traderID;
}

///查询报单操作
struct CThostFtdcQryOrderActionField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///交易所代码
	3:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
}

///查询交易所报单操作
struct CThostFtdcQryExchangeOrderActionField
{
	///会员代码
	1:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///客户代码
	2:CMSDataType.TThostFtdcClientIDType	clientID;
	///交易所代码
	3:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///交易所交易员代码
	4:CMSDataType.TThostFtdcTraderIDType	traderID;
}

///查询管理用户
struct CThostFtdcQrySuperUserField
{
	///用户代码
	1:CMSDataType.TThostFtdcUserIDType	userID;
}

///查询交易所
struct CThostFtdcQryExchangeField
{
	///交易所代码
	1:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
}

///查询产品
struct CThostFtdcQryProductField
{
	///产品代码
	1:CMSDataType.TThostFtdcInstrumentIDType	productID;
	///产品类型
	2:CMSDataType.TThostFtdcProductClassType	productClass;
}

///查询合约
struct CThostFtdcQryInstrumentField
{
	///合约代码
	1:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///交易所代码
	2:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///合约在交易所的代码
	3:CMSDataType.TThostFtdcExchangeInstIDType	exchangeInstID;
	///产品代码
	4:CMSDataType.TThostFtdcInstrumentIDType	productID;
}

///查询行情
struct CThostFtdcQryDepthMarketDataField
{
	///合约代码
	1:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
}

///查询经纪公司用户
struct CThostFtdcQryBrokerUserField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///用户代码
	2:CMSDataType.TThostFtdcUserIDType	userID;
}

///查询经纪公司用户权限
struct CThostFtdcQryBrokerUserFunctionField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///用户代码
	2:CMSDataType.TThostFtdcUserIDType	userID;
}

///查询交易员报盘机
struct CThostFtdcQryTraderOfferField
{
	///交易所代码
	1:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///会员代码
	2:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///交易所交易员代码
	3:CMSDataType.TThostFtdcTraderIDType	traderID;
}

///查询出入金流水
struct CThostFtdcQrySyncDepositField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///出入金流水号
	2:CMSDataType.TThostFtdcDepositSeqNoType	depositSeqNo;
}

///查询投资者结算结果
struct CThostFtdcQrySettlementInfoField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///交易日
	3:CMSDataType.TThostFtdcDateType	tradingDay;
}


///查询交易所保证金率
struct CThostFtdcQryExchangeMarginRateField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///合约代码
	2:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///投机套保标志
	3:CMSDataType.TThostFtdcHedgeFlagType	hedgeFlag;
}

///查询交易所调整保证金率
struct CThostFtdcQryExchangeMarginRateAdjustField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///合约代码
	2:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///投机套保标志
	3:CMSDataType.TThostFtdcHedgeFlagType	hedgeFlag;
}

///查询汇率
struct CThostFtdcQryExchangeRateField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///源币种
	2:CMSDataType.TThostFtdcCurrencyIDType	fromCurrencyID;
	///目标币种
	3:CMSDataType.TThostFtdcCurrencyIDType	toCurrencyID;
}

///查询货币质押流水
struct CThostFtdcQrySyncFundMortgageField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///货币质押流水号
	2:CMSDataType.TThostFtdcDepositSeqNoType	mortgageSeqNo;
}

///查询报单
struct CThostFtdcQryHisOrderField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///交易所代码
	4:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///报单编号
	5:CMSDataType.TThostFtdcOrderSysIDType	orderSysID;
	///开始时间
	6:CMSDataType.TThostFtdcTimeType	insertTimeStart;
	///结束时间
	7:CMSDataType.TThostFtdcTimeType	insertTimeEnd;
	///交易日
	8:CMSDataType.TThostFtdcDateType	tradingDay;
	///结算编号
	9:CMSDataType.TThostFtdcSettlementIDType	settlementID;
}

///当前期权合约最小保证金
struct CThostFtdcOptionInstrMiniMarginField
{
	///合约代码
	1:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///投资者范围
	2:CMSDataType.TThostFtdcInvestorRangeType	investorRange;
	///经纪公司代码
	3:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	4:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///单位（手）期权合约最小保证金
	5:CMSDataType.TThostFtdcMoneyType	minMargin;
	///取值方式
	6:CMSDataType.TThostFtdcValueMethodType	valueMethod;
	///是否跟随交易所收取
	7:CMSDataType.TThostFtdcBoolType	isRelative;
}

///当前期权合约保证金调整系数
struct CThostFtdcOptionInstrMarginAdjustField
{
	///合约代码
	1:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///投资者范围
	2:CMSDataType.TThostFtdcInvestorRangeType	investorRange;
	///经纪公司代码
	3:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	4:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///投机空头保证金调整系数
	5:CMSDataType.TThostFtdcRatioType	sShortMarginRatioByMoney;
	///投机空头保证金调整系数
	6:CMSDataType.TThostFtdcMoneyType	sShortMarginRatioByVolume;
	///保值空头保证金调整系数
	7:CMSDataType.TThostFtdcRatioType	hShortMarginRatioByMoney;
	///保值空头保证金调整系数
	8:CMSDataType.TThostFtdcMoneyType	hShortMarginRatioByVolume;
	///套利空头保证金调整系数
	9:CMSDataType.TThostFtdcRatioType	aShortMarginRatioByMoney;
	///套利空头保证金调整系数
	10:CMSDataType.TThostFtdcMoneyType	aShortMarginRatioByVolume;
	///是否跟随交易所收取
	11:CMSDataType.TThostFtdcBoolType	isRelative;
}

///当前期权合约手续费的详细内容
struct CThostFtdcOptionInstrCommRateField
{
	///合约代码
	1:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///投资者范围
	2:CMSDataType.TThostFtdcInvestorRangeType	investorRange;
	///经纪公司代码
	3:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	4:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///开仓手续费率
	5:CMSDataType.TThostFtdcRatioType	openRatioByMoney;
	///开仓手续费
	6:CMSDataType.TThostFtdcRatioType	openRatioByVolume;
	///平仓手续费率
	7:CMSDataType.TThostFtdcRatioType	closeRatioByMoney;
	///平仓手续费
	8:CMSDataType.TThostFtdcRatioType	closeRatioByVolume;
	///平今手续费率
	9:CMSDataType.TThostFtdcRatioType	closeTodayRatioByMoney;
	///平今手续费
	10:CMSDataType.TThostFtdcRatioType	closeTodayRatioByVolume;
	///执行手续费率
	11:CMSDataType.TThostFtdcRatioType	strikeRatioByMoney;
	///执行手续费
	12:CMSDataType.TThostFtdcRatioType	strikeRatioByVolume;
}

///期权交易成本
struct CThostFtdcOptionInstrTradeCostField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///投机套保标志
	4:CMSDataType.TThostFtdcHedgeFlagType	hedgeFlag;
	///期权合约保证金不变部分
	5:CMSDataType.TThostFtdcMoneyType	fixedMargin;
	///期权合约最小保证金
	6:CMSDataType.TThostFtdcMoneyType	miniMargin;
	///期权合约权利金
	7:CMSDataType.TThostFtdcMoneyType	royalty;
	///交易所期权合约保证金不变部分
	8:CMSDataType.TThostFtdcMoneyType	exchFixedMargin;
	///交易所期权合约最小保证金
	9:CMSDataType.TThostFtdcMoneyType	exchMiniMargin;
}

///期权交易成本查询
struct CThostFtdcQryOptionInstrTradeCostField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///投机套保标志
	4:CMSDataType.TThostFtdcHedgeFlagType	hedgeFlag;
	///期权合约报价
	5:CMSDataType.TThostFtdcPriceType	inputPrice;
	///标的价格,填0则用昨结算价
	6:CMSDataType.TThostFtdcPriceType	underlyingPrice;
}

///期权手续费率查询
struct CThostFtdcQryOptionInstrCommRateField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
}

///股指现货指数
struct CThostFtdcIndexPriceField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///合约代码
	2:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///指数现货收盘价
	3:CMSDataType.TThostFtdcPriceType	closePrice;
}

///输入的执行宣告
struct CThostFtdcInputExecOrderField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///执行宣告引用
	4:CMSDataType.TThostFtdcOrderRefType	execOrderRef;
	///用户代码
	5:CMSDataType.TThostFtdcUserIDType	userID;
	///数量
	6:CMSDataType.TThostFtdcVolumeType	volume;
	///请求编号
	7:CMSDataType.TThostFtdcRequestIDType	requestID;
	///业务单元
	8:CMSDataType.TThostFtdcBusinessUnitType	businessUnit;
	///开平标志
	9:CMSDataType.TThostFtdcOffsetFlagType	offsetFlag;
	///投机套保标志
	10:CMSDataType.TThostFtdcHedgeFlagType	hedgeFlag;
	///执行类型
	11:CMSDataType.TThostFtdcActionTypeType	actionType;
	///保留头寸申请的持仓方向
	12:CMSDataType.TThostFtdcPosiDirectionType	posiDirection;
	///期权行权后是否保留期货头寸的标记
	13:CMSDataType.TThostFtdcExecOrderPositionFlagType	reservePositionFlag;
	///期权行权后生成的头寸是否自动平仓
	14:CMSDataType.TThostFtdcExecOrderCloseFlagType	closeFlag;
}

///输入执行宣告操作
struct CThostFtdcInputExecOrderActionField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///执行宣告操作引用
	3:CMSDataType.TThostFtdcOrderActionRefType	execOrderActionRef;
	///执行宣告引用
	4:CMSDataType.TThostFtdcOrderRefType	execOrderRef;
	///请求编号
	5:CMSDataType.TThostFtdcRequestIDType	requestID;
	///前置编号
	6:CMSDataType.TThostFtdcFrontIDType	frontID;
	///会话编号
	7:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///交易所代码
	8:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///执行宣告操作编号
	9:CMSDataType.TThostFtdcExecOrderSysIDType	execOrderSysID;
	///操作标志
	10:CMSDataType.TThostFtdcActionFlagType	actionFlag;
	///用户代码
	11:CMSDataType.TThostFtdcUserIDType	userID;
	///合约代码
	12:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
}

///执行宣告
struct CThostFtdcExecOrderField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///执行宣告引用
	4:CMSDataType.TThostFtdcOrderRefType	execOrderRef;
	///用户代码
	5:CMSDataType.TThostFtdcUserIDType	userID;
	///数量
	6:CMSDataType.TThostFtdcVolumeType	volume;
	///请求编号
	7:CMSDataType.TThostFtdcRequestIDType	requestID;
	///业务单元
	8:CMSDataType.TThostFtdcBusinessUnitType	businessUnit;
	///开平标志
	9:CMSDataType.TThostFtdcOffsetFlagType	offsetFlag;
	///投机套保标志
	10:CMSDataType.TThostFtdcHedgeFlagType	hedgeFlag;
	///执行类型
	11:CMSDataType.TThostFtdcActionTypeType	actionType;
	///保留头寸申请的持仓方向
	12:CMSDataType.TThostFtdcPosiDirectionType	posiDirection;
	///期权行权后是否保留期货头寸的标记
	13:CMSDataType.TThostFtdcExecOrderPositionFlagType	reservePositionFlag;
	///期权行权后生成的头寸是否自动平仓
	14:CMSDataType.TThostFtdcExecOrderCloseFlagType	closeFlag;
	///本地执行宣告编号
	15:CMSDataType.TThostFtdcOrderLocalIDType	execOrderLocalID;
	///交易所代码
	16:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///会员代码
	17:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///客户代码
	18:CMSDataType.TThostFtdcClientIDType	clientID;
	///合约在交易所的代码
	19:CMSDataType.TThostFtdcExchangeInstIDType	exchangeInstID;
	///交易所交易员代码
	20:CMSDataType.TThostFtdcTraderIDType	traderID;
	///安装编号
	21:CMSDataType.TThostFtdcInstallIDType	installID;
	///执行宣告提交状态
	22:CMSDataType.TThostFtdcOrderSubmitStatusType	orderSubmitStatus;
	///报单提示序号
	23:CMSDataType.TThostFtdcSequenceNoType	notifySequence;
	///交易日
	24:CMSDataType.TThostFtdcDateType	tradingDay;
	///结算编号
	25:CMSDataType.TThostFtdcSettlementIDType	settlementID;
	///执行宣告编号
	27:CMSDataType.TThostFtdcExecOrderSysIDType	execOrderSysID;
	///报单日期
	28:CMSDataType.TThostFtdcDateType	insertDate;
	///插入时间
	29:CMSDataType.TThostFtdcTimeType	insertTime;
	///撤销时间
	30:CMSDataType.TThostFtdcTimeType	cancelTime;
	///执行结果
	31:CMSDataType.TThostFtdcExecResultType	execResult;
	///结算会员编号
	32:CMSDataType.TThostFtdcParticipantIDType	clearingPartID;
	///序号
	33:CMSDataType.TThostFtdcSequenceNoType	sequenceNo;
	///前置编号
	34:CMSDataType.TThostFtdcFrontIDType	frontID;
	///会话编号
	35:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///用户端产品信息
	36:CMSDataType.TThostFtdcProductInfoType	userProductInfo;
	///状态信息
	37:CMSDataType.TThostFtdcErrorMsgType	statusMsg;
	///操作用户代码
	38:CMSDataType.TThostFtdcUserIDType	activeUserID;
	///经纪公司报单编号
	39:CMSDataType.TThostFtdcSequenceNoType	brokerExecOrderSeq;
}

///执行宣告操作
struct CThostFtdcExecOrderActionField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///执行宣告操作引用
	3:CMSDataType.TThostFtdcOrderActionRefType	execOrderActionRef;
	///执行宣告引用
	4:CMSDataType.TThostFtdcOrderRefType	execOrderRef;
	///请求编号
	5:CMSDataType.TThostFtdcRequestIDType	requestID;
	///前置编号
	6:CMSDataType.TThostFtdcFrontIDType	frontID;
	///会话编号
	7:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///交易所代码
	8:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///执行宣告操作编号
	9:CMSDataType.TThostFtdcExecOrderSysIDType	execOrderSysID;
	///操作标志
	10:CMSDataType.TThostFtdcActionFlagType	actionFlag;
	///操作日期
	11:CMSDataType.TThostFtdcDateType	actionDate;
	///操作时间
	12:CMSDataType.TThostFtdcTimeType	actionTime;
	///交易所交易员代码
	13:CMSDataType.TThostFtdcTraderIDType	traderID;
	///安装编号
	14:CMSDataType.TThostFtdcInstallIDType	installID;
	///本地执行宣告编号
	15:CMSDataType.TThostFtdcOrderLocalIDType	execOrderLocalID;
	///操作本地编号
	16:CMSDataType.TThostFtdcOrderLocalIDType	actionLocalID;
	///会员代码
	17:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///客户代码
	18:CMSDataType.TThostFtdcClientIDType	clientID;
	///业务单元
	19:CMSDataType.TThostFtdcBusinessUnitType	businessUnit;
	///报单操作状态
	20:CMSDataType.TThostFtdcOrderActionStatusType	orderActionStatus;
	///用户代码
	21:CMSDataType.TThostFtdcUserIDType	userID;
	///执行类型
	22:CMSDataType.TThostFtdcActionTypeType	actionType;
	///状态信息
	23:CMSDataType.TThostFtdcErrorMsgType	statusMsg;
	///合约代码
	24:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
}

///执行宣告查询
struct CThostFtdcQryExecOrderField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///交易所代码
	4:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///执行宣告编号
	5:CMSDataType.TThostFtdcExecOrderSysIDType	execOrderSysID;
	///开始时间
	6:CMSDataType.TThostFtdcTimeType	insertTimeStart;
	///结束时间
	7:CMSDataType.TThostFtdcTimeType	insertTimeEnd;
}

///交易所执行宣告信息
struct CThostFtdcExchangeExecOrderField
{
	///数量
	1:CMSDataType.TThostFtdcVolumeType	volume;
	///请求编号
	2:CMSDataType.TThostFtdcRequestIDType	requestID;
	///业务单元
	3:CMSDataType.TThostFtdcBusinessUnitType	businessUnit;
	///开平标志
	4:CMSDataType.TThostFtdcOffsetFlagType	offsetFlag;
	///投机套保标志
	5:CMSDataType.TThostFtdcHedgeFlagType	hedgeFlag;
	///执行类型
	6:CMSDataType.TThostFtdcActionTypeType	actionType;
	///保留头寸申请的持仓方向
	7:CMSDataType.TThostFtdcPosiDirectionType	posiDirection;
	///期权行权后是否保留期货头寸的标记
	8:CMSDataType.TThostFtdcExecOrderPositionFlagType	reservePositionFlag;
	///期权行权后生成的头寸是否自动平仓
	9:CMSDataType.TThostFtdcExecOrderCloseFlagType	closeFlag;
	///本地执行宣告编号
	10:CMSDataType.TThostFtdcOrderLocalIDType	execOrderLocalID;
	///交易所代码
	11:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///会员代码
	12:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///客户代码
	13:CMSDataType.TThostFtdcClientIDType	clientID;
	///合约在交易所的代码
	14:CMSDataType.TThostFtdcExchangeInstIDType	exchangeInstID;
	///交易所交易员代码
	15:CMSDataType.TThostFtdcTraderIDType	traderID;
	///安装编号
	16:CMSDataType.TThostFtdcInstallIDType	installID;
	///执行宣告提交状态
	17:CMSDataType.TThostFtdcOrderSubmitStatusType	orderSubmitStatus;
	///报单提示序号
	18:CMSDataType.TThostFtdcSequenceNoType	notifySequence;
	///交易日
	19:CMSDataType.TThostFtdcDateType	tradingDay;
	///结算编号
	20:CMSDataType.TThostFtdcSettlementIDType	settlementID;
	///执行宣告编号
	21:CMSDataType.TThostFtdcExecOrderSysIDType	execOrderSysID;
	///报单日期
	22:CMSDataType.TThostFtdcDateType	insertDate;
	///插入时间
	23:CMSDataType.TThostFtdcTimeType	insertTime;
	///撤销时间
	24:CMSDataType.TThostFtdcTimeType	cancelTime;
	///执行结果
	25:CMSDataType.TThostFtdcExecResultType	execResult;
	///结算会员编号
	26:CMSDataType.TThostFtdcParticipantIDType	clearingPartID;
	///序号
	27:CMSDataType.TThostFtdcSequenceNoType	sequenceNo;
}

///交易所执行宣告查询
struct CThostFtdcQryExchangeExecOrderField
{
	///会员代码
	1:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///客户代码
	2:CMSDataType.TThostFtdcClientIDType	clientID;
	///合约在交易所的代码
	3:CMSDataType.TThostFtdcExchangeInstIDType	exchangeInstID;
	///交易所代码
	4:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///交易所交易员代码
	5:CMSDataType.TThostFtdcTraderIDType	traderID;
}

///执行宣告操作查询
struct CThostFtdcQryExecOrderActionField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///交易所代码
	3:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
}

///交易所执行宣告操作
struct CThostFtdcExchangeExecOrderActionField
{
	///交易所代码
	1:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///执行宣告操作编号
	2:CMSDataType.TThostFtdcExecOrderSysIDType	execOrderSysID;
	///操作标志
	3:CMSDataType.TThostFtdcActionFlagType	actionFlag;
	///操作日期
	4:CMSDataType.TThostFtdcDateType	actionDate;
	///操作时间
	5:CMSDataType.TThostFtdcTimeType	actionTime;
	///交易所交易员代码
	6:CMSDataType.TThostFtdcTraderIDType	traderID;
	///安装编号
	7:CMSDataType.TThostFtdcInstallIDType	installID;
	///本地执行宣告编号
	8:CMSDataType.TThostFtdcOrderLocalIDType	execOrderLocalID;
	///操作本地编号
	9:CMSDataType.TThostFtdcOrderLocalIDType	actionLocalID;
	///会员代码
	10:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///客户代码
	11:CMSDataType.TThostFtdcClientIDType	clientID;
	///业务单元
	12:CMSDataType.TThostFtdcBusinessUnitType	businessUnit;
	///报单操作状态
	13:CMSDataType.TThostFtdcOrderActionStatusType	orderActionStatus;
	///用户代码
	14:CMSDataType.TThostFtdcUserIDType	userID;
	///执行类型
	15:CMSDataType.TThostFtdcActionTypeType	actionType;
}

///交易所执行宣告操作查询
struct CThostFtdcQryExchangeExecOrderActionField
{
	///会员代码
	1:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///客户代码
	2:CMSDataType.TThostFtdcClientIDType	clientID;
	///交易所代码
	3:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///交易所交易员代码
	4:CMSDataType.TThostFtdcTraderIDType	traderID;
}

///错误执行宣告
struct CThostFtdcErrExecOrderField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///执行宣告引用
	4:CMSDataType.TThostFtdcOrderRefType	execOrderRef;
	///用户代码
	5:CMSDataType.TThostFtdcUserIDType	userID;
	///数量
	6:CMSDataType.TThostFtdcVolumeType	volume;
	///请求编号
	7:CMSDataType.TThostFtdcRequestIDType	requestID;
	///业务单元
	8:CMSDataType.TThostFtdcBusinessUnitType	businessUnit;
	///开平标志
	9:CMSDataType.TThostFtdcOffsetFlagType	offsetFlag;
	///投机套保标志
	10:CMSDataType.TThostFtdcHedgeFlagType	hedgeFlag;
	///执行类型
	11:CMSDataType.TThostFtdcActionTypeType	actionType;
	///保留头寸申请的持仓方向
	12:CMSDataType.TThostFtdcPosiDirectionType	posiDirection;
	///期权行权后是否保留期货头寸的标记
	13:CMSDataType.TThostFtdcExecOrderPositionFlagType	reservePositionFlag;
	///期权行权后生成的头寸是否自动平仓
	14:CMSDataType.TThostFtdcExecOrderCloseFlagType	closeFlag;
	///错误代码
	15:CMSDataType.TThostFtdcErrorIDType	errorID;
	///错误信息
	16:CMSDataType.TThostFtdcErrorMsgType	errorMsg;
}

///查询错误执行宣告
struct CThostFtdcQryErrExecOrderField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
}

///错误执行宣告操作
struct CThostFtdcErrExecOrderActionField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///执行宣告操作引用
	3:CMSDataType.TThostFtdcOrderActionRefType	execOrderActionRef;
	///执行宣告引用
	4:CMSDataType.TThostFtdcOrderRefType	execOrderRef;
	///请求编号
	5:CMSDataType.TThostFtdcRequestIDType	requestID;
	///前置编号
	6:CMSDataType.TThostFtdcFrontIDType	frontID;
	///会话编号
	7:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///交易所代码
	8:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///执行宣告操作编号
	9:CMSDataType.TThostFtdcExecOrderSysIDType	execOrderSysID;
	///操作标志
	10:CMSDataType.TThostFtdcActionFlagType	actionFlag;
	///用户代码
	11:CMSDataType.TThostFtdcUserIDType	userID;
	///合约代码
	12:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///错误代码
	13:CMSDataType.TThostFtdcErrorIDType	errorID;
	///错误信息
	14:CMSDataType.TThostFtdcErrorMsgType	errorMsg;
}

///查询错误执行宣告操作
struct CThostFtdcQryErrExecOrderActionField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
}

///投资者期权合约交易权限
struct CThostFtdcOptionInstrTradingRightField
{
	///合约代码
	1:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///投资者范围
	2:CMSDataType.TThostFtdcInvestorRangeType	investorRange;
	///经纪公司代码
	3:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	4:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///买卖方向
	5:CMSDataType.TThostFtdcDirectionType	direction;
	///交易权限
	6:CMSDataType.TThostFtdcTradingRightType	tradingRight;
}

///查询期权合约交易权限
struct CThostFtdcQryOptionInstrTradingRightField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///买卖方向
	4:CMSDataType.TThostFtdcDirectionType	direction;
}

///输入的询价
struct CThostFtdcInputForQuoteField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///询价引用
	4:CMSDataType.TThostFtdcOrderRefType	forQuoteRef;
	///用户代码
	5:CMSDataType.TThostFtdcUserIDType	userID;
}

///询价
struct CThostFtdcForQuoteField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///询价引用
	4:CMSDataType.TThostFtdcOrderRefType	forQuoteRef;
	///用户代码
	5:CMSDataType.TThostFtdcUserIDType	userID;
	///本地询价编号
	6:CMSDataType.TThostFtdcOrderLocalIDType	forQuoteLocalID;
	///交易所代码
	7:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///会员代码
	8:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///客户代码
	9:CMSDataType.TThostFtdcClientIDType	clientID;
	///合约在交易所的代码
	10:CMSDataType.TThostFtdcExchangeInstIDType	exchangeInstID;
	///交易所交易员代码
	11:CMSDataType.TThostFtdcTraderIDType	traderID;
	///安装编号
	12:CMSDataType.TThostFtdcInstallIDType	installID;
	///报单日期
	13:CMSDataType.TThostFtdcDateType	insertDate;
	///插入时间
	14:CMSDataType.TThostFtdcTimeType	insertTime;
	///询价状态
	15:CMSDataType.TThostFtdcForQuoteStatusType	forQuoteStatus;
	///前置编号
	16:CMSDataType.TThostFtdcFrontIDType	frontID;
	///会话编号
	17:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///状态信息
	18:CMSDataType.TThostFtdcErrorMsgType	statusMsg;
	///操作用户代码
	19:CMSDataType.TThostFtdcUserIDType	activeUserID;
	///经纪公司询价编号
	20:CMSDataType.TThostFtdcSequenceNoType	brokerForQutoSeq;
}

///询价查询
struct CThostFtdcQryForQuoteField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///交易所代码
	4:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///开始时间
	5:CMSDataType.TThostFtdcTimeType	insertTimeStart;
	///结束时间
	6:CMSDataType.TThostFtdcTimeType	insertTimeEnd;
}

///交易所询价信息
struct CThostFtdcExchangeForQuoteField
{
	///本地询价编号
	1:CMSDataType.TThostFtdcOrderLocalIDType	forQuoteLocalID;
	///交易所代码
	2:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///会员代码
	3:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///客户代码
	4:CMSDataType.TThostFtdcClientIDType	clientID;
	///合约在交易所的代码
	5:CMSDataType.TThostFtdcExchangeInstIDType	exchangeInstID;
	///交易所交易员代码
	6:CMSDataType.TThostFtdcTraderIDType	traderID;
	///安装编号
	7:CMSDataType.TThostFtdcInstallIDType	installID;
	///报单日期
	8:CMSDataType.TThostFtdcDateType	insertDate;
	///插入时间
	9:CMSDataType.TThostFtdcTimeType	insertTime;
	///询价状态
	10:CMSDataType.TThostFtdcForQuoteStatusType	forQuoteStatus;
}

///交易所询价查询
struct CThostFtdcQryExchangeForQuoteField
{
	///会员代码
	1:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///客户代码
	2:CMSDataType.TThostFtdcClientIDType	clientID;
	///合约在交易所的代码
	3:CMSDataType.TThostFtdcExchangeInstIDType	exchangeInstID;
	///交易所代码
	4:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///交易所交易员代码
	5:CMSDataType.TThostFtdcTraderIDType	traderID;
}

///输入的报价
struct CThostFtdcInputQuoteField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///报价引用
	4:CMSDataType.TThostFtdcOrderRefType	quoteRef;
	///用户代码
	5:CMSDataType.TThostFtdcUserIDType	userID;
	///卖价格
	6:CMSDataType.TThostFtdcPriceType	askPrice;
	///买价格
	7:CMSDataType.TThostFtdcPriceType	bidPrice;
	///卖数量
	8:CMSDataType.TThostFtdcVolumeType	askVolume;
	///买数量
	9:CMSDataType.TThostFtdcVolumeType	bidVolume;
	///请求编号
	10:CMSDataType.TThostFtdcRequestIDType	requestID;
	///业务单元
	11:CMSDataType.TThostFtdcBusinessUnitType	businessUnit;
	///卖开平标志
	12:CMSDataType.TThostFtdcOffsetFlagType	askOffsetFlag;
	///买开平标志
	13:CMSDataType.TThostFtdcOffsetFlagType	bidOffsetFlag;
	///卖投机套保标志
	14:CMSDataType.TThostFtdcHedgeFlagType	askHedgeFlag;
	///买投机套保标志
	15:CMSDataType.TThostFtdcHedgeFlagType	bidHedgeFlag;
	///衍生卖报单引用
	16:CMSDataType.TThostFtdcOrderRefType	askOrderRef;
	///衍生买报单引用
	17:CMSDataType.TThostFtdcOrderRefType	bidOrderRef;
}

///输入报价操作
struct CThostFtdcInputQuoteActionField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///报价操作引用
	3:CMSDataType.TThostFtdcOrderActionRefType	quoteActionRef;
	///报价引用
	4:CMSDataType.TThostFtdcOrderRefType	quoteRef;
	///请求编号
	5:CMSDataType.TThostFtdcRequestIDType	requestID;
	///前置编号
	6:CMSDataType.TThostFtdcFrontIDType	frontID;
	///会话编号
	7:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///交易所代码
	8:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///报价操作编号
	9:CMSDataType.TThostFtdcOrderSysIDType	quoteSysID;
	///操作标志
	10:CMSDataType.TThostFtdcActionFlagType	actionFlag;
	///用户代码
	11:CMSDataType.TThostFtdcUserIDType	userID;
	///合约代码
	12:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
}

///报价
struct CThostFtdcQuoteField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///报价引用
	4:CMSDataType.TThostFtdcOrderRefType	quoteRef;
	///用户代码
	5:CMSDataType.TThostFtdcUserIDType	userID;
	///卖价格
	6:CMSDataType.TThostFtdcPriceType	askPrice;
	///买价格
	7:CMSDataType.TThostFtdcPriceType	bidPrice;
	///卖数量
	8:CMSDataType.TThostFtdcVolumeType	askVolume;
	///买数量
	9:CMSDataType.TThostFtdcVolumeType	bidVolume;
	///请求编号
	10:CMSDataType.TThostFtdcRequestIDType	requestID;
	///业务单元
	11:CMSDataType.TThostFtdcBusinessUnitType	businessUnit;
	///卖开平标志
	12:CMSDataType.TThostFtdcOffsetFlagType	askOffsetFlag;
	///买开平标志
	13:CMSDataType.TThostFtdcOffsetFlagType	bidOffsetFlag;
	///卖投机套保标志
	14:CMSDataType.TThostFtdcHedgeFlagType	askHedgeFlag;
	///买投机套保标志
	15:CMSDataType.TThostFtdcHedgeFlagType	bidHedgeFlag;
	///本地报价编号
	16:CMSDataType.TThostFtdcOrderLocalIDType	quoteLocalID;
	///交易所代码
	17:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///会员代码
	18:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///客户代码
	19:CMSDataType.TThostFtdcClientIDType	clientID;
	///合约在交易所的代码
	20:CMSDataType.TThostFtdcExchangeInstIDType	exchangeInstID;
	///交易所交易员代码
	21:CMSDataType.TThostFtdcTraderIDType	traderID;
	///安装编号
	22:CMSDataType.TThostFtdcInstallIDType	installID;
	///报价提示序号
	23:CMSDataType.TThostFtdcSequenceNoType	notifySequence;
	///报价提交状态
	24:CMSDataType.TThostFtdcOrderSubmitStatusType	orderSubmitStatus;
	///交易日
	25:CMSDataType.TThostFtdcDateType	tradingDay;
	///结算编号
	26:CMSDataType.TThostFtdcSettlementIDType	settlementID;
	///报价编号
	27:CMSDataType.TThostFtdcOrderSysIDType	quoteSysID;
	///报单日期
	28:CMSDataType.TThostFtdcDateType	insertDate;
	///插入时间
	29:CMSDataType.TThostFtdcTimeType	insertTime;
	///撤销时间
	30:CMSDataType.TThostFtdcTimeType	cancelTime;
	///报价状态
	31:CMSDataType.TThostFtdcOrderStatusType	quoteStatus;
	///结算会员编号
	32:CMSDataType.TThostFtdcParticipantIDType	clearingPartID;
	///序号
	33:CMSDataType.TThostFtdcSequenceNoType	sequenceNo;
	///卖方报单编号
	34:CMSDataType.TThostFtdcOrderSysIDType	askOrderSysID;
	///买方报单编号
	35:CMSDataType.TThostFtdcOrderSysIDType	bidOrderSysID;
	///前置编号
	36:CMSDataType.TThostFtdcFrontIDType	frontID;
	///会话编号
	37:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///用户端产品信息
	38:CMSDataType.TThostFtdcProductInfoType	userProductInfo;
	///状态信息
	39:CMSDataType.TThostFtdcErrorMsgType	statusMsg;
	///操作用户代码
	40:CMSDataType.TThostFtdcUserIDType	activeUserID;
	///经纪公司报价编号
	41:CMSDataType.TThostFtdcSequenceNoType	brokerQuoteSeq;
	///衍生卖报单引用
	42:CMSDataType.TThostFtdcOrderRefType	askOrderRef;
	///衍生买报单引用
	43:CMSDataType.TThostFtdcOrderRefType	bidOrderRef;
}

///报价操作
struct CThostFtdcQuoteActionField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///报价操作引用
	3:CMSDataType.TThostFtdcOrderActionRefType	quoteActionRef;
	///报价引用
	4:CMSDataType.TThostFtdcOrderRefType	quoteRef;
	///请求编号
	5:CMSDataType.TThostFtdcRequestIDType	requestID;
	///前置编号
	6:CMSDataType.TThostFtdcFrontIDType	frontID;
	///会话编号
	7:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///交易所代码
	8:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///报价操作编号
	9:CMSDataType.TThostFtdcOrderSysIDType	quoteSysID;
	///操作标志
	10:CMSDataType.TThostFtdcActionFlagType	actionFlag;
	///操作日期
	11:CMSDataType.TThostFtdcDateType	actionDate;
	///操作时间
	12:CMSDataType.TThostFtdcTimeType	actionTime;
	///交易所交易员代码
	13:CMSDataType.TThostFtdcTraderIDType	traderID;
	///安装编号
	14:CMSDataType.TThostFtdcInstallIDType	installID;
	///本地报价编号
	15:CMSDataType.TThostFtdcOrderLocalIDType	quoteLocalID;
	///操作本地编号
	16:CMSDataType.TThostFtdcOrderLocalIDType	actionLocalID;
	///会员代码
	17:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///客户代码
	18:CMSDataType.TThostFtdcClientIDType	clientID;
	///业务单元
	19:CMSDataType.TThostFtdcBusinessUnitType	businessUnit;
	///报单操作状态
	20:CMSDataType.TThostFtdcOrderActionStatusType	orderActionStatus;
	///用户代码
	21:CMSDataType.TThostFtdcUserIDType	userID;
	///状态信息
	22:CMSDataType.TThostFtdcErrorMsgType	statusMsg;
	///合约代码
	23:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
}

///报价查询
struct CThostFtdcQryQuoteField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///交易所代码
	4:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///报价编号
	5:CMSDataType.TThostFtdcOrderSysIDType	quoteSysID;
	///开始时间
	6:CMSDataType.TThostFtdcTimeType	insertTimeStart;
	///结束时间
	7:CMSDataType.TThostFtdcTimeType	insertTimeEnd;
}

///交易所报价信息
struct CThostFtdcExchangeQuoteField
{
	///卖价格
	1:CMSDataType.TThostFtdcPriceType	askPrice;
	///买价格
	2:CMSDataType.TThostFtdcPriceType	bidPrice;
	///卖数量
	3:CMSDataType.TThostFtdcVolumeType	askVolume;
	///买数量
	4:CMSDataType.TThostFtdcVolumeType	bidVolume;
	///请求编号
	5:CMSDataType.TThostFtdcRequestIDType	requestID;
	///业务单元
	6:CMSDataType.TThostFtdcBusinessUnitType	businessUnit;
	///卖开平标志
	7:CMSDataType.TThostFtdcOffsetFlagType	askOffsetFlag;
	///买开平标志
	8:CMSDataType.TThostFtdcOffsetFlagType	bidOffsetFlag;
	///卖投机套保标志
	9:CMSDataType.TThostFtdcHedgeFlagType	askHedgeFlag;
	///买投机套保标志
	10:CMSDataType.TThostFtdcHedgeFlagType	bidHedgeFlag;
	///本地报价编号
	11:CMSDataType.TThostFtdcOrderLocalIDType	quoteLocalID;
	///交易所代码
	12:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///会员代码
	13:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///客户代码
	14:CMSDataType.TThostFtdcClientIDType	clientID;
	///合约在交易所的代码
	15:CMSDataType.TThostFtdcExchangeInstIDType	exchangeInstID;
	///交易所交易员代码
	16:CMSDataType.TThostFtdcTraderIDType	traderID;
	///安装编号
	17:CMSDataType.TThostFtdcInstallIDType	installID;
	///报价提示序号
	18:CMSDataType.TThostFtdcSequenceNoType	notifySequence;
	///报价提交状态
	19:CMSDataType.TThostFtdcOrderSubmitStatusType	orderSubmitStatus;
	///交易日
	20:CMSDataType.TThostFtdcDateType	tradingDay;
	///结算编号
	21:CMSDataType.TThostFtdcSettlementIDType	settlementID;
	///报价编号
	22:CMSDataType.TThostFtdcOrderSysIDType	quoteSysID;
	///报单日期
	23:CMSDataType.TThostFtdcDateType	insertDate;
	///插入时间
	24:CMSDataType.TThostFtdcTimeType	insertTime;
	///撤销时间
	25:CMSDataType.TThostFtdcTimeType	cancelTime;
	///报价状态
	26:CMSDataType.TThostFtdcOrderStatusType	quoteStatus;
	///结算会员编号
	27:CMSDataType.TThostFtdcParticipantIDType	clearingPartID;
	///序号
	28:CMSDataType.TThostFtdcSequenceNoType	sequenceNo;
	///卖方报单编号
	29:CMSDataType.TThostFtdcOrderSysIDType	askOrderSysID;
	///买方报单编号
	30:CMSDataType.TThostFtdcOrderSysIDType	bidOrderSysID;
}

///交易所报价查询
struct CThostFtdcQryExchangeQuoteField
{
	///会员代码
	1:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///客户代码
	2:CMSDataType.TThostFtdcClientIDType	clientID;
	///合约在交易所的代码
	3:CMSDataType.TThostFtdcExchangeInstIDType	exchangeInstID;
	///交易所代码
	4:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///交易所交易员代码
	5:CMSDataType.TThostFtdcTraderIDType	traderID;
}

///报价操作查询
struct CThostFtdcQryQuoteActionField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///交易所代码
	3:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
}

///交易所报价操作
struct CThostFtdcExchangeQuoteActionField
{
	///交易所代码
	1:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///报价操作编号
	2:CMSDataType.TThostFtdcOrderSysIDType	quoteSysID;
	///操作标志
	3:CMSDataType.TThostFtdcActionFlagType	actionFlag;
	///操作日期
	4:CMSDataType.TThostFtdcDateType	actionDate;
	///操作时间
	5:CMSDataType.TThostFtdcTimeType	actionTime;
	///交易所交易员代码
	6:CMSDataType.TThostFtdcTraderIDType	traderID;
	///安装编号
	7:CMSDataType.TThostFtdcInstallIDType	installID;
	///本地报价编号
	8:CMSDataType.TThostFtdcOrderLocalIDType	quoteLocalID;
	///操作本地编号
	9:CMSDataType.TThostFtdcOrderLocalIDType	actionLocalID;
	///会员代码
	10:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///客户代码
	11:CMSDataType.TThostFtdcClientIDType	clientID;
	///业务单元
	12:CMSDataType.TThostFtdcBusinessUnitType	businessUnit;
	///报单操作状态
	13:CMSDataType.TThostFtdcOrderActionStatusType	orderActionStatus;
	///用户代码
	14:CMSDataType.TThostFtdcUserIDType	userID;
}

///交易所报价操作查询
struct CThostFtdcQryExchangeQuoteActionField
{
	///会员代码
	1:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///客户代码
	2:CMSDataType.TThostFtdcClientIDType	clientID;
	///交易所代码
	3:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///交易所交易员代码
	4:CMSDataType.TThostFtdcTraderIDType	traderID;
}

///期权合约delta值
struct CThostFtdcOptionInstrDeltaField
{
	///合约代码
	1:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///投资者范围
	2:CMSDataType.TThostFtdcInvestorRangeType	investorRange;
	///经纪公司代码
	3:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	4:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///Delta值
	5:CMSDataType.TThostFtdcRatioType	delta;
}

///发给做市商的询价请求
struct CThostFtdcForQuoteRspField
{
	///交易日
	1:CMSDataType.TThostFtdcDateType	tradingDay;
	///合约代码
	2:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///询价编号
	3:CMSDataType.TThostFtdcOrderSysIDType	forQuoteSysID;
	///询价时间
	4:CMSDataType.TThostFtdcTimeType	forQuoteTime;
	///业务日期
	5:CMSDataType.TThostFtdcDateType	actionDay;
	///交易所代码
	6:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
}

///当前期权合约执行偏移值的详细内容
struct CThostFtdcStrikeOffsetField
{
	///合约代码
	1:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///投资者范围
	2:CMSDataType.TThostFtdcInvestorRangeType	investorRange;
	///经纪公司代码
	3:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	4:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///执行偏移值
	5:CMSDataType.TThostFtdcMoneyType	offset;
}

///期权执行偏移值查询
struct CThostFtdcQryStrikeOffsetField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
}

///市场行情
struct CThostFtdcMarketDataField
{
	///交易日
	1:CMSDataType.TThostFtdcDateType	tradingDay;
	///合约代码
	2:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///交易所代码
	3:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///合约在交易所的代码
	4:CMSDataType.TThostFtdcExchangeInstIDType	exchangeInstID;
	///最新价
	5:CMSDataType.TThostFtdcPriceType	lastPrice;
	///上次结算价
	6:CMSDataType.TThostFtdcPriceType	preSettlementPrice;
	///昨收盘
	7:CMSDataType.TThostFtdcPriceType	preClosePrice;
	///昨持仓量
	8:CMSDataType.TThostFtdcLargeVolumeType	preOpenInterest;
	///今开盘
	9:CMSDataType.TThostFtdcPriceType	openPrice;
	///最高价
	10:CMSDataType.TThostFtdcPriceType	highestPrice;
	///最低价
	11:CMSDataType.TThostFtdcPriceType	lowestPrice;
	///数量
	12:CMSDataType.TThostFtdcVolumeType	volume;
	///成交金额
	13:CMSDataType.TThostFtdcMoneyType	turnover;
	///持仓量
	14:CMSDataType.TThostFtdcLargeVolumeType	openInterest;
	///今收盘
	15:CMSDataType.TThostFtdcPriceType	closePrice;
	///本次结算价
	16:CMSDataType.TThostFtdcPriceType	settlementPrice;
	///涨停板价
	17:CMSDataType.TThostFtdcPriceType	upperLimitPrice;
	///跌停板价
	18:CMSDataType.TThostFtdcPriceType	lowerLimitPrice;
	///昨虚实度
	19:CMSDataType.TThostFtdcRatioType	preDelta;
	///今虚实度
	20:CMSDataType.TThostFtdcRatioType	currDelta;
	///最后修改时间
	21:CMSDataType.TThostFtdcTimeType	updateTime;
	///最后修改毫秒
	22:CMSDataType.TThostFtdcMillisecType	updateMillisec;
	///业务日期
	23:CMSDataType.TThostFtdcDateType	actionDay;
}

///行情基础属性
struct CThostFtdcMarketDataBaseField
{
	///交易日
	1:CMSDataType.TThostFtdcDateType	tradingDay;
	///上次结算价
	2:CMSDataType.TThostFtdcPriceType	preSettlementPrice;
	///昨收盘
	3:CMSDataType.TThostFtdcPriceType	preClosePrice;
	///昨持仓量
	4:CMSDataType.TThostFtdcLargeVolumeType	preOpenInterest;
	///昨虚实度
	5:CMSDataType.TThostFtdcRatioType	preDelta;
}

///行情静态属性
struct CThostFtdcMarketDataStaticField
{
	///今开盘
	1:CMSDataType.TThostFtdcPriceType	openPrice;
	///最高价
	2:CMSDataType.TThostFtdcPriceType	highestPrice;
	///最低价
	3:CMSDataType.TThostFtdcPriceType	lowestPrice;
	///今收盘
	4:CMSDataType.TThostFtdcPriceType	closePrice;
	///涨停板价
	5:CMSDataType.TThostFtdcPriceType	upperLimitPrice;
	///跌停板价
	6:CMSDataType.TThostFtdcPriceType	lowerLimitPrice;
	///本次结算价
	7:CMSDataType.TThostFtdcPriceType	settlementPrice;
	///今虚实度
	8:CMSDataType.TThostFtdcRatioType	currDelta;
}

///行情最新成交属性
struct CThostFtdcMarketDataLastMatchField
{
	///最新价
	1:CMSDataType.TThostFtdcPriceType	lastPrice;
	///数量
	2:CMSDataType.TThostFtdcVolumeType	volume;
	///成交金额
	3:CMSDataType.TThostFtdcMoneyType	turnover;
	///持仓量
	4:CMSDataType.TThostFtdcLargeVolumeType	openInterest;
}

///行情最优价属性
struct CThostFtdcMarketDataBestPriceField
{
	///申买价一
	1:CMSDataType.TThostFtdcPriceType	bidPrice1;
	///申买量一
	2:CMSDataType.TThostFtdcVolumeType	bidVolume1;
	///申卖价一
	3:CMSDataType.TThostFtdcPriceType	askPrice1;
	///申卖量一
	4:CMSDataType.TThostFtdcVolumeType	askVolume1;
}

///行情申买二、三属性
struct CThostFtdcMarketDataBid23Field
{
	///申买价二
	1:CMSDataType.TThostFtdcPriceType	bidPrice2;
	///申买量二
	2:CMSDataType.TThostFtdcVolumeType	bidVolume2;
	///申买价三
	3:CMSDataType.TThostFtdcPriceType	bidPrice3;
	///申买量三
	4:CMSDataType.TThostFtdcVolumeType	bidVolume3;
}

///行情申卖二、三属性
struct CThostFtdcMarketDataAsk23Field
{
	///申卖价二
	1:CMSDataType.TThostFtdcPriceType	askPrice2;
	///申卖量二
	2:CMSDataType.TThostFtdcVolumeType	askVolume2;
	///申卖价三
	3:CMSDataType.TThostFtdcPriceType	askPrice3;
	///申卖量三
	4:CMSDataType.TThostFtdcVolumeType	askVolume3;
}

///行情申买四、五属性
struct CThostFtdcMarketDataBid45Field
{
	///申买价四
	1:CMSDataType.TThostFtdcPriceType	bidPrice4;
	///申买量四
	2:CMSDataType.TThostFtdcVolumeType	bidVolume4;
	///申买价五
	3:CMSDataType.TThostFtdcPriceType	bidPrice5;
	///申买量五
	4:CMSDataType.TThostFtdcVolumeType	bidVolume5;
}

///行情申卖四、五属性
struct CThostFtdcMarketDataAsk45Field
{
	///申卖价四
	1:CMSDataType.TThostFtdcPriceType	askPrice4;
	///申卖量四
	2:CMSDataType.TThostFtdcVolumeType	askVolume4;
	///申卖价五
	3:CMSDataType.TThostFtdcPriceType	askPrice5;
	///申卖量五
	4:CMSDataType.TThostFtdcVolumeType	askVolume5;
}

///行情更新时间属性
struct CThostFtdcMarketDataUpdateTimeField
{
	///合约代码
	1:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///最后修改时间
	2:CMSDataType.TThostFtdcTimeType	updateTime;
	///最后修改毫秒
	3:CMSDataType.TThostFtdcMillisecType	updateMillisec;
	///业务日期
	4:CMSDataType.TThostFtdcDateType	actionDay;
}

///行情交易所代码属性
struct CThostFtdcMarketDataExchangeField
{
	///交易所代码
	1:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
}

///指定的合约
struct CThostFtdcSpecificInstrumentField
{
	///合约代码
	1:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
}

///合约状态
struct CThostFtdcInstrumentStatusField
{
	///交易所代码
	1:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///合约在交易所的代码
	2:CMSDataType.TThostFtdcExchangeInstIDType	exchangeInstID;
	///结算组代码
	3:CMSDataType.TThostFtdcSettlementGroupIDType	settlementGroupID;
	///合约代码
	4:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///合约交易状态
	5:CMSDataType.TThostFtdcInstrumentStatusType	instrumentStatus;
	///交易阶段编号
	6:CMSDataType.TThostFtdcTradingSegmentSNType	tradingSegmentSN;
	///进入本状态时间
	7:CMSDataType.TThostFtdcTimeType	enterTime;
	///进入本状态原因
	8:CMSDataType.TThostFtdcInstStatusEnterReasonType	enterReason;
}

///查询合约状态
struct CThostFtdcQryInstrumentStatusField
{
	///交易所代码
	1:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///合约在交易所的代码
	2:CMSDataType.TThostFtdcExchangeInstIDType	exchangeInstID;
}

///投资者账户
struct CThostFtdcInvestorAccountField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///投资者帐号
	3:CMSDataType.TThostFtdcAccountIDType	accountID;
	///币种代码
	4:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
}

///浮动盈亏算法
struct CThostFtdcPositionProfitAlgorithmField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者帐号
	2:CMSDataType.TThostFtdcAccountIDType	accountID;
	///盈亏算法
	3:CMSDataType.TThostFtdcAlgorithmType	algorithm;
	///备注
	4:CMSDataType.TThostFtdcMemoType	memo;
	///币种代码
	5:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
}

///会员资金折扣
struct CThostFtdcDiscountField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者范围
	2:CMSDataType.TThostFtdcInvestorRangeType	investorRange;
	///投资者代码
	3:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///资金折扣比例
	4:CMSDataType.TThostFtdcRatioType	discount;
}

///查询转帐银行
struct CThostFtdcQryTransferBankField
{
	///银行代码
	1:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分中心代码
	2:CMSDataType.TThostFtdcBankBrchIDType	bankBrchID;
}

///转帐银行
struct CThostFtdcTransferBankField
{
	///银行代码
	1:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分中心代码
	2:CMSDataType.TThostFtdcBankBrchIDType	bankBrchID;
	///银行名称
	3:CMSDataType.TThostFtdcBankNameType	bankName;
	///是否活跃
	4:CMSDataType.TThostFtdcBoolType	isActive;
}

///查询投资者持仓明细
struct CThostFtdcQryInvestorPositionDetailField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
}

///投资者持仓明细
struct CThostFtdcInvestorPositionDetailField
{
	///合约代码
	1:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///经纪公司代码
	2:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	3:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///投机套保标志
	4:CMSDataType.TThostFtdcHedgeFlagType	hedgeFlag;
	///买卖
	5:CMSDataType.TThostFtdcDirectionType	direction;
	///开仓日期
	6:CMSDataType.TThostFtdcDateType	openDate;
	///成交编号
	7:CMSDataType.TThostFtdcTradeIDType	tradeID;
	///数量
	8:CMSDataType.TThostFtdcVolumeType	volume;
	///开仓价
	9:CMSDataType.TThostFtdcPriceType	openPrice;
	///交易日
	10:CMSDataType.TThostFtdcDateType	tradingDay;
	///结算编号
	11:CMSDataType.TThostFtdcSettlementIDType	settlementID;
	///成交类型
	12:CMSDataType.TThostFtdcTradeTypeType	tradeType;
	///组合合约代码
	13:CMSDataType.TThostFtdcInstrumentIDType	combInstrumentID;
	///交易所代码
	14:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///逐日盯市平仓盈亏
	15:CMSDataType.TThostFtdcMoneyType	closeProfitByDate;
	///逐笔对冲平仓盈亏
	16:CMSDataType.TThostFtdcMoneyType	closeProfitByTrade;
	///逐日盯市持仓盈亏
	17:CMSDataType.TThostFtdcMoneyType	positionProfitByDate;
	///逐笔对冲持仓盈亏
	18:CMSDataType.TThostFtdcMoneyType	positionProfitByTrade;
	///投资者保证金
	19:CMSDataType.TThostFtdcMoneyType	margin;
	///交易所保证金
	20:CMSDataType.TThostFtdcMoneyType	exchMargin;
	///保证金率
	21:CMSDataType.TThostFtdcRatioType	marginRateByMoney;
	///保证金率(按手数)
	22:CMSDataType.TThostFtdcRatioType	marginRateByVolume;
	///昨结算价
	23:CMSDataType.TThostFtdcPriceType	lastSettlementPrice;
	///结算价
	24:CMSDataType.TThostFtdcPriceType	settlementPrice;
	///平仓量
	25:CMSDataType.TThostFtdcVolumeType	closeVolume;
	///平仓金额
	26:CMSDataType.TThostFtdcMoneyType	closeAmount;
}

///资金账户口令域
struct CThostFtdcTradingAccountPasswordField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者帐号
	2:CMSDataType.TThostFtdcAccountIDType	accountID;
	///密码
	3:CMSDataType.TThostFtdcPasswordType	password;
	///币种代码
	4:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
}

///交易所行情报盘机
struct CThostFtdcMDTraderOfferField
{
	///交易所代码
	1:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///交易所交易员代码
	2:CMSDataType.TThostFtdcTraderIDType	traderID;
	///会员代码
	3:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///密码
	4:CMSDataType.TThostFtdcPasswordType	password;
	///安装编号
	5:CMSDataType.TThostFtdcInstallIDType	installID;
	///本地报单编号
	6:CMSDataType.TThostFtdcOrderLocalIDType	orderLocalID;
	///交易所交易员连接状态
	7:CMSDataType.TThostFtdcTraderConnectStatusType	traderConnectStatus;
	///发出连接请求的日期
	8:CMSDataType.TThostFtdcDateType	connectRequestDate;
	///发出连接请求的时间
	9:CMSDataType.TThostFtdcTimeType	connectRequestTime;
	///上次报告日期
	10:CMSDataType.TThostFtdcDateType	lastReportDate;
	///上次报告时间
	11:CMSDataType.TThostFtdcTimeType	lastReportTime;
	///完成连接日期
	12:CMSDataType.TThostFtdcDateType	connectDate;
	///完成连接时间
	13:CMSDataType.TThostFtdcTimeType	connectTime;
	///启动日期
	14:CMSDataType.TThostFtdcDateType	startDate;
	///启动时间
	15:CMSDataType.TThostFtdcTimeType	startTime;
	///交易日
	16:CMSDataType.TThostFtdcDateType	tradingDay;
	///经纪公司代码
	17:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///本席位最大成交编号
	18:CMSDataType.TThostFtdcTradeIDType	maxTradeID;
	///本席位最大报单备拷
	19:CMSDataType.TThostFtdcReturnCodeType	maxOrderMessageReference;
}

///查询行情报盘机
struct CThostFtdcQryMDTraderOfferField
{
	///交易所代码
	1:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///会员代码
	2:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///交易所交易员代码
	3:CMSDataType.TThostFtdcTraderIDType	traderID;
}

///查询客户通知
struct CThostFtdcQryNoticeField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
}

///客户通知
struct CThostFtdcNoticeField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///消息正文
	2:CMSDataType.TThostFtdcContentType	content;
	///经纪公司通知内容序列号
	3:CMSDataType.TThostFtdcSequenceLabelType	sequenceLabel;
}

///用户权限
struct CThostFtdcUserRightField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///用户代码
	2:CMSDataType.TThostFtdcUserIDType	userID;
	///客户权限类型
	3:CMSDataType.TThostFtdcUserRightTypeType	userRightType;
	///是否禁止
	4:CMSDataType.TThostFtdcBoolType	isForbidden;
}

///查询结算信息确认域
struct CThostFtdcQrySettlementInfoConfirmField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
}

///装载结算信息
struct CThostFtdcLoadSettlementInfoField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
}

///经纪公司可提资金算法表
struct CThostFtdcBrokerWithdrawAlgorithmField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///可提资金算法
	2:CMSDataType.TThostFtdcAlgorithmType	withdrawAlgorithm;
	///资金使用率
	3:CMSDataType.TThostFtdcRatioType	usingRatio;
	///可提是否包含平仓盈利
	4:CMSDataType.TThostFtdcIncludeCloseProfitType	includeCloseProfit;
	///本日无仓且无成交客户是否受可提比例限制
	5:CMSDataType.TThostFtdcAllWithoutTradeType	allWithoutTrade;
	///可用是否包含平仓盈利
	6:CMSDataType.TThostFtdcIncludeCloseProfitType	availIncludeCloseProfit;
	///是否启用用户事件
	7:CMSDataType.TThostFtdcBoolType	isBrokerUserEvent;
	///币种代码
	8:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///货币质押比率
	9:CMSDataType.TThostFtdcRatioType	fundMortgageRatio;
	///权益算法
	10:CMSDataType.TThostFtdcBalanceAlgorithmType	balanceAlgorithm;
}

///资金账户口令变更域
struct CThostFtdcTradingAccountPasswordUpdateV1Field
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///原来的口令
	3:CMSDataType.TThostFtdcPasswordType	oldPassword;
	///新的口令
	4:CMSDataType.TThostFtdcPasswordType	newPassword;
}

///资金账户口令变更域
struct CThostFtdcTradingAccountPasswordUpdateField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者帐号
	2:CMSDataType.TThostFtdcAccountIDType	accountID;
	///原来的口令
	3:CMSDataType.TThostFtdcPasswordType	oldPassword;
	///新的口令
	4:CMSDataType.TThostFtdcPasswordType	newPassword;
	///币种代码
	5:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
}

///查询组合合约分腿
struct CThostFtdcQryCombinationLegField
{
	///组合合约代码
	1:CMSDataType.TThostFtdcInstrumentIDType	combInstrumentID;
	///单腿编号
	2:CMSDataType.TThostFtdcLegIDType	legID;
	///单腿合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	legInstrumentID;
}

///查询组合合约分腿
struct CThostFtdcQrySyncStatusField
{
	///交易日
	1:CMSDataType.TThostFtdcDateType	tradingDay;
}

///组合交易合约的单腿
struct CThostFtdcCombinationLegField
{
	///组合合约代码
	1:CMSDataType.TThostFtdcInstrumentIDType	combInstrumentID;
	///单腿编号
	2:CMSDataType.TThostFtdcLegIDType	legID;
	///单腿合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	legInstrumentID;
	///买卖方向
	4:CMSDataType.TThostFtdcDirectionType	direction;
	///单腿乘数
	5:CMSDataType.TThostFtdcLegMultipleType	legMultiple;
	///派生层数
	6:CMSDataType.TThostFtdcImplyLevelType	implyLevel;
}

///数据同步状态
struct CThostFtdcSyncStatusField
{
	///交易日
	1:CMSDataType.TThostFtdcDateType	tradingDay;
	///数据同步状态
	2:CMSDataType.TThostFtdcDataSyncStatusType	dataSyncStatus;
}

///查询联系人
struct CThostFtdcQryLinkManField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
}

///联系人
struct CThostFtdcLinkManField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///联系人类型
	3:CMSDataType.TThostFtdcPersonTypeType	personType;
	///证件类型
	4:CMSDataType.TThostFtdcIdCardTypeType	identifiedCardType;
	///证件号码
	5:CMSDataType.TThostFtdcIdentifiedCardNoType	identifiedCardNo;
	///名称
	6:CMSDataType.TThostFtdcPartyNameType	personName;
	///联系电话
	7:CMSDataType.TThostFtdcTelephoneType	telephone;
	///通讯地址
	8:CMSDataType.TThostFtdcAddressType	address;
	///邮政编码
	9:CMSDataType.TThostFtdcZipCodeType	zipCode;
	///优先级
	10:CMSDataType.TThostFtdcPriorityType	priority;
	///开户邮政编码
	11:CMSDataType.TThostFtdcUOAZipCodeType	uOAZipCode;
	///全称
	12:CMSDataType.TThostFtdcInvestorFullNameType	personFullName;
}

///查询经纪公司用户事件
struct CThostFtdcQryBrokerUserEventField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///用户代码
	2:CMSDataType.TThostFtdcUserIDType	userID;
	///用户事件类型
	3:CMSDataType.TThostFtdcUserEventTypeType	userEventType;
}

///查询经纪公司用户事件
struct CThostFtdcBrokerUserEventField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///用户代码
	2:CMSDataType.TThostFtdcUserIDType	userID;
	///用户事件类型
	3:CMSDataType.TThostFtdcUserEventTypeType	userEventType;
	///用户事件序号
	4:CMSDataType.TThostFtdcSequenceNoType	eventSequenceNo;
	///事件发生日期
	5:CMSDataType.TThostFtdcDateType	eventDate;
	///事件发生时间
	6:CMSDataType.TThostFtdcTimeType	eventTime;
	///用户事件信息
	7:CMSDataType.TThostFtdcUserEventInfoType	userEventInfo;
	///投资者代码
	8:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	9:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
}

///查询签约银行请求
struct CThostFtdcQryContractBankField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///银行代码
	2:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分中心代码
	3:CMSDataType.TThostFtdcBankBrchIDType	bankBrchID;
}

///查询签约银行响应
struct CThostFtdcContractBankField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///银行代码
	2:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分中心代码
	3:CMSDataType.TThostFtdcBankBrchIDType	bankBrchID;
	///银行名称
	4:CMSDataType.TThostFtdcBankNameType	bankName;
}

///投资者组合持仓明细
struct CThostFtdcInvestorPositionCombineDetailField
{
	///交易日
	1:CMSDataType.TThostFtdcDateType	tradingDay;
	///开仓日期
	2:CMSDataType.TThostFtdcDateType	openDate;
	///交易所代码
	3:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///结算编号
	4:CMSDataType.TThostFtdcSettlementIDType	settlementID;
	///经纪公司代码
	5:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	6:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///组合编号
	7:CMSDataType.TThostFtdcTradeIDType	comTradeID;
	///撮合编号
	8:CMSDataType.TThostFtdcTradeIDType	tradeID;
	///合约代码
	9:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///投机套保标志
	10:CMSDataType.TThostFtdcHedgeFlagType	hedgeFlag;
	///买卖
	11:CMSDataType.TThostFtdcDirectionType	direction;
	///持仓量
	12:CMSDataType.TThostFtdcVolumeType	totalAmt;
	///投资者保证金
	13:CMSDataType.TThostFtdcMoneyType	margin;
	///交易所保证金
	14:CMSDataType.TThostFtdcMoneyType	exchMargin;
	///保证金率
	15:CMSDataType.TThostFtdcRatioType	marginRateByMoney;
	///保证金率(按手数)
	16:CMSDataType.TThostFtdcRatioType	marginRateByVolume;
	///单腿编号
	17:CMSDataType.TThostFtdcLegIDType	legID;
	///单腿乘数
	18:CMSDataType.TThostFtdcLegMultipleType	legMultiple;
	///组合持仓合约编码
	19:CMSDataType.TThostFtdcInstrumentIDType	combInstrumentID;
	///成交组号
	20:CMSDataType.TThostFtdcTradeGroupIDType	tradeGroupID;
}

///预埋单
struct CThostFtdcParkedOrderField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///报单引用
	4:CMSDataType.TThostFtdcOrderRefType	orderRef;
	///用户代码
	5:CMSDataType.TThostFtdcUserIDType	userID;
	///报单价格条件
	6:CMSDataType.TThostFtdcOrderPriceTypeType	orderPriceType;
	///买卖方向
	7:CMSDataType.TThostFtdcDirectionType	direction;
	///组合开平标志
	8:CMSDataType.TThostFtdcCombOffsetFlagType	combOffsetFlag;
	///组合投机套保标志
	9:CMSDataType.TThostFtdcCombHedgeFlagType	combHedgeFlag;
	///价格
	10:CMSDataType.TThostFtdcPriceType	limitPrice;
	///数量
	11:CMSDataType.TThostFtdcVolumeType	volumeTotalOriginal;
	///有效期类型
	12:CMSDataType.TThostFtdcTimeConditionType	timeCondition;
	///GTD日期
	13:CMSDataType.TThostFtdcDateType	gTDDate;
	///成交量类型
	14:CMSDataType.TThostFtdcVolumeConditionType	volumeCondition;
	///最小成交量
	15:CMSDataType.TThostFtdcVolumeType	minVolume;
	///触发条件
	16:CMSDataType.TThostFtdcContingentConditionType	contingentCondition;
	///止损价
	17:CMSDataType.TThostFtdcPriceType	stopPrice;
	///强平原因
	18:CMSDataType.TThostFtdcForceCloseReasonType	forceCloseReason;
	///自动挂起标志
	19:CMSDataType.TThostFtdcBoolType	isAutoSuspend;
	///业务单元
	20:CMSDataType.TThostFtdcBusinessUnitType	businessUnit;
	///请求编号
	21:CMSDataType.TThostFtdcRequestIDType	requestID;
	///用户强评标志
	22:CMSDataType.TThostFtdcBoolType	userForceClose;
	///交易所代码
	23:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///预埋报单编号
	24:CMSDataType.TThostFtdcParkedOrderIDType	parkedOrderID;
	///用户类型
	25:CMSDataType.TThostFtdcUserTypeType	userType;
	///预埋单状态
	26:CMSDataType.TThostFtdcParkedOrderStatusType	status;
	///错误代码
	27:CMSDataType.TThostFtdcErrorIDType	errorID;
	///错误信息
	28:CMSDataType.TThostFtdcErrorMsgType	errorMsg;
	///互换单标志
	29:CMSDataType.TThostFtdcBoolType	isSwapOrder;
}

//输入预埋单操作
struct CThostFtdcParkedOrderActionField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///报单操作引用
	3:CMSDataType.TThostFtdcOrderActionRefType	orderActionRef;
	///报单引用
	4:CMSDataType.TThostFtdcOrderRefType	orderRef;
	///请求编号
	5:CMSDataType.TThostFtdcRequestIDType	requestID;
	///前置编号
	6:CMSDataType.TThostFtdcFrontIDType	frontID;
	///会话编号
	7:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///交易所代码
	8:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///报单编号
	9:CMSDataType.TThostFtdcOrderSysIDType	orderSysID;
	///操作标志
	10:CMSDataType.TThostFtdcActionFlagType	actionFlag;
	///价格
	11:CMSDataType.TThostFtdcPriceType	limitPrice;
	///数量变化
	12:CMSDataType.TThostFtdcVolumeType	volumeChange;
	///用户代码
	13:CMSDataType.TThostFtdcUserIDType	userID;
	///合约代码
	14:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///预埋撤单单编号
	15:CMSDataType.TThostFtdcParkedOrderActionIDType	parkedOrderActionID;
	///用户类型
	16:CMSDataType.TThostFtdcUserTypeType	userType;
	///预埋撤单状态
	17:CMSDataType.TThostFtdcParkedOrderStatusType	status;
	///错误代码
	18:CMSDataType.TThostFtdcErrorIDType	errorID;
	///错误信息
	19:CMSDataType.TThostFtdcErrorMsgType	errorMsg;
}

///查询预埋单
struct CThostFtdcQryParkedOrderField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///交易所代码
	4:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
}

///查询预埋撤单
struct CThostFtdcQryParkedOrderActionField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///交易所代码
	4:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
}

///删除预埋单
struct CThostFtdcRemoveParkedOrderField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///预埋报单编号
	3:CMSDataType.TThostFtdcParkedOrderIDType	parkedOrderID;
}

///删除预埋撤单
struct CThostFtdcRemoveParkedOrderActionField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///预埋撤单编号
	3:CMSDataType.TThostFtdcParkedOrderActionIDType	parkedOrderActionID;
}

///经纪公司可提资金算法表
struct CThostFtdcInvestorWithdrawAlgorithmField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者范围
	2:CMSDataType.TThostFtdcInvestorRangeType	investorRange;
	///投资者代码
	3:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///可提资金比例
	4:CMSDataType.TThostFtdcRatioType	usingRatio;
	///币种代码
	5:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///货币质押比率
	6:CMSDataType.TThostFtdcRatioType	fundMortgageRatio;
}

///查询组合持仓明细
struct CThostFtdcQryInvestorPositionCombineDetailField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///组合持仓合约编码
	3:CMSDataType.TThostFtdcInstrumentIDType	combInstrumentID;
}

///成交均价
struct CThostFtdcMarketDataAveragePriceField
{
	///当日均价
	1:CMSDataType.TThostFtdcPriceType	averagePrice;
}

///校验投资者密码
struct CThostFtdcVerifyInvestorPasswordField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///密码
	3:CMSDataType.TThostFtdcPasswordType	password;
}

///用户IP
struct CThostFtdcUserIPField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///用户代码
	2:CMSDataType.TThostFtdcUserIDType	userID;
	///IP地址
	3:CMSDataType.TThostFtdcIPAddressType	iPAddress;
	///IP地址掩码
	4:CMSDataType.TThostFtdcIPAddressType	iPMask;
	///Mac地址
	5:CMSDataType.TThostFtdcMacAddressType	macAddress;
}

///用户事件通知信息
struct CThostFtdcTradingNoticeInfoField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///发送时间
	3:CMSDataType.TThostFtdcTimeType	sendTime;
	///消息正文
	4:CMSDataType.TThostFtdcContentType	fieldContent;
	///序列系列号
	5:CMSDataType.TThostFtdcSequenceSeriesType	sequenceSeries;
	///序列号
	6:CMSDataType.TThostFtdcSequenceNoType	sequenceNo;
}

///用户事件通知
struct CThostFtdcTradingNoticeField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者范围
	2:CMSDataType.TThostFtdcInvestorRangeType	investorRange;
	///投资者代码
	3:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///序列系列号
	4:CMSDataType.TThostFtdcSequenceSeriesType	sequenceSeries;
	///用户代码
	5:CMSDataType.TThostFtdcUserIDType	userID;
	///发送时间
	6:CMSDataType.TThostFtdcTimeType	sendTime;
	///序列号
	7:CMSDataType.TThostFtdcSequenceNoType	sequenceNo;
	///消息正文
	8:CMSDataType.TThostFtdcContentType	fieldContent;
}

///查询交易事件通知
struct CThostFtdcQryTradingNoticeField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
}

///查询错误报单
struct CThostFtdcQryErrOrderField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
}

///错误报单
struct CThostFtdcErrOrderField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///报单引用
	4:CMSDataType.TThostFtdcOrderRefType	orderRef;
	///用户代码
	5:CMSDataType.TThostFtdcUserIDType	userID;
	///报单价格条件
	6:CMSDataType.TThostFtdcOrderPriceTypeType	orderPriceType;
	///买卖方向
	7:CMSDataType.TThostFtdcDirectionType	direction;
	///组合开平标志
	8:CMSDataType.TThostFtdcCombOffsetFlagType	combOffsetFlag;
	///组合投机套保标志
	9:CMSDataType.TThostFtdcCombHedgeFlagType	combHedgeFlag;
	///价格
	10:CMSDataType.TThostFtdcPriceType	limitPrice;
	///数量
	11:CMSDataType.TThostFtdcVolumeType	volumeTotalOriginal;
	///有效期类型
	12:CMSDataType.TThostFtdcTimeConditionType	timeCondition;
	///GTD日期
	13:CMSDataType.TThostFtdcDateType	gTDDate;
	///成交量类型
	14:CMSDataType.TThostFtdcVolumeConditionType	volumeCondition;
	///最小成交量
	15:CMSDataType.TThostFtdcVolumeType	minVolume;
	///触发条件
	16:CMSDataType.TThostFtdcContingentConditionType	contingentCondition;
	///止损价
	17:CMSDataType.TThostFtdcPriceType	stopPrice;
	///强平原因
	18:CMSDataType.TThostFtdcForceCloseReasonType	forceCloseReason;
	///自动挂起标志
	19:CMSDataType.TThostFtdcBoolType	isAutoSuspend;
	///业务单元
	20:CMSDataType.TThostFtdcBusinessUnitType	businessUnit;
	///请求编号
	21:CMSDataType.TThostFtdcRequestIDType	requestID;
	///用户强评标志
	22:CMSDataType.TThostFtdcBoolType	userForceClose;
	///错误代码
	23:CMSDataType.TThostFtdcErrorIDType	errorID;
	///错误信息
	24:CMSDataType.TThostFtdcErrorMsgType	errorMsg;
	///互换单标志
	25:CMSDataType.TThostFtdcBoolType	isSwapOrder;
}

///查询错误报单操作
struct CThostFtdcErrorConditionalOrderField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///报单引用
	4:CMSDataType.TThostFtdcOrderRefType	orderRef;
	///用户代码
	5:CMSDataType.TThostFtdcUserIDType	userID;
	///报单价格条件
	6:CMSDataType.TThostFtdcOrderPriceTypeType	orderPriceType;
	///买卖方向
	7:CMSDataType.TThostFtdcDirectionType	direction;
	///组合开平标志
	8:CMSDataType.TThostFtdcCombOffsetFlagType	combOffsetFlag;
	///组合投机套保标志
	9:CMSDataType.TThostFtdcCombHedgeFlagType	combHedgeFlag;
	///价格
	10:CMSDataType.TThostFtdcPriceType	limitPrice;
	///数量
	11:CMSDataType.TThostFtdcVolumeType	volumeTotalOriginal;
	///有效期类型
	12:CMSDataType.TThostFtdcTimeConditionType	timeCondition;
	///GTD日期
	13:CMSDataType.TThostFtdcDateType	gTDDate;
	///成交量类型
	14:CMSDataType.TThostFtdcVolumeConditionType	volumeCondition;
	///最小成交量
	15:CMSDataType.TThostFtdcVolumeType	minVolume;
	///触发条件
	16:CMSDataType.TThostFtdcContingentConditionType	contingentCondition;
	///止损价
	17:CMSDataType.TThostFtdcPriceType	stopPrice;
	///强平原因
	18:CMSDataType.TThostFtdcForceCloseReasonType	forceCloseReason;
	///自动挂起标志
	19:CMSDataType.TThostFtdcBoolType	isAutoSuspend;
	///业务单元
	20:CMSDataType.TThostFtdcBusinessUnitType	businessUnit;
	///请求编号
	21:CMSDataType.TThostFtdcRequestIDType	requestID;
	///本地报单编号
	22:CMSDataType.TThostFtdcOrderLocalIDType	orderLocalID;
	///交易所代码
	23:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///会员代码
	24:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///客户代码
	25:CMSDataType.TThostFtdcClientIDType	clientID;
	///合约在交易所的代码
	26:CMSDataType.TThostFtdcExchangeInstIDType	exchangeInstID;
	///交易所交易员代码
	27:CMSDataType.TThostFtdcTraderIDType	traderID;
	///安装编号
	28:CMSDataType.TThostFtdcInstallIDType	installID;
	///报单提交状态
	29:CMSDataType.TThostFtdcOrderSubmitStatusType	orderSubmitStatus;
	///报单提示序号
	30:CMSDataType.TThostFtdcSequenceNoType	notifySequence;
	///交易日
	31:CMSDataType.TThostFtdcDateType	tradingDay;
	///结算编号
	32:CMSDataType.TThostFtdcSettlementIDType	settlementID;
	///报单编号
	33:CMSDataType.TThostFtdcOrderSysIDType	orderSysID;
	///报单来源
	34:CMSDataType.TThostFtdcOrderSourceType	orderSource;
	///报单状态
	35:CMSDataType.TThostFtdcOrderStatusType	orderStatus;
	///报单类型
	36:CMSDataType.TThostFtdcOrderTypeType	orderType;
	///今成交数量
	37:CMSDataType.TThostFtdcVolumeType	volumeTraded;
	///剩余数量
	38:CMSDataType.TThostFtdcVolumeType	volumeTotal;
	///报单日期
	39:CMSDataType.TThostFtdcDateType	insertDate;
	///委托时间
	40:CMSDataType.TThostFtdcTimeType	insertTime;
	///激活时间
	41:CMSDataType.TThostFtdcTimeType	activeTime;
	///挂起时间
	42:CMSDataType.TThostFtdcTimeType	suspendTime;
	///最后修改时间
	43:CMSDataType.TThostFtdcTimeType	updateTime;
	///撤销时间
	44:CMSDataType.TThostFtdcTimeType	cancelTime;
	///最后修改交易所交易员代码
	45:CMSDataType.TThostFtdcTraderIDType	activeTraderID;
	///结算会员编号
	46:CMSDataType.TThostFtdcParticipantIDType	clearingPartID;
	///序号
	47:CMSDataType.TThostFtdcSequenceNoType	sequenceNo;
	///前置编号
	48:CMSDataType.TThostFtdcFrontIDType	frontID;
	///会话编号
	49:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///用户端产品信息
	50:CMSDataType.TThostFtdcProductInfoType	userProductInfo;
	///状态信息
	51:CMSDataType.TThostFtdcErrorMsgType	statusMsg;
	///用户强评标志
	52:CMSDataType.TThostFtdcBoolType	userForceClose;
	///操作用户代码
	53:CMSDataType.TThostFtdcUserIDType	activeUserID;
	///经纪公司报单编号
	54:CMSDataType.TThostFtdcSequenceNoType	brokerOrderSeq;
	///相关报单
	55:CMSDataType.TThostFtdcOrderSysIDType	relativeOrderSysID;
	///郑商所成交数量
	56:CMSDataType.TThostFtdcVolumeType	zCETotalTradedVolume;
	///错误代码
	57:CMSDataType.TThostFtdcErrorIDType	errorID;
	///错误信息
	58:CMSDataType.TThostFtdcErrorMsgType	errorMsg;
	///互换单标志
	59:CMSDataType.TThostFtdcBoolType	isSwapOrder;
}
///查询错误报单操作
struct CThostFtdcQryErrOrderActionField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
}

///错误报单操作
struct CThostFtdcErrOrderActionField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///报单操作引用
	3:CMSDataType.TThostFtdcOrderActionRefType	orderActionRef;
	///报单引用
	4:CMSDataType.TThostFtdcOrderRefType	orderRef;
	///请求编号
	5:CMSDataType.TThostFtdcRequestIDType	requestID;
	///前置编号
	6:CMSDataType.TThostFtdcFrontIDType	frontID;
	///会话编号
	7:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///交易所代码
	8:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///报单编号
	9:CMSDataType.TThostFtdcOrderSysIDType	orderSysID;
	///操作标志
	10:CMSDataType.TThostFtdcActionFlagType	actionFlag;
	///价格
	11:CMSDataType.TThostFtdcPriceType	limitPrice;
	///数量变化
	12:CMSDataType.TThostFtdcVolumeType	volumeChange;
	///操作日期
	13:CMSDataType.TThostFtdcDateType	actionDate;
	///操作时间
	14:CMSDataType.TThostFtdcTimeType	actionTime;
	///交易所交易员代码
	15:CMSDataType.TThostFtdcTraderIDType	traderID;
	///安装编号
	16:CMSDataType.TThostFtdcInstallIDType	installID;
	///本地报单编号
	17:CMSDataType.TThostFtdcOrderLocalIDType	orderLocalID;
	///操作本地编号
	18:CMSDataType.TThostFtdcOrderLocalIDType	actionLocalID;
	///会员代码
	19:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///客户代码
	20:CMSDataType.TThostFtdcClientIDType	clientID;
	///业务单元
	21:CMSDataType.TThostFtdcBusinessUnitType	businessUnit;
	///报单操作状态
	22:CMSDataType.TThostFtdcOrderActionStatusType	orderActionStatus;
	///用户代码
	23:CMSDataType.TThostFtdcUserIDType	userID;
	///状态信息
	24:CMSDataType.TThostFtdcErrorMsgType	statusMsg;
	///合约代码
	25:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///错误代码
	26:CMSDataType.TThostFtdcErrorIDType	errorID;
	///错误信息
	27:CMSDataType.TThostFtdcErrorMsgType	errorMsg;
}

///查询交易所状态
struct CThostFtdcQryExchangeSequenceField
{
	///交易所代码
	1:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
}

///交易所状态
struct CThostFtdcExchangeSequenceField
{
	///交易所代码
	1:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///序号
	2:CMSDataType.TThostFtdcSequenceNoType	sequenceNo;
	///合约交易状态
	3:CMSDataType.TThostFtdcInstrumentStatusType	marketStatus;
}

///根据价格查询最大报单数量
struct CThostFtdcQueryMaxOrderVolumeWithPriceField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///买卖方向
	4:CMSDataType.TThostFtdcDirectionType	direction;
	///开平标志
	5:CMSDataType.TThostFtdcOffsetFlagType	offsetFlag;
	///投机套保标志
	6:CMSDataType.TThostFtdcHedgeFlagType	hedgeFlag;
	///最大允许报单数量
	7:CMSDataType.TThostFtdcVolumeType	maxVolume;
	///报单价格
	8:CMSDataType.TThostFtdcPriceType	price;
}

///查询经纪公司交易参数
struct CThostFtdcQryBrokerTradingParamsField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///币种代码
	3:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
}

///经纪公司交易参数
struct CThostFtdcBrokerTradingParamsField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///保证金价格类型
	3:CMSDataType.TThostFtdcMarginPriceTypeType	marginPriceType;
	///盈亏算法
	4:CMSDataType.TThostFtdcAlgorithmType	algorithm;
	///可用是否包含平仓盈利
	5:CMSDataType.TThostFtdcIncludeCloseProfitType	availIncludeCloseProfit;
	///币种代码
	6:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///期权权利金价格类型
	7:CMSDataType.TThostFtdcOptionRoyaltyPriceTypeType	optionRoyaltyPriceType;
}

///查询经纪公司交易算法
struct CThostFtdcQryBrokerTradingAlgosField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///交易所代码
	2:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
}

///经纪公司交易算法
struct CThostFtdcBrokerTradingAlgosField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///交易所代码
	2:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///合约代码
	3:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///持仓处理算法编号
	4:CMSDataType.TThostFtdcHandlePositionAlgoIDType	handlePositionAlgoID;
	///寻找保证金率算法编号
	5:CMSDataType.TThostFtdcFindMarginRateAlgoIDType	findMarginRateAlgoID;
	///资金处理算法编号
	6:CMSDataType.TThostFtdcHandleTradingAccountAlgoIDType	handleTradingAccountAlgoID;
}

///查询经纪公司资金
struct CThostFtdcQueryBrokerDepositField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///交易所代码
	2:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
}

///经纪公司资金
struct CThostFtdcBrokerDepositField
{
	///交易日期
	1:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///经纪公司代码
	2:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///会员代码
	3:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///交易所代码
	4:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///上次结算准备金
	5:CMSDataType.TThostFtdcMoneyType	preBalance;
	///当前保证金总额
	6:CMSDataType.TThostFtdcMoneyType	currmargin;
	///平仓盈亏
	7:CMSDataType.TThostFtdcMoneyType	closeProfit;
	///期货结算准备金
	8:CMSDataType.TThostFtdcMoneyType	balance;
	///入金金额
	9:CMSDataType.TThostFtdcMoneyType	deposit;
	///出金金额
	10:CMSDataType.TThostFtdcMoneyType	withdraw;
	///可提资金
	11:CMSDataType.TThostFtdcMoneyType	available;
	///基本准备金
	12:CMSDataType.TThostFtdcMoneyType	reserve;
	///冻结的保证金
	13:CMSDataType.TThostFtdcMoneyType	frozenMargin;
}

///查询保证金监管系统经纪公司密钥
struct CThostFtdcQryCFMMCBrokerKeyField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
}

///保证金监管系统经纪公司密钥
struct CThostFtdcCFMMCBrokerKeyField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///经纪公司统一编码
	2:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///密钥生成日期
	3:CMSDataType.TThostFtdcDateType	createDate;
	///密钥生成时间
	4:CMSDataType.TThostFtdcTimeType	createTime;
	///密钥编号
	5:CMSDataType.TThostFtdcSequenceNoType	keyID;
	///动态密钥
	6:CMSDataType.TThostFtdcCFMMCKeyType	currentKey;
	///动态密钥类型
	7:CMSDataType.TThostFtdcCFMMCKeyKindType	keyKind;
}

///保证金监管系统经纪公司资金账户密钥
struct CThostFtdcCFMMCTradingAccountKeyField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///经纪公司统一编码
	2:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///投资者帐号
	3:CMSDataType.TThostFtdcAccountIDType	accountID;
	///密钥编号
	4:CMSDataType.TThostFtdcSequenceNoType	keyID;
	///动态密钥
	5:CMSDataType.TThostFtdcCFMMCKeyType	currentKey;
}

///请求查询保证金监管系统经纪公司资金账户密钥
struct CThostFtdcQryCFMMCTradingAccountKeyField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
}

///用户动态令牌参数
struct CThostFtdcBrokerUserOTPParamField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///用户代码
	2:CMSDataType.TThostFtdcUserIDType	userID;
	///动态令牌提供商
	3:CMSDataType.TThostFtdcOTPVendorsIDType	oTPVendorsID;
	///动态令牌序列号
	4:CMSDataType.TThostFtdcSerialNumberType	serialNumber;
	///令牌密钥
	5:CMSDataType.TThostFtdcAuthKeyType	authKey;
	///漂移值
	6:CMSDataType.TThostFtdcLastDriftType	lastDrift;
	///成功值
	7:CMSDataType.TThostFtdcLastSuccessType	lastSuccess;
	///动态令牌类型
	8:CMSDataType.TThostFtdcOTPTypeType	oTPType;
}

///手工同步用户动态令牌
struct CThostFtdcManualSyncBrokerUserOTPField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///用户代码
	2:CMSDataType.TThostFtdcUserIDType	userID;
	///动态令牌类型
	3:CMSDataType.TThostFtdcOTPTypeType	oTPType;
	///第一个动态密码
	4:CMSDataType.TThostFtdcPasswordType	firstOTP;
	///第二个动态密码
	5:CMSDataType.TThostFtdcPasswordType	secondOTP;
}

///投资者手续费率模板
struct CThostFtdcCommRateModelField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///手续费率模板代码
	2:CMSDataType.TThostFtdcInvestorIDType	commModelID;
	///模板名称
	3:CMSDataType.TThostFtdcCommModelNameType	commModelName;
}

///请求查询投资者手续费率模板
struct CThostFtdcQryCommRateModelField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///手续费率模板代码
	2:CMSDataType.TThostFtdcInvestorIDType	commModelID;
}

///投资者保证金率模板
struct CThostFtdcMarginModelField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///保证金率模板代码
	2:CMSDataType.TThostFtdcInvestorIDType	marginModelID;
	///模板名称
	3:CMSDataType.TThostFtdcCommModelNameType	marginModelName;
}

///请求查询投资者保证金率模板
struct CThostFtdcQryMarginModelField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///保证金率模板代码
	2:CMSDataType.TThostFtdcInvestorIDType	marginModelID;
}

///仓单折抵信息
struct CThostFtdcEWarrantOffsetField
{
	///交易日期
	1:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///经纪公司代码
	2:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	3:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///交易所代码
	4:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///合约代码
	5:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
	///买卖方向
	6:CMSDataType.TThostFtdcDirectionType	direction;
	///投机套保标志
	7:CMSDataType.TThostFtdcHedgeFlagType	hedgeFlag;
	///数量
	8:CMSDataType.TThostFtdcVolumeType	volume;
}

///查询仓单折抵信息
struct CThostFtdcQryEWarrantOffsetField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///交易所代码
	3:CMSDataType.TThostFtdcExchangeIDType	exchangeID;
	///合约代码
	4:CMSDataType.TThostFtdcInstrumentIDType	instrumentID;
}

///查询投资者品种/跨品种保证金
struct CThostFtdcQryInvestorProductGroupMarginField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///品种/跨品种标示
	3:CMSDataType.TThostFtdcInstrumentIDType	productGroupID;
	///投机套保标志
	4:CMSDataType.TThostFtdcHedgeFlagType	hedgeFlag;
}

///投资者品种/跨品种保证金
struct CThostFtdcInvestorProductGroupMarginField
{
	///品种/跨品种标示
	1:CMSDataType.TThostFtdcInstrumentIDType	productGroupID;
	///经纪公司代码
	2:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	3:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///交易日
	4:CMSDataType.TThostFtdcDateType	tradingDay;
	///结算编号
	5:CMSDataType.TThostFtdcSettlementIDType	settlementID;
	///冻结的保证金
	6:CMSDataType.TThostFtdcMoneyType	frozenMargin;
	///多头冻结的保证金
	7:CMSDataType.TThostFtdcMoneyType	longFrozenMargin;
	///空头冻结的保证金
	8:CMSDataType.TThostFtdcMoneyType	shortFrozenMargin;
	///占用的保证金
	9:CMSDataType.TThostFtdcMoneyType	useMargin;
	///多头保证金
	10:CMSDataType.TThostFtdcMoneyType	longUseMargin;
	///空头保证金
	11:CMSDataType.TThostFtdcMoneyType	shortUseMargin;
	///交易所保证金
	12:CMSDataType.TThostFtdcMoneyType	exchMargin;
	///交易所多头保证金
	13:CMSDataType.TThostFtdcMoneyType	longExchMargin;
	///交易所空头保证金
	14:CMSDataType.TThostFtdcMoneyType	shortExchMargin;
	///平仓盈亏
	15:CMSDataType.TThostFtdcMoneyType	closeProfit;
	///冻结的手续费
	16:CMSDataType.TThostFtdcMoneyType	frozenCommission;
	///手续费
	17:CMSDataType.TThostFtdcMoneyType	commission;
	///冻结的资金
	18:CMSDataType.TThostFtdcMoneyType	frozenCash;
	///资金差额
	19:CMSDataType.TThostFtdcMoneyType	cashIn;
	///持仓盈亏
	20:CMSDataType.TThostFtdcMoneyType	positionProfit;
	///折抵总金额
	21:CMSDataType.TThostFtdcMoneyType	offsetAmount;
	///多头折抵总金额
	22:CMSDataType.TThostFtdcMoneyType	longOffsetAmount;
	///空头折抵总金额
	23:CMSDataType.TThostFtdcMoneyType	shortOffsetAmount;
	///交易所折抵总金额
	24:CMSDataType.TThostFtdcMoneyType	exchOffsetAmount;
	///交易所多头折抵总金额
	25:CMSDataType.TThostFtdcMoneyType	longExchOffsetAmount;
	///交易所空头折抵总金额
	26:CMSDataType.TThostFtdcMoneyType	shortExchOffsetAmount;
	///投机套保标志
	27:CMSDataType.TThostFtdcHedgeFlagType	hedgeFlag;
}
///查询监控中心用户令牌
struct CThostFtdcQueryCFMMCTradingAccountTokenField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	2:CMSDataType.TThostFtdcInvestorIDType	investorID;
}

///监控中心用户令牌
struct CThostFtdcCFMMCTradingAccountTokenField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///经纪公司统一编码
	2:CMSDataType.TThostFtdcParticipantIDType	participantID;
	///投资者帐号
	3:CMSDataType.TThostFtdcAccountIDType	accountID;
	///密钥编号
	4:CMSDataType.TThostFtdcSequenceNoType	keyID;
	///动态令牌
	5:CMSDataType.TThostFtdcCFMMCTokenType	token;
}
///转帐开户请求
struct CThostFtdcReqOpenAccountField
{
	///业务功能码
	1:CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///银行代码
	2:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构代码
	3:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///期商代码
	4:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期商分支机构代码
	5:CMSDataType.TThostFtdcFutureBranchIDType	brokerBranchID;
	///交易日期
	6:CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易时间
	7:CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///银行流水号
	8:CMSDataType.TThostFtdcBankSerialType	bankSerial;
	///交易系统日期
	9:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///银期平台消息流水号
	10:CMSDataType.TThostFtdcSerialType	plateSerial;
	///最后分片标志
	11:CMSDataType.TThostFtdcLastFragmentType	lastFragment;
	///会话号
	12:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///客户姓名
	13:CMSDataType.TThostFtdcIndividualNameType	customerName;
	///证件类型
	14:CMSDataType.TThostFtdcIdCardTypeType	idCardType;
	///证件号码
	15:CMSDataType.TThostFtdcIdentifiedCardNoType	identifiedCardNo;
	///性别
	16:CMSDataType.TThostFtdcGenderType	gender;
	///国家代码
	17:CMSDataType.TThostFtdcCountryCodeType	countryCode;
	///客户类型
	18:CMSDataType.TThostFtdcCustTypeType	custType;
	///地址
	19:CMSDataType.TThostFtdcAddressType	address;
	///邮编
	20:CMSDataType.TThostFtdcZipCodeType	zipCode;
	///电话号码
	21:CMSDataType.TThostFtdcTelephoneType	telephone;
	///手机
	22:CMSDataType.TThostFtdcMobilePhoneType	mobilePhone;
	///传真
	23:CMSDataType.TThostFtdcFaxType	fax;
	///电子邮件
	24:CMSDataType.TThostFtdcEMailType	eMail;
	///资金账户状态
	25:CMSDataType.TThostFtdcMoneyAccountStatusType	moneyAccountStatus;
	///银行帐号
	26:CMSDataType.TThostFtdcBankAccountType	bankAccount;
	///银行密码
	27:CMSDataType.TThostFtdcPasswordType	bankPassWord;
	///投资者帐号
	28:CMSDataType.TThostFtdcAccountIDType	accountID;
	///期货密码
	29:CMSDataType.TThostFtdcPasswordType	password;
	///安装编号
	30:CMSDataType.TThostFtdcInstallIDType	installID;
	///验证客户证件号码标志
	31:CMSDataType.TThostFtdcYesNoIndicatorType	verifyCertNoFlag;
	///币种代码
	32:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///汇钞标志
	33:CMSDataType.TThostFtdcCashExchangeCodeType	cashExchangeCode;
	///摘要
	34:CMSDataType.TThostFtdcDigestType	digest;
	///银行帐号类型
	35:CMSDataType.TThostFtdcBankAccTypeType	bankAccType;
	///渠道标志
	36:CMSDataType.TThostFtdcDeviceIDType	deviceID;
	///期货单位帐号类型
	37:CMSDataType.TThostFtdcBankAccTypeType	bankSecuAccType;
	///期货公司银行编码
	38:CMSDataType.TThostFtdcBankCodingForFutureType	brokerIDByBank;
	///期货单位帐号
	39:CMSDataType.TThostFtdcBankAccountType	bankSecuAcc;
	///银行密码标志
	40:CMSDataType.TThostFtdcPwdFlagType	bankPwdFlag;
	///期货资金密码核对标志
	41:CMSDataType.TThostFtdcPwdFlagType	secuPwdFlag;
	///交易柜员
	42:CMSDataType.TThostFtdcOperNoType	operNo;
	///交易ID
	43:CMSDataType.TThostFtdcTIDType	tID;
	///用户标识
	44:CMSDataType.TThostFtdcUserIDType	userID;
}

///转帐销户请求
struct CThostFtdcReqCancelAccountField
{
	///业务功能码
	1:CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///银行代码
	2:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构代码
	3:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///期商代码
	4:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期商分支机构代码
	5:CMSDataType.TThostFtdcFutureBranchIDType	brokerBranchID;
	///交易日期
	6:CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易时间
	7:CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///银行流水号
	8:CMSDataType.TThostFtdcBankSerialType	bankSerial;
	///交易系统日期
	9:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///银期平台消息流水号
	10:CMSDataType.TThostFtdcSerialType	plateSerial;
	///最后分片标志
	11:CMSDataType.TThostFtdcLastFragmentType	lastFragment;
	///会话号
	12:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///客户姓名
	13:CMSDataType.TThostFtdcIndividualNameType	customerName;
	///证件类型
	14:CMSDataType.TThostFtdcIdCardTypeType	idcardType;
	///证件号码
	15:CMSDataType.TThostFtdcIdentifiedCardNoType	identifiedCardNo;
	///性别
	16:CMSDataType.TThostFtdcGenderType	gender;
	///国家代码
	17:CMSDataType.TThostFtdcCountryCodeType	countryCode;
	///客户类型
	18:CMSDataType.TThostFtdcCustTypeType	custType;
	///地址
	19:CMSDataType.TThostFtdcAddressType	address;
	///邮编
	20:CMSDataType.TThostFtdcZipCodeType	zipCode;
	///电话号码
	21:CMSDataType.TThostFtdcTelephoneType	telephone;
	///手机
	22:CMSDataType.TThostFtdcMobilePhoneType	mobilePhone;
	///传真
	23:CMSDataType.TThostFtdcFaxType	fax;
	///电子邮件
	24:CMSDataType.TThostFtdcEMailType	eMail;
	///资金账户状态
	25:CMSDataType.TThostFtdcMoneyAccountStatusType	moneyAccountStatus;
	///银行帐号
	26:CMSDataType.TThostFtdcBankAccountType	bankAccount;
	///银行密码
	27:CMSDataType.TThostFtdcPasswordType	bankPassWord;
	///投资者帐号
	28:CMSDataType.TThostFtdcAccountIDType	accountID;
	///期货密码
	29:CMSDataType.TThostFtdcPasswordType	password;
	///安装编号
	30:CMSDataType.TThostFtdcInstallIDType	installID;
	///验证客户证件号码标志
	31:CMSDataType.TThostFtdcYesNoIndicatorType	verifyCertNoFlag;
	///币种代码
	32:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///汇钞标志
	33:CMSDataType.TThostFtdcCashExchangeCodeType	cashExchangeCode;
	///摘要
	34:CMSDataType.TThostFtdcDigestType	digest;
	///银行帐号类型
	35:CMSDataType.TThostFtdcBankAccTypeType	bankAccType;
	///渠道标志
	36:CMSDataType.TThostFtdcDeviceIDType	deviceID;
	///期货单位帐号类型
	37:CMSDataType.TThostFtdcBankAccTypeType	bankSecuAccType;
	///期货公司银行编码
	38:CMSDataType.TThostFtdcBankCodingForFutureType	brokerIDByBank;
	///期货单位帐号
	39:CMSDataType.TThostFtdcBankAccountType	bankSecuAcc;
	///银行密码标志
	40:CMSDataType.TThostFtdcPwdFlagType	bankPwdFlag;
	///期货资金密码核对标志
	41:CMSDataType.TThostFtdcPwdFlagType	secuPwdFlag;
	///交易柜员
	42:CMSDataType.TThostFtdcOperNoType	operNo;
	///交易ID
	43:CMSDataType.TThostFtdcTIDType	tID;
	///用户标识
	44:CMSDataType.TThostFtdcUserIDType	userID;
}

///变更银行账户请求
struct CThostFtdcReqChangeAccountField
{
	///业务功能码
	1:CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///银行代码
	2:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构代码
	3:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///期商代码
	4:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期商分支机构代码
	5:CMSDataType.TThostFtdcFutureBranchIDType	brokerBranchID;
	///交易日期
	6:CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易时间
	7:CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///银行流水号
	8:CMSDataType.TThostFtdcBankSerialType	bankSerial;
	///交易系统日期
	9:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///银期平台消息流水号
	10:CMSDataType.TThostFtdcSerialType	plateSerial;
	///最后分片标志
	11:CMSDataType.TThostFtdcLastFragmentType	lastFragment;
	///会话号
	12:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///客户姓名
	13:CMSDataType.TThostFtdcIndividualNameType	customerName;
	///证件类型
	14:CMSDataType.TThostFtdcIdCardTypeType	idCardType;
	///证件号码
	15:CMSDataType.TThostFtdcIdentifiedCardNoType	identifiedCardNo;
	///性别
	16:CMSDataType.TThostFtdcGenderType	gender;
	///国家代码
	17:CMSDataType.TThostFtdcCountryCodeType	countryCode;
	///客户类型
	18:CMSDataType.TThostFtdcCustTypeType	custType;
	///地址
	19:CMSDataType.TThostFtdcAddressType	address;
	///邮编
	20:CMSDataType.TThostFtdcZipCodeType	zipCode;
	///电话号码
	21:CMSDataType.TThostFtdcTelephoneType	telephone;
	///手机
	22:CMSDataType.TThostFtdcMobilePhoneType	mobilePhone;
	///传真
	23:CMSDataType.TThostFtdcFaxType	fax;
	///电子邮件
	24:CMSDataType.TThostFtdcEMailType	eMail;
	///资金账户状态
	25:CMSDataType.TThostFtdcMoneyAccountStatusType	moneyAccountStatus;
	///银行帐号
	26:CMSDataType.TThostFtdcBankAccountType	bankAccount;
	///银行密码
	27:CMSDataType.TThostFtdcPasswordType	bankPassWord;
	///新银行帐号
	28:CMSDataType.TThostFtdcBankAccountType	newBankAccount;
	///新银行密码
	29:CMSDataType.TThostFtdcPasswordType	newBankPassWord;
	///投资者帐号
	30:CMSDataType.TThostFtdcAccountIDType	accountID;
	///期货密码
	31:CMSDataType.TThostFtdcPasswordType	password;
	///银行帐号类型
	32:CMSDataType.TThostFtdcBankAccTypeType	bankAccType;
	///安装编号
	33:CMSDataType.TThostFtdcInstallIDType	installID;
	///验证客户证件号码标志
	34:CMSDataType.TThostFtdcYesNoIndicatorType	verifyCertNoFlag;
	///币种代码
	35:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///期货公司银行编码
	36:CMSDataType.TThostFtdcBankCodingForFutureType	brokerIDByBank;
	///银行密码标志
	37:CMSDataType.TThostFtdcPwdFlagType	bankPwdFlag;
	///期货资金密码核对标志
	38:CMSDataType.TThostFtdcPwdFlagType	secuPwdFlag;
	///交易ID
	39:CMSDataType.TThostFtdcTIDType	tID;
	///摘要
	40:CMSDataType.TThostFtdcDigestType	digest;
}

///转账请求
struct CThostFtdcReqTransferField
{
	///业务功能码
	1:CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///银行代码
	2:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构代码
	3:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///期商代码
	4:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期商分支机构代码
	5:CMSDataType.TThostFtdcFutureBranchIDType	brokerBranchID;
	///交易日期
	6:CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易时间
	7:CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///银行流水号
	8:CMSDataType.TThostFtdcBankSerialType	bankSerial;
	///交易系统日期
	9:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///银期平台消息流水号
	10:CMSDataType.TThostFtdcSerialType	plateSerial;
	///最后分片标志
	11:CMSDataType.TThostFtdcLastFragmentType	lastFragment;
	///会话号
	12:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///客户姓名
	13:CMSDataType.TThostFtdcIndividualNameType	customerName;
	///证件类型
	14:CMSDataType.TThostFtdcIdCardTypeType	idCardType;
	///证件号码
	15:CMSDataType.TThostFtdcIdentifiedCardNoType	identifiedCardNo;
	///客户类型
	16:CMSDataType.TThostFtdcCustTypeType	custType;
	///银行帐号
	17:CMSDataType.TThostFtdcBankAccountType	bankAccount;
	///银行密码
	18:CMSDataType.TThostFtdcPasswordType	bankPassWord;
	///投资者帐号
	19:CMSDataType.TThostFtdcAccountIDType	accountID;
	///期货密码
	20:CMSDataType.TThostFtdcPasswordType	password;
	///安装编号
	21:CMSDataType.TThostFtdcInstallIDType	installID;
	///期货公司流水号
	22:CMSDataType.TThostFtdcFutureSerialType	futureSerial;
	///用户标识
	23:CMSDataType.TThostFtdcUserIDType	userID;
	///验证客户证件号码标志
	24:CMSDataType.TThostFtdcYesNoIndicatorType	verifyCertNoFlag;
	///币种代码
	25:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///转帐金额
	26:CMSDataType.TThostFtdcTradeAmountType	tradeAmount;
	///期货可取金额
	27:CMSDataType.TThostFtdcTradeAmountType	futureFetchAmount;
	///费用支付标志
	28:CMSDataType.TThostFtdcFeePayFlagType	feePayFlag;
	///应收客户费用
	29:CMSDataType.TThostFtdcCustFeeType	custFee;
	///应收期货公司费用
	30:CMSDataType.TThostFtdcFutureFeeType	brokerFee;
	///发送方给接收方的消息
	31:CMSDataType.TThostFtdcAddInfoType	message;
	///摘要
	32:CMSDataType.TThostFtdcDigestType	digest;
	///银行帐号类型
	33:CMSDataType.TThostFtdcBankAccTypeType	bankAccType;
	///渠道标志
	34:CMSDataType.TThostFtdcDeviceIDType	deviceID;
	///期货单位帐号类型
	35:CMSDataType.TThostFtdcBankAccTypeType	bankSecuAccType;
	///期货公司银行编码
	36:CMSDataType.TThostFtdcBankCodingForFutureType	brokerIDByBank;
	///期货单位帐号
	37:CMSDataType.TThostFtdcBankAccountType	bankSecuAcc;
	///银行密码标志
	38:CMSDataType.TThostFtdcPwdFlagType	bankPwdFlag;
	///期货资金密码核对标志
	39:CMSDataType.TThostFtdcPwdFlagType	secuPwdFlag;
	///交易柜员
	40:CMSDataType.TThostFtdcOperNoType	operNo;
	///请求编号
	41:CMSDataType.TThostFtdcRequestIDType	requestID;
	///交易ID
	42:CMSDataType.TThostFtdcTIDType	tID;
	///转账交易状态
	43:CMSDataType.TThostFtdcTransferStatusType	transferStatus;
}

///银行发起银行资金转期货响应
struct CThostFtdcRspTransferField
{
	///业务功能码
	1:CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///银行代码
	2:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构代码
	3:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///期商代码
	4:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期商分支机构代码
	5:CMSDataType.TThostFtdcFutureBranchIDType	brokerBranchID;
	///交易日期
	6:CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易时间
	7:CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///银行流水号
	8:CMSDataType.TThostFtdcBankSerialType	bankSerial;
	///交易系统日期
	9:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///银期平台消息流水号
	10:CMSDataType.TThostFtdcSerialType	plateSerial;
	///最后分片标志
	11:CMSDataType.TThostFtdcLastFragmentType	lastFragment;
	///会话号
	12:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///客户姓名
	13:CMSDataType.TThostFtdcIndividualNameType	customerName;
	///证件类型
	14:CMSDataType.TThostFtdcIdCardTypeType	idCardType;
	///证件号码
	15:CMSDataType.TThostFtdcIdentifiedCardNoType	identifiedCardNo;
	///客户类型
	16:CMSDataType.TThostFtdcCustTypeType	custType;
	///银行帐号
	17:CMSDataType.TThostFtdcBankAccountType	bankAccount;
	///银行密码
	18:CMSDataType.TThostFtdcPasswordType	bankPassWord;
	///投资者帐号
	19:CMSDataType.TThostFtdcAccountIDType	accountID;
	///期货密码
	20:CMSDataType.TThostFtdcPasswordType	password;
	///安装编号
	21:CMSDataType.TThostFtdcInstallIDType	installID;
	///期货公司流水号
	22:CMSDataType.TThostFtdcFutureSerialType	futureSerial;
	///用户标识
	23:CMSDataType.TThostFtdcUserIDType	userID;
	///验证客户证件号码标志
	24:CMSDataType.TThostFtdcYesNoIndicatorType	verifyCertNoFlag;
	///币种代码
	25:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///转帐金额
	26:CMSDataType.TThostFtdcTradeAmountType	tradeAmount;
	///期货可取金额
	27:CMSDataType.TThostFtdcTradeAmountType	futureFetchAmount;
	///费用支付标志
	28:CMSDataType.TThostFtdcFeePayFlagType	feePayFlag;
	///应收客户费用
	29:CMSDataType.TThostFtdcCustFeeType	custFee;
	///应收期货公司费用
	30:CMSDataType.TThostFtdcFutureFeeType	brokerFee;
	///发送方给接收方的消息
	31:CMSDataType.TThostFtdcAddInfoType	message;
	///摘要
	32:CMSDataType.TThostFtdcDigestType	digest;
	///银行帐号类型
	33:CMSDataType.TThostFtdcBankAccTypeType	bankAccType;
	///渠道标志
	34:CMSDataType.TThostFtdcDeviceIDType	deviceID;
	///期货单位帐号类型
	35:CMSDataType.TThostFtdcBankAccTypeType	bankSecuAccType;
	///期货公司银行编码
	36:CMSDataType.TThostFtdcBankCodingForFutureType	brokerIDByBank;
	///期货单位帐号
	37:CMSDataType.TThostFtdcBankAccountType	bankSecuAcc;
	///银行密码标志
	38:CMSDataType.TThostFtdcPwdFlagType	bankPwdFlag;
	///期货资金密码核对标志
	39:CMSDataType.TThostFtdcPwdFlagType	secuPwdFlag;
	///交易柜员
	40:CMSDataType.TThostFtdcOperNoType	operNo;
	///请求编号
	41:CMSDataType.TThostFtdcRequestIDType	requestID;
	///交易ID
	42:CMSDataType.TThostFtdcTIDType	tID;
	///转账交易状态
	43:CMSDataType.TThostFtdcTransferStatusType	transferStatus;
	///错误代码
	44:CMSDataType.TThostFtdcErrorIDType	errorID;
	///错误信息
	45:CMSDataType.TThostFtdcErrorMsgType	errorMsg;
}

///冲正请求
struct CThostFtdcReqRepealField
{
	///冲正时间间隔
	1:CMSDataType.TThostFtdcRepealTimeIntervalType	repealTimeInterval;
	///已经冲正次数
	2:CMSDataType.TThostFtdcRepealedTimesType	repealedTimes;
	///银行冲正标志
	3:CMSDataType.TThostFtdcBankRepealFlagType	bankRepealFlag;
	///期商冲正标志
	4:CMSDataType.TThostFtdcBrokerRepealFlagType	brokerRepealFlag;
	///被冲正平台流水号
	5:CMSDataType.TThostFtdcPlateSerialType	plateRepealSerial;
	///被冲正银行流水号
	6:CMSDataType.TThostFtdcBankSerialType	bankRepealSerial;
	///被冲正期货流水号
	7:CMSDataType.TThostFtdcFutureSerialType	futureRepealSerial;
	///业务功能码
	8:CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///银行代码
	9:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构代码
	10:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///期商代码
	11:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期商分支机构代码
	12:CMSDataType.TThostFtdcFutureBranchIDType	brokerBranchID;
	///交易日期
	13:CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易时间
	14:CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///银行流水号
	15:CMSDataType.TThostFtdcBankSerialType	bankSerial;
	///交易系统日期
	16:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///银期平台消息流水号
	17:CMSDataType.TThostFtdcSerialType	plateSerial;
	///最后分片标志
	18:CMSDataType.TThostFtdcLastFragmentType	lastFragment;
	///会话号
	19:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///客户姓名
	20:CMSDataType.TThostFtdcIndividualNameType	customerName;
	///证件类型
	21:CMSDataType.TThostFtdcIdCardTypeType	idCardType;
	///证件号码
	22:CMSDataType.TThostFtdcIdentifiedCardNoType	identifiedCardNo;
	///客户类型
	23:CMSDataType.TThostFtdcCustTypeType	custType;
	///银行帐号
	24:CMSDataType.TThostFtdcBankAccountType	bankAccount;
	///银行密码
	25:CMSDataType.TThostFtdcPasswordType	bankPassWord;
	///投资者帐号
	26:CMSDataType.TThostFtdcAccountIDType	accountID;
	///期货密码
	27:CMSDataType.TThostFtdcPasswordType	password;
	///安装编号
	28:CMSDataType.TThostFtdcInstallIDType	installID;
	///期货公司流水号
	29:CMSDataType.TThostFtdcFutureSerialType	futureSerial;
	///用户标识
	30:CMSDataType.TThostFtdcUserIDType	userID;
	///验证客户证件号码标志
	31:CMSDataType.TThostFtdcYesNoIndicatorType	verifyCertNoFlag;
	///币种代码
	32:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///转帐金额
	33:CMSDataType.TThostFtdcTradeAmountType	tradeAmount;
	///期货可取金额
	34:CMSDataType.TThostFtdcTradeAmountType	futureFetchAmount;
	///费用支付标志
	35:CMSDataType.TThostFtdcFeePayFlagType	feePayFlag;
	///应收客户费用
	36:CMSDataType.TThostFtdcCustFeeType	custFee;
	///应收期货公司费用
	37:CMSDataType.TThostFtdcFutureFeeType	brokerFee;
	///发送方给接收方的消息
	38:CMSDataType.TThostFtdcAddInfoType	message;
	///摘要
	39:CMSDataType.TThostFtdcDigestType	digest;
	///银行帐号类型
	40:CMSDataType.TThostFtdcBankAccTypeType	bankAccType;
	///渠道标志
	41:CMSDataType.TThostFtdcDeviceIDType	deviceID;
	///期货单位帐号类型
	42:CMSDataType.TThostFtdcBankAccTypeType	bankSecuAccType;
	///期货公司银行编码
	43:CMSDataType.TThostFtdcBankCodingForFutureType	brokerIDByBank;
	///期货单位帐号
	44:CMSDataType.TThostFtdcBankAccountType	bankSecuAcc;
	///银行密码标志
	45:CMSDataType.TThostFtdcPwdFlagType	bankPwdFlag;
	///期货资金密码核对标志
	46:CMSDataType.TThostFtdcPwdFlagType	secuPwdFlag;
	///交易柜员
	47:CMSDataType.TThostFtdcOperNoType	operNo;
	///请求编号
	48:CMSDataType.TThostFtdcRequestIDType	requestID;
	///交易ID
	49:CMSDataType.TThostFtdcTIDType	tID;
	///转账交易状态
	50:CMSDataType.TThostFtdcTransferStatusType	transferStatus;
}

///冲正响应
struct CThostFtdcRspRepealField
{
	///冲正时间间隔
	1:CMSDataType.TThostFtdcRepealTimeIntervalType	repealTimeInterval;
	///已经冲正次数
	2:CMSDataType.TThostFtdcRepealedTimesType	repealedTimes;
	///银行冲正标志
	3:CMSDataType.TThostFtdcBankRepealFlagType	bankRepealFlag;
	///期商冲正标志
	4:CMSDataType.TThostFtdcBrokerRepealFlagType	brokerRepealFlag;
	///被冲正平台流水号
	5:CMSDataType.TThostFtdcPlateSerialType	plateRepealSerial;
	///被冲正银行流水号
	6:CMSDataType.TThostFtdcBankSerialType	bankRepealSerial;
	///被冲正期货流水号
	7:CMSDataType.TThostFtdcFutureSerialType	futureRepealSerial;
	///业务功能码
	8:CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///银行代码
	9:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构代码
	10:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///期商代码
	11:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期商分支机构代码
	12:CMSDataType.TThostFtdcFutureBranchIDType	brokerBranchID;
	///交易日期
	13:CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易时间
	14:CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///银行流水号
	15:CMSDataType.TThostFtdcBankSerialType	bankSerial;
	///交易系统日期
	16:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///银期平台消息流水号
	17:CMSDataType.TThostFtdcSerialType	plateSerial;
	///最后分片标志
	18:CMSDataType.TThostFtdcLastFragmentType	lastFragment;
	///会话号
	19:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///客户姓名
	20:CMSDataType.TThostFtdcIndividualNameType	customerName;
	///证件类型
	21:CMSDataType.TThostFtdcIdCardTypeType	idCardType;
	///证件号码
	22:CMSDataType.TThostFtdcIdentifiedCardNoType	identifiedCardNo;
	///客户类型
	23:CMSDataType.TThostFtdcCustTypeType	custType;
	///银行帐号
	24:CMSDataType.TThostFtdcBankAccountType	bankAccount;
	///银行密码
	25:CMSDataType.TThostFtdcPasswordType	bankPassWord;
	///投资者帐号
	26:CMSDataType.TThostFtdcAccountIDType	accountID;
	///期货密码
	27:CMSDataType.TThostFtdcPasswordType	password;
	///安装编号
	28:CMSDataType.TThostFtdcInstallIDType	installID;
	///期货公司流水号
	29:CMSDataType.TThostFtdcFutureSerialType	futureSerial;
	///用户标识
	30:CMSDataType.TThostFtdcUserIDType	userID;
	///验证客户证件号码标志
	31:CMSDataType.TThostFtdcYesNoIndicatorType	verifyCertNoFlag;
	///币种代码
	32:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///转帐金额
	33:CMSDataType.TThostFtdcTradeAmountType	tradeAmount;
	///期货可取金额
	34:CMSDataType.TThostFtdcTradeAmountType	futureFetchAmount;
	///费用支付标志
	35:CMSDataType.TThostFtdcFeePayFlagType	feePayFlag;
	///应收客户费用
	36:CMSDataType.TThostFtdcCustFeeType	custFee;
	///应收期货公司费用
	37:CMSDataType.TThostFtdcFutureFeeType	brokerFee;
	///发送方给接收方的消息
	38:CMSDataType.TThostFtdcAddInfoType	message;
	///摘要
	39:CMSDataType.TThostFtdcDigestType	digest;
	///银行帐号类型
	40:CMSDataType.TThostFtdcBankAccTypeType	bankAccType;
	///渠道标志
	41:CMSDataType.TThostFtdcDeviceIDType	deviceID;
	///期货单位帐号类型
	42:CMSDataType.TThostFtdcBankAccTypeType	bankSecuAccType;
	///期货公司银行编码
	43:CMSDataType.TThostFtdcBankCodingForFutureType	brokerIDByBank;
	///期货单位帐号
	44:CMSDataType.TThostFtdcBankAccountType	bankSecuAcc;
	///银行密码标志
	45:CMSDataType.TThostFtdcPwdFlagType	bankPwdFlag;
	///期货资金密码核对标志
	46:CMSDataType.TThostFtdcPwdFlagType	secuPwdFlag;
	///交易柜员
	47:CMSDataType.TThostFtdcOperNoType	operNo;
	///请求编号
	48:CMSDataType.TThostFtdcRequestIDType	requestID;
	///交易ID
	49:CMSDataType.TThostFtdcTIDType	tID;
	///转账交易状态
	50:CMSDataType.TThostFtdcTransferStatusType	transferStatus;
	///错误代码
	51:CMSDataType.TThostFtdcErrorIDType	errorID;
	///错误信息
	52:CMSDataType.TThostFtdcErrorMsgType	errorMsg;
}

///查询账户信息请求
struct CThostFtdcReqQueryAccountField
{
	///业务功能码
	1:CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///银行代码
	2:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构代码
	3:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///期商代码
	4:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期商分支机构代码
	5:CMSDataType.TThostFtdcFutureBranchIDType	brokerBranchID;
	///交易日期
	6:CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易时间
	7:CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///银行流水号
	8:CMSDataType.TThostFtdcBankSerialType	bankSerial;
	///交易系统日期
	9:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///银期平台消息流水号
	10:CMSDataType.TThostFtdcSerialType	plateSerial;
	///最后分片标志
	11:CMSDataType.TThostFtdcLastFragmentType	lastFragment;
	///会话号
	12:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///客户姓名
	13:CMSDataType.TThostFtdcIndividualNameType	customerName;
	///证件类型
	14:CMSDataType.TThostFtdcIdCardTypeType	idCardType;
	///证件号码
	15:CMSDataType.TThostFtdcIdentifiedCardNoType	identifiedCardNo;
	///客户类型
	16:CMSDataType.TThostFtdcCustTypeType	custType;
	///银行帐号
	17:CMSDataType.TThostFtdcBankAccountType	bankAccount;
	///银行密码
	18:CMSDataType.TThostFtdcPasswordType	bankPassWord;
	///投资者帐号
	19:CMSDataType.TThostFtdcAccountIDType	accountID;
	///期货密码
	20:CMSDataType.TThostFtdcPasswordType	password;
	///期货公司流水号
	21:CMSDataType.TThostFtdcFutureSerialType	futureSerial;
	///安装编号
	22:CMSDataType.TThostFtdcInstallIDType	installID;
	///用户标识
	23:CMSDataType.TThostFtdcUserIDType	userID;
	///验证客户证件号码标志
	24:CMSDataType.TThostFtdcYesNoIndicatorType	verifyCertNoFlag;
	///币种代码
	25:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///摘要
	26:CMSDataType.TThostFtdcDigestType	digest;
	///银行帐号类型
	27:CMSDataType.TThostFtdcBankAccTypeType	bankAccType;
	///渠道标志
	28:CMSDataType.TThostFtdcDeviceIDType	deviceID;
	///期货单位帐号类型
	29:CMSDataType.TThostFtdcBankAccTypeType	bankSecuAccType;
	///期货公司银行编码
	30:CMSDataType.TThostFtdcBankCodingForFutureType	brokerIDByBank;
	///期货单位帐号
	31:CMSDataType.TThostFtdcBankAccountType	bankSecuAcc;
	///银行密码标志
	32:CMSDataType.TThostFtdcPwdFlagType	bankPwdFlag;
	///期货资金密码核对标志
	33:CMSDataType.TThostFtdcPwdFlagType	secuPwdFlag;
	///交易柜员
	34:CMSDataType.TThostFtdcOperNoType	operNo;
	///请求编号
	35:CMSDataType.TThostFtdcRequestIDType	requestID;
	///交易ID
	36:CMSDataType.TThostFtdcTIDType	tID;
}

///查询账户信息响应
struct CThostFtdcRspQueryAccountField
{
	///业务功能码
	1:CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///银行代码
	2:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构代码
	3:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///期商代码
	4:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期商分支机构代码
	5:CMSDataType.TThostFtdcFutureBranchIDType	brokerBranchID;
	///交易日期
	6:CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易时间
	7:CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///银行流水号
	8:CMSDataType.TThostFtdcBankSerialType	bankSerial;
	///交易系统日期
	9:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///银期平台消息流水号
	10:CMSDataType.TThostFtdcSerialType	plateSerial;
	///最后分片标志
	11:CMSDataType.TThostFtdcLastFragmentType	lastFragment;
	///会话号
	12:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///客户姓名
	13:CMSDataType.TThostFtdcIndividualNameType	customerName;
	///证件类型
	14:CMSDataType.TThostFtdcIdCardTypeType	idcardType;
	///证件号码
	15:CMSDataType.TThostFtdcIdentifiedCardNoType	identifiedCardNo;
	///客户类型
	16:CMSDataType.TThostFtdcCustTypeType	custType;
	///银行帐号
	17:CMSDataType.TThostFtdcBankAccountType	bankAccount;
	///银行密码
	18:CMSDataType.TThostFtdcPasswordType	bankPassWord;
	///投资者帐号
	19:CMSDataType.TThostFtdcAccountIDType	accountID;
	///期货密码
	20:CMSDataType.TThostFtdcPasswordType	password;
	///期货公司流水号
	21:CMSDataType.TThostFtdcFutureSerialType	futureSerial;
	///安装编号
	22:CMSDataType.TThostFtdcInstallIDType	installID;
	///用户标识
	23:CMSDataType.TThostFtdcUserIDType	userID;
	///验证客户证件号码标志
	24:CMSDataType.TThostFtdcYesNoIndicatorType	verifyCertNoFlag;
	///币种代码
	25:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///摘要
	26:CMSDataType.TThostFtdcDigestType	digest;
	///银行帐号类型
	27:CMSDataType.TThostFtdcBankAccTypeType	bankAccType;
	///渠道标志
	28:CMSDataType.TThostFtdcDeviceIDType	deviceID;
	///期货单位帐号类型
	29:CMSDataType.TThostFtdcBankAccTypeType	bankSecuAccType;
	///期货公司银行编码
	30:CMSDataType.TThostFtdcBankCodingForFutureType	brokerIDByBank;
	///期货单位帐号
	31:CMSDataType.TThostFtdcBankAccountType	bankSecuAcc;
	///银行密码标志
	32:CMSDataType.TThostFtdcPwdFlagType	bankPwdFlag;
	///期货资金密码核对标志
	33:CMSDataType.TThostFtdcPwdFlagType	secuPwdFlag;
	///交易柜员
	34:CMSDataType.TThostFtdcOperNoType	operNo;
	///请求编号
	35:CMSDataType.TThostFtdcRequestIDType	requestID;
	///交易ID
	36:CMSDataType.TThostFtdcTIDType	tID;
	///银行可用金额
	37:CMSDataType.TThostFtdcTradeAmountType	bankUseAmount;
	///银行可取金额
	38:CMSDataType.TThostFtdcTradeAmountType	bankFetchAmount;
}

///期商签到签退
struct CThostFtdcFutureSignIOField
{
	///业务功能码
	1:CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///银行代码
	2:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构代码
	3:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///期商代码
	4:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期商分支机构代码
	5:CMSDataType.TThostFtdcFutureBranchIDType	BrokerBranchID;
	///交易日期
	6:CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易时间
	7:CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///银行流水号
	8:CMSDataType.TThostFtdcBankSerialType	bankSerial;
	///交易系统日期
	9:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///银期平台消息流水号
	10:CMSDataType.TThostFtdcSerialType	plateSerial;
	///最后分片标志
	11:CMSDataType.TThostFtdcLastFragmentType	lastFragment;
	///会话号
	12:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///安装编号
	13:CMSDataType.TThostFtdcInstallIDType	installID;
	///用户标识
	14:CMSDataType.TThostFtdcUserIDType	userID;
	///摘要
	15:CMSDataType.TThostFtdcDigestType	digest;
	///币种代码
	16:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///渠道标志
	17:CMSDataType.TThostFtdcDeviceIDType	deviceID;
	///期货公司银行编码
	18:CMSDataType.TThostFtdcBankCodingForFutureType	brokerIDByBank;
	///交易柜员
	19:CMSDataType.TThostFtdcOperNoType	operNo;
	///请求编号
	20:CMSDataType.TThostFtdcRequestIDType	requestID;
	///交易ID
	21:CMSDataType.TThostFtdcTIDType	tID;
}

///期商签到响应
struct CThostFtdcRspFutureSignInField
{
	///业务功能码
	1:CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///银行代码
	2:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构代码
	3:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///期商代码
	4:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期商分支机构代码
	5:CMSDataType.TThostFtdcFutureBranchIDType	brokerBranchID;
	///交易日期
	6:CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易时间
	7:CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///银行流水号
	8:CMSDataType.TThostFtdcBankSerialType	bankSerial;
	///交易系统日期
	9:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///银期平台消息流水号
	10:CMSDataType.TThostFtdcSerialType	plateSerial;
	///最后分片标志
	11:CMSDataType.TThostFtdcLastFragmentType	lastFragment;
	///会话号
	12:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///安装编号
	13:CMSDataType.TThostFtdcInstallIDType	installID;
	///用户标识
	14:CMSDataType.TThostFtdcUserIDType	userID;
	///摘要
	15:CMSDataType.TThostFtdcDigestType	digest;
	///币种代码
	16:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///渠道标志
	17:CMSDataType.TThostFtdcDeviceIDType	deviceID;
	///期货公司银行编码
	18:CMSDataType.TThostFtdcBankCodingForFutureType	brokerIDByBank;
	///交易柜员
	19:CMSDataType.TThostFtdcOperNoType	operNo;
	///请求编号
	20:CMSDataType.TThostFtdcRequestIDType	requestID;
	///交易ID
	21:CMSDataType.TThostFtdcTIDType	tID;
	///错误代码
	22:CMSDataType.TThostFtdcErrorIDType	errorID;
	///错误信息
	23:CMSDataType.TThostFtdcErrorMsgType	errorMsg;
	///PIN密钥
	24:CMSDataType.TThostFtdcPasswordKeyType	pinKey;
	///MAC密钥
	25:CMSDataType.TThostFtdcPasswordKeyType	macKey;
}

///期商签退请求
struct CThostFtdcReqFutureSignOutField
{
	///业务功能码
	1:CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///银行代码
	2:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构代码
	3:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///期商代码
	4:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期商分支机构代码
	5:CMSDataType.TThostFtdcFutureBranchIDType	brokerBranchID;
	///交易日期
	6:CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易时间
	7:CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///银行流水号
	8:CMSDataType.TThostFtdcBankSerialType	bankSerial;
	///交易系统日期
	9:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///银期平台消息流水号
	10:CMSDataType.TThostFtdcSerialType	plateSerial;
	///最后分片标志
	11:CMSDataType.TThostFtdcLastFragmentType	lastFragment;
	///会话号
	12:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///安装编号
	13:CMSDataType.TThostFtdcInstallIDType	installID;
	///用户标识
	14:CMSDataType.TThostFtdcUserIDType	userID;
	///摘要
	15:CMSDataType.TThostFtdcDigestType	digest;
	///币种代码
	16:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///渠道标志
	17:CMSDataType.TThostFtdcDeviceIDType	deviceID;
	///期货公司银行编码
	18:CMSDataType.TThostFtdcBankCodingForFutureType	brokerIDByBank;
	///交易柜员
	19:CMSDataType.TThostFtdcOperNoType	operNo;
	///请求编号
	20:CMSDataType.TThostFtdcRequestIDType	requestID;
	///交易ID
	21:CMSDataType.TThostFtdcTIDType	tID;
}

///期商签退响应
struct CThostFtdcRspFutureSignOutField
{
	///业务功能码
	1:CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///银行代码
	2:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构代码
	3:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///期商代码
	4:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期商分支机构代码
	5:CMSDataType.TThostFtdcFutureBranchIDType	brokerBranchID;
	///交易日期
	6:CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易时间
	7:CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///银行流水号
	8:CMSDataType.TThostFtdcBankSerialType	bankSerial;
	///交易系统日期
	9:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///银期平台消息流水号
	10:CMSDataType.TThostFtdcSerialType	plateSerial;
	///最后分片标志
	11:CMSDataType.TThostFtdcLastFragmentType	lastFragment;
	///会话号
	12:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///安装编号
	13:CMSDataType.TThostFtdcInstallIDType	installID;
	///用户标识
	14:CMSDataType.TThostFtdcUserIDType	userID;
	///摘要
	15:CMSDataType.TThostFtdcDigestType	digest;
	///币种代码
	16:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///渠道标志
	17:CMSDataType.TThostFtdcDeviceIDType	deviceID;
	///期货公司银行编码
	18:CMSDataType.TThostFtdcBankCodingForFutureType	brokerIDByBank;
	///交易柜员
	19:CMSDataType.TThostFtdcOperNoType	operNo;
	///请求编号
	20:CMSDataType.TThostFtdcRequestIDType	requestID;
	///交易ID
	21:CMSDataType.TThostFtdcTIDType	tID;
	///错误代码
	22:CMSDataType.TThostFtdcErrorIDType	errorID;
	///错误信息
	23:CMSDataType.TThostFtdcErrorMsgType	errorMsg;
}

///查询指定流水号的交易结果请求
struct CThostFtdcReqQueryTradeResultBySerialField
{
	///业务功能码
	1:CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///银行代码
	2:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构代码
	3:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///期商代码
	4:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期商分支机构代码
	5:CMSDataType.TThostFtdcFutureBranchIDType	brokerBranchID;
	///交易日期
	6:CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易时间
	7:CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///银行流水号
	8:CMSDataType.TThostFtdcBankSerialType	bankSerial;
	///交易系统日期
	9:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///银期平台消息流水号
	10:CMSDataType.TThostFtdcSerialType	plateSerial;
	///最后分片标志
	11:CMSDataType.TThostFtdcLastFragmentType	lastFragment;
	///会话号
	12:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///流水号
	13:CMSDataType.TThostFtdcSerialType	reference;
	///本流水号发布者的机构类型
	14:CMSDataType.TThostFtdcInstitutionTypeType	refrenceIssureType;
	///本流水号发布者机构编码
	15:CMSDataType.TThostFtdcOrganCodeType	refrenceIssure;
	///客户姓名
	16:CMSDataType.TThostFtdcIndividualNameType	customerName;
	///证件类型
	17:CMSDataType.TThostFtdcIdCardTypeType	idCardType;
	///证件号码
	18:CMSDataType.TThostFtdcIdentifiedCardNoType	identifiedCardNo;
	///客户类型
	19:CMSDataType.TThostFtdcCustTypeType	custType;
	///银行帐号
	20:CMSDataType.TThostFtdcBankAccountType	bankAccount;
	///银行密码
	21:CMSDataType.TThostFtdcPasswordType	bankPassWord;
	///投资者帐号
	22:CMSDataType.TThostFtdcAccountIDType	accountID;
	///期货密码
	23:CMSDataType.TThostFtdcPasswordType	password;
	///币种代码
	24:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///转帐金额
	25:CMSDataType.TThostFtdcTradeAmountType	tradeAmount;
	///摘要
	26:CMSDataType.TThostFtdcDigestType	digest;
}

///查询指定流水号的交易结果响应
struct CThostFtdcRspQueryTradeResultBySerialField
{
	///业务功能码
	1:CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///银行代码
	2:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构代码
	3:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///期商代码
	4:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期商分支机构代码
	5:CMSDataType.TThostFtdcFutureBranchIDType	brokerBranchID;
	///交易日期
	6:CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易时间
	7:CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///银行流水号
	8:CMSDataType.TThostFtdcBankSerialType	bankSerial;
	///交易系统日期
	9:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///银期平台消息流水号
	10:CMSDataType.TThostFtdcSerialType	plateSerial;
	///最后分片标志
	11:CMSDataType.TThostFtdcLastFragmentType	lastFragment;
	///会话号
	12:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///错误代码
	13:CMSDataType.TThostFtdcErrorIDType	errorID;
	///错误信息
	14:CMSDataType.TThostFtdcErrorMsgType	errorMsg;
	///流水号
	15:CMSDataType.TThostFtdcSerialType	reference;
	///本流水号发布者的机构类型
	16:CMSDataType.TThostFtdcInstitutionTypeType	refrenceIssureType;
	///本流水号发布者机构编码
	17:CMSDataType.TThostFtdcOrganCodeType	refrenceIssure;
	///原始返回代码
	18:CMSDataType.TThostFtdcReturnCodeType	originReturnCode;
	///原始返回码描述
	19:CMSDataType.TThostFtdcDescrInfoForReturnCodeType	originDescrInfoForReturnCode;
	///银行帐号
	20:CMSDataType.TThostFtdcBankAccountType	bankAccount;
	///银行密码
	21:CMSDataType.TThostFtdcPasswordType	bankPassWord;
	///投资者帐号
	22:CMSDataType.TThostFtdcAccountIDType	accountID;
	///期货密码
	23:CMSDataType.TThostFtdcPasswordType	password;
	///币种代码
	24:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///转帐金额
	25:CMSDataType.TThostFtdcTradeAmountType	tradeAmount;
	///摘要
	26:CMSDataType.TThostFtdcDigestType	digest;
}

///日终文件就绪请求
struct CThostFtdcReqDayEndFileReadyField
{
	///业务功能码
	1:CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///银行代码
	2:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构代码
	3:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///期商代码
	4:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期商分支机构代码
	5:CMSDataType.TThostFtdcFutureBranchIDType	brokerBranchID;
	///交易日期
	6:CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易时间
	7:CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///银行流水号
	8:CMSDataType.TThostFtdcBankSerialType	bankSerial;
	///交易系统日期
	9:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///银期平台消息流水号
	10:CMSDataType.TThostFtdcSerialType	plateSerial;
	///最后分片标志
	11:CMSDataType.TThostFtdcLastFragmentType	lastFragment;
	///会话号
	12:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///文件业务功能
	13:CMSDataType.TThostFtdcFileBusinessCodeType	fileBusinessCode;
	///摘要
	14:CMSDataType.TThostFtdcDigestType	digest;
}

///返回结果
struct CThostFtdcReturnResultField
{
	///返回代码
	1:CMSDataType.TThostFtdcReturnCodeType	returnCode;
	///返回码描述
	2:CMSDataType.TThostFtdcDescrInfoForReturnCodeType	descrInfoForReturnCode;
}

///验证期货资金密码
struct CThostFtdcVerifyFuturePasswordField
{
	///业务功能码
	1:CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///银行代码
	2:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构代码
	3:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///期商代码
	4:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期商分支机构代码
	5:CMSDataType.TThostFtdcFutureBranchIDType	brokerBranchID;
	///交易日期
	6:CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易时间
	7:CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///银行流水号
	8:CMSDataType.TThostFtdcBankSerialType	bankSerial;
	///交易系统日期
	9:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///银期平台消息流水号
	10:CMSDataType.TThostFtdcSerialType	plateSerial;
	///最后分片标志
	11:CMSDataType.TThostFtdcLastFragmentType	lastFragment;
	///会话号
	12:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///投资者帐号
	13:CMSDataType.TThostFtdcAccountIDType	accountID;
	///期货密码
	14:CMSDataType.TThostFtdcPasswordType	password;
	///银行帐号
	15:CMSDataType.TThostFtdcBankAccountType	bankAccount;
	///银行密码
	16:CMSDataType.TThostFtdcPasswordType	bankPassWord;
	///安装编号
	17:CMSDataType.TThostFtdcInstallIDType	installID;
	///交易ID
	18:CMSDataType.TThostFtdcTIDType	tID;
	///币种代码
	19:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
}

///验证客户信息
struct CThostFtdcVerifyCustInfoField
{
	///客户姓名
	1:CMSDataType.TThostFtdcIndividualNameType	customerName;
	///证件类型
	2:CMSDataType.TThostFtdcIdCardTypeType	idCardType;
	///证件号码
	3:CMSDataType.TThostFtdcIdentifiedCardNoType	identifiedCardNo;
	///客户类型
	4:CMSDataType.TThostFtdcCustTypeType	custType;
}

///验证期货资金密码和客户信息
struct CThostFtdcVerifyFuturePasswordAndCustInfoField
{
	///客户姓名
	1:CMSDataType.TThostFtdcIndividualNameType	customerName;
	///证件类型
	2:CMSDataType.TThostFtdcIdCardTypeType	idCardType;
	///证件号码
	3:CMSDataType.TThostFtdcIdentifiedCardNoType	identifiedCardNo;
	///客户类型
	4:CMSDataType.TThostFtdcCustTypeType	custType;
	///投资者帐号
	5:CMSDataType.TThostFtdcAccountIDType	accountID;
	///期货密码
	6:CMSDataType.TThostFtdcPasswordType	password;
	///币种代码
	7:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
}

///验证期货资金密码和客户信息
struct CThostFtdcDepositResultInformField
{
	///出入金流水号，该流水号为银期报盘返回的流水号
	1:CMSDataType.TThostFtdcDepositSeqNoType	depositSeqNo;
	///经纪公司代码
	2:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者代码
	3:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///入金金额
	4:CMSDataType.TThostFtdcMoneyType	deposit;
	///请求编号
	5:CMSDataType.TThostFtdcRequestIDType	requestID;
	///返回代码
	6:CMSDataType.TThostFtdcReturnCodeType	returnCode;
	///返回码描述
	7:CMSDataType.TThostFtdcDescrInfoForReturnCodeType	descrInfoForReturnCode;
}

///交易核心向银期报盘发出密钥同步请求
struct CThostFtdcReqSyncKeyField
{
	///业务功能码
	1:CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///银行代码
	2:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构代码
	3:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///期商代码
	4:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期商分支机构代码
	5:CMSDataType.TThostFtdcFutureBranchIDType	brokerBranchID;
	///交易日期
	6:CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易时间
	7:CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///银行流水号
	8:CMSDataType.TThostFtdcBankSerialType	bankSerial;
	///交易系统日期
	9:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///银期平台消息流水号
	10:CMSDataType.TThostFtdcSerialType	plateSerial;
	///最后分片标志
	11:CMSDataType.TThostFtdcLastFragmentType	lastFragment;
	///会话号
	12:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///安装编号
	13:CMSDataType.TThostFtdcInstallIDType	installID;
	///用户标识
	14:CMSDataType.TThostFtdcUserIDType	userID;
	///交易核心给银期报盘的消息
	15:CMSDataType.TThostFtdcAddInfoType	message;
	///渠道标志
	16:CMSDataType.TThostFtdcDeviceIDType	deviceID;
	///期货公司银行编码
	17:CMSDataType.TThostFtdcBankCodingForFutureType	brokerIDByBank;
	///交易柜员
	18:CMSDataType.TThostFtdcOperNoType	operNo;
	///请求编号
	19:CMSDataType.TThostFtdcRequestIDType	requestID;
	///交易ID
	20:CMSDataType.TThostFtdcTIDType	tID;
}

///交易核心向银期报盘发出密钥同步响应
struct CThostFtdcRspSyncKeyField
{
	///业务功能码
	1:CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///银行代码
	2:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构代码
	3:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///期商代码
	4:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期商分支机构代码
	5:CMSDataType.TThostFtdcFutureBranchIDType	brokerBranchID;
	///交易日期
	6:CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易时间
	7:CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///银行流水号
	8:CMSDataType.TThostFtdcBankSerialType	bankSerial;
	///交易系统日期
	9:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///银期平台消息流水号
	10:CMSDataType.TThostFtdcSerialType	plateSerial;
	///最后分片标志
	11:CMSDataType.TThostFtdcLastFragmentType	lastFragment;
	///会话号
	12:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///安装编号
	13:CMSDataType.TThostFtdcInstallIDType	installID;
	///用户标识
	14:CMSDataType.TThostFtdcUserIDType	userID;
	///交易核心给银期报盘的消息
	15:CMSDataType.TThostFtdcAddInfoType	message;
	///渠道标志
	16:CMSDataType.TThostFtdcDeviceIDType	deviceID;
	///期货公司银行编码
	17:CMSDataType.TThostFtdcBankCodingForFutureType	brokerIDByBank;
	///交易柜员
	18:CMSDataType.TThostFtdcOperNoType	operNo;
	///请求编号
	19:CMSDataType.TThostFtdcRequestIDType	requestID;
	///交易ID
	20:CMSDataType.TThostFtdcTIDType	tID;
	///错误代码
	21:CMSDataType.TThostFtdcErrorIDType	errorID;
	///错误信息
	22:CMSDataType.TThostFtdcErrorMsgType	errorMsg;
}

///查询账户信息通知
struct CThostFtdcNotifyQueryAccountField
{
	///业务功能码
	1:CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///银行代码
	2:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构代码
	3:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///期商代码
	4:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期商分支机构代码
	5:CMSDataType.TThostFtdcFutureBranchIDType	brokerBranchID;
	///交易日期
	6:CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易时间
	7:CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///银行流水号
	8:CMSDataType.TThostFtdcBankSerialType	bankSerial;
	///交易系统日期
	9:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///银期平台消息流水号
	10:CMSDataType.TThostFtdcSerialType	plateSerial;
	///最后分片标志
	11:CMSDataType.TThostFtdcLastFragmentType	lastFragment;
	///会话号
	12:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///客户姓名
	13:CMSDataType.TThostFtdcIndividualNameType	customerName;
	///证件类型
	14:CMSDataType.TThostFtdcIdCardTypeType	idCardType;
	///证件号码
	15:CMSDataType.TThostFtdcIdentifiedCardNoType	identifiedCardNo;
	///客户类型
	16:CMSDataType.TThostFtdcCustTypeType	custType;
	///银行帐号
	17:CMSDataType.TThostFtdcBankAccountType	bankAccount;
	///银行密码
	18:CMSDataType.TThostFtdcPasswordType	bankPassWord;
	///投资者帐号
	19:CMSDataType.TThostFtdcAccountIDType	accountID;
	///期货密码
	20:CMSDataType.TThostFtdcPasswordType	password;
	///期货公司流水号
	21:CMSDataType.TThostFtdcFutureSerialType	futureSerial;
	///安装编号
	22:CMSDataType.TThostFtdcInstallIDType	installID;
	///用户标识
	23:CMSDataType.TThostFtdcUserIDType	userID;
	///验证客户证件号码标志
	24:CMSDataType.TThostFtdcYesNoIndicatorType	verifyCertNoFlag;
	///币种代码
	25:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///摘要
	26:CMSDataType.TThostFtdcDigestType	digest;
	///银行帐号类型
	27:CMSDataType.TThostFtdcBankAccTypeType	bankAccType;
	///渠道标志
	28:CMSDataType.TThostFtdcDeviceIDType	deviceID;
	///期货单位帐号类型
	29:CMSDataType.TThostFtdcBankAccTypeType	bankSecuAccType;
	///期货公司银行编码
	30:CMSDataType.TThostFtdcBankCodingForFutureType	brokerIDByBank;
	///期货单位帐号
	31:CMSDataType.TThostFtdcBankAccountType	bankSecuAcc;
	///银行密码标志
	32:CMSDataType.TThostFtdcPwdFlagType	bankPwdFlag;
	///期货资金密码核对标志
	33:CMSDataType.TThostFtdcPwdFlagType	secuPwdFlag;
	///交易柜员
	34:CMSDataType.TThostFtdcOperNoType	operNo;
	///请求编号
	35:CMSDataType.TThostFtdcRequestIDType	requestID;
	///交易ID
	36:CMSDataType.TThostFtdcTIDType	tID;
	///银行可用金额
	37:CMSDataType.TThostFtdcTradeAmountType	bankUseAmount;
	///银行可取金额
	38:CMSDataType.TThostFtdcTradeAmountType	bankFetchAmount;
	///错误代码
	39:CMSDataType.TThostFtdcErrorIDType	errorID;
	///错误信息
	40:CMSDataType.TThostFtdcErrorMsgType	errorMsg;
}

///银期转账交易流水表
struct CThostFtdcTransferSerialField
{
	///平台流水号
	1:CMSDataType.TThostFtdcPlateSerialType	plateSerial;
	///交易发起方日期
	2:CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易日期
	3:CMSDataType.TThostFtdcDateType	tradingDay;
	///交易时间
	4:CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///交易代码
	5:CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///会话编号
	6:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///银行编码
	7:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构编码
	8:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///银行帐号类型
	9:CMSDataType.TThostFtdcBankAccTypeType	bankAccType;
	///银行帐号
	10:CMSDataType.TThostFtdcBankAccountType	bankAccount;
	///银行流水号
	11:CMSDataType.TThostFtdcBankSerialType	bankSerial;
	///期货公司编码
	12:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期商分支机构代码
	13:CMSDataType.TThostFtdcFutureBranchIDType	brokerBranchID;
	///期货公司帐号类型
	14:CMSDataType.TThostFtdcFutureAccTypeType	futureAccType;
	///投资者帐号
	15:CMSDataType.TThostFtdcAccountIDType	accountID;
	///投资者代码
	16:CMSDataType.TThostFtdcInvestorIDType	investorID;
	///期货公司流水号
	17:CMSDataType.TThostFtdcFutureSerialType	futureSerial;
	///证件类型
	18:CMSDataType.TThostFtdcIdCardTypeType	idCardType;
	///证件号码
	19:CMSDataType.TThostFtdcIdentifiedCardNoType	identifiedCardNo;
	///币种代码
	20:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///交易金额
	21:CMSDataType.TThostFtdcTradeAmountType	tradeAmount;
	///应收客户费用
	22:CMSDataType.TThostFtdcCustFeeType	custFee;
	///应收期货公司费用
	23:CMSDataType.TThostFtdcFutureFeeType	brokerFee;
	///有效标志
	24:CMSDataType.TThostFtdcAvailabilityFlagType	availabilityFlag;
	///操作员
	25:CMSDataType.TThostFtdcOperatorCodeType	operatorCode;
	///新银行帐号
	26:CMSDataType.TThostFtdcBankAccountType	bankNewAccount;
	///错误代码
	27:CMSDataType.TThostFtdcErrorIDType	errorID;
	///错误信息
	28:CMSDataType.TThostFtdcErrorMsgType	errorMsg;
}

///请求查询转帐流水
struct CThostFtdcQryTransferSerialField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者帐号
	2:CMSDataType.TThostFtdcAccountIDType	accountID;
	///银行编码
	3:CMSDataType.TThostFtdcBankIDType	bankID;
	///币种代码
	4:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
}

///期商签到通知
struct CThostFtdcNotifyFutureSignInField
{
	///业务功能码
	1:CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///银行代码
	2:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构代码
	3:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///期商代码
	4:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期商分支机构代码
	5:CMSDataType.TThostFtdcFutureBranchIDType	brokerBranchID;
	///交易日期
	6:CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易时间
	7:CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///银行流水号
	8:CMSDataType.TThostFtdcBankSerialType	bankSerial;
	///交易系统日期
	9:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///银期平台消息流水号
	10:CMSDataType.TThostFtdcSerialType	plateSerial;
	///最后分片标志
	11:CMSDataType.TThostFtdcLastFragmentType	lastFragment;
	///会话号
	12:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///安装编号
	13:CMSDataType.TThostFtdcInstallIDType	installID;
	///用户标识
	14:CMSDataType.TThostFtdcUserIDType	userID;
	///摘要
	15:CMSDataType.TThostFtdcDigestType	digest;
	///币种代码
	16:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///渠道标志
	17:CMSDataType.TThostFtdcDeviceIDType	deviceID;
	///期货公司银行编码
	18:CMSDataType.TThostFtdcBankCodingForFutureType	brokerIDByBank;
	///交易柜员
	19:CMSDataType.TThostFtdcOperNoType	operNo;
	///请求编号
	20:CMSDataType.TThostFtdcRequestIDType	requestID;
	///交易ID
	21:CMSDataType.TThostFtdcTIDType	tID;
	///错误代码
	22:CMSDataType.TThostFtdcErrorIDType	errorID;
	///错误信息
	23:CMSDataType.TThostFtdcErrorMsgType	errorMsg;
	///PIN密钥
	24:CMSDataType.TThostFtdcPasswordKeyType	pinKey;
	///MAC密钥
	25:CMSDataType.TThostFtdcPasswordKeyType	macKey;
}

///期商签退通知
struct CThostFtdcNotifyFutureSignOutField
{
	///业务功能码
	1:CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///银行代码
	2:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构代码
	3:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///期商代码
	4:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期商分支机构代码
	5:CMSDataType.TThostFtdcFutureBranchIDType	brokerBranchID;
	///交易日期
	6:CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易时间
	7:CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///银行流水号
	8:CMSDataType.TThostFtdcBankSerialType	bankSerial;
	///交易系统日期
	9:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///银期平台消息流水号
	10:CMSDataType.TThostFtdcSerialType	plateSerial;
	///最后分片标志
	11:CMSDataType.TThostFtdcLastFragmentType	lastFragment;
	///会话号
	12:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///安装编号
	13:CMSDataType.TThostFtdcInstallIDType	installID;
	///用户标识
	14:CMSDataType.TThostFtdcUserIDType	userID;
	///摘要
	15:CMSDataType.TThostFtdcDigestType	digest;
	///币种代码
	16:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///渠道标志
	17:CMSDataType.TThostFtdcDeviceIDType	deviceID;
	///期货公司银行编码
	18:CMSDataType.TThostFtdcBankCodingForFutureType	brokerIDByBank;
	///交易柜员
	19:CMSDataType.TThostFtdcOperNoType	operNo;
	///请求编号
	20:CMSDataType.TThostFtdcRequestIDType	requestID;
	///交易ID
	21:CMSDataType.TThostFtdcTIDType	tID;
	///错误代码
	22:CMSDataType.TThostFtdcErrorIDType	errorID;
	///错误信息
	23:CMSDataType.TThostFtdcErrorMsgType	errorMsg;
}

///交易核心向银期报盘发出密钥同步处理结果的通知
struct CThostFtdcNotifySyncKeyField
{
	///业务功能码
	1:CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///银行代码
	2:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构代码
	3:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///期商代码
	4:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期商分支机构代码
	5:CMSDataType.TThostFtdcFutureBranchIDType	brokerBranchID;
	///交易日期
	6:CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易时间
	7:CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///银行流水号
	8:CMSDataType.TThostFtdcBankSerialType	bankSerial;
	///交易系统日期
	9:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///银期平台消息流水号
	10:CMSDataType.TThostFtdcSerialType	plateSerial;
	///最后分片标志
	11:CMSDataType.TThostFtdcLastFragmentType	lastFragment;
	///会话号
	12:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///安装编号
	13:CMSDataType.TThostFtdcInstallIDType	installID;
	///用户标识
	14:CMSDataType.TThostFtdcUserIDType	userID;
	///交易核心给银期报盘的消息
	15:CMSDataType.TThostFtdcAddInfoType	message;
	///渠道标志
	16:CMSDataType.TThostFtdcDeviceIDType	deviceID;
	///期货公司银行编码
	17:CMSDataType.TThostFtdcBankCodingForFutureType	brokerIDByBank;
	///交易柜员
	18:CMSDataType.TThostFtdcOperNoType	operNo;
	///请求编号
	19:CMSDataType.TThostFtdcRequestIDType	requestID;
	///交易ID
	20:CMSDataType.TThostFtdcTIDType	tID;
	///错误代码
	21:CMSDataType.TThostFtdcErrorIDType	errorID;
	///错误信息
	22:CMSDataType.TThostFtdcErrorMsgType	errorMsg;
}

///请求查询银期签约关系
struct CThostFtdcQryAccountregisterField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///投资者帐号
	2:CMSDataType.TThostFtdcAccountIDType	accountID;
	///银行编码
	3:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构编码
	4:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///币种代码
	5:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
}

///客户开销户信息表
struct CThostFtdcAccountregisterField
{
	///交易日期
	1:CMSDataType.TThostFtdcTradeDateType	tradeDay;
	///银行编码
	2:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构编码
	3:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///银行帐号
	4:CMSDataType.TThostFtdcBankAccountType	bankAccount;
	///期货公司编码
	5:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期货公司分支机构编码
	6:CMSDataType.TThostFtdcFutureBranchIDType	brokerBranchID;
	///投资者帐号
	7:CMSDataType.TThostFtdcAccountIDType	accountID;
	///证件类型
	8:CMSDataType.TThostFtdcIdCardTypeType	idCardType;
	///证件号码
	9:CMSDataType.TThostFtdcIdentifiedCardNoType	identifiedCardNo;
	///客户姓名
	10:CMSDataType.TThostFtdcIndividualNameType	customerName;
	///币种代码
	11:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///开销户类别
	12:CMSDataType.TThostFtdcOpenOrDestroyType	openOrDestroy;
	///签约日期
	13:CMSDataType.TThostFtdcTradeDateType	regDate;
	///解约日期
	14:CMSDataType.TThostFtdcTradeDateType	outDate;
	///交易ID
	15:CMSDataType.TThostFtdcTIDType	tID;
	///客户类型
	16:CMSDataType.TThostFtdcCustTypeType	custType;
	///银行帐号类型
	17:CMSDataType.TThostFtdcBankAccTypeType	bankAccType;
}

///银期开户信息
struct CThostFtdcOpenAccountField
{
	///业务功能码
	1:CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///银行代码
	2:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构代码
	3:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///期商代码
	4:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期商分支机构代码
	5:CMSDataType.TThostFtdcFutureBranchIDType	brokerBranchID;
	///交易日期
	6:CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易时间
	7:CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///银行流水号
	8:CMSDataType.TThostFtdcBankSerialType	bankSerial;
	///交易系统日期
	9:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///银期平台消息流水号
	10:CMSDataType.TThostFtdcSerialType	plateSerial;
	///最后分片标志
	11:CMSDataType.TThostFtdcLastFragmentType	lastFragment;
	///会话号
	12:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///客户姓名
	13:CMSDataType.TThostFtdcIndividualNameType	customerName;
	///证件类型
	14:CMSDataType.TThostFtdcIdCardTypeType	idCardType;
	///证件号码
	15:CMSDataType.TThostFtdcIdentifiedCardNoType	identifiedCardNo;
	///性别
	16:CMSDataType.TThostFtdcGenderType	gender;
	///国家代码
	17:CMSDataType.TThostFtdcCountryCodeType	countryCode;
	///客户类型
	18:CMSDataType.TThostFtdcCustTypeType	custType;
	///地址
	19:CMSDataType.TThostFtdcAddressType	address;
	///邮编
	20:CMSDataType.TThostFtdcZipCodeType	zipCode;
	///电话号码
	21:CMSDataType.TThostFtdcTelephoneType	telephone;
	///手机
	22:CMSDataType.TThostFtdcMobilePhoneType	mobilePhone;
	///传真
	23:CMSDataType.TThostFtdcFaxType	fax;
	///电子邮件
	24:CMSDataType.TThostFtdcEMailType	eMail;
	///资金账户状态
	25:CMSDataType.TThostFtdcMoneyAccountStatusType	moneyAccountStatus;
	///银行帐号
	26:CMSDataType.TThostFtdcBankAccountType	bankAccount;
	///银行密码
	27:CMSDataType.TThostFtdcPasswordType	bankPassWord;
	///投资者帐号
	28:CMSDataType.TThostFtdcAccountIDType	accountID;
	///期货密码
	29:CMSDataType.TThostFtdcPasswordType	password;
	///安装编号
	30:CMSDataType.TThostFtdcInstallIDType	installID;
	///验证客户证件号码标志
	31:CMSDataType.TThostFtdcYesNoIndicatorType	verifyCertNoFlag;
	///币种代码
	32:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///汇钞标志
	33:CMSDataType.TThostFtdcCashExchangeCodeType	cashExchangeCode;
	///摘要
	34:CMSDataType.TThostFtdcDigestType	digest;
	///银行帐号类型
	35:CMSDataType.TThostFtdcBankAccTypeType	bankAccType;
	///渠道标志
	36:CMSDataType.TThostFtdcDeviceIDType	deviceID;
	///期货单位帐号类型
	37:CMSDataType.TThostFtdcBankAccTypeType	bankSecuAccType;
	///期货公司银行编码
	38:CMSDataType.TThostFtdcBankCodingForFutureType	brokerIDByBank;
	///期货单位帐号
	39:CMSDataType.TThostFtdcBankAccountType	bankSecuAcc;
	///银行密码标志
	40:CMSDataType.TThostFtdcPwdFlagType	bankPwdFlag;
	///期货资金密码核对标志
	41:CMSDataType.TThostFtdcPwdFlagType	secuPwdFlag;
	///交易柜员
	42:CMSDataType.TThostFtdcOperNoType	operNo;
	///交易ID
	43:CMSDataType.TThostFtdcTIDType	tID;
	///用户标识
	44:CMSDataType.TThostFtdcUserIDType	userID;
	///错误代码
	45:CMSDataType.TThostFtdcErrorIDType	errorID;
	///错误信息
	46:CMSDataType.TThostFtdcErrorMsgType	errorMsg;
}

///银期销户信息
struct CThostFtdcCancelAccountField
{
	///业务功能码
	1:CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///银行代码
	2:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构代码
	3:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///期商代码
	4:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期商分支机构代码
	5:CMSDataType.TThostFtdcFutureBranchIDType	brokerBranchID;
	///交易日期
	6:CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易时间
	7:CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///银行流水号
	8:CMSDataType.TThostFtdcBankSerialType	bankSerial;
	///交易系统日期
	9:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///银期平台消息流水号
	10:CMSDataType.TThostFtdcSerialType	plateSerial;
	///最后分片标志
	11:CMSDataType.TThostFtdcLastFragmentType	lastFragment;
	///会话号
	12:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///客户姓名
	13:CMSDataType.TThostFtdcIndividualNameType	customerName;
	///证件类型
	14:CMSDataType.TThostFtdcIdCardTypeType	idCardType;
	///证件号码
	15:CMSDataType.TThostFtdcIdentifiedCardNoType	identifiedCardNo;
	///性别
	16:CMSDataType.TThostFtdcGenderType	gender;
	///国家代码
	17:CMSDataType.TThostFtdcCountryCodeType	countryCode;
	///客户类型
	18:CMSDataType.TThostFtdcCustTypeType	custType;
	///地址
	19:CMSDataType.TThostFtdcAddressType	address;
	///邮编
	20:CMSDataType.TThostFtdcZipCodeType	zipCode;
	///电话号码
	21:CMSDataType.TThostFtdcTelephoneType	telephone;
	///手机
	22:CMSDataType.TThostFtdcMobilePhoneType	mobilePhone;
	///传真
	23:CMSDataType.TThostFtdcFaxType	fax;
	///电子邮件
	24:CMSDataType.TThostFtdcEMailType	eMail;
	///资金账户状态
	25:CMSDataType.TThostFtdcMoneyAccountStatusType	moneyAccountStatus;
	///银行帐号
	26:CMSDataType.TThostFtdcBankAccountType	bankAccount;
	///银行密码
	27:CMSDataType.TThostFtdcPasswordType	bankPassWord;
	///投资者帐号
	28:CMSDataType.TThostFtdcAccountIDType	accountID;
	///期货密码
	29:CMSDataType.TThostFtdcPasswordType	password;
	///安装编号
	30:CMSDataType.TThostFtdcInstallIDType	installID;
	///验证客户证件号码标志
	31:CMSDataType.TThostFtdcYesNoIndicatorType	verifyCertNoFlag;
	///币种代码
	32:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///汇钞标志
	33:CMSDataType.TThostFtdcCashExchangeCodeType	cashExchangeCode;
	///摘要
	34:CMSDataType.TThostFtdcDigestType	digest;
	///银行帐号类型
	35:CMSDataType.TThostFtdcBankAccTypeType	bankAccType;
	///渠道标志
	36:CMSDataType.TThostFtdcDeviceIDType	deviceID;
	///期货单位帐号类型
	37:CMSDataType.TThostFtdcBankAccTypeType	bankSecuAccType;
	///期货公司银行编码
	38:CMSDataType.TThostFtdcBankCodingForFutureType	brokerIDByBank;
	///期货单位帐号
	39:CMSDataType.TThostFtdcBankAccountType	bankSecuAcc;
	///银行密码标志
	40:CMSDataType.TThostFtdcPwdFlagType	bankPwdFlag;
	///期货资金密码核对标志
	41:CMSDataType.TThostFtdcPwdFlagType	secuPwdFlag;
	///交易柜员
	42:CMSDataType.TThostFtdcOperNoType	operNo;
	///交易ID
	43:CMSDataType.TThostFtdcTIDType	tID;
	///用户标识
	44:CMSDataType.TThostFtdcUserIDType	userID;
	///错误代码
	45:CMSDataType.TThostFtdcErrorIDType	errorID;
	///错误信息
	46:CMSDataType.TThostFtdcErrorMsgType	errorMsg;
}

///银期变更银行账号信息
struct CThostFtdcChangeAccountField
{
	///业务功能码
	1:CMSDataType.TThostFtdcTradeCodeType	tradeCode;
	///银行代码
	2:CMSDataType.TThostFtdcBankIDType	bankID;
	///银行分支机构代码
	3:CMSDataType.TThostFtdcBankBrchIDType	bankBranchID;
	///期商代码
	4:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///期商分支机构代码
	5:CMSDataType.TThostFtdcFutureBranchIDType	brokerBranchID;
	///交易日期
	6:CMSDataType.TThostFtdcTradeDateType	tradeDate;
	///交易时间
	7:CMSDataType.TThostFtdcTradeTimeType	tradeTime;
	///银行流水号
	8:CMSDataType.TThostFtdcBankSerialType	bankSerial;
	///交易系统日期
	9:CMSDataType.TThostFtdcTradeDateType	tradingDay;
	///银期平台消息流水号
	10:CMSDataType.TThostFtdcSerialType	plateSerial;
	///最后分片标志
	11:CMSDataType.TThostFtdcLastFragmentType	lastFragment;
	///会话号
	12:CMSDataType.TThostFtdcSessionIDType	sessionID;
	///客户姓名
	13:CMSDataType.TThostFtdcIndividualNameType	customerName;
	///证件类型
	14:CMSDataType.TThostFtdcIdCardTypeType	idCardType;
	///证件号码
	15:CMSDataType.TThostFtdcIdentifiedCardNoType	identifiedCardNo;
	///性别
	16:CMSDataType.TThostFtdcGenderType	gender;
	///国家代码
	17:CMSDataType.TThostFtdcCountryCodeType	countryCode;
	///客户类型
	18:CMSDataType.TThostFtdcCustTypeType	custType;
	///地址
	19:CMSDataType.TThostFtdcAddressType	address;
	///邮编
	20:CMSDataType.TThostFtdcZipCodeType	zipCode;
	///电话号码
	21:CMSDataType.TThostFtdcTelephoneType	telephone;
	///手机
	22:CMSDataType.TThostFtdcMobilePhoneType	mobilePhone;
	///传真
	23:CMSDataType.TThostFtdcFaxType	fax;
	///电子邮件
	24:CMSDataType.TThostFtdcEMailType	eMail;
	///资金账户状态
	25:CMSDataType.TThostFtdcMoneyAccountStatusType	moneyAccountStatus;
	///银行帐号
	26:CMSDataType.TThostFtdcBankAccountType	bankAccount;
	///银行密码
	27:CMSDataType.TThostFtdcPasswordType	bankPassWord;
	///新银行帐号
	28:CMSDataType.TThostFtdcBankAccountType	newBankAccount;
	///新银行密码
	29:CMSDataType.TThostFtdcPasswordType	newBankPassWord;
	///投资者帐号
	30:CMSDataType.TThostFtdcAccountIDType	accountID;
	///期货密码
	31:CMSDataType.TThostFtdcPasswordType	password;
	///银行帐号类型
	32:CMSDataType.TThostFtdcBankAccTypeType	bankAccType;
	///安装编号
	33:CMSDataType.TThostFtdcInstallIDType	installID;
	///验证客户证件号码标志
	34:CMSDataType.TThostFtdcYesNoIndicatorType	verifyCertNoFlag;
	///币种代码
	35:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///期货公司银行编码
	36:CMSDataType.TThostFtdcBankCodingForFutureType	brokerIDByBank;
	///银行密码标志
	37:CMSDataType.TThostFtdcPwdFlagType	bankPwdFlag;
	///期货资金密码核对标志
	38:CMSDataType.TThostFtdcPwdFlagType	secuPwdFlag;
	///交易ID
	39:CMSDataType.TThostFtdcTIDType	tID;
	///摘要
	40:CMSDataType.TThostFtdcDigestType	digest;
	///错误代码
	41:CMSDataType.TThostFtdcErrorIDType	errorID;
	///错误信息
	42:CMSDataType.TThostFtdcErrorMsgType	errormsg;
}

///二级代理操作员银期权限
struct CThostFtdcSecAgentACIDMapField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///用户代码
	2:CMSDataType.TThostFtdcUserIDType	userID;
	///资金账户
	3:CMSDataType.TThostFtdcAccountIDType	accountID;
	///币种
	4:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
	///境外中介机构资金帐号
	5:CMSDataType.TThostFtdcAccountIDType	brokerSecAgentID;
}

///二级代理操作员银期权限查询
struct CThostFtdcQrySecAgentACIDMapField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType	brokerID;
	///用户代码
	2:CMSDataType.TThostFtdcUserIDType	userID;
	///资金账户
	3:CMSDataType.TThostFtdcAccountIDType	accountID;
	///币种
	4:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
}

///灾备中心交易权限
struct CThostFtdcUserRightsAssignField
{
	///应用单元代码
	1:CMSDataType.TThostFtdcBrokerIDType brokerID;
	///用户代码
	2:CMSDataType.TThostFtdcUserIDType userID;
	///交易中心代码
	3:CMSDataType.TThostFtdcDRIdentityIDType dRIdentityID;
}

///经济公司是否有在本标示的交易权限
struct CThostFtdcBrokerUserRightAssignField
{
	///应用单元代码
	1:CMSDataType.TThostFtdcBrokerIDType brokerID;
	///交易中心代码
	2:CMSDataType.TThostFtdcDRIdentityIDType yRIdentityID;
	///能否交易
	3:CMSDataType.TThostFtdcBoolType yradeable;
}

///灾备交易转换报文
struct CThostFtdcDRTransferField
{
	///原交易中心代码
	1:CMSDataType.TThostFtdcDRIdentityIDType origDRIdentityID;
	///目标交易中心代码
	2:CMSDataType.TThostFtdcDRIdentityIDType destDRIdentityID;
	///原应用单元代码
	3:CMSDataType.TThostFtdcBrokerIDType origBrokerID;
	///目标易用单元代码
	4:CMSDataType.TThostFtdcBrokerIDType destBrokerID;
}

///当前银期所属交易中心
struct CThostFtdcCurrTransferIdentityField
{
	///交易中心代码
	1:CMSDataType.TThostFtdcDRIdentityIDType identityID;
}

///禁止登录用户
struct CThostFtdcLoginForbiddenUserField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType brokerID;
	///用户代码
	2:CMSDataType.TThostFtdcUserIDType userID;
}

///查询禁止登录用户
struct CThostFtdcQryLoginForbiddenUserField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType brokerID;
	///用户代码
	2:CMSDataType.TThostFtdcUserIDType userID;
}

///UDP组播组信息
struct CThostFtdcMulticastGroupInfoField
{
	///组播组IP地址
	1:CMSDataType.TThostFtdcIPAddressType	groupIP;
	///组播组IP端口
	2:CMSDataType.TThostFtdcIPPortType	groupPort;
	///源地址
	3:CMSDataType.TThostFtdcIPAddressType	sourceIP;
}

///资金账户基本准备金
struct CThostFtdcTradingAccountReserveField
{
	///经纪公司代码
	1:CMSDataType.TThostFtdcBrokerIDType brokerID;
	///投资者帐号
	2:CMSDataType.TThostFtdcAccountIDType accountID;
	///基本准备金
	3:CMSDataType.TThostFtdcMoneyType	reserve;
	///币种代码
	4:CMSDataType.TThostFtdcCurrencyIDType	currencyID;
}

