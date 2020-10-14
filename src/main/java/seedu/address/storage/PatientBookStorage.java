package seedu.address.storage;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Optional;

import seedu.address.commons.exceptions.DataConversionException;
import seedu.address.model.ReadOnlyPatientBook;

/**
 * Represents a storage for {@link seedu.address.model.PatientBook}.
 */
public interface PatientBookStorage {

    /**
     * Returns the file path of the data file.
     */
    Path getPatientBookFilePath();

    /**
     * Returns PatientBook data as a {@link ReadOnlyPatientBook}.
     * Returns {@code Optional.empty()} if storage file is not found.
     * @throws DataConversionException if the data in storage is not in the expected format.
     * @throws IOException             if there was any problem when reading from the storage.
     */
    Optional<ReadOnlyPatientBook> readPatientBook() throws DataConversionException, IOException;

    /**
     * @see #getPatientBookFilePath()
     */
    Optional<ReadOnlyPatientBook> readPatientBook(Path filePath) throws DataConversionException, IOException;

    /**
     * Saves the given {@link ReadOnlyPatientBook} to the storage.
     * @param patientBook cannot be null.
     * @throws IOException if there was any problem writing to the file.
     */
    void savePatientBook(ReadOnlyPatientBook patientBook) throws IOException;

    /**
     * @see #savePatientBook(ReadOnlyPatientBook)
     */
    void savePatientBook(ReadOnlyPatientBook patientBook, Path filePath) throws IOException;

}
