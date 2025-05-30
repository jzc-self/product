package cn.kmbeast.pojo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * 订单实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Orders {
    /**
     * ID
     */
    private Integer id;
    /**
     * 订单号
     */
    private String code;
    /**
     * 备注
     */
    private String detail;
    /**
     * 商品ID
     */
    private Integer productId;
    /**
     * 购买时价格
     */
    private BigDecimal buyPrice;
    /**
     * 交易状态
     */
    private Boolean tradeStatus;
    /**
     * 交易时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime tradeTime;
    /**
     * 创建时间
     */
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;
}