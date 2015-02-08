package com.baselet.element.elementnew.uml;

import java.util.List;

import com.baselet.control.enums.ElementId;
import com.baselet.diagram.draw.DrawHandler;
import com.baselet.element.NewGridElement;
import com.baselet.element.facet.Facet;
import com.baselet.element.facet.PropertiesParserState;
import com.baselet.element.facet.Settings;
import com.baselet.element.facet.common.SeparatorLineWithHalignChangeFacet;
import com.baselet.element.facet.specific.UpperRightSymbolFacet;
import com.baselet.element.settings.SettingsManualResizeTop;

public class Generic extends NewGridElement {

	@Override
	public ElementId getId() {
		return ElementId.UMLGeneric;
	}

	@Override
	protected void drawCommonContent(PropertiesParserState state) {
		DrawHandler drawer = state.getDrawer();
		drawer.drawRectangle(0, 0, getRealSize().getWidth(), getRealSize().getHeight());
	}

	@Override
	protected Settings createSettings() {
		return new SettingsManualResizeTop() {
			@Override
			protected List<Facet> createFacets() {
				return listOf(super.createFacets(), UpperRightSymbolFacet.INSTANCE, SeparatorLineWithHalignChangeFacet.INSTANCE);
			}
		};
	}

}
