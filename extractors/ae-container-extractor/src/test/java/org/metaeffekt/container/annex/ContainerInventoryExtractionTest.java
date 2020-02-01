package org.metaeffekt.container.annex;

import org.junit.Test;
import org.metaeffekt.core.inventory.processor.model.Artifact;

import static org.junit.Assert.assertNotNull;
import static org.metaeffekt.core.inventory.processor.model.Constants.*;
import org.metaeffekt.core.test.container.validation.AbstractContainerValidationTest;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

import static org.junit.Assert.assertNull;

/**
 * Tests that general inventory extraction rules are met.
 */
public class ContainerInventoryExtractionTest extends AbstractContainerValidationTest {

    @Test
    public void testInventory() throws IOException {
        File analysisDir = new File("target/classes/analysis");
        assertInventory(analysisDir, new File(analysisDir, "ae-container-extractor-inventory.xls"));
    }

    @Override
    protected void assertCommonPackageAttributes(Artifact artifact) {
        notNullOrEmpty("Component not set for " + artifact.getId(), artifact.getComponent());
        notNullOrEmpty("Version not set for " + artifact.getId(), artifact.getVersion());
    }

    protected void assertCommonAttributes(Artifact artifact) {
        this.notNullOrEmpty("Id not set for artifact " + artifact.createStringRepresentation(), artifact.getId());
        this.notNullOrEmpty("Source Project not set for " + artifact.getId(), artifact.get("Source Project"));
        this.notNullOrEmpty("Type not set for " + artifact.getId(), artifact.get("Type"));
        //this.nullOrEmpty("License must not be set " + artifact.getId(), artifact.getLicense());
        this.nullOrEmpty("Latest version must not be set " + artifact.getId(), artifact.getLatestVersion());
    }

    protected void assertArtifactAttributes(Artifact artifact) {
    }

}