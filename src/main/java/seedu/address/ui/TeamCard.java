package seedu.address.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import seedu.address.model.team.Team;

/**
 * A UI component that displays information of a {@code Team}.
 */
public class TeamCard extends UiPart<Region> {

    private static final String FXML = "TeamListCard.fxml";

    /**
     * Note: Certain keywords such as "location" and "resources" are reserved keywords in JavaFX.
     * As a consequence, UI elements' variable names cannot be set to such keywords
     * or an exception will be thrown by JavaFX during runtime.
     *
     * @see <a href="https://github.com/se-edu/addressbook-level4/issues/336">The issue on AddressBook level 4</a>
     */

    public final Team team;

    @FXML
    private HBox cardPane;
    @FXML
    private Label teamName;
    @FXML
    private Label id;
    @FXML
    private VBox teamLeader;
    @FXML
    private VBox teamMembers;

    /**
     * Constructor of the TeamCard class which creates a
     * UI component that displays information of a {@code Team}.
     *
     * @param team On of the teams for display.
     * @param displayedIndex Index of the team for display.
     */
    public TeamCard(Team team, int displayedIndex) {
        super(FXML);
        this.team = team;
        id.setText(displayedIndex + ". ");
        teamName.setText(team.getTeamName());
        teamLeader.getChildren()
                .add(new Label("Team leader: " + team.getTeamLeaderIdentityCode().toString()));
        teamMembers.getChildren()
                .add(new Label("Developers: "));
        team.getDeveloperIdentityCodes()
                .forEach(memberCode -> teamMembers.getChildren()
                        .add(new Label(memberCode.toString())));
    }
}
