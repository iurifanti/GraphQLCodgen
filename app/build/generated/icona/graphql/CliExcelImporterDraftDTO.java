package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a draft object of class ExcelImporter.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliExcelImporterDraftDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private String _clientId;
    private CliPendingFileReferenceDTO file;
    private String log;

    public CliExcelImporterDraftDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
    }

    public String get_clientId() {
        return _clientId;
    }
    public void set_clientId(String _clientId) {
        this._clientId = _clientId;
    }

    public CliPendingFileReferenceDTO getFile() {
        return file;
    }
    public void setFile(CliPendingFileReferenceDTO file) {
        this.file = file;
    }

    public String getLog() {
        return log;
    }
    public void setLog(String log) {
        this.log = log;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (_id != null) {
            joiner.add("_id: " + GraphQLRequestSerializer.getEntry(_id));
        }
        if (_clientId != null) {
            joiner.add("_clientId: " + GraphQLRequestSerializer.getEntry(_clientId));
        }
        if (file != null) {
            joiner.add("file: " + GraphQLRequestSerializer.getEntry(file));
        }
        if (log != null) {
            joiner.add("log: " + GraphQLRequestSerializer.getEntry(log));
        }
        return joiner.toString();
    }

    public static CliExcelImporterDraftDTO.Builder builder() {
        return new CliExcelImporterDraftDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _id;
        private String _clientId;
        private CliPendingFileReferenceDTO file;
        private String log;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
            return this;
        }

        public Builder set_clientId(String _clientId) {
            this._clientId = _clientId;
            return this;
        }

        public Builder setFile(CliPendingFileReferenceDTO file) {
            this.file = file;
            return this;
        }

        public Builder setLog(String log) {
            this.log = log;
            return this;
        }


        public CliExcelImporterDraftDTO build() {
            CliExcelImporterDraftDTO result = new CliExcelImporterDraftDTO();
            result.set_id(this._id);
            result.set_clientId(this._clientId);
            result.setFile(this.file);
            result.setLog(this.log);
            return result;
        }

    }
}
