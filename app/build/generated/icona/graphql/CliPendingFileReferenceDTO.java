package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLRequestSerializer;
import java.util.StringJoiner;

/**
 * POST <cloudletUrl>/auth/file/{class}/{attribute}
GET  <cloudletUrl>/auth/file/{class}/{attribute}/pending/{pendingFileId}
GET  <cloudletUrl>/auth/file/{class}/ID/{attribute}
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:44+0100"
)
public class CliPendingFileReferenceDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    @javax.validation.constraints.NotNull
    private String pendingFileId;
    @javax.validation.constraints.NotNull
    private String fileId;
    @javax.validation.constraints.NotNull
    private String mimeType;
    @javax.validation.constraints.NotNull
    private String name;
    private int size;
    @javax.validation.constraints.NotNull
    private String uploadedOn;

    public CliPendingFileReferenceDTO() {
    }


    public String getPendingFileId() {
        return pendingFileId;
    }
    public void setPendingFileId(String pendingFileId) {
        this.pendingFileId = pendingFileId;
    }

    public String getFileId() {
        return fileId;
    }
    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getMimeType() {
        return mimeType;
    }
    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }

    public String getUploadedOn() {
        return uploadedOn;
    }
    public void setUploadedOn(String uploadedOn) {
        this.uploadedOn = uploadedOn;
    }


    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(", ", "{ ", " }");
        if (pendingFileId != null) {
            joiner.add("pendingFileId: " + GraphQLRequestSerializer.getEntry(pendingFileId));
        }
        if (fileId != null) {
            joiner.add("fileId: " + GraphQLRequestSerializer.getEntry(fileId));
        }
        if (mimeType != null) {
            joiner.add("mimeType: " + GraphQLRequestSerializer.getEntry(mimeType));
        }
        if (name != null) {
            joiner.add("name: " + GraphQLRequestSerializer.getEntry(name));
        }
        joiner.add("size: " + GraphQLRequestSerializer.getEntry(size));
        if (uploadedOn != null) {
            joiner.add("uploadedOn: " + GraphQLRequestSerializer.getEntry(uploadedOn));
        }
        return joiner.toString();
    }

    public static CliPendingFileReferenceDTO.Builder builder() {
        return new CliPendingFileReferenceDTO.Builder();
    }

    @javax.annotation.processing.Generated(
        value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
        date = "2025-12-28T01:33:44+0100"
    )
    public static class Builder {

        private String pendingFileId;
        private String fileId;
        private String mimeType;
        private String name;
        private int size;
        private String uploadedOn;

        public Builder() {
        }

        public Builder setPendingFileId(String pendingFileId) {
            this.pendingFileId = pendingFileId;
            return this;
        }

        public Builder setFileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        public Builder setMimeType(String mimeType) {
            this.mimeType = mimeType;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public Builder setUploadedOn(String uploadedOn) {
            this.uploadedOn = uploadedOn;
            return this;
        }


        public CliPendingFileReferenceDTO build() {
            CliPendingFileReferenceDTO result = new CliPendingFileReferenceDTO();
            result.setPendingFileId(this.pendingFileId);
            result.setFileId(this.fileId);
            result.setMimeType(this.mimeType);
            result.setName(this.name);
            result.setSize(this.size);
            result.setUploadedOn(this.uploadedOn);
            return result;
        }

    }
}
