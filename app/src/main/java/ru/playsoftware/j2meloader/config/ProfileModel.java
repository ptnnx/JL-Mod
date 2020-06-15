/*
 *  Copyright 2020 Yury Kharchenko
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package ru.playsoftware.j2meloader.config;


import com.google.gson.annotations.SerializedName;

import java.io.File;

import javax.microedition.lcdui.pointer.VirtualKeyboard;
import javax.microedition.util.ContextHolder;

public class ProfileModel {
	/** True if this is a new profile (not yet saved to file) */
	public final transient boolean isNew;

	public transient File dir;

	public int version;

	@SerializedName("ScreenWidth")
	public int screenWidth;

	@SerializedName("ScreenHeight")
	public int screenHeight;

	@SerializedName("ScreenBackgroundColor")
	public int screenBackgroundColor;

	@SerializedName("ScreenScaleRatio")
	public int screenScaleRatio;

	@SerializedName("Orientation")
	public int orientation;

	@SerializedName("ScreenScaleToFit")
	public boolean screenScaleToFit;

	@SerializedName("ScreenKeepAspectRatio")
	public boolean screenKeepAspectRatio;

	@SerializedName("ScreenFilter")
	public boolean screenFilter;

	@SerializedName("ImmediateMode")
	public boolean immediateMode;

	@SerializedName("HwAcceleration")
	public boolean hwAcceleration;

	public ShaderInfo shader;

	@SerializedName("ParallelRedrawScreen")
	public boolean parallelRedrawScreen;

	@SerializedName("ShowFps")
	public boolean showFps;

	@SerializedName("FpsLimit")
	public int fpsLimit;

	@SerializedName("ForceFullscreen")
	public boolean forceFullscreen;

	@SerializedName("FontSizeSmall")
	public int fontSizeSmall;

	@SerializedName("FontSizeMedium")
	public int fontSizeMedium;

	@SerializedName("FontSizeLarge")
	public int fontSizeLarge;

	@SerializedName("FontApplyDimensions")
	public boolean fontApplyDimensions;

	@SerializedName("TouchInput")
	public boolean touchInput;

	@SerializedName("ShowKeyboard")
	public boolean showKeyboard;

	@SerializedName("VirtualKeyboardType")
	public int vkType;

	@SerializedName("ButtonShape")
	public int vkButtonShape;

	@SerializedName("VirtualKeyboardAlpha")
	public int vkAlpha;

	@SerializedName("VirtualKeyboardForceOpacity")
	public boolean vkForceOpacity;

	@SerializedName("VirtualKeyboardFeedback")
	public boolean vkFeedback;

	@SerializedName("VirtualKeyboardDelay")
	public int vkHideDelay;

	@SerializedName("VirtualKeyboardColorBackground")
	public int vkBgColor;

	@SerializedName("VirtualKeyboardColorBackgroundSelected")
	public int vkBgColorSelected;

	@SerializedName("VirtualKeyboardColorForeground")
	public int vkFgColor;

	@SerializedName("VirtualKeyboardColorForegroundSelected")
	public int vkFgColorSelected;

	@SerializedName("VirtualKeyboardColorOutline")
	public int vkOutlineColor;

	@SerializedName("Layout")
	public int keyCodesLayout;

	@SerializedName("KeyMappings")
	public String keyMappings;

	@SerializedName("SystemProperties")
	public String systemProperties;

	@SuppressWarnings("unused") // Gson uses default constructor if present
	public ProfileModel() {
		isNew = false;
	}

	public ProfileModel(File dir) {
		this.dir = dir;
		this.isNew = true;
		version = 1;
		screenWidth = 240;
		screenHeight = 320;
		screenBackgroundColor = 0xD0D0D0;
		screenScaleRatio = 100;
		screenScaleToFit = true;
		screenKeepAspectRatio = true;

		fontSizeSmall = 18;
		fontSizeMedium = 22;
		fontSizeLarge = 26;

		showKeyboard = true;
		touchInput = true;

		vkButtonShape = VirtualKeyboard.ROUND_RECT_SHAPE;
		vkAlpha = 64;

		vkBgColor = 0xD0D0D0;
		vkFgColor = 0x000080;
		vkBgColorSelected = 0x000080;
		vkFgColorSelected = 0xFFFFFF;
		vkOutlineColor = 0xFFFFFF;
		systemProperties = ContextHolder.getAssetAsString("defaults/system.props");
	}
}
