package com.kodilla.good.patterns.challenges.order_service;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderDataBase orderDataBase;

    public ProductOrderService(final InformationService informationService, final OrderService orderService, final OrderDataBase orderDataBase) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderDataBase = orderDataBase;
    }

    public OrderDTO process(OrderRequest orderRequest) {
        boolean orderConfirmed = orderService.order(orderRequest.getUser(), orderRequest.getProduct(),
                orderRequest.getLocalDate(), orderRequest.getDelivery());
        if (orderConfirmed) {
            informationService.inform(orderRequest.getUser());
            orderDataBase.newOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getDelivery(), orderRequest.getLocalDate());
            return new OrderDTO(orderRequest.getUser(), orderRequest.getProduct(), true);
        } else {
            return new OrderDTO(orderRequest.getUser(), orderRequest.getProduct(), false);
        }
    }
}