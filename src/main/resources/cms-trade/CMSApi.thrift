include "CMSStructReq.thrift"
include "CMSStructRes.thrift"
include "CMSTrader1Api.thrift"

namespace java cn.kkworld.futuresservice.cmsTrade
namespace cpp cmsapi

service CMSApi extends CMSTrader1Api.TraderPart1Service{
	
}