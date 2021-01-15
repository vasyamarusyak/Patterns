package AbstractFactoryWebSite.banking;

import AbstractFactoryWebSite.Developer;
import AbstractFactoryWebSite.ProjectManager;
import AbstractFactoryWebSite.ProjectTeamFactory;
import AbstractFactoryWebSite.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
