package com.lyl.study.cloud.wechat.core.service;

public interface WxMenuService {
    /**
     * 设置菜单
     *
     * @param appId 公众号AppID
     * @param json  传参json
     * @return 公众号接口响应json串
     */
    String setMenu(String appId, String json);

    /**
     * 获取菜单信息
     *
     * @param appId 公众号AppID
     * @return 公众号接口响应json串
     */
    String menuGet(String appId);
}
