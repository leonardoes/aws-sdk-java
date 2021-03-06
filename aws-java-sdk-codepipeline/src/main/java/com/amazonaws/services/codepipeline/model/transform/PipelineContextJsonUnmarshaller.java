/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.codepipeline.model.transform;

import java.math.*;

import javax.annotation.Generated;

import com.amazonaws.services.codepipeline.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;

import com.fasterxml.jackson.core.JsonToken;
import static com.fasterxml.jackson.core.JsonToken.*;

/**
 * PipelineContext JSON Unmarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipelineContextJsonUnmarshaller implements Unmarshaller<PipelineContext, JsonUnmarshallerContext> {

    public PipelineContext unmarshall(JsonUnmarshallerContext context) throws Exception {
        PipelineContext pipelineContext = new PipelineContext();

        int originalDepth = context.getCurrentDepth();
        String currentParentElement = context.getCurrentParentElement();
        int targetDepth = originalDepth + 1;

        JsonToken token = context.getCurrentToken();
        if (token == null)
            token = context.nextToken();
        if (token == VALUE_NULL) {
            return null;
        }

        while (true) {
            if (token == null)
                break;

            if (token == FIELD_NAME || token == START_OBJECT) {
                if (context.testExpression("pipelineName", targetDepth)) {
                    context.nextToken();
                    pipelineContext.setPipelineName(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("stage", targetDepth)) {
                    context.nextToken();
                    pipelineContext.setStage(StageContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("action", targetDepth)) {
                    context.nextToken();
                    pipelineContext.setAction(ActionContextJsonUnmarshaller.getInstance().unmarshall(context));
                }
                if (context.testExpression("pipelineArn", targetDepth)) {
                    context.nextToken();
                    pipelineContext.setPipelineArn(context.getUnmarshaller(String.class).unmarshall(context));
                }
                if (context.testExpression("pipelineExecutionId", targetDepth)) {
                    context.nextToken();
                    pipelineContext.setPipelineExecutionId(context.getUnmarshaller(String.class).unmarshall(context));
                }
            } else if (token == END_ARRAY || token == END_OBJECT) {
                if (context.getLastParsedParentElement() == null || context.getLastParsedParentElement().equals(currentParentElement)) {
                    if (context.getCurrentDepth() <= originalDepth)
                        break;
                }
            }
            token = context.nextToken();
        }

        return pipelineContext;
    }

    private static PipelineContextJsonUnmarshaller instance;

    public static PipelineContextJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PipelineContextJsonUnmarshaller();
        return instance;
    }
}
