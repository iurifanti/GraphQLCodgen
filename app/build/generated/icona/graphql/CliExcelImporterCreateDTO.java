package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for objects of ExcelImporter.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliExcelImporterCreateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _clientId;
    private CliPendingFileReferenceDTO file;
    private String log;

    public CliExcelImporterCreateDTO() {
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

    public static CliExcelImporterCreateDTO.Builder builder() {
        return new CliExcelImporterCreateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String _clientId;
        private CliPendingFileReferenceDTO file;
        private String log;

        public Builder() {
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


        public CliExcelImporterCreateDTO build() {
            CliExcelImporterCreateDTO result = new CliExcelImporterCreateDTO();
            result.set_clientId(this._clientId);
            result.setFile(this.file);
            result.setLog(this.log);
            return result;
        }

    }
}
