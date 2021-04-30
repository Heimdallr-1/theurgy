/*
 * MIT License
 *
 * Copyright 2021 klikli-dev, TheOnlyTails
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT
 * OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

package com.klikli_dev.theurgy.datagen

import net.minecraftforge.eventbus.api.SubscribeEvent
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent

/**
 * See also https://github.com/TheOnlyTails/RubyMod/blob/master/src/main/kotlin/com/theonlytails/rubymod/datagen/DataGenerators.kt
 */
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
object TheurgyDataGenerators {
    @SubscribeEvent
    fun gatherData(event: GatherDataEvent) {
        val generator = event.generator
        val helper = event.existingFileHelper

        if (event.includeClient()) {
            generator.addProvider(LangGenerator.English(generator))
        }

        if (event.includeServer()) {
            val blockTags = BlockTagDataGenerator(generator, helper)
            val itemModels = ItemModelsGenerator(generator, helper)

            generator.addProvider(AdvancementsGenerator(generator))
            generator.addProvider(BlockLootTablesGenerator(generator))
            generator.addProvider(blockTags)
            generator.addProvider(ItemTagGenerator(generator, blockTags, helper))
            generator.addProvider(itemModels)
        }
    }
}