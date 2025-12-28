package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Represents an object of class ExcelImporter, as defined in the model.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliExcelImporterDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private String _id;
    private CliFileInfoDTO file;
    private String log;

    public CliExcelImporterDTO() {
    }


    /**
     * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
     */
    public String get_clientId() {
        return _clientId;
    }
    /**
     * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
     */
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
    }

    /**
     * The attribute _id of ExcelImporter. It is of type ID. Cannot be null.
     */
    public String get_id() {
        return _id;
    }
    /**
     * The attribute _id of ExcelImporter. It is of type ID. Cannot be null.
     */
    public void set_id(String _id) {
        this._id = _id;
    }

    /**
     * The attribute file of ExcelImporter. It is of type FileInfo.
     */
    public CliFileInfoDTO getFile() {
        return file;
    }
    /**
     * The attribute file of ExcelImporter. It is of type FileInfo.
     */
    public void setFile(CliFileInfoDTO file) {
        this.file = file;
    }

    /**
     * The attribute log of ExcelImporter. It is of type Text.
     */
    public String getLog() {
        return log;
    }
    /**
     * The attribute log of ExcelImporter. It is of type Text.
     */
    public void setLog(String log) {
        this.log = log;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (file != null) {
            joiner.add("file: " + GraphQLRequestSerializer.getEntry(file));
        }
        if (log != null) {
            joiner.add("log: " + GraphQLRequestSerializer.getEntry(log));
        }
        return joiner.toString();
    }

    public static CliExcelImporterDTO.Builder builder() {
        return new CliExcelImporterDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _clientId;
        private String _id;
        private CliFileInfoDTO file;
        private String log;

        public Builder() {
        }

        /**
         * A special attribute, chosen by the client, useful to
uniquely reference not existing objects.
         */
        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
            return this;
        }

        /**
         * The attribute _id of ExcelImporter. It is of type ID. Cannot be null.
         */
        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        /**
         * The attribute file of ExcelImporter. It is of type FileInfo.
         */
        public Builder setFile(CliFileInfoDTO file) {
            this.file = file;
            return this;
        }

        /**
         * The attribute log of ExcelImporter. It is of type Text.
         */
        public Builder setLog(String log) {
            this.log = log;
            return this;
        }


        public CliExcelImporterDTO build() {
            CliExcelImporterDTO result = new CliExcelImporterDTO();
            result.set_clientId(this._clientId);
            result.set_id(this._id);
            result.setFile(this.file);
            result.setLog(this.log);
            return result;
        }

    }
}
