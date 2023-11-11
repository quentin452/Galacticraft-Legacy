package micdoodle8.mods.miccore;

import cpw.mods.fml.common.asm.transformers.*;
import java.io.*;

public class MicdoodleAccessTransformerDeObf extends AccessTransformer
{
    public MicdoodleAccessTransformerDeObf() throws IOException {
        super("micdoodlecore_at.deobf");
    }
}
