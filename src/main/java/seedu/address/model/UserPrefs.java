package seedu.address.model;

import static java.util.Objects.requireNonNull;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

import seedu.address.commons.core.GuiSettings;

/**
 * Represents User's preferences.
 */
public class UserPrefs implements ReadOnlyUserPrefs {

    private GuiSettings guiSettings = new GuiSettings();
    private Path patientBookFilePath = Paths.get("data" , "patientbook.json");
    private Path appointmentBookFilePath = Paths.get("data" , "appointment.json");
    private Path archiveDirectoryPath = Paths.get("data", "archives");

    /**
     * Creates a {@code UserPrefs} with default values.
     */
    public UserPrefs() {}

    /**
     * Creates a {@code UserPrefs} with the prefs in {@code userPrefs}.
     */
    public UserPrefs(ReadOnlyUserPrefs userPrefs) {
        this();
        resetData(userPrefs);
    }

    /**
     * Resets the existing data of this {@code UserPrefs} with {@code newUserPrefs}.
     */
    public void resetData(ReadOnlyUserPrefs newUserPrefs) {
        requireNonNull(newUserPrefs);
        setGuiSettings(newUserPrefs.getGuiSettings());
        setPatientBookFilePath(newUserPrefs.getPatientBookFilePath());
        setAppointmentBookFilePath(newUserPrefs.getAppointmentBookFilePath());
    }

    @Override
    public GuiSettings getGuiSettings() {
        return guiSettings;
    }

    public void setGuiSettings(GuiSettings guiSettings) {
        requireNonNull(guiSettings);
        this.guiSettings = guiSettings;
    }

    public Path getPatientBookFilePath() {
        return patientBookFilePath;
    }

    public void setPatientBookFilePath(Path patientBookFilePath) {
        requireNonNull(patientBookFilePath);
        this.patientBookFilePath = patientBookFilePath;
    }

    public Path getAppointmentBookFilePath() {
        return appointmentBookFilePath;
    }

    public void setAppointmentBookFilePath(Path appointmentBookFilePath) {
        requireNonNull(appointmentBookFilePath);
        this.appointmentBookFilePath = appointmentBookFilePath;
    }

    public Path getArchiveDirectoryPath() {
        return archiveDirectoryPath;
    }

    public void setArchiveDirectoryPath(Path archiveDirectoryPath) {
        requireNonNull(archiveDirectoryPath);
        this.archiveDirectoryPath = archiveDirectoryPath;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UserPrefs)) { //this handles null as well.
            return false;
        }

        UserPrefs o = (UserPrefs) other;

        return guiSettings.equals(o.guiSettings)
                && patientBookFilePath.equals(o.patientBookFilePath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guiSettings, patientBookFilePath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Gui Settings : " + guiSettings);
        sb.append("\nLocal data file location : " + patientBookFilePath);
        return sb.toString();
    }

}
