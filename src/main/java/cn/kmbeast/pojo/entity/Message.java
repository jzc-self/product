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
public class Message
{
    private int id;
    private int userId;
    private String content;//消息体（内容）
    private String isRead;//是否已读
    private LocalDateTime createTime;//发送时间

}
