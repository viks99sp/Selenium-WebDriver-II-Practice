package jiratests.enums;

import lombok.Getter;

@Getter
public enum TestData {
    JIRA_PASSWORD(""),
    JIRA_EMAIL("");

    TestData(String propName) {
        value = propName;
    }

    final String value;
}
