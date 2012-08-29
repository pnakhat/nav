package org.jbehave.tutorials.etsy.webrunner;

import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.web.runner.wicket.WebRunnerApplication;
import org.qainfolabs.jbehave.MyStories;

public class MyWebApplication extends WebRunnerApplication {

    private MyStories stories = new MyStories();

    protected List<CandidateSteps> candidateSteps() {
        return stories.stepsFactory().createCandidateSteps();
    }

    protected Configuration configuration() {
        return stories.configuration();
    }

}
