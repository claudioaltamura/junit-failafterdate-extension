package de.claudioaltamura.junit.failafterdate.extension;

import org.junit.jupiter.api.extension.ConditionEvaluationResult;
import org.junit.jupiter.api.extension.ExecutionCondition;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.platform.commons.util.AnnotationUtils;
import org.opentest4j.AssertionFailedError;

import java.time.LocalDate;
import java.util.Optional;

public class FailAfterDateCondition implements ExecutionCondition {
    private static final ConditionEvaluationResult ENABLED = ConditionEvaluationResult.enabled(
            "@FailAfterDate not present or date not yet reached");

    @Override
    public ConditionEvaluationResult evaluateExecutionCondition(ExtensionContext context) {

        final Optional<FailAfterDate> annotation = AnnotationUtils.findAnnotation(context.getElement(), FailAfterDate.class);
        if(annotation.isPresent()) {
            final FailAfterDate failAfterDate = annotation.get();
            if(LocalDate.parse(failAfterDate.after())
                    .isBefore(LocalDate.now())) {
                throw new AssertionFailedError("Date passed: " + failAfterDate.after() + ". " + failAfterDate.reason());
            }
        }

        return ENABLED;
    }
}
