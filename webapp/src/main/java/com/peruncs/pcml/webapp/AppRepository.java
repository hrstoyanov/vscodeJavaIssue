package com.peruncs.pcml.webapp;

import one.microstream.storage.embedded.types.EmbeddedStorageManager;

record AppRepository(Application application, EmbeddedStorageManager embeddedStorageManager) {

}
