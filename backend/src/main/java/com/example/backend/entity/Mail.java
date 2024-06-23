package com.example.backend.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("mail")
public class Mail implements Serializable
{
	@TableId(value="id", type=IdType.AUTO)
	private Integer id;
	private String theme;
	private String content;
	private Integer senderId;
	private Integer receiverId;
	private LocalDateTime sendTime;
	private Integer ownerId;
	private Integer star;
	private Integer readis;
	private Integer draft;
	@TableField("attachment_ids")
	private String attachmentIds;
	@TableField("junk")
	private Integer junk;
	@TableField("cc")
	private String ccEmailAddresses;

}
