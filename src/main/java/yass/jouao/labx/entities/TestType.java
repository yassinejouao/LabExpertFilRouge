package yass.jouao.labx.entities;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TestType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(nullable = false, unique = true)
	private String name;
	@Column(nullable = false)
	private Double max;
	@Column(nullable = false)
	private Double min;
	@ManyToOne
	private AnalysisType analysisType;
	@OneToMany(mappedBy = "testType", fetch = FetchType.LAZY)
	private Collection<Test> tests;
	@OneToMany(mappedBy = "testType", fetch = FetchType.LAZY)
	private Collection<TestTypeReagent> testTypeReagents;
}
