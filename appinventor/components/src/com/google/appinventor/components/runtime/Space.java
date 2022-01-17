package com.google.appinventor.components.runtime;

import com.google.appinventor.components.annotations.DesignerComponent;
import com.google.appinventor.components.annotations.SimpleObject;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.common.YaVersion;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;

@DesignerComponent(
    category = ComponentCategory.LAYOUT,
    description = "Tool to add space between components, make your app spacious!",
    version = YaVersion.SPACE_COMPONENT_VERSION)
@SimpleObject
public class Space extends HVArrangement {

  public Space(ComponentContainer container, int orientation, boolean scrollable) {
    super(container, orientation, scrollable);
  }

  @Override
  public void $add(AndroidViewComponent component) {
    throw new YailRuntimeError("Space cannot contain a component", "Space");
  }
}