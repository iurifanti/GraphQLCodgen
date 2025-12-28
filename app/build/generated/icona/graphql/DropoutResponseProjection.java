package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Dropout
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class DropoutResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public DropoutResponseProjection() {
    }

    public DropoutResponseProjection(DropoutResponseProjection projection) {
        super(projection);
    }

    public DropoutResponseProjection(List<DropoutResponseProjection> projections) {
        super(projections);
    }

    public DropoutResponseProjection all$() {
        return all$(3);
    }

    public DropoutResponseProjection all$(int maxDepth) {
        this._clientId();
        this._createdby();
        this._createdon();
        this._id();
        this._lastmodifiedby();
        this._lastmodifiedon();
        this._ownedby();
        this._ownedon();
        this.altro_causa_decesso();
        this.altro_motivo_drop();
        this.altro_sede_decesso();
        this.autopsia();
        this.causa_decesso_nome1();
        this.causa_decesso_nome2();
        this.codice_centro();
        this.data();
        this.data_decesso();
        this.data_status_vita();
        this.deceduto();
        this.luogo_decesso();
        this.motivo_decesso();
        this.motivo_dropout();
        this.paziente();
        this.status_vita();
        this.ultima_visita_ok();
        this.undropped();
        if (projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Causa_decessoPageResponseProjection.causa_decesso___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("DropoutResponseProjection.Causa_decessoPageResponseProjection.causa_decesso___associables", projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Causa_decessoPageResponseProjection.causa_decesso___associables", 0) + 1);
            this.causa_decesso___associables(new Causa_decessoPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Causa_decessoPageResponseProjection.causa_decesso___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Causa_decessoResponseProjection.causa_decesso", 0) <= maxDepth) {
            projectionDepthOnFields.put("DropoutResponseProjection.Causa_decessoResponseProjection.causa_decesso", projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Causa_decessoResponseProjection.causa_decesso", 0) + 1);
            this.causa_decesso(new Causa_decessoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Causa_decessoResponseProjection.causa_decesso", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Causa_decessoPageResponseProjection.causa_decesso_sec___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("DropoutResponseProjection.Causa_decessoPageResponseProjection.causa_decesso_sec___associables", projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Causa_decessoPageResponseProjection.causa_decesso_sec___associables", 0) + 1);
            this.causa_decesso_sec___associables(new Causa_decessoPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Causa_decessoPageResponseProjection.causa_decesso_sec___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Causa_decessoResponseProjection.causa_decesso_sec", 0) <= maxDepth) {
            projectionDepthOnFields.put("DropoutResponseProjection.Causa_decessoResponseProjection.causa_decesso_sec", projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Causa_decessoResponseProjection.causa_decesso_sec", 0) + 1);
            this.causa_decesso_sec(new Causa_decessoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Causa_decessoResponseProjection.causa_decesso_sec", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Causa_decessoPageResponseProjection.causa_decesso_stimata___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("DropoutResponseProjection.Causa_decessoPageResponseProjection.causa_decesso_stimata___associables", projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Causa_decessoPageResponseProjection.causa_decesso_stimata___associables", 0) + 1);
            this.causa_decesso_stimata___associables(new Causa_decessoPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Causa_decessoPageResponseProjection.causa_decesso_stimata___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Causa_decessoResponseProjection.causa_decesso_stimata", 0) <= maxDepth) {
            projectionDepthOnFields.put("DropoutResponseProjection.Causa_decessoResponseProjection.causa_decesso_stimata", projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Causa_decessoResponseProjection.causa_decesso_stimata", 0) + 1);
            this.causa_decesso_stimata(new Causa_decessoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Causa_decessoResponseProjection.causa_decesso_stimata", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Motivazione_dropoutPageResponseProjection.motivazione_dropout___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("DropoutResponseProjection.Motivazione_dropoutPageResponseProjection.motivazione_dropout___associables", projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Motivazione_dropoutPageResponseProjection.motivazione_dropout___associables", 0) + 1);
            this.motivazione_dropout___associables(new Motivazione_dropoutPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Motivazione_dropoutPageResponseProjection.motivazione_dropout___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Motivazione_dropoutResponseProjection.motivazione_dropout", 0) <= maxDepth) {
            projectionDepthOnFields.put("DropoutResponseProjection.Motivazione_dropoutResponseProjection.motivazione_dropout", projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Motivazione_dropoutResponseProjection.motivazione_dropout", 0) + 1);
            this.motivazione_dropout(new Motivazione_dropoutResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Motivazione_dropoutResponseProjection.motivazione_dropout", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Relazione_decessoPageResponseProjection.relazione_decesso_1___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("DropoutResponseProjection.Relazione_decessoPageResponseProjection.relazione_decesso_1___associables", projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Relazione_decessoPageResponseProjection.relazione_decesso_1___associables", 0) + 1);
            this.relazione_decesso_1___associables(new Relazione_decessoPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Relazione_decessoPageResponseProjection.relazione_decesso_1___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Relazione_decessoResponseProjection.relazione_decesso_1", 0) <= maxDepth) {
            projectionDepthOnFields.put("DropoutResponseProjection.Relazione_decessoResponseProjection.relazione_decesso_1", projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Relazione_decessoResponseProjection.relazione_decesso_1", 0) + 1);
            this.relazione_decesso_1(new Relazione_decessoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Relazione_decessoResponseProjection.relazione_decesso_1", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Relazione_decessoPageResponseProjection.relazione_decesso_2___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("DropoutResponseProjection.Relazione_decessoPageResponseProjection.relazione_decesso_2___associables", projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Relazione_decessoPageResponseProjection.relazione_decesso_2___associables", 0) + 1);
            this.relazione_decesso_2___associables(new Relazione_decessoPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Relazione_decessoPageResponseProjection.relazione_decesso_2___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Relazione_decessoResponseProjection.relazione_decesso_2", 0) <= maxDepth) {
            projectionDepthOnFields.put("DropoutResponseProjection.Relazione_decessoResponseProjection.relazione_decesso_2", projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Relazione_decessoResponseProjection.relazione_decesso_2", 0) + 1);
            this.relazione_decesso_2(new Relazione_decessoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Relazione_decessoResponseProjection.relazione_decesso_2", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Sede_decessoPageResponseProjection.sede_decesso___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("DropoutResponseProjection.Sede_decessoPageResponseProjection.sede_decesso___associables", projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Sede_decessoPageResponseProjection.sede_decesso___associables", 0) + 1);
            this.sede_decesso___associables(new Sede_decessoPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Sede_decessoPageResponseProjection.sede_decesso___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Sede_decessoResponseProjection.sede_decesso", 0) <= maxDepth) {
            projectionDepthOnFields.put("DropoutResponseProjection.Sede_decessoResponseProjection.sede_decesso", projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Sede_decessoResponseProjection.sede_decesso", 0) + 1);
            this.sede_decesso(new Sede_decessoResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DropoutResponseProjection.Sede_decessoResponseProjection.sede_decesso", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("DropoutResponseProjection.PazienteResponseProjection.Paziente_dropout", 0) <= maxDepth) {
            projectionDepthOnFields.put("DropoutResponseProjection.PazienteResponseProjection.Paziente_dropout", projectionDepthOnFields.getOrDefault("DropoutResponseProjection.PazienteResponseProjection.Paziente_dropout", 0) + 1);
            this.Paziente_dropout(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("DropoutResponseProjection.PazienteResponseProjection.Paziente_dropout", 0)));
        }
        this.typename();
        return this;
    }

    public DropoutResponseProjection _clientId() {
        return _clientId(null);
    }

    public DropoutResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public DropoutResponseProjection _createdby() {
        return _createdby(null);
    }

    public DropoutResponseProjection _createdby(String alias) {
        add$(new GraphQLResponseField("_createdby").alias(alias));
        return this;
    }

    public DropoutResponseProjection _createdon() {
        return _createdon(null);
    }

    public DropoutResponseProjection _createdon(String alias) {
        add$(new GraphQLResponseField("_createdon").alias(alias));
        return this;
    }

    public DropoutResponseProjection _id() {
        return _id(null);
    }

    public DropoutResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public DropoutResponseProjection _lastmodifiedby() {
        return _lastmodifiedby(null);
    }

    public DropoutResponseProjection _lastmodifiedby(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedby").alias(alias));
        return this;
    }

    public DropoutResponseProjection _lastmodifiedon() {
        return _lastmodifiedon(null);
    }

    public DropoutResponseProjection _lastmodifiedon(String alias) {
        add$(new GraphQLResponseField("_lastmodifiedon").alias(alias));
        return this;
    }

    public DropoutResponseProjection _ownedby() {
        return _ownedby(null);
    }

    public DropoutResponseProjection _ownedby(String alias) {
        add$(new GraphQLResponseField("_ownedby").alias(alias));
        return this;
    }

    public DropoutResponseProjection _ownedon() {
        return _ownedon(null);
    }

    public DropoutResponseProjection _ownedon(String alias) {
        add$(new GraphQLResponseField("_ownedon").alias(alias));
        return this;
    }

    public DropoutResponseProjection altro_causa_decesso() {
        return altro_causa_decesso(null);
    }

    public DropoutResponseProjection altro_causa_decesso(String alias) {
        add$(new GraphQLResponseField("altro_causa_decesso").alias(alias));
        return this;
    }

    public DropoutResponseProjection altro_motivo_drop() {
        return altro_motivo_drop(null);
    }

    public DropoutResponseProjection altro_motivo_drop(String alias) {
        add$(new GraphQLResponseField("altro_motivo_drop").alias(alias));
        return this;
    }

    public DropoutResponseProjection altro_sede_decesso() {
        return altro_sede_decesso(null);
    }

    public DropoutResponseProjection altro_sede_decesso(String alias) {
        add$(new GraphQLResponseField("altro_sede_decesso").alias(alias));
        return this;
    }

    public DropoutResponseProjection autopsia() {
        return autopsia(null);
    }

    public DropoutResponseProjection autopsia(String alias) {
        add$(new GraphQLResponseField("autopsia").alias(alias));
        return this;
    }

    public DropoutResponseProjection causa_decesso_nome1() {
        return causa_decesso_nome1(null);
    }

    public DropoutResponseProjection causa_decesso_nome1(String alias) {
        add$(new GraphQLResponseField("causa_decesso_nome1").alias(alias));
        return this;
    }

    public DropoutResponseProjection causa_decesso_nome2() {
        return causa_decesso_nome2(null);
    }

    public DropoutResponseProjection causa_decesso_nome2(String alias) {
        add$(new GraphQLResponseField("causa_decesso_nome2").alias(alias));
        return this;
    }

    public DropoutResponseProjection codice_centro() {
        return codice_centro(null);
    }

    public DropoutResponseProjection codice_centro(String alias) {
        add$(new GraphQLResponseField("codice_centro").alias(alias));
        return this;
    }

    public DropoutResponseProjection data() {
        return data(null);
    }

    public DropoutResponseProjection data(String alias) {
        add$(new GraphQLResponseField("data").alias(alias));
        return this;
    }

    public DropoutResponseProjection data_decesso() {
        return data_decesso(null);
    }

    public DropoutResponseProjection data_decesso(String alias) {
        add$(new GraphQLResponseField("data_decesso").alias(alias));
        return this;
    }

    public DropoutResponseProjection data_status_vita() {
        return data_status_vita(null);
    }

    public DropoutResponseProjection data_status_vita(String alias) {
        add$(new GraphQLResponseField("data_status_vita").alias(alias));
        return this;
    }

    public DropoutResponseProjection deceduto() {
        return deceduto(null);
    }

    public DropoutResponseProjection deceduto(String alias) {
        add$(new GraphQLResponseField("deceduto").alias(alias));
        return this;
    }

    public DropoutResponseProjection luogo_decesso() {
        return luogo_decesso(null);
    }

    public DropoutResponseProjection luogo_decesso(String alias) {
        add$(new GraphQLResponseField("luogo_decesso").alias(alias));
        return this;
    }

    public DropoutResponseProjection motivo_decesso() {
        return motivo_decesso(null);
    }

    public DropoutResponseProjection motivo_decesso(String alias) {
        add$(new GraphQLResponseField("motivo_decesso").alias(alias));
        return this;
    }

    public DropoutResponseProjection motivo_dropout() {
        return motivo_dropout(null);
    }

    public DropoutResponseProjection motivo_dropout(String alias) {
        add$(new GraphQLResponseField("motivo_dropout").alias(alias));
        return this;
    }

    public DropoutResponseProjection paziente() {
        return paziente(null);
    }

    public DropoutResponseProjection paziente(String alias) {
        add$(new GraphQLResponseField("paziente").alias(alias));
        return this;
    }

    public DropoutResponseProjection status_vita() {
        return status_vita(null);
    }

    public DropoutResponseProjection status_vita(String alias) {
        add$(new GraphQLResponseField("status_vita").alias(alias));
        return this;
    }

    public DropoutResponseProjection ultima_visita_ok() {
        return ultima_visita_ok(null);
    }

    public DropoutResponseProjection ultima_visita_ok(String alias) {
        add$(new GraphQLResponseField("ultima_visita_ok").alias(alias));
        return this;
    }

    public DropoutResponseProjection undropped() {
        return undropped(null);
    }

    public DropoutResponseProjection undropped(String alias) {
        add$(new GraphQLResponseField("undropped").alias(alias));
        return this;
    }

    public DropoutResponseProjection causa_decesso___associables(Causa_decessoPageResponseProjection subProjection) {
        return causa_decesso___associables((String)null, subProjection);
    }

    public DropoutResponseProjection causa_decesso___associables(String alias, Causa_decessoPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("causa_decesso___associables").alias(alias).projection(subProjection));
        return this;
    }

    public DropoutResponseProjection causa_decesso___associables(DropoutCausa_decesso___associablesParametrizedInput input, Causa_decessoPageResponseProjection subProjection) {
        return causa_decesso___associables(null, input, subProjection);
    }

    public DropoutResponseProjection causa_decesso___associables(String alias, DropoutCausa_decesso___associablesParametrizedInput input, Causa_decessoPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("causa_decesso___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public DropoutResponseProjection causa_decesso(Causa_decessoResponseProjection subProjection) {
        return causa_decesso(null, subProjection);
    }

    public DropoutResponseProjection causa_decesso(String alias, Causa_decessoResponseProjection subProjection) {
        add$(new GraphQLResponseField("causa_decesso").alias(alias).projection(subProjection));
        return this;
    }

    public DropoutResponseProjection causa_decesso_sec___associables(Causa_decessoPageResponseProjection subProjection) {
        return causa_decesso_sec___associables((String)null, subProjection);
    }

    public DropoutResponseProjection causa_decesso_sec___associables(String alias, Causa_decessoPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("causa_decesso_sec___associables").alias(alias).projection(subProjection));
        return this;
    }

    public DropoutResponseProjection causa_decesso_sec___associables(DropoutCausa_decesso_sec___associablesParametrizedInput input, Causa_decessoPageResponseProjection subProjection) {
        return causa_decesso_sec___associables(null, input, subProjection);
    }

    public DropoutResponseProjection causa_decesso_sec___associables(String alias, DropoutCausa_decesso_sec___associablesParametrizedInput input, Causa_decessoPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("causa_decesso_sec___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public DropoutResponseProjection causa_decesso_sec(Causa_decessoResponseProjection subProjection) {
        return causa_decesso_sec(null, subProjection);
    }

    public DropoutResponseProjection causa_decesso_sec(String alias, Causa_decessoResponseProjection subProjection) {
        add$(new GraphQLResponseField("causa_decesso_sec").alias(alias).projection(subProjection));
        return this;
    }

    public DropoutResponseProjection causa_decesso_stimata___associables(Causa_decessoPageResponseProjection subProjection) {
        return causa_decesso_stimata___associables((String)null, subProjection);
    }

    public DropoutResponseProjection causa_decesso_stimata___associables(String alias, Causa_decessoPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("causa_decesso_stimata___associables").alias(alias).projection(subProjection));
        return this;
    }

    public DropoutResponseProjection causa_decesso_stimata___associables(DropoutCausa_decesso_stimata___associablesParametrizedInput input, Causa_decessoPageResponseProjection subProjection) {
        return causa_decesso_stimata___associables(null, input, subProjection);
    }

    public DropoutResponseProjection causa_decesso_stimata___associables(String alias, DropoutCausa_decesso_stimata___associablesParametrizedInput input, Causa_decessoPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("causa_decesso_stimata___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public DropoutResponseProjection causa_decesso_stimata(Causa_decessoResponseProjection subProjection) {
        return causa_decesso_stimata(null, subProjection);
    }

    public DropoutResponseProjection causa_decesso_stimata(String alias, Causa_decessoResponseProjection subProjection) {
        add$(new GraphQLResponseField("causa_decesso_stimata").alias(alias).projection(subProjection));
        return this;
    }

    public DropoutResponseProjection motivazione_dropout___associables(Motivazione_dropoutPageResponseProjection subProjection) {
        return motivazione_dropout___associables((String)null, subProjection);
    }

    public DropoutResponseProjection motivazione_dropout___associables(String alias, Motivazione_dropoutPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("motivazione_dropout___associables").alias(alias).projection(subProjection));
        return this;
    }

    public DropoutResponseProjection motivazione_dropout___associables(DropoutMotivazione_dropout___associablesParametrizedInput input, Motivazione_dropoutPageResponseProjection subProjection) {
        return motivazione_dropout___associables(null, input, subProjection);
    }

    public DropoutResponseProjection motivazione_dropout___associables(String alias, DropoutMotivazione_dropout___associablesParametrizedInput input, Motivazione_dropoutPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("motivazione_dropout___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public DropoutResponseProjection motivazione_dropout(Motivazione_dropoutResponseProjection subProjection) {
        return motivazione_dropout(null, subProjection);
    }

    public DropoutResponseProjection motivazione_dropout(String alias, Motivazione_dropoutResponseProjection subProjection) {
        add$(new GraphQLResponseField("motivazione_dropout").alias(alias).projection(subProjection));
        return this;
    }

    public DropoutResponseProjection relazione_decesso_1___associables(Relazione_decessoPageResponseProjection subProjection) {
        return relazione_decesso_1___associables((String)null, subProjection);
    }

    public DropoutResponseProjection relazione_decesso_1___associables(String alias, Relazione_decessoPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("relazione_decesso_1___associables").alias(alias).projection(subProjection));
        return this;
    }

    public DropoutResponseProjection relazione_decesso_1___associables(DropoutRelazione_decesso_1___associablesParametrizedInput input, Relazione_decessoPageResponseProjection subProjection) {
        return relazione_decesso_1___associables(null, input, subProjection);
    }

    public DropoutResponseProjection relazione_decesso_1___associables(String alias, DropoutRelazione_decesso_1___associablesParametrizedInput input, Relazione_decessoPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("relazione_decesso_1___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public DropoutResponseProjection relazione_decesso_1(Relazione_decessoResponseProjection subProjection) {
        return relazione_decesso_1(null, subProjection);
    }

    public DropoutResponseProjection relazione_decesso_1(String alias, Relazione_decessoResponseProjection subProjection) {
        add$(new GraphQLResponseField("relazione_decesso_1").alias(alias).projection(subProjection));
        return this;
    }

    public DropoutResponseProjection relazione_decesso_2___associables(Relazione_decessoPageResponseProjection subProjection) {
        return relazione_decesso_2___associables((String)null, subProjection);
    }

    public DropoutResponseProjection relazione_decesso_2___associables(String alias, Relazione_decessoPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("relazione_decesso_2___associables").alias(alias).projection(subProjection));
        return this;
    }

    public DropoutResponseProjection relazione_decesso_2___associables(DropoutRelazione_decesso_2___associablesParametrizedInput input, Relazione_decessoPageResponseProjection subProjection) {
        return relazione_decesso_2___associables(null, input, subProjection);
    }

    public DropoutResponseProjection relazione_decesso_2___associables(String alias, DropoutRelazione_decesso_2___associablesParametrizedInput input, Relazione_decessoPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("relazione_decesso_2___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public DropoutResponseProjection relazione_decesso_2(Relazione_decessoResponseProjection subProjection) {
        return relazione_decesso_2(null, subProjection);
    }

    public DropoutResponseProjection relazione_decesso_2(String alias, Relazione_decessoResponseProjection subProjection) {
        add$(new GraphQLResponseField("relazione_decesso_2").alias(alias).projection(subProjection));
        return this;
    }

    public DropoutResponseProjection sede_decesso___associables(Sede_decessoPageResponseProjection subProjection) {
        return sede_decesso___associables((String)null, subProjection);
    }

    public DropoutResponseProjection sede_decesso___associables(String alias, Sede_decessoPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("sede_decesso___associables").alias(alias).projection(subProjection));
        return this;
    }

    public DropoutResponseProjection sede_decesso___associables(DropoutSede_decesso___associablesParametrizedInput input, Sede_decessoPageResponseProjection subProjection) {
        return sede_decesso___associables(null, input, subProjection);
    }

    public DropoutResponseProjection sede_decesso___associables(String alias, DropoutSede_decesso___associablesParametrizedInput input, Sede_decessoPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("sede_decesso___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public DropoutResponseProjection sede_decesso(Sede_decessoResponseProjection subProjection) {
        return sede_decesso(null, subProjection);
    }

    public DropoutResponseProjection sede_decesso(String alias, Sede_decessoResponseProjection subProjection) {
        add$(new GraphQLResponseField("sede_decesso").alias(alias).projection(subProjection));
        return this;
    }

    public DropoutResponseProjection Paziente_dropout(PazienteResponseProjection subProjection) {
        return Paziente_dropout(null, subProjection);
    }

    public DropoutResponseProjection Paziente_dropout(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("Paziente_dropout").alias(alias).projection(subProjection));
        return this;
    }

    public DropoutResponseProjection typename() {
        return typename(null);
    }

    public DropoutResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public DropoutResponseProjection deepCopy$() {
        return new DropoutResponseProjection(this);
    }


}
