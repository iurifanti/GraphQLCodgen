package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * Define a specific [Cursor](https://en.wikipedia.org/wiki/Cursor_%28databases%29) for objects of type
ExcelImporter.
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliExcelImporterCursorDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private String _id;
    private CliPendingFileReferenceDTO file;
    private String log;

    public CliExcelImporterCursorDTO() {
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

    public static CliExcelImporterCursorDTO.Builder builder() {
        return new CliExcelImporterCursorDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
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


        public CliExcelImporterCursorDTO build() {
            CliExcelImporterCursorDTO result = new CliExcelImporterCursorDTO();
            result.set_id(this._id);
            result.setFile(this.file);
            result.setLog(this.log);
            return result;
        }

    }
}
