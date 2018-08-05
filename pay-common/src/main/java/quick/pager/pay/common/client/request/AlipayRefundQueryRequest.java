package quick.pager.pay.common.client.request;

/**
 * 统一收单交易退款查询
 */
public class AlipayRefundQueryRequest extends BaseAlipayRequest {
    private static final long serialVersionUID = -8683141316274288952L;
    /**
     * 支付宝交易号，和商户订单号不能同时为空
     */
    private String tradeNo;
    /**
     * 订单支付时传入的商户订单号,和支付宝交易号不能同时为空<br />
     * trade_no,out_trade_no如果同时存在优先取trade_no
     */
    private String outTradeNo;
    /**
     * 请求退款接口时，传入的退款请求号<br />
     * 如果在退款请求时未传入，则该值为创建交易时的外部交易号
     */
    private String outRequestNo;


    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getOutTradeNo() {
        return outTradeNo;
    }

    public void setOutTradeNo(String outTradeNo) {
        this.outTradeNo = outTradeNo;
    }

    public String getOutRequestNo() {
        return outRequestNo;
    }

    public void setOutRequestNo(String outRequestNo) {
        this.outRequestNo = outRequestNo;
    }
}