package com.yyf.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;

@Data
@ToString
@EqualsAndHashCode
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class Dept implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long deptno;
	private String dname;
	private String db_source;

}
