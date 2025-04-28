package cn.kmbeast.pojo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Interaction
{
    private Integer id;;
    private Integer userId;
    private Integer productId;//行为类型
    private Integer type;//互动时间
    private LocalDateTime createTime;//

}
