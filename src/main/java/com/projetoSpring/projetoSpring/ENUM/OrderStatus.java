package com.projetoSpring.projetoSpring.ENUM;

public enum OrderStatus {
    AGUARDANDO_PAGAMENTO(1),
    PAGO(2),
    ENVIADO(3),
    ENTREGUE(4),
    CANCELADO(5);

    private int code;

    private OrderStatus (int code)
    {
        this.code = code;
    }
    public int getCode() {
        return code;
    }


    public static OrderStatus valueOf(int code) {
        for (OrderStatus status : OrderStatus.values()) {
            if (status.getCode() == code) {
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid order status");
    }
}
