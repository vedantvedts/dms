package com.vts.dms.dak.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "dak_assign_replyattach_rev")
public class DakAssignReplyAttachRev {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long DakAssignReplyAttachRevId;
	private Long DakAssignReplyRevId;
	private String FilePath;
	private String FileName;
	private String CreatedBy;
	private String CreatedDate;
}
