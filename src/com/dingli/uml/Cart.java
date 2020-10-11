package com.dingli.uml;

/**
 *  购物车
 *
 * @author 陈迪凯
 * @date 2020年10月05日
 */
public class Cart extends BasePojo {
    private Long id; // 购物车id
    private Long userId; //用户id
    private Long itemId; // 商品id
    private String itemTitle; // 商品标题
    private Long itemPrice; // 商品价格
    private int num; // 商品数量

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public Long getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Long itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
