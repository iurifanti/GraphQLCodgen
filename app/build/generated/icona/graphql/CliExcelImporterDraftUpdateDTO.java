package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * A data structure for a draft update object of class ExcelImporter.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class CliExcelImporterDraftUpdateDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String _id;
    private CliPendingFileReferenceDTO file;
    private String log;

    public CliExcelImporterDraftUpdateDTO() {
    }


    public String get_id() {
        return _id;
    }
    public void set_id(String _id) {
        this._id = _id;
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
        if (file != null) {
            joiner.add("file: " + GraphQLRequestSerializer.getEntry(file));
        }
        if (log != null) {
            joiner.add("log: " + GraphQLRequestSerializer.getEntry(log));
        }
        return joiner.toString();
    }

    public static CliExcelImporterDraftUpdateDTO.Builder builder() {
        return new CliExcelImporterDraftUpdateDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:43+0100"
    )
    public static class Builder {

        private String _id;
        private CliPendingFileReferenceDTO file;
        private String log;

        public Builder() {
        }

        public Builder set_id(String _id) {
            this._id = _id;
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


        public CliExcelImporterDraftUpdateDTO build() {
            CliExcelImporterDraftUpdateDTO result = new CliExcelImporterDraftUpdateDTO();
            result.set_id(this._id);
            result.setFile(this.file);
            result.setLog(this.log);
            return result;
        }

    }
}
