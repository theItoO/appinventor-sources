package com.google.appinventor.client.editor.simple.components;

import com.google.appinventor.client.editor.simple.SimpleEditor;
import com.google.appinventor.components.common.ComponentConstants;
import com.google.gwt.user.client.ui.Widget;

public class MockSpace extends MockHVArrangement {

  public static final String TYPE = "Space";

  /**
   * Creates a new component container.
   * <p>
   * Implementations are responsible for constructing their own visual appearance and calling {@link
   * #initWidget(Widget)}. This appearance should include {@link
   * #rootPanel} so that children components are displayed correctly.
   *
   * @param editor editor of source file the component belongs to
   */
  public MockSpace(SimpleEditor editor) {
    super(editor, TYPE, images.vertical(),
        ComponentConstants.LAYOUT_ORIENTATION_VERTICAL,
        ComponentConstants.NONSCROLLABLE_ARRANGEMENT);
  }
}
