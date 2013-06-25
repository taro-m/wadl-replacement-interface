package com.kii.wadl2.dom;

import net.kaoriya.qb.json_schema_dom.draft_v4.JSONSchema;

public interface JSONBody extends ContentBody {
    JSONSchema getJSONSchema();
}
