package codehub.club.docker.controller;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 描述:
 * Index
 *
 * @author lil
 * @since 2020-09-29 16:56
 */
@RestController
public class IndexController {

    @GetMapping("/api/test")
    public String index() {
        String ipJson = HttpUtil.get("https://jsonip.com");
        JSONObject jsonObject = JSONUtil.parseObj(ipJson);
        String ip = jsonObject.getStr("ip");
        return String.format("当前机器IP地址为: %s", ip);
    }
}
