package AbstractFactoryWebSite.website;

import AbstractFactoryWebSite.Developer;
import AbstractFactoryWebSite.ProjectManager;
import AbstractFactoryWebSite.ProjectTeamFactory;
import AbstractFactoryWebSite.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
