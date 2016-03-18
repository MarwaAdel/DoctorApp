package com.example.marwaadel.attendancesystem.utils;

/**
 * Constants class store most important strings and paths of the app
 */
public final class Constants {

    /**
     * Constants related to locations in Firebase, such as the name of the node
     * where active lists are stored (ie "activeLists")
     */
    public static final String FIREBASE_PROPERTY_LIST_NAME = "StudentList";

    /**
     * Constants for Firebase object properties
     */
    public static final String FIREBASE_PROPERTY_TIMESTAMP_LAST_CHANGED = "timestampLastChanged";
    public static final String FIREBASE_PROPERTY_TIMESTAMP = "timestamp";
    public static final String FIREBASE_PROPERTY_TIME = "time";
    public static final String FIREBASE_PROPERTY_date = "date";
    public static final String FIREBASE_LOCATION_USERS = "users";
    /**
     * Constants for Firebase URL
     */
    public static final String FIREBASE_URL = "https://boiling-torch-9221.firebaseio.com/";
    public static final String FIREBASE_URL_ACTIVE_LIST = FIREBASE_URL + "/" + FIREBASE_PROPERTY_LIST_NAME;
    public static final String FIREBASE_URL_USERS = FIREBASE_URL + "/" + FIREBASE_LOCATION_USERS;

    /**
     * Constants for bundles, extras and shared preferences keys
     */
    public static final String FIREBASE_PROPERTY_EMAIL = "email";
    public static final String PASSWORD_PROVIDER = "password";
    public static final String KEY_PROVIDER = "PROVIDER";
    public static final String KEY_ENCODED_EMAIL = "ENCODED_EMAIL";
    public static final String KEY_STUDENT_NAME = "STUDENT";
    public static final String KEY_STUDENT_ID = "0000";
    public static final String check = "false";


}
