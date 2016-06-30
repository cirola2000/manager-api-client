package website.automate.manager.api.client.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Job extends AbstractEntity {

	public enum JobProfile {
		MINIMAL,
		BRIEF,
        COMPLETE;
    }

    public enum JobStatus {
        SCHEDULED,
        RUNNING,
        SUCCESS,
        FAILURE,
        ERROR
    }

    public enum TakeScreenshots {
    	NEVER,
    	ON_FAILURE,
    	ON_EVERY_STEP;
    }

    private String title;
    
    private JobStatus status;
    
    private Set<String> scenarioIds;
    
    private TakeScreenshots takeScreenshots;
    
	private Map<String, String> context = new HashMap<String, String>();
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public TakeScreenshots getTakeScreenshots() {
        return takeScreenshots;
    }

    public void setTakeScreenshots(TakeScreenshots takeScreenshots) {
        this.takeScreenshots = takeScreenshots;
    }
    
    public Set<String> getScenarioIds() {
        return scenarioIds;
    }

    public void setScenarioIds(Set<String> scenarioIds) {
        this.scenarioIds = scenarioIds;
    }
    
    public JobStatus getStatus() {
        return status;
    }

    public void setStatus(JobStatus status) {
        this.status = status;
    }
    
    public Map<String, String> getContext() {
		return context;
	}

	public void setContext(Map<String, String> context) {
		this.context = context;
	}
}
