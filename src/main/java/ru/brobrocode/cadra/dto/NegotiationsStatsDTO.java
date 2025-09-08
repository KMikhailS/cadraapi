package ru.brobrocode.cadra.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class NegotiationsStatsDTO {
	private Integer total;
	private Integer notResponded;
	private Integer discards;
	private Integer invites;
}
