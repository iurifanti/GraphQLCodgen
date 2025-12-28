package icona.graphql;

import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseField;
import com.kobylynskyi.graphql.codegen.model.graphql.GraphQLResponseProjection;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

/**
 * Response projection for Gravidanza
 */
@javax.annotation.processing.Generated(
    value = "com.kobylynskyi.graphql.codegen.GraphQLCodegen",
    date = "2025-12-28T01:33:43+0100"
)
public class GravidanzaResponseProjection extends GraphQLResponseProjection {

    private final Map<String, Integer> projectionDepthOnFields = new HashMap<>();

    public GravidanzaResponseProjection() {
    }

    public GravidanzaResponseProjection(GravidanzaResponseProjection projection) {
        super(projection);
    }

    public GravidanzaResponseProjection(List<GravidanzaResponseProjection> projections) {
        super(projections);
    }

    public GravidanzaResponseProjection all$() {
        return all$(3);
    }

    public GravidanzaResponseProjection all$(int maxDepth) {
        this._clientId();
        this._id();
        this.allattamento_seno1();
        this.allattamento_seno2();
        this.codice_centro();
        this.data_esito();
        this.eta_gestazionale();
        this.neonati();
        this.note();
        this.padre_hiv();
        this.peso1();
        this.peso2();
        this.probelma_ostetrico_specificare();
        this.problema_ostetrico_nome();
        this.sesso1();
        this.sesso2();
        this.ultima_mestruazione();
        if (projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.anomalia___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.anomalia___associables", projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.anomalia___associables", 0) + 1);
            this.anomalia___associables(new Codici_gravidanzaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.anomalia___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.anomalia", 0) <= maxDepth) {
            projectionDepthOnFields.put("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.anomalia", projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.anomalia", 0) + 1);
            this.anomalia(new Codici_gravidanzaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.anomalia", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.cariotipo1___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.cariotipo1___associables", projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.cariotipo1___associables", 0) + 1);
            this.cariotipo1___associables(new Codici_gravidanzaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.cariotipo1___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.cariotipo1", 0) <= maxDepth) {
            projectionDepthOnFields.put("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.cariotipo1", projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.cariotipo1", 0) + 1);
            this.cariotipo1(new Codici_gravidanzaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.cariotipo1", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.cariotipo2___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.cariotipo2___associables", projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.cariotipo2___associables", 0) + 1);
            this.cariotipo2___associables(new Codici_gravidanzaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.cariotipo2___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.cariotipo2", 0) <= maxDepth) {
            projectionDepthOnFields.put("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.cariotipo2", projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.cariotipo2", 0) + 1);
            this.cariotipo2(new Codici_gravidanzaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.cariotipo2", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.concepimento___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.concepimento___associables", projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.concepimento___associables", 0) + 1);
            this.concepimento___associables(new Codici_gravidanzaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.concepimento___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.concepimento", 0) <= maxDepth) {
            projectionDepthOnFields.put("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.concepimento", projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.concepimento", 0) + 1);
            this.concepimento(new Codici_gravidanzaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.concepimento", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.esito___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.esito___associables", projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.esito___associables", 0) + 1);
            this.esito___associables(new Codici_gravidanzaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.esito___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.esito", 0) <= maxDepth) {
            projectionDepthOnFields.put("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.esito", projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.esito", 0) + 1);
            this.esito(new Codici_gravidanzaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.esito", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.modalita___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.modalita___associables", projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.modalita___associables", 0) + 1);
            this.modalita___associables(new Codici_gravidanzaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.modalita___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.modalita", 0) <= maxDepth) {
            projectionDepthOnFields.put("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.modalita", projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.modalita", 0) + 1);
            this.modalita(new Codici_gravidanzaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.modalita", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.motivazione_interruzione___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.motivazione_interruzione___associables", projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.motivazione_interruzione___associables", 0) + 1);
            this.motivazione_interruzione___associables(new Codici_gravidanzaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.motivazione_interruzione___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.motivazione_interruzione", 0) <= maxDepth) {
            projectionDepthOnFields.put("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.motivazione_interruzione", projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.motivazione_interruzione", 0) + 1);
            this.motivazione_interruzione(new Codici_gravidanzaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.motivazione_interruzione", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.problema_ostetrico___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.problema_ostetrico___associables", projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.problema_ostetrico___associables", 0) + 1);
            this.problema_ostetrico___associables(new Codici_gravidanzaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.problema_ostetrico___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.problema_ostetrico", 0) <= maxDepth) {
            projectionDepthOnFields.put("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.problema_ostetrico", projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.problema_ostetrico", 0) + 1);
            this.problema_ostetrico(new Codici_gravidanzaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.problema_ostetrico", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.procedura_invasiva___associables", 0) <= maxDepth) {
            projectionDepthOnFields.put("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.procedura_invasiva___associables", projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.procedura_invasiva___associables", 0) + 1);
            this.procedura_invasiva___associables(new Codici_gravidanzaPageResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaPageResponseProjection.procedura_invasiva___associables", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.procedura_invasiva", 0) <= maxDepth) {
            projectionDepthOnFields.put("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.procedura_invasiva", projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.procedura_invasiva", 0) + 1);
            this.procedura_invasiva(new Codici_gravidanzaResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.Codici_gravidanzaResponseProjection.procedura_invasiva", 0)));
        }
        if (projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.PazienteResponseProjection.paziente_", 0) <= maxDepth) {
            projectionDepthOnFields.put("GravidanzaResponseProjection.PazienteResponseProjection.paziente_", projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.PazienteResponseProjection.paziente_", 0) + 1);
            this.paziente_(new PazienteResponseProjection().all$(maxDepth - projectionDepthOnFields.getOrDefault("GravidanzaResponseProjection.PazienteResponseProjection.paziente_", 0)));
        }
        this.typename();
        return this;
    }

    public GravidanzaResponseProjection _clientId() {
        return _clientId(null);
    }

    public GravidanzaResponseProjection _clientId(String alias) {
        add$(new GraphQLResponseField("_clientId").alias(alias));
        return this;
    }

    public GravidanzaResponseProjection _id() {
        return _id(null);
    }

    public GravidanzaResponseProjection _id(String alias) {
        add$(new GraphQLResponseField("_id").alias(alias));
        return this;
    }

    public GravidanzaResponseProjection allattamento_seno1() {
        return allattamento_seno1(null);
    }

    public GravidanzaResponseProjection allattamento_seno1(String alias) {
        add$(new GraphQLResponseField("allattamento_seno1").alias(alias));
        return this;
    }

    public GravidanzaResponseProjection allattamento_seno2() {
        return allattamento_seno2(null);
    }

    public GravidanzaResponseProjection allattamento_seno2(String alias) {
        add$(new GraphQLResponseField("allattamento_seno2").alias(alias));
        return this;
    }

    public GravidanzaResponseProjection codice_centro() {
        return codice_centro(null);
    }

    public GravidanzaResponseProjection codice_centro(String alias) {
        add$(new GraphQLResponseField("codice_centro").alias(alias));
        return this;
    }

    public GravidanzaResponseProjection data_esito() {
        return data_esito(null);
    }

    public GravidanzaResponseProjection data_esito(String alias) {
        add$(new GraphQLResponseField("data_esito").alias(alias));
        return this;
    }

    public GravidanzaResponseProjection eta_gestazionale() {
        return eta_gestazionale(null);
    }

    public GravidanzaResponseProjection eta_gestazionale(String alias) {
        add$(new GraphQLResponseField("eta_gestazionale").alias(alias));
        return this;
    }

    public GravidanzaResponseProjection neonati() {
        return neonati(null);
    }

    public GravidanzaResponseProjection neonati(String alias) {
        add$(new GraphQLResponseField("neonati").alias(alias));
        return this;
    }

    public GravidanzaResponseProjection note() {
        return note(null);
    }

    public GravidanzaResponseProjection note(String alias) {
        add$(new GraphQLResponseField("note").alias(alias));
        return this;
    }

    public GravidanzaResponseProjection padre_hiv() {
        return padre_hiv(null);
    }

    public GravidanzaResponseProjection padre_hiv(String alias) {
        add$(new GraphQLResponseField("padre_hiv").alias(alias));
        return this;
    }

    public GravidanzaResponseProjection peso1() {
        return peso1(null);
    }

    public GravidanzaResponseProjection peso1(String alias) {
        add$(new GraphQLResponseField("peso1").alias(alias));
        return this;
    }

    public GravidanzaResponseProjection peso2() {
        return peso2(null);
    }

    public GravidanzaResponseProjection peso2(String alias) {
        add$(new GraphQLResponseField("peso2").alias(alias));
        return this;
    }

    public GravidanzaResponseProjection probelma_ostetrico_specificare() {
        return probelma_ostetrico_specificare(null);
    }

    public GravidanzaResponseProjection probelma_ostetrico_specificare(String alias) {
        add$(new GraphQLResponseField("probelma_ostetrico_specificare").alias(alias));
        return this;
    }

    public GravidanzaResponseProjection problema_ostetrico_nome() {
        return problema_ostetrico_nome(null);
    }

    public GravidanzaResponseProjection problema_ostetrico_nome(String alias) {
        add$(new GraphQLResponseField("problema_ostetrico_nome").alias(alias));
        return this;
    }

    public GravidanzaResponseProjection sesso1() {
        return sesso1(null);
    }

    public GravidanzaResponseProjection sesso1(String alias) {
        add$(new GraphQLResponseField("sesso1").alias(alias));
        return this;
    }

    public GravidanzaResponseProjection sesso2() {
        return sesso2(null);
    }

    public GravidanzaResponseProjection sesso2(String alias) {
        add$(new GraphQLResponseField("sesso2").alias(alias));
        return this;
    }

    public GravidanzaResponseProjection ultima_mestruazione() {
        return ultima_mestruazione(null);
    }

    public GravidanzaResponseProjection ultima_mestruazione(String alias) {
        add$(new GraphQLResponseField("ultima_mestruazione").alias(alias));
        return this;
    }

    public GravidanzaResponseProjection anomalia___associables(Codici_gravidanzaPageResponseProjection subProjection) {
        return anomalia___associables((String)null, subProjection);
    }

    public GravidanzaResponseProjection anomalia___associables(String alias, Codici_gravidanzaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("anomalia___associables").alias(alias).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection anomalia___associables(GravidanzaAnomalia___associablesParametrizedInput input, Codici_gravidanzaPageResponseProjection subProjection) {
        return anomalia___associables(null, input, subProjection);
    }

    public GravidanzaResponseProjection anomalia___associables(String alias, GravidanzaAnomalia___associablesParametrizedInput input, Codici_gravidanzaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("anomalia___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection anomalia(Codici_gravidanzaResponseProjection subProjection) {
        return anomalia(null, subProjection);
    }

    public GravidanzaResponseProjection anomalia(String alias, Codici_gravidanzaResponseProjection subProjection) {
        add$(new GraphQLResponseField("anomalia").alias(alias).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection cariotipo1___associables(Codici_gravidanzaPageResponseProjection subProjection) {
        return cariotipo1___associables((String)null, subProjection);
    }

    public GravidanzaResponseProjection cariotipo1___associables(String alias, Codici_gravidanzaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("cariotipo1___associables").alias(alias).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection cariotipo1___associables(GravidanzaCariotipo1___associablesParametrizedInput input, Codici_gravidanzaPageResponseProjection subProjection) {
        return cariotipo1___associables(null, input, subProjection);
    }

    public GravidanzaResponseProjection cariotipo1___associables(String alias, GravidanzaCariotipo1___associablesParametrizedInput input, Codici_gravidanzaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("cariotipo1___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection cariotipo1(Codici_gravidanzaResponseProjection subProjection) {
        return cariotipo1(null, subProjection);
    }

    public GravidanzaResponseProjection cariotipo1(String alias, Codici_gravidanzaResponseProjection subProjection) {
        add$(new GraphQLResponseField("cariotipo1").alias(alias).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection cariotipo2___associables(Codici_gravidanzaPageResponseProjection subProjection) {
        return cariotipo2___associables((String)null, subProjection);
    }

    public GravidanzaResponseProjection cariotipo2___associables(String alias, Codici_gravidanzaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("cariotipo2___associables").alias(alias).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection cariotipo2___associables(GravidanzaCariotipo2___associablesParametrizedInput input, Codici_gravidanzaPageResponseProjection subProjection) {
        return cariotipo2___associables(null, input, subProjection);
    }

    public GravidanzaResponseProjection cariotipo2___associables(String alias, GravidanzaCariotipo2___associablesParametrizedInput input, Codici_gravidanzaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("cariotipo2___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection cariotipo2(Codici_gravidanzaResponseProjection subProjection) {
        return cariotipo2(null, subProjection);
    }

    public GravidanzaResponseProjection cariotipo2(String alias, Codici_gravidanzaResponseProjection subProjection) {
        add$(new GraphQLResponseField("cariotipo2").alias(alias).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection concepimento___associables(Codici_gravidanzaPageResponseProjection subProjection) {
        return concepimento___associables((String)null, subProjection);
    }

    public GravidanzaResponseProjection concepimento___associables(String alias, Codici_gravidanzaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("concepimento___associables").alias(alias).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection concepimento___associables(GravidanzaConcepimento___associablesParametrizedInput input, Codici_gravidanzaPageResponseProjection subProjection) {
        return concepimento___associables(null, input, subProjection);
    }

    public GravidanzaResponseProjection concepimento___associables(String alias, GravidanzaConcepimento___associablesParametrizedInput input, Codici_gravidanzaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("concepimento___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection concepimento(Codici_gravidanzaResponseProjection subProjection) {
        return concepimento(null, subProjection);
    }

    public GravidanzaResponseProjection concepimento(String alias, Codici_gravidanzaResponseProjection subProjection) {
        add$(new GraphQLResponseField("concepimento").alias(alias).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection esito___associables(Codici_gravidanzaPageResponseProjection subProjection) {
        return esito___associables((String)null, subProjection);
    }

    public GravidanzaResponseProjection esito___associables(String alias, Codici_gravidanzaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("esito___associables").alias(alias).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection esito___associables(GravidanzaEsito___associablesParametrizedInput input, Codici_gravidanzaPageResponseProjection subProjection) {
        return esito___associables(null, input, subProjection);
    }

    public GravidanzaResponseProjection esito___associables(String alias, GravidanzaEsito___associablesParametrizedInput input, Codici_gravidanzaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("esito___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection esito(Codici_gravidanzaResponseProjection subProjection) {
        return esito(null, subProjection);
    }

    public GravidanzaResponseProjection esito(String alias, Codici_gravidanzaResponseProjection subProjection) {
        add$(new GraphQLResponseField("esito").alias(alias).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection modalita___associables(Codici_gravidanzaPageResponseProjection subProjection) {
        return modalita___associables((String)null, subProjection);
    }

    public GravidanzaResponseProjection modalita___associables(String alias, Codici_gravidanzaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("modalita___associables").alias(alias).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection modalita___associables(GravidanzaModalita___associablesParametrizedInput input, Codici_gravidanzaPageResponseProjection subProjection) {
        return modalita___associables(null, input, subProjection);
    }

    public GravidanzaResponseProjection modalita___associables(String alias, GravidanzaModalita___associablesParametrizedInput input, Codici_gravidanzaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("modalita___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection modalita(Codici_gravidanzaResponseProjection subProjection) {
        return modalita(null, subProjection);
    }

    public GravidanzaResponseProjection modalita(String alias, Codici_gravidanzaResponseProjection subProjection) {
        add$(new GraphQLResponseField("modalita").alias(alias).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection motivazione_interruzione___associables(Codici_gravidanzaPageResponseProjection subProjection) {
        return motivazione_interruzione___associables((String)null, subProjection);
    }

    public GravidanzaResponseProjection motivazione_interruzione___associables(String alias, Codici_gravidanzaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("motivazione_interruzione___associables").alias(alias).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection motivazione_interruzione___associables(GravidanzaMotivazione_interruzione___associablesParametrizedInput input, Codici_gravidanzaPageResponseProjection subProjection) {
        return motivazione_interruzione___associables(null, input, subProjection);
    }

    public GravidanzaResponseProjection motivazione_interruzione___associables(String alias, GravidanzaMotivazione_interruzione___associablesParametrizedInput input, Codici_gravidanzaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("motivazione_interruzione___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection motivazione_interruzione(Codici_gravidanzaResponseProjection subProjection) {
        return motivazione_interruzione(null, subProjection);
    }

    public GravidanzaResponseProjection motivazione_interruzione(String alias, Codici_gravidanzaResponseProjection subProjection) {
        add$(new GraphQLResponseField("motivazione_interruzione").alias(alias).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection problema_ostetrico___associables(Codici_gravidanzaPageResponseProjection subProjection) {
        return problema_ostetrico___associables((String)null, subProjection);
    }

    public GravidanzaResponseProjection problema_ostetrico___associables(String alias, Codici_gravidanzaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("problema_ostetrico___associables").alias(alias).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection problema_ostetrico___associables(GravidanzaProblema_ostetrico___associablesParametrizedInput input, Codici_gravidanzaPageResponseProjection subProjection) {
        return problema_ostetrico___associables(null, input, subProjection);
    }

    public GravidanzaResponseProjection problema_ostetrico___associables(String alias, GravidanzaProblema_ostetrico___associablesParametrizedInput input, Codici_gravidanzaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("problema_ostetrico___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection problema_ostetrico(Codici_gravidanzaResponseProjection subProjection) {
        return problema_ostetrico(null, subProjection);
    }

    public GravidanzaResponseProjection problema_ostetrico(String alias, Codici_gravidanzaResponseProjection subProjection) {
        add$(new GraphQLResponseField("problema_ostetrico").alias(alias).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection procedura_invasiva___associables(Codici_gravidanzaPageResponseProjection subProjection) {
        return procedura_invasiva___associables((String)null, subProjection);
    }

    public GravidanzaResponseProjection procedura_invasiva___associables(String alias, Codici_gravidanzaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("procedura_invasiva___associables").alias(alias).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection procedura_invasiva___associables(GravidanzaProcedura_invasiva___associablesParametrizedInput input, Codici_gravidanzaPageResponseProjection subProjection) {
        return procedura_invasiva___associables(null, input, subProjection);
    }

    public GravidanzaResponseProjection procedura_invasiva___associables(String alias, GravidanzaProcedura_invasiva___associablesParametrizedInput input, Codici_gravidanzaPageResponseProjection subProjection) {
        add$(new GraphQLResponseField("procedura_invasiva___associables").alias(alias).parameters(input).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection procedura_invasiva(Codici_gravidanzaResponseProjection subProjection) {
        return procedura_invasiva(null, subProjection);
    }

    public GravidanzaResponseProjection procedura_invasiva(String alias, Codici_gravidanzaResponseProjection subProjection) {
        add$(new GraphQLResponseField("procedura_invasiva").alias(alias).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection paziente_(PazienteResponseProjection subProjection) {
        return paziente_(null, subProjection);
    }

    public GravidanzaResponseProjection paziente_(String alias, PazienteResponseProjection subProjection) {
        add$(new GraphQLResponseField("paziente_").alias(alias).projection(subProjection));
        return this;
    }

    public GravidanzaResponseProjection typename() {
        return typename(null);
    }

    public GravidanzaResponseProjection typename(String alias) {
        add$(new GraphQLResponseField("__typename").alias(alias));
        return this;
    }

    @Override
    public GravidanzaResponseProjection deepCopy$() {
        return new GravidanzaResponseProjection(this);
    }


}
