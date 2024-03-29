package com.evan.evanrpc.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class RpcRequest implements Serializable {
    // 服务名称
    private String serviceName;

    // 方法名称
    private String methodName;

    // 参数列表类型
    private Class<?>[] parameterTypes;

    // 参数列表
    private Object[] args;
}
