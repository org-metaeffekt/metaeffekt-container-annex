package org.metaeffekt.container.annex;

import org.junit.Test;
import org.metaeffekt.core.inventory.processor.model.Artifact;
import org.metaeffekt.core.test.container.validation.AbstractContainerValidationTest;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

import static org.junit.Assert.assertNull;

/**
 * Tests that general inventory extraction rules are met.
 */
public class ContainerInventoryExtractionTest extends AbstractContainerValidationTest {

    String KEY_DERIVED_LICENSE_PACKAGE = "Specified Package License";

    String KEY_TYPE = "Type";

    String TYPE_PACKAGE = "package";
    String TYPE_FILE = "file";

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

    /**
     * Override. Debian does not support package level license annotations. Everything is in the copyright files.
     *
     * @param artifact
     */
    @Override
    protected void assertArtifactAttributes(Artifact artifact) {
        if (Objects.equals(artifact.get(KEY_TYPE), TYPE_PACKAGE)) {
            assertNull(artifact.get(KEY_DERIVED_LICENSE_PACKAGE));
        }
    }

}