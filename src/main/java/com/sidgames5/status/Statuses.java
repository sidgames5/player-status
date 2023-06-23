package com.sidgames5.status;

public class Statuses {
    public static final String NONE = "none";
    public static final String DND = "dnd";
    public static final String NOSLEEP = "nosleep";

    public static String getDisplayName(String status) {
        switch (status) {
            case DND: return "[Do Not Disturb]";
            case NOSLEEP: return "[No Sleep]";
            default: return "";
        }
    }
}
