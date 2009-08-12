package org.eclipse.uml2.codegen.ecore.templates.model;

import java.util.*;
import org.eclipse.emf.codegen.ecore.genmodel.*;
import org.eclipse.uml2.codegen.ecore.genmodel.util.UML2GenModelUtil;

public class Class
{
  protected static String nl;
  public static synchronized Class create(String lineSeparator)
  {
    nl = lineSeparator;
    Class result = new Class();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = "";
  protected final String TEXT_2 = "/**";
  protected final String TEXT_3 = NL + " * ";
  protected final String TEXT_4 = NL + " * <copyright>" + NL + " * </copyright>" + NL + " *" + NL + " * ";
  protected final String TEXT_5 = "Id";
  protected final String TEXT_6 = NL + " */";
  protected final String TEXT_7 = NL + "package ";
  protected final String TEXT_8 = ";";
  protected final String TEXT_9 = NL + "package ";
  protected final String TEXT_10 = ";";
  protected final String TEXT_11 = NL;
  protected final String TEXT_12 = NL;
  protected final String TEXT_13 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * A representation of the model object '<em><b>";
  protected final String TEXT_14 = "</b></em>'." + NL + " * <!-- end-user-doc -->";
  protected final String TEXT_15 = NL + " *" + NL + " * <!-- begin-model-doc -->" + NL + " * ";
  protected final String TEXT_16 = NL + " * <!-- end-model-doc -->";
  protected final String TEXT_17 = NL + " *";
  protected final String TEXT_18 = NL + " * <p>" + NL + " * The following features are supported:" + NL + " * <ul>";
  protected final String TEXT_19 = NL + " *   <li>{@link ";
  protected final String TEXT_20 = "#";
  protected final String TEXT_21 = " <em>";
  protected final String TEXT_22 = "</em>}</li>";
  protected final String TEXT_23 = NL + " * </ul>" + NL + " * </p>";
  protected final String TEXT_24 = NL + " *";
  protected final String TEXT_25 = NL + " * @see ";
  protected final String TEXT_26 = "#get";
  protected final String TEXT_27 = "()";
  protected final String TEXT_28 = NL + " * @model ";
  protected final String TEXT_29 = NL + " *        ";
  protected final String TEXT_30 = NL + " * @model";
  protected final String TEXT_31 = NL + " * @extends ";
  protected final String TEXT_32 = NL + " * @generated" + NL + " */";
  protected final String TEXT_33 = NL + "/**" + NL + " * <!-- begin-user-doc -->" + NL + " * An implementation of the model object '<em><b>";
  protected final String TEXT_34 = "</b></em>'." + NL + " * <!-- end-user-doc -->" + NL + " * <p>";
  protected final String TEXT_35 = NL + " * The following features are implemented:" + NL + " * <ul>";
  protected final String TEXT_36 = NL + " *   <li>{@link ";
  protected final String TEXT_37 = "#";
  protected final String TEXT_38 = " <em>";
  protected final String TEXT_39 = "</em>}</li>";
  protected final String TEXT_40 = NL + " * </ul>";
  protected final String TEXT_41 = NL + " * </p>" + NL + " *" + NL + " * @generated" + NL + " */";
  protected final String TEXT_42 = NL + "public";
  protected final String TEXT_43 = " abstract";
  protected final String TEXT_44 = " class ";
  protected final String TEXT_45 = NL + "public interface ";
  protected final String TEXT_46 = NL + "{";
  protected final String TEXT_47 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_48 = " copyright = ";
  protected final String TEXT_49 = ";";
  protected final String TEXT_50 = NL;
  protected final String TEXT_51 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic static final ";
  protected final String TEXT_52 = " mofDriverNumber = \"";
  protected final String TEXT_53 = "\";";
  protected final String TEXT_54 = NL;
  protected final String TEXT_55 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final long serialVersionUID = 1L;" + NL;
  protected final String TEXT_56 = NL + "\t/**" + NL + "\t * An array of objects representing the values of non-primitive features." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected Object[] ";
  protected final String TEXT_57 = ";" + NL;
  protected final String TEXT_58 = NL + "\t/**" + NL + "\t * A bit field representing the indices of non-primitive feature values." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_59 = ";" + NL;
  protected final String TEXT_60 = NL + "\t/**" + NL + "\t * A set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_61 = " = 0;" + NL;
  protected final String TEXT_62 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_63 = "() <em>";
  protected final String TEXT_64 = "</em>}' ";
  protected final String TEXT_65 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_66 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_67 = " ";
  protected final String TEXT_68 = ";" + NL;
  protected final String TEXT_69 = NL + "\t/**" + NL + "\t * The empty value for the '{@link #";
  protected final String TEXT_70 = "() <em>";
  protected final String TEXT_71 = "</em>}' array accessor." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_72 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_73 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_74 = NL + "\tprotected static final ";
  protected final String TEXT_75 = "[] ";
  protected final String TEXT_76 = "_EEMPTY_ARRAY = new ";
  protected final String TEXT_77 = " [0]";
  protected final String TEXT_78 = ";" + NL;
  protected final String TEXT_79 = NL + "\t/**" + NL + "\t * The default value of the '{@link #";
  protected final String TEXT_80 = "() <em>";
  protected final String TEXT_81 = "</em>}' ";
  protected final String TEXT_82 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_83 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */";
  protected final String TEXT_84 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_85 = NL + "\tprotected static final ";
  protected final String TEXT_86 = " ";
  protected final String TEXT_87 = "; // TODO The default value literal \"";
  protected final String TEXT_88 = "\" is not valid.";
  protected final String TEXT_89 = " = ";
  protected final String TEXT_90 = ";";
  protected final String TEXT_91 = NL;
  protected final String TEXT_92 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_93 = " = 0;" + NL;
  protected final String TEXT_94 = NL + "\t/**" + NL + "\t * The offset of the flags representing the value of the '{@link #";
  protected final String TEXT_95 = "() <em>";
  protected final String TEXT_96 = "</em>}' ";
  protected final String TEXT_97 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_98 = "_EFLAG_OFFSET = ";
  protected final String TEXT_99 = ";" + NL + "" + NL + "\t/**" + NL + "\t * The flags representing the default value of the '{@link #";
  protected final String TEXT_100 = "() <em>";
  protected final String TEXT_101 = "</em>}' ";
  protected final String TEXT_102 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_103 = "_EFLAG_DEFAULT = ";
  protected final String TEXT_104 = ".ordinal()";
  protected final String TEXT_105 = ".VALUES.indexOf(";
  protected final String TEXT_106 = ")";
  protected final String TEXT_107 = " << ";
  protected final String TEXT_108 = "_EFLAG_OFFSET;" + NL + "" + NL + "\t/**" + NL + "\t * The array of enumeration values for '{@link ";
  protected final String TEXT_109 = " ";
  protected final String TEXT_110 = "}'" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprivate static final ";
  protected final String TEXT_111 = "[] ";
  protected final String TEXT_112 = "_EFLAG_VALUES = ";
  protected final String TEXT_113 = ".values()";
  protected final String TEXT_114 = "(";
  protected final String TEXT_115 = "[])";
  protected final String TEXT_116 = ".VALUES.toArray(new ";
  protected final String TEXT_117 = "[";
  protected final String TEXT_118 = ".VALUES.size()])";
  protected final String TEXT_119 = ";" + NL;
  protected final String TEXT_120 = NL + "\t/**" + NL + "\t * The flag";
  protected final String TEXT_121 = " representing the value of the '{@link #";
  protected final String TEXT_122 = "() <em>";
  protected final String TEXT_123 = "</em>}' ";
  protected final String TEXT_124 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_125 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_126 = "_EFLAG = ";
  protected final String TEXT_127 = " << ";
  protected final String TEXT_128 = "_EFLAG_OFFSET";
  protected final String TEXT_129 = ";" + NL;
  protected final String TEXT_130 = NL + "\t/**" + NL + "\t * The cached value of the '{@link #";
  protected final String TEXT_131 = "() <em>";
  protected final String TEXT_132 = "</em>}' ";
  protected final String TEXT_133 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_134 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_135 = " ";
  protected final String TEXT_136 = " = ";
  protected final String TEXT_137 = ";" + NL;
  protected final String TEXT_138 = NL + "\t/**" + NL + "\t * An additional set of bit flags representing the values of boolean attributes and whether unsettable features have been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected int ";
  protected final String TEXT_139 = " = 0;" + NL;
  protected final String TEXT_140 = NL + "\t/**" + NL + "\t * The flag representing whether the ";
  protected final String TEXT_141 = " ";
  protected final String TEXT_142 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int ";
  protected final String TEXT_143 = "_ESETFLAG = 1 << ";
  protected final String TEXT_144 = ";" + NL;
  protected final String TEXT_145 = NL + "\t/**" + NL + "\t * This is true if the ";
  protected final String TEXT_146 = " ";
  protected final String TEXT_147 = " has been set." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected boolean ";
  protected final String TEXT_148 = "ESet;" + NL;
  protected final String TEXT_149 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int ";
  protected final String TEXT_150 = " = ";
  protected final String TEXT_151 = ".getFeatureID(";
  protected final String TEXT_152 = ") - ";
  protected final String TEXT_153 = ";" + NL;
  protected final String TEXT_154 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprivate static final int ";
  protected final String TEXT_155 = " = ";
  protected final String TEXT_156 = ".getFeatureID(";
  protected final String TEXT_157 = ") - ";
  protected final String TEXT_158 = ";" + NL;
  protected final String TEXT_159 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\t";
  protected final String TEXT_160 = "public";
  protected final String TEXT_161 = "protected";
  protected final String TEXT_162 = " ";
  protected final String TEXT_163 = "()" + NL + "\t{" + NL + "\t\tsuper();";
  protected final String TEXT_164 = NL + "\t\t";
  protected final String TEXT_165 = " |= ";
  protected final String TEXT_166 = "_EFLAG";
  protected final String TEXT_167 = "_DEFAULT";
  protected final String TEXT_168 = ";";
  protected final String TEXT_169 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_170 = NL + "\t@Override";
  protected final String TEXT_171 = NL + "\tprotected ";
  protected final String TEXT_172 = " eStaticClass()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_173 = ";" + NL + "\t}" + NL;
  protected final String TEXT_174 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_175 = NL + "\t@Override";
  protected final String TEXT_176 = NL + "\tprotected int eStaticFeatureCount()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_177 = ";" + NL + "\t}" + NL;
  protected final String TEXT_178 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_179 = NL + "\t";
  protected final String TEXT_180 = "[] ";
  protected final String TEXT_181 = "();" + NL;
  protected final String TEXT_182 = NL + "\tpublic ";
  protected final String TEXT_183 = "[] ";
  protected final String TEXT_184 = "()" + NL + "\t{";
  protected final String TEXT_185 = NL + "\t\t";
  protected final String TEXT_186 = " list = (";
  protected final String TEXT_187 = ")";
  protected final String TEXT_188 = "();" + NL + "\t\tif (list.isEmpty()) return ";
  protected final String TEXT_189 = "(";
  protected final String TEXT_190 = "[])";
  protected final String TEXT_191 = "_EEMPTY_ARRAY;";
  protected final String TEXT_192 = NL + "\t\tif (";
  protected final String TEXT_193 = " == null || ";
  protected final String TEXT_194 = ".isEmpty()) return ";
  protected final String TEXT_195 = "(";
  protected final String TEXT_196 = "[])";
  protected final String TEXT_197 = "_EEMPTY_ARRAY;" + NL + "\t\t";
  protected final String TEXT_198 = " list = (";
  protected final String TEXT_199 = ")";
  protected final String TEXT_200 = ";";
  protected final String TEXT_201 = NL + "\t\tlist.shrink();" + NL + "\t\treturn (";
  protected final String TEXT_202 = "[])list.data();" + NL + "\t}" + NL;
  protected final String TEXT_203 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_204 = NL + "\t";
  protected final String TEXT_205 = " get";
  protected final String TEXT_206 = "(int index);" + NL;
  protected final String TEXT_207 = NL + "\tpublic ";
  protected final String TEXT_208 = " get";
  protected final String TEXT_209 = "(int index)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_210 = "(";
  protected final String TEXT_211 = ")";
  protected final String TEXT_212 = "().get(index);" + NL + "\t}" + NL;
  protected final String TEXT_213 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_214 = NL + "\tint get";
  protected final String TEXT_215 = "Length();" + NL;
  protected final String TEXT_216 = NL + "\tpublic int get";
  protected final String TEXT_217 = "Length()" + NL + "\t{";
  protected final String TEXT_218 = NL + "\t\treturn ";
  protected final String TEXT_219 = "().size();";
  protected final String TEXT_220 = NL + "\t\treturn ";
  protected final String TEXT_221 = " == null ? 0 : ";
  protected final String TEXT_222 = ".size();";
  protected final String TEXT_223 = NL + "\t}" + NL;
  protected final String TEXT_224 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_225 = NL + "\tvoid set";
  protected final String TEXT_226 = "(";
  protected final String TEXT_227 = "[] new";
  protected final String TEXT_228 = ");" + NL;
  protected final String TEXT_229 = NL + "\tpublic void set";
  protected final String TEXT_230 = "(";
  protected final String TEXT_231 = "[] new";
  protected final String TEXT_232 = ")" + NL + "\t{" + NL + "\t\t((";
  protected final String TEXT_233 = ")";
  protected final String TEXT_234 = "()).setData(new";
  protected final String TEXT_235 = ".length, new";
  protected final String TEXT_236 = ");" + NL + "\t}" + NL;
  protected final String TEXT_237 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_238 = NL + "\tvoid set";
  protected final String TEXT_239 = "(int index, ";
  protected final String TEXT_240 = " element);" + NL;
  protected final String TEXT_241 = NL + "\tpublic void set";
  protected final String TEXT_242 = "(int index, ";
  protected final String TEXT_243 = " element)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_244 = "().set(index, element);" + NL + "\t}" + NL;
  protected final String TEXT_245 = NL + "\t/**" + NL + "\t * Returns the value of the '<em><b>";
  protected final String TEXT_246 = "</b></em>' ";
  protected final String TEXT_247 = ".";
  protected final String TEXT_248 = NL + "\t * The key is of type ";
  protected final String TEXT_249 = "list of {@link ";
  protected final String TEXT_250 = "}";
  protected final String TEXT_251 = "{@link ";
  protected final String TEXT_252 = "}";
  protected final String TEXT_253 = "," + NL + "\t * and the value is of type ";
  protected final String TEXT_254 = "list of {@link ";
  protected final String TEXT_255 = "}";
  protected final String TEXT_256 = "{@link ";
  protected final String TEXT_257 = "}";
  protected final String TEXT_258 = ",";
  protected final String TEXT_259 = NL + "\t * The list contents are of type {@link ";
  protected final String TEXT_260 = "}";
  protected final String TEXT_261 = ".";
  protected final String TEXT_262 = NL + "\t * The default value is <code>";
  protected final String TEXT_263 = "</code>.";
  protected final String TEXT_264 = NL + "\t * The literals are from the enumeration {@link ";
  protected final String TEXT_265 = "}.";
  protected final String TEXT_266 = NL + "\t * It is bidirectional and its opposite is '{@link ";
  protected final String TEXT_267 = "#";
  protected final String TEXT_268 = " <em>";
  protected final String TEXT_269 = "</em>}'.";
  protected final String TEXT_270 = NL + "\t * <p>" + NL + "\t * This feature subsets the following features:" + NL + "\t * <ul>";
  protected final String TEXT_271 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_272 = "#";
  protected final String TEXT_273 = "() <em>";
  protected final String TEXT_274 = "</em>}'</li>";
  protected final String TEXT_275 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_276 = NL + "\t * <p>" + NL + "\t * This feature redefines the following features:" + NL + "\t * <ul>";
  protected final String TEXT_277 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_278 = "#";
  protected final String TEXT_279 = "() <em>";
  protected final String TEXT_280 = "</em>}'</li>";
  protected final String TEXT_281 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_282 = NL + "\t * This feature is a derived union.";
  protected final String TEXT_283 = NL + "\t * <!-- begin-user-doc -->";
  protected final String TEXT_284 = NL + "\t * <p>" + NL + "\t * If the meaning of the '<em>";
  protected final String TEXT_285 = "</em>' ";
  protected final String TEXT_286 = " isn't clear," + NL + "\t * there really should be more of a description here..." + NL + "\t * </p>";
  protected final String TEXT_287 = NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_288 = NL + "\t * <!-- begin-model-doc -->" + NL + "\t * ";
  protected final String TEXT_289 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_290 = NL + "\t * @return the value of the '<em>";
  protected final String TEXT_291 = "</em>' ";
  protected final String TEXT_292 = ".";
  protected final String TEXT_293 = NL + "\t * @see ";
  protected final String TEXT_294 = NL + "\t * @see #isSet";
  protected final String TEXT_295 = "()";
  protected final String TEXT_296 = NL + "\t * @see #unset";
  protected final String TEXT_297 = "()";
  protected final String TEXT_298 = NL + "\t * @see #set";
  protected final String TEXT_299 = "(";
  protected final String TEXT_300 = ")";
  protected final String TEXT_301 = NL + "\t * @see ";
  protected final String TEXT_302 = "#get";
  protected final String TEXT_303 = "()";
  protected final String TEXT_304 = NL + "\t * @see ";
  protected final String TEXT_305 = "#";
  protected final String TEXT_306 = NL + "\t * @model ";
  protected final String TEXT_307 = NL + "\t *        ";
  protected final String TEXT_308 = NL + "\t * @model";
  protected final String TEXT_309 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_310 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_311 = NL + "\t@Override";
  protected final String TEXT_312 = NL + "\t";
  protected final String TEXT_313 = " ";
  protected final String TEXT_314 = "();" + NL;
  protected final String TEXT_315 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_316 = NL + "\tpublic ";
  protected final String TEXT_317 = " ";
  protected final String TEXT_318 = "_";
  protected final String TEXT_319 = "()" + NL + "\t{";
  protected final String TEXT_320 = NL + "\t\treturn ";
  protected final String TEXT_321 = "(";
  protected final String TEXT_322 = "(";
  protected final String TEXT_323 = ")eDynamicGet(";
  protected final String TEXT_324 = ", ";
  protected final String TEXT_325 = ", true, ";
  protected final String TEXT_326 = ")";
  protected final String TEXT_327 = ").";
  protected final String TEXT_328 = "()";
  protected final String TEXT_329 = ";";
  protected final String TEXT_330 = NL + "\t\treturn ";
  protected final String TEXT_331 = "(";
  protected final String TEXT_332 = "(";
  protected final String TEXT_333 = ")eGet(";
  protected final String TEXT_334 = ", true)";
  protected final String TEXT_335 = ").";
  protected final String TEXT_336 = "()";
  protected final String TEXT_337 = ";";
  protected final String TEXT_338 = NL + "\t\t";
  protected final String TEXT_339 = " ";
  protected final String TEXT_340 = " = (";
  protected final String TEXT_341 = ")eVirtualGet(";
  protected final String TEXT_342 = ");";
  protected final String TEXT_343 = NL + "\t\tif (";
  protected final String TEXT_344 = " == null)" + NL + "\t\t{";
  protected final String TEXT_345 = NL + "\t\t\teVirtualSet(";
  protected final String TEXT_346 = ", ";
  protected final String TEXT_347 = " = new ";
  protected final String TEXT_348 = ");";
  protected final String TEXT_349 = NL + "\t\t\t";
  protected final String TEXT_350 = " = new ";
  protected final String TEXT_351 = ";";
  protected final String TEXT_352 = NL + "\t\t}" + NL + "\t\treturn ";
  protected final String TEXT_353 = ";";
  protected final String TEXT_354 = NL + "\t\tif (eContainerFeatureID() != ";
  protected final String TEXT_355 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_356 = ")eContainer();";
  protected final String TEXT_357 = NL + "\t\t";
  protected final String TEXT_358 = " ";
  protected final String TEXT_359 = " = (";
  protected final String TEXT_360 = ")eVirtualGet(";
  protected final String TEXT_361 = ", ";
  protected final String TEXT_362 = ");";
  protected final String TEXT_363 = NL + "\t\tif (";
  protected final String TEXT_364 = " != null && ";
  protected final String TEXT_365 = ".eIsProxy())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_366 = " old";
  protected final String TEXT_367 = " = (";
  protected final String TEXT_368 = ")";
  protected final String TEXT_369 = ";" + NL + "\t\t\t";
  protected final String TEXT_370 = " = ";
  protected final String TEXT_371 = "eResolveProxy(old";
  protected final String TEXT_372 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_373 = " != old";
  protected final String TEXT_374 = ")" + NL + "\t\t\t{";
  protected final String TEXT_375 = NL + "\t\t\t\t";
  protected final String TEXT_376 = " new";
  protected final String TEXT_377 = " = (";
  protected final String TEXT_378 = ")";
  protected final String TEXT_379 = ";";
  protected final String TEXT_380 = NL + "\t\t\t\t";
  protected final String TEXT_381 = " msgs = old";
  protected final String TEXT_382 = ".eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_383 = ", null, null);";
  protected final String TEXT_384 = NL + "\t\t\t\t";
  protected final String TEXT_385 = " msgs =  old";
  protected final String TEXT_386 = ".eInverseRemove(this, ";
  protected final String TEXT_387 = ", ";
  protected final String TEXT_388 = ".class, null);";
  protected final String TEXT_389 = NL + "\t\t\t\tif (new";
  protected final String TEXT_390 = ".eInternalContainer() == null)" + NL + "\t\t\t\t{";
  protected final String TEXT_391 = NL + "\t\t\t\t\tmsgs = new";
  protected final String TEXT_392 = ".eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_393 = ", null, msgs);";
  protected final String TEXT_394 = NL + "\t\t\t\t\tmsgs =  new";
  protected final String TEXT_395 = ".eInverseAdd(this, ";
  protected final String TEXT_396 = ", ";
  protected final String TEXT_397 = ".class, msgs);";
  protected final String TEXT_398 = NL + "\t\t\t\t}" + NL + "\t\t\t\tif (msgs != null) msgs.dispatch();";
  protected final String TEXT_399 = NL + "\t\t\t\teVirtualSet(";
  protected final String TEXT_400 = ", ";
  protected final String TEXT_401 = ");";
  protected final String TEXT_402 = NL + "\t\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\t\teNotify(new ";
  protected final String TEXT_403 = "(this, ";
  protected final String TEXT_404 = ".RESOLVE, ";
  protected final String TEXT_405 = ", old";
  protected final String TEXT_406 = ", ";
  protected final String TEXT_407 = "));";
  protected final String TEXT_408 = NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_409 = NL + "\t\treturn (";
  protected final String TEXT_410 = ")eVirtualGet(";
  protected final String TEXT_411 = ", ";
  protected final String TEXT_412 = ");";
  protected final String TEXT_413 = NL + "\t\treturn (";
  protected final String TEXT_414 = " & ";
  protected final String TEXT_415 = "_EFLAG) != 0;";
  protected final String TEXT_416 = NL + "\t\treturn ";
  protected final String TEXT_417 = "_EFLAG_VALUES[(";
  protected final String TEXT_418 = " & ";
  protected final String TEXT_419 = "_EFLAG) >>> ";
  protected final String TEXT_420 = "_EFLAG_OFFSET];";
  protected final String TEXT_421 = NL + "\t\treturn ";
  protected final String TEXT_422 = ";";
  protected final String TEXT_423 = NL + "\t\t";
  protected final String TEXT_424 = " ";
  protected final String TEXT_425 = " = basicGet";
  protected final String TEXT_426 = "();" + NL + "\t\treturn ";
  protected final String TEXT_427 = " != null && ";
  protected final String TEXT_428 = ".eIsProxy() ? ";
  protected final String TEXT_429 = "eResolveProxy((";
  protected final String TEXT_430 = ")";
  protected final String TEXT_431 = ") : ";
  protected final String TEXT_432 = ";";
  protected final String TEXT_433 = NL + "\t\treturn new ";
  protected final String TEXT_434 = "((";
  protected final String TEXT_435 = ".Internal)((";
  protected final String TEXT_436 = ".Internal.Wrapper)get";
  protected final String TEXT_437 = "()).featureMap().";
  protected final String TEXT_438 = "list(";
  protected final String TEXT_439 = "));";
  protected final String TEXT_440 = NL + "\t\treturn (";
  protected final String TEXT_441 = ")get";
  protected final String TEXT_442 = "().";
  protected final String TEXT_443 = "list(";
  protected final String TEXT_444 = ");";
  protected final String TEXT_445 = NL + "\t\treturn ((";
  protected final String TEXT_446 = ".Internal.Wrapper)get";
  protected final String TEXT_447 = "()).featureMap().list(";
  protected final String TEXT_448 = ");";
  protected final String TEXT_449 = NL + "\t\treturn get";
  protected final String TEXT_450 = "().list(";
  protected final String TEXT_451 = ");";
  protected final String TEXT_452 = NL + "\t\treturn ";
  protected final String TEXT_453 = "(";
  protected final String TEXT_454 = "(";
  protected final String TEXT_455 = ")";
  protected final String TEXT_456 = "((";
  protected final String TEXT_457 = ".Internal.Wrapper)get";
  protected final String TEXT_458 = "()).featureMap().get(";
  protected final String TEXT_459 = ", true)";
  protected final String TEXT_460 = ").";
  protected final String TEXT_461 = "()";
  protected final String TEXT_462 = ";";
  protected final String TEXT_463 = NL + "\t\treturn ";
  protected final String TEXT_464 = "(";
  protected final String TEXT_465 = "(";
  protected final String TEXT_466 = ")";
  protected final String TEXT_467 = "get";
  protected final String TEXT_468 = "().get(";
  protected final String TEXT_469 = ", true)";
  protected final String TEXT_470 = ").";
  protected final String TEXT_471 = "()";
  protected final String TEXT_472 = ";";
  protected final String TEXT_473 = NL + "\t\t";
  protected final String TEXT_474 = NL + "\t\t";
  protected final String TEXT_475 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_476 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_477 = NL + "\t\t\t";
  protected final String TEXT_478 = " result = (";
  protected final String TEXT_479 = ") cache.get(";
  protected final String TEXT_480 = "eResource(), ";
  protected final String TEXT_481 = "this, ";
  protected final String TEXT_482 = ");" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_483 = "eResource(), ";
  protected final String TEXT_484 = "this, ";
  protected final String TEXT_485 = ", result = ";
  protected final String TEXT_486 = "new ";
  protected final String TEXT_487 = "(";
  protected final String TEXT_488 = ".";
  protected final String TEXT_489 = "(this)";
  protected final String TEXT_490 = ")";
  protected final String TEXT_491 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_492 = ".";
  protected final String TEXT_493 = "()";
  protected final String TEXT_494 = ";" + NL + "\t\t}";
  protected final String TEXT_495 = NL + "\t\treturn ";
  protected final String TEXT_496 = ".";
  protected final String TEXT_497 = "(this);";
  protected final String TEXT_498 = NL + "\t\t";
  protected final String TEXT_499 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {" + NL + "\t\t\t";
  protected final String TEXT_500 = " eResource = eResource();";
  protected final String TEXT_501 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_502 = NL + "\t\t\t";
  protected final String TEXT_503 = " ";
  protected final String TEXT_504 = " = (";
  protected final String TEXT_505 = ") cache.get(eResource, this, ";
  protected final String TEXT_506 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_507 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(eResource, this, ";
  protected final String TEXT_508 = ", ";
  protected final String TEXT_509 = " = new ";
  protected final String TEXT_510 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_511 = ";" + NL + "\t\t}";
  protected final String TEXT_512 = NL + "\t\treturn new ";
  protected final String TEXT_513 = ";";
  protected final String TEXT_514 = NL + "\t\t";
  protected final String TEXT_515 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null) {";
  protected final String TEXT_516 = NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_517 = " method = getClass().getMethod(\"";
  protected final String TEXT_518 = "\", null);";
  protected final String TEXT_519 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_520 = NL + "\t\t\t\t";
  protected final String TEXT_521 = " ";
  protected final String TEXT_522 = " = (";
  protected final String TEXT_523 = ") cache.get(eResource(), this, method);" + NL + "\t\t\t\tif (";
  protected final String TEXT_524 = " == null)" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_525 = " union = ";
  protected final String TEXT_526 = "Helper(new ";
  protected final String TEXT_527 = ".FastCompare());" + NL + "\t\t\t\t\tcache.put(eResource(), this, method, ";
  protected final String TEXT_528 = " = new ";
  protected final String TEXT_529 = "(this, ";
  protected final String TEXT_530 = "null";
  protected final String TEXT_531 = ", union.size(), union.toArray()));" + NL + "\t\t\t\t}" + NL + "\t\t\t\treturn ";
  protected final String TEXT_532 = ";" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_533 = " nsme)" + NL + "\t\t\t{" + NL + "\t\t\t\t// ignore" + NL + "\t\t\t}";
  protected final String TEXT_534 = NL + "\t\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_535 = NL + "\t\t\t";
  protected final String TEXT_536 = " ";
  protected final String TEXT_537 = " = (";
  protected final String TEXT_538 = ") cache.get(eResource(), this, ";
  protected final String TEXT_539 = ");" + NL + "\t\t\tif (";
  protected final String TEXT_540 = " == null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_541 = " union = ";
  protected final String TEXT_542 = "Helper(new ";
  protected final String TEXT_543 = ".FastCompare());" + NL + "\t\t\t\tcache.put(eResource(), this, ";
  protected final String TEXT_544 = ", ";
  protected final String TEXT_545 = " = new ";
  protected final String TEXT_546 = "(this, ";
  protected final String TEXT_547 = "null";
  protected final String TEXT_548 = ", union.size(), union.toArray()));" + NL + "\t\t\t}" + NL + "\t\t\treturn ";
  protected final String TEXT_549 = ";";
  protected final String TEXT_550 = NL + "\t\t}";
  protected final String TEXT_551 = NL + "\t\t";
  protected final String TEXT_552 = " union = ";
  protected final String TEXT_553 = "Helper(new ";
  protected final String TEXT_554 = ".FastCompare());" + NL + "\t\treturn new ";
  protected final String TEXT_555 = "(this, ";
  protected final String TEXT_556 = "null";
  protected final String TEXT_557 = ", union.size(), union.toArray());";
  protected final String TEXT_558 = NL + "\t\tif (isSet";
  protected final String TEXT_559 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_560 = "();" + NL + "\t\t}";
  protected final String TEXT_561 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_562 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_563 = "();" + NL + "\t\t}";
  protected final String TEXT_564 = NL + "\t\t";
  protected final String TEXT_565 = " ";
  protected final String TEXT_566 = " = ";
  protected final String TEXT_567 = "();" + NL + "\t\tif (";
  protected final String TEXT_568 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_569 = ";" + NL + "\t\t}";
  protected final String TEXT_570 = NL + "\t\treturn ";
  protected final String TEXT_571 = "super.";
  protected final String TEXT_572 = "()";
  protected final String TEXT_573 = "null";
  protected final String TEXT_574 = ";";
  protected final String TEXT_575 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_576 = "' ";
  protected final String TEXT_577 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_578 = NL + "\t}" + NL;
  protected final String TEXT_579 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_580 = NL + "\t@Override";
  protected final String TEXT_581 = NL + "\tpublic ";
  protected final String TEXT_582 = " basicGet";
  protected final String TEXT_583 = "()" + NL + "\t{";
  protected final String TEXT_584 = NL + "\t\treturn (";
  protected final String TEXT_585 = ")eDynamicGet(";
  protected final String TEXT_586 = ", ";
  protected final String TEXT_587 = ", false, ";
  protected final String TEXT_588 = ");";
  protected final String TEXT_589 = NL + "\t\tif (eContainerFeatureID() != ";
  protected final String TEXT_590 = ") return null;" + NL + "\t\treturn (";
  protected final String TEXT_591 = ")eInternalContainer();";
  protected final String TEXT_592 = NL + "\t\treturn (";
  protected final String TEXT_593 = ")eVirtualGet(";
  protected final String TEXT_594 = ");";
  protected final String TEXT_595 = NL + "\t\treturn ";
  protected final String TEXT_596 = ";";
  protected final String TEXT_597 = NL + "\t\treturn (";
  protected final String TEXT_598 = ")((";
  protected final String TEXT_599 = ".Internal.Wrapper)get";
  protected final String TEXT_600 = "()).featureMap().get(";
  protected final String TEXT_601 = ", false);";
  protected final String TEXT_602 = NL + "\t\treturn (";
  protected final String TEXT_603 = ")get";
  protected final String TEXT_604 = "().get(";
  protected final String TEXT_605 = ", false);";
  protected final String TEXT_606 = NL + "\t\treturn ";
  protected final String TEXT_607 = ".";
  protected final String TEXT_608 = "(this);";
  protected final String TEXT_609 = NL + "\t\tif (isSet";
  protected final String TEXT_610 = "())" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_611 = "basicGet";
  protected final String TEXT_612 = "();" + NL + "\t\t}";
  protected final String TEXT_613 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_614 = "))" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_615 = "basicGet";
  protected final String TEXT_616 = "();" + NL + "\t\t}";
  protected final String TEXT_617 = NL + "\t\t";
  protected final String TEXT_618 = " ";
  protected final String TEXT_619 = " = ";
  protected final String TEXT_620 = "basicGet";
  protected final String TEXT_621 = "();\t\t\t" + NL + "\t\tif (";
  protected final String TEXT_622 = " != null)" + NL + "\t\t{" + NL + "\t\t\treturn ";
  protected final String TEXT_623 = ";" + NL + "\t\t}";
  protected final String TEXT_624 = NL + "\t\treturn ";
  protected final String TEXT_625 = "super.basicGet";
  protected final String TEXT_626 = "()";
  protected final String TEXT_627 = "null";
  protected final String TEXT_628 = ";";
  protected final String TEXT_629 = NL + "\t\t// TODO: implement this method to return the '";
  protected final String TEXT_630 = "' ";
  protected final String TEXT_631 = NL + "\t\t// -> do not perform proxy resolution" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_632 = NL + "\t}" + NL;
  protected final String TEXT_633 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_634 = NL + "\t@Override";
  protected final String TEXT_635 = NL + "\tpublic ";
  protected final String TEXT_636 = " basicSet";
  protected final String TEXT_637 = "(";
  protected final String TEXT_638 = " new";
  protected final String TEXT_639 = ", ";
  protected final String TEXT_640 = " msgs)" + NL + "\t{";
  protected final String TEXT_641 = NL + "\t\tmsgs = eBasicSetContainer((";
  protected final String TEXT_642 = ")new";
  protected final String TEXT_643 = ", ";
  protected final String TEXT_644 = ", msgs);";
  protected final String TEXT_645 = NL + "\t\t";
  protected final String TEXT_646 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_647 = NL + "\t\t\t";
  protected final String TEXT_648 = " ";
  protected final String TEXT_649 = " = ";
  protected final String TEXT_650 = "();";
  protected final String TEXT_651 = NL + "\t\t\tObject ";
  protected final String TEXT_652 = " = eVirtualGet(";
  protected final String TEXT_653 = ");";
  protected final String TEXT_654 = NL + "\t\t\tif (";
  protected final String TEXT_655 = " != null && ";
  protected final String TEXT_656 = " != new";
  protected final String TEXT_657 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_658 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_659 = NL + "\t\t\tif (new";
  protected final String TEXT_660 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_661 = NL + "\t\t\t\t";
  protected final String TEXT_662 = " ";
  protected final String TEXT_663 = " = ";
  protected final String TEXT_664 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_665 = ".contains(new";
  protected final String TEXT_666 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_667 = ".add(new";
  protected final String TEXT_668 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_669 = NL + "\t\t\t\t";
  protected final String TEXT_670 = " ";
  protected final String TEXT_671 = " = ";
  protected final String TEXT_672 = "();";
  protected final String TEXT_673 = NL + "\t\t\t\tObject ";
  protected final String TEXT_674 = " = eVirtualGet(";
  protected final String TEXT_675 = ");";
  protected final String TEXT_676 = NL + "\t\t\t\tif (new";
  protected final String TEXT_677 = " != ";
  protected final String TEXT_678 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_679 = "(new";
  protected final String TEXT_680 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_681 = NL + "\t\t\t}";
  protected final String TEXT_682 = NL + "\t\t}";
  protected final String TEXT_683 = NL + "\t\treturn msgs;";
  protected final String TEXT_684 = NL + "\t\tmsgs = eDynamicInverseAdd((";
  protected final String TEXT_685 = ")new";
  protected final String TEXT_686 = ", ";
  protected final String TEXT_687 = ", msgs);";
  protected final String TEXT_688 = NL + "\t\t";
  protected final String TEXT_689 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_690 = NL + "\t\t\t";
  protected final String TEXT_691 = " ";
  protected final String TEXT_692 = " = ";
  protected final String TEXT_693 = "();";
  protected final String TEXT_694 = NL + "\t\t\tObject ";
  protected final String TEXT_695 = " = eVirtualGet(";
  protected final String TEXT_696 = ");";
  protected final String TEXT_697 = NL + "\t\t\tif (";
  protected final String TEXT_698 = " != null && ";
  protected final String TEXT_699 = " != new";
  protected final String TEXT_700 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_701 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_702 = NL + "\t\t\tif (new";
  protected final String TEXT_703 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_704 = NL + "\t\t\t\t";
  protected final String TEXT_705 = " ";
  protected final String TEXT_706 = " = ";
  protected final String TEXT_707 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_708 = ".contains(new";
  protected final String TEXT_709 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_710 = ".add(new";
  protected final String TEXT_711 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_712 = NL + "\t\t\t\t";
  protected final String TEXT_713 = " ";
  protected final String TEXT_714 = " = ";
  protected final String TEXT_715 = "();";
  protected final String TEXT_716 = NL + "\t\t\t\tObject ";
  protected final String TEXT_717 = " = eVirtualGet(";
  protected final String TEXT_718 = ");";
  protected final String TEXT_719 = NL + "\t\t\t\tif (new";
  protected final String TEXT_720 = " != ";
  protected final String TEXT_721 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_722 = "(new";
  protected final String TEXT_723 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_724 = NL + "\t\t\t}";
  protected final String TEXT_725 = NL + "\t\t}";
  protected final String TEXT_726 = NL + "\t\treturn msgs;";
  protected final String TEXT_727 = NL + "\t\tObject old";
  protected final String TEXT_728 = " = eVirtualSet(";
  protected final String TEXT_729 = ", new";
  protected final String TEXT_730 = ");";
  protected final String TEXT_731 = NL + "\t\t";
  protected final String TEXT_732 = " old";
  protected final String TEXT_733 = " = ";
  protected final String TEXT_734 = ";" + NL + "\t\t";
  protected final String TEXT_735 = " = new";
  protected final String TEXT_736 = ";";
  protected final String TEXT_737 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_738 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_739 = NL + "\t\tboolean old";
  protected final String TEXT_740 = "ESet = (";
  protected final String TEXT_741 = " & ";
  protected final String TEXT_742 = "_ESETFLAG) != 0;";
  protected final String TEXT_743 = NL + "\t\t";
  protected final String TEXT_744 = " |= ";
  protected final String TEXT_745 = "_ESETFLAG;";
  protected final String TEXT_746 = NL + "\t\tboolean old";
  protected final String TEXT_747 = "ESet = ";
  protected final String TEXT_748 = "ESet;";
  protected final String TEXT_749 = NL + "\t\t";
  protected final String TEXT_750 = "ESet = true;";
  protected final String TEXT_751 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{";
  protected final String TEXT_752 = NL + "\t\t\t";
  protected final String TEXT_753 = " notification = new ";
  protected final String TEXT_754 = "(this, ";
  protected final String TEXT_755 = ".SET, ";
  protected final String TEXT_756 = ", ";
  protected final String TEXT_757 = "isSetChange ? null : old";
  protected final String TEXT_758 = "old";
  protected final String TEXT_759 = ", new";
  protected final String TEXT_760 = ", ";
  protected final String TEXT_761 = "isSetChange";
  protected final String TEXT_762 = "!old";
  protected final String TEXT_763 = "ESet";
  protected final String TEXT_764 = ");";
  protected final String TEXT_765 = NL + "\t\t\t";
  protected final String TEXT_766 = " notification = new ";
  protected final String TEXT_767 = "(this, ";
  protected final String TEXT_768 = ".SET, ";
  protected final String TEXT_769 = ", ";
  protected final String TEXT_770 = "old";
  protected final String TEXT_771 = " == EVIRTUAL_NO_VALUE ? null : old";
  protected final String TEXT_772 = "old";
  protected final String TEXT_773 = ", new";
  protected final String TEXT_774 = ");";
  protected final String TEXT_775 = NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}";
  protected final String TEXT_776 = NL + "\t\t";
  protected final String TEXT_777 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_778 = NL + "\t\t\t";
  protected final String TEXT_779 = " ";
  protected final String TEXT_780 = " = ";
  protected final String TEXT_781 = "();";
  protected final String TEXT_782 = NL + "\t\t\tObject ";
  protected final String TEXT_783 = " = eVirtualGet(";
  protected final String TEXT_784 = ");";
  protected final String TEXT_785 = NL + "\t\t\tif (";
  protected final String TEXT_786 = " != null && ";
  protected final String TEXT_787 = " != new";
  protected final String TEXT_788 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_789 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_790 = NL + "\t\t\tif (new";
  protected final String TEXT_791 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_792 = NL + "\t\t\t\t";
  protected final String TEXT_793 = " ";
  protected final String TEXT_794 = " = ";
  protected final String TEXT_795 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_796 = ".contains(new";
  protected final String TEXT_797 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_798 = ".add(new";
  protected final String TEXT_799 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_800 = NL + "\t\t\t\t";
  protected final String TEXT_801 = " ";
  protected final String TEXT_802 = " = ";
  protected final String TEXT_803 = "();";
  protected final String TEXT_804 = NL + "\t\t\t\tObject ";
  protected final String TEXT_805 = " = eVirtualGet(";
  protected final String TEXT_806 = ");";
  protected final String TEXT_807 = NL + "\t\t\t\tif (new";
  protected final String TEXT_808 = " != ";
  protected final String TEXT_809 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_810 = "(new";
  protected final String TEXT_811 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_812 = NL + "\t\t\t}";
  protected final String TEXT_813 = NL + "\t\t}";
  protected final String TEXT_814 = NL + "\t\treturn msgs;";
  protected final String TEXT_815 = NL + "\t\treturn ((";
  protected final String TEXT_816 = ".Internal)((";
  protected final String TEXT_817 = ".Internal.Wrapper)get";
  protected final String TEXT_818 = "()).featureMap()).basicAdd(";
  protected final String TEXT_819 = ", new";
  protected final String TEXT_820 = ", msgs);";
  protected final String TEXT_821 = NL + "\t\treturn ((";
  protected final String TEXT_822 = ".Internal)get";
  protected final String TEXT_823 = "()).basicAdd(";
  protected final String TEXT_824 = ", new";
  protected final String TEXT_825 = ", msgs);";
  protected final String TEXT_826 = NL + "\t\t// TODO: implement this method to set the contained '";
  protected final String TEXT_827 = "' ";
  protected final String TEXT_828 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_829 = NL + "\t}" + NL;
  protected final String TEXT_830 = NL + "\t/**" + NL + "\t * Sets the value of the '{@link ";
  protected final String TEXT_831 = "#";
  protected final String TEXT_832 = " <em>";
  protected final String TEXT_833 = "</em>}' ";
  protected final String TEXT_834 = ".";
  protected final String TEXT_835 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param value the new value of the '<em>";
  protected final String TEXT_836 = "</em>' ";
  protected final String TEXT_837 = ".";
  protected final String TEXT_838 = NL + "\t * @see ";
  protected final String TEXT_839 = NL + "\t * @see #isSet";
  protected final String TEXT_840 = "()";
  protected final String TEXT_841 = NL + "\t * @see #unset";
  protected final String TEXT_842 = "()";
  protected final String TEXT_843 = NL + "\t * @see #";
  protected final String TEXT_844 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_845 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_846 = NL + "\t@Override";
  protected final String TEXT_847 = NL + "\tvoid set";
  protected final String TEXT_848 = "(";
  protected final String TEXT_849 = " value);" + NL;
  protected final String TEXT_850 = NL + "\tpublic void set";
  protected final String TEXT_851 = "_";
  protected final String TEXT_852 = "(";
  protected final String TEXT_853 = " ";
  protected final String TEXT_854 = ")" + NL + "\t{";
  protected final String TEXT_855 = NL + "\t\tnew";
  protected final String TEXT_856 = " = new";
  protected final String TEXT_857 = " == null ? ";
  protected final String TEXT_858 = " : new";
  protected final String TEXT_859 = ";";
  protected final String TEXT_860 = NL + "\t\teDynamicSet(";
  protected final String TEXT_861 = ", ";
  protected final String TEXT_862 = ", ";
  protected final String TEXT_863 = "new ";
  protected final String TEXT_864 = "(";
  protected final String TEXT_865 = "new";
  protected final String TEXT_866 = ")";
  protected final String TEXT_867 = ");";
  protected final String TEXT_868 = NL + "\t\teSet(";
  protected final String TEXT_869 = ", ";
  protected final String TEXT_870 = "new ";
  protected final String TEXT_871 = "(";
  protected final String TEXT_872 = "new";
  protected final String TEXT_873 = ")";
  protected final String TEXT_874 = ");";
  protected final String TEXT_875 = NL + "\t\tif (new";
  protected final String TEXT_876 = " != eInternalContainer() || (eContainerFeatureID() != ";
  protected final String TEXT_877 = " && new";
  protected final String TEXT_878 = " != null))" + NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_879 = ".isAncestor(this, ";
  protected final String TEXT_880 = "new";
  protected final String TEXT_881 = "))" + NL + "\t\t\t\tthrow new ";
  protected final String TEXT_882 = "(\"Recursive containment not allowed for \" + toString());";
  protected final String TEXT_883 = NL + "\t\t\t";
  protected final String TEXT_884 = " msgs = null;" + NL + "\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_885 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_886 = ")new";
  protected final String TEXT_887 = ").eInverseAdd(this, ";
  protected final String TEXT_888 = ", ";
  protected final String TEXT_889 = ".class, msgs);" + NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_890 = "(";
  protected final String TEXT_891 = "new";
  protected final String TEXT_892 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_893 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_894 = "(this, ";
  protected final String TEXT_895 = ".SET, ";
  protected final String TEXT_896 = ", new";
  protected final String TEXT_897 = ", new";
  protected final String TEXT_898 = "));";
  protected final String TEXT_899 = NL + "\t\t";
  protected final String TEXT_900 = " ";
  protected final String TEXT_901 = " = (";
  protected final String TEXT_902 = ")eVirtualGet(";
  protected final String TEXT_903 = ");";
  protected final String TEXT_904 = NL + "\t\tif (new";
  protected final String TEXT_905 = " != ";
  protected final String TEXT_906 = ")" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_907 = " msgs = null;" + NL + "\t\t\tif (";
  protected final String TEXT_908 = " != null)";
  protected final String TEXT_909 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_910 = ")";
  protected final String TEXT_911 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_912 = ", null, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_913 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_914 = ")new";
  protected final String TEXT_915 = ").eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_916 = ", null, msgs);";
  protected final String TEXT_917 = NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_918 = ")";
  protected final String TEXT_919 = ").eInverseRemove(this, ";
  protected final String TEXT_920 = ", ";
  protected final String TEXT_921 = ".class, msgs);" + NL + "\t\t\tif (new";
  protected final String TEXT_922 = " != null)" + NL + "\t\t\t\tmsgs = ((";
  protected final String TEXT_923 = ")new";
  protected final String TEXT_924 = ").eInverseAdd(this, ";
  protected final String TEXT_925 = ", ";
  protected final String TEXT_926 = ".class, msgs);";
  protected final String TEXT_927 = NL + "\t\t\tmsgs = basicSet";
  protected final String TEXT_928 = "(";
  protected final String TEXT_929 = "new";
  protected final String TEXT_930 = ", msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}";
  protected final String TEXT_931 = NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_932 = NL + "\t\t\tboolean old";
  protected final String TEXT_933 = "ESet = eVirtualIsSet(";
  protected final String TEXT_934 = ");";
  protected final String TEXT_935 = NL + "\t\t\tboolean old";
  protected final String TEXT_936 = "ESet = (";
  protected final String TEXT_937 = " & ";
  protected final String TEXT_938 = "_ESETFLAG) != 0;";
  protected final String TEXT_939 = NL + "\t\t\t";
  protected final String TEXT_940 = " |= ";
  protected final String TEXT_941 = "_ESETFLAG;";
  protected final String TEXT_942 = NL + "\t\t\tboolean old";
  protected final String TEXT_943 = "ESet = ";
  protected final String TEXT_944 = "ESet;";
  protected final String TEXT_945 = NL + "\t\t\t";
  protected final String TEXT_946 = "ESet = true;";
  protected final String TEXT_947 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_948 = "(this, ";
  protected final String TEXT_949 = ".SET, ";
  protected final String TEXT_950 = ", new";
  protected final String TEXT_951 = ", new";
  protected final String TEXT_952 = ", !old";
  protected final String TEXT_953 = "ESet));";
  protected final String TEXT_954 = NL + "\t\t}";
  protected final String TEXT_955 = NL + "\t\telse if (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_956 = "(this, ";
  protected final String TEXT_957 = ".SET, ";
  protected final String TEXT_958 = ", new";
  protected final String TEXT_959 = ", new";
  protected final String TEXT_960 = "));";
  protected final String TEXT_961 = NL + "\t\t";
  protected final String TEXT_962 = " old";
  protected final String TEXT_963 = " = (";
  protected final String TEXT_964 = " & ";
  protected final String TEXT_965 = "_EFLAG) != 0;";
  protected final String TEXT_966 = NL + "\t\t";
  protected final String TEXT_967 = " old";
  protected final String TEXT_968 = " = ";
  protected final String TEXT_969 = "_EFLAG_VALUES[(";
  protected final String TEXT_970 = " & ";
  protected final String TEXT_971 = "_EFLAG) >>> ";
  protected final String TEXT_972 = "_EFLAG_OFFSET];";
  protected final String TEXT_973 = NL + "\t\tif (new";
  protected final String TEXT_974 = ") ";
  protected final String TEXT_975 = " |= ";
  protected final String TEXT_976 = "_EFLAG; else ";
  protected final String TEXT_977 = " &= ~";
  protected final String TEXT_978 = "_EFLAG;";
  protected final String TEXT_979 = NL + "\t\tif (new";
  protected final String TEXT_980 = " == null) new";
  protected final String TEXT_981 = " = ";
  protected final String TEXT_982 = "_EDEFAULT;" + NL + "\t\t";
  protected final String TEXT_983 = " = ";
  protected final String TEXT_984 = " & ~";
  protected final String TEXT_985 = "_EFLAG | ";
  protected final String TEXT_986 = "new";
  protected final String TEXT_987 = ".ordinal()";
  protected final String TEXT_988 = ".VALUES.indexOf(new";
  protected final String TEXT_989 = ")";
  protected final String TEXT_990 = " << ";
  protected final String TEXT_991 = "_EFLAG_OFFSET;";
  protected final String TEXT_992 = NL + "\t\t";
  protected final String TEXT_993 = " old";
  protected final String TEXT_994 = " = ";
  protected final String TEXT_995 = ";";
  protected final String TEXT_996 = NL + "\t\t";
  protected final String TEXT_997 = " ";
  protected final String TEXT_998 = " = new";
  protected final String TEXT_999 = " == null ? ";
  protected final String TEXT_1000 = " : new";
  protected final String TEXT_1001 = ";";
  protected final String TEXT_1002 = NL + "\t\t";
  protected final String TEXT_1003 = " = new";
  protected final String TEXT_1004 = " == null ? ";
  protected final String TEXT_1005 = " : new";
  protected final String TEXT_1006 = ";";
  protected final String TEXT_1007 = NL + "\t\t";
  protected final String TEXT_1008 = " ";
  protected final String TEXT_1009 = " = ";
  protected final String TEXT_1010 = "new";
  protected final String TEXT_1011 = ";";
  protected final String TEXT_1012 = NL + "\t\t";
  protected final String TEXT_1013 = " = ";
  protected final String TEXT_1014 = "new";
  protected final String TEXT_1015 = ";";
  protected final String TEXT_1016 = NL + "\t\tObject old";
  protected final String TEXT_1017 = " = eVirtualSet(";
  protected final String TEXT_1018 = ", ";
  protected final String TEXT_1019 = ");";
  protected final String TEXT_1020 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1021 = " == EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1022 = NL + "\t\tboolean old";
  protected final String TEXT_1023 = "ESet = (";
  protected final String TEXT_1024 = " & ";
  protected final String TEXT_1025 = "_ESETFLAG) != 0;";
  protected final String TEXT_1026 = NL + "\t\t";
  protected final String TEXT_1027 = " |= ";
  protected final String TEXT_1028 = "_ESETFLAG;";
  protected final String TEXT_1029 = NL + "\t\tboolean old";
  protected final String TEXT_1030 = "ESet = ";
  protected final String TEXT_1031 = "ESet;";
  protected final String TEXT_1032 = NL + "\t\t";
  protected final String TEXT_1033 = "ESet = true;";
  protected final String TEXT_1034 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1035 = "(this, ";
  protected final String TEXT_1036 = ".SET, ";
  protected final String TEXT_1037 = ", ";
  protected final String TEXT_1038 = "isSetChange ? ";
  protected final String TEXT_1039 = " : old";
  protected final String TEXT_1040 = "old";
  protected final String TEXT_1041 = ", ";
  protected final String TEXT_1042 = "new";
  protected final String TEXT_1043 = ", ";
  protected final String TEXT_1044 = "isSetChange";
  protected final String TEXT_1045 = "!old";
  protected final String TEXT_1046 = "ESet";
  protected final String TEXT_1047 = "));";
  protected final String TEXT_1048 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1049 = "(this, ";
  protected final String TEXT_1050 = ".SET, ";
  protected final String TEXT_1051 = ", ";
  protected final String TEXT_1052 = "old";
  protected final String TEXT_1053 = " == EVIRTUAL_NO_VALUE ? ";
  protected final String TEXT_1054 = " : old";
  protected final String TEXT_1055 = "old";
  protected final String TEXT_1056 = ", ";
  protected final String TEXT_1057 = "new";
  protected final String TEXT_1058 = "));";
  protected final String TEXT_1059 = NL + "\t\t";
  protected final String TEXT_1060 = ".Internal eInternalResource = eInternalResource();" + NL + "\t\tif (eInternalResource == null || !eInternalResource.isLoading()) {";
  protected final String TEXT_1061 = NL + "\t\t\t";
  protected final String TEXT_1062 = " ";
  protected final String TEXT_1063 = " = ";
  protected final String TEXT_1064 = "();";
  protected final String TEXT_1065 = NL + "\t\t\tObject ";
  protected final String TEXT_1066 = " = eVirtualGet(";
  protected final String TEXT_1067 = ");";
  protected final String TEXT_1068 = NL + "\t\t\tif (";
  protected final String TEXT_1069 = " != null && ";
  protected final String TEXT_1070 = " != new";
  protected final String TEXT_1071 = ")" + NL + "\t\t\t{" + NL + "\t\t\t\tset";
  protected final String TEXT_1072 = "(null);" + NL + "\t\t\t}";
  protected final String TEXT_1073 = NL + "\t\t\tif (new";
  protected final String TEXT_1074 = " != null)" + NL + "\t\t\t{";
  protected final String TEXT_1075 = NL + "\t\t\t\t";
  protected final String TEXT_1076 = " ";
  protected final String TEXT_1077 = " = ";
  protected final String TEXT_1078 = "();" + NL + "\t\t\t\tif (!";
  protected final String TEXT_1079 = ".contains(new";
  protected final String TEXT_1080 = "))" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\t";
  protected final String TEXT_1081 = ".add(new";
  protected final String TEXT_1082 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_1083 = NL + "\t\t\t\t";
  protected final String TEXT_1084 = " ";
  protected final String TEXT_1085 = " = ";
  protected final String TEXT_1086 = "();";
  protected final String TEXT_1087 = NL + "\t\t\t\tObject ";
  protected final String TEXT_1088 = " = eVirtualGet(";
  protected final String TEXT_1089 = ");";
  protected final String TEXT_1090 = NL + "\t\t\t\tif (new";
  protected final String TEXT_1091 = " != ";
  protected final String TEXT_1092 = ")" + NL + "\t\t\t\t{" + NL + "\t\t\t\t\tset";
  protected final String TEXT_1093 = "(new";
  protected final String TEXT_1094 = ");" + NL + "\t\t\t\t}";
  protected final String TEXT_1095 = NL + "\t\t\t}";
  protected final String TEXT_1096 = NL + "\t\t}";
  protected final String TEXT_1097 = NL + "\t\t((";
  protected final String TEXT_1098 = ".Internal)((";
  protected final String TEXT_1099 = ".Internal.Wrapper)get";
  protected final String TEXT_1100 = "()).featureMap()).set(";
  protected final String TEXT_1101 = ", ";
  protected final String TEXT_1102 = "new ";
  protected final String TEXT_1103 = "(";
  protected final String TEXT_1104 = "new";
  protected final String TEXT_1105 = ")";
  protected final String TEXT_1106 = ");";
  protected final String TEXT_1107 = NL + "\t\t((";
  protected final String TEXT_1108 = ".Internal)get";
  protected final String TEXT_1109 = "()).set(";
  protected final String TEXT_1110 = ", ";
  protected final String TEXT_1111 = "new ";
  protected final String TEXT_1112 = "(";
  protected final String TEXT_1113 = "new";
  protected final String TEXT_1114 = ")";
  protected final String TEXT_1115 = ");";
  protected final String TEXT_1116 = NL + "\t\t";
  protected final String TEXT_1117 = NL + "\t\t";
  protected final String TEXT_1118 = ".";
  protected final String TEXT_1119 = "(this, ";
  protected final String TEXT_1120 = ");";
  protected final String TEXT_1121 = NL + "\t\t// TODO: implement this method to set the '";
  protected final String TEXT_1122 = "' ";
  protected final String TEXT_1123 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1124 = NL + "\t}" + NL;
  protected final String TEXT_1125 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1126 = NL + "\t@Override";
  protected final String TEXT_1127 = NL + "\tpublic ";
  protected final String TEXT_1128 = " basicUnset";
  protected final String TEXT_1129 = "(";
  protected final String TEXT_1130 = " msgs)" + NL + "\t{";
  protected final String TEXT_1131 = NL + "\t\treturn eDynamicInverseRemove((";
  protected final String TEXT_1132 = ")";
  protected final String TEXT_1133 = "basicGet";
  protected final String TEXT_1134 = "(), ";
  protected final String TEXT_1135 = ", msgs);";
  protected final String TEXT_1136 = "Object old";
  protected final String TEXT_1137 = " = ";
  protected final String TEXT_1138 = "eVirtualUnset(";
  protected final String TEXT_1139 = ");";
  protected final String TEXT_1140 = NL + "\t\t";
  protected final String TEXT_1141 = " old";
  protected final String TEXT_1142 = " = ";
  protected final String TEXT_1143 = ";";
  protected final String TEXT_1144 = NL + "\t\t";
  protected final String TEXT_1145 = " = null;";
  protected final String TEXT_1146 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1147 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1148 = NL + "\t\tboolean old";
  protected final String TEXT_1149 = "ESet = (";
  protected final String TEXT_1150 = " & ";
  protected final String TEXT_1151 = "_ESETFLAG) != 0;";
  protected final String TEXT_1152 = NL + "\t\t";
  protected final String TEXT_1153 = " &= ~";
  protected final String TEXT_1154 = "_ESETFLAG;";
  protected final String TEXT_1155 = NL + "\t\tboolean old";
  protected final String TEXT_1156 = "ESet = ";
  protected final String TEXT_1157 = "ESet;";
  protected final String TEXT_1158 = NL + "\t\t";
  protected final String TEXT_1159 = "ESet = false;";
  protected final String TEXT_1160 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1161 = " notification = new ";
  protected final String TEXT_1162 = "(this, ";
  protected final String TEXT_1163 = ".UNSET, ";
  protected final String TEXT_1164 = ", ";
  protected final String TEXT_1165 = "isSetChange ? old";
  protected final String TEXT_1166 = " : null";
  protected final String TEXT_1167 = "old";
  protected final String TEXT_1168 = ", null, ";
  protected final String TEXT_1169 = "isSetChange";
  protected final String TEXT_1170 = "old";
  protected final String TEXT_1171 = "ESet";
  protected final String TEXT_1172 = ");" + NL + "\t\t\tif (msgs == null) msgs = notification; else msgs.add(notification);" + NL + "\t\t}" + NL + "\t\treturn msgs;";
  protected final String TEXT_1173 = NL + "\t\t// TODO: implement this method to unset the contained '";
  protected final String TEXT_1174 = "' ";
  protected final String TEXT_1175 = NL + "\t\t// -> this method is automatically invoked to keep the containment relationship in synch" + NL + "\t\t// -> do not modify other features" + NL + "\t\t// -> return msgs, after adding any generated Notification to it (if it is null, a NotificationChain object must be created first)" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1176 = NL + "\t}" + NL;
  protected final String TEXT_1177 = NL + "\t/**" + NL + "\t * Unsets the value of the '{@link ";
  protected final String TEXT_1178 = "#";
  protected final String TEXT_1179 = " <em>";
  protected final String TEXT_1180 = "</em>}' ";
  protected final String TEXT_1181 = ".";
  protected final String TEXT_1182 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1183 = NL + "\t * @see #isSet";
  protected final String TEXT_1184 = "()";
  protected final String TEXT_1185 = NL + "\t * @see #";
  protected final String TEXT_1186 = "()";
  protected final String TEXT_1187 = NL + "\t * @see #set";
  protected final String TEXT_1188 = "(";
  protected final String TEXT_1189 = ")";
  protected final String TEXT_1190 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1191 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1192 = NL + "\t@Override";
  protected final String TEXT_1193 = NL + "\tvoid unset";
  protected final String TEXT_1194 = "();" + NL;
  protected final String TEXT_1195 = NL + "\tpublic void unset";
  protected final String TEXT_1196 = "_";
  protected final String TEXT_1197 = "()" + NL + "\t{";
  protected final String TEXT_1198 = NL + "\t\teDynamicUnset(";
  protected final String TEXT_1199 = ", ";
  protected final String TEXT_1200 = ");";
  protected final String TEXT_1201 = NL + "\t\teUnset(";
  protected final String TEXT_1202 = ");";
  protected final String TEXT_1203 = NL + "\t\t";
  protected final String TEXT_1204 = " ";
  protected final String TEXT_1205 = " = (";
  protected final String TEXT_1206 = ")eVirtualGet(";
  protected final String TEXT_1207 = ");";
  protected final String TEXT_1208 = NL + "\t\tif (";
  protected final String TEXT_1209 = " != null) ((";
  protected final String TEXT_1210 = ".Unsettable";
  protected final String TEXT_1211 = ")";
  protected final String TEXT_1212 = ").unset();";
  protected final String TEXT_1213 = NL + "\t\t";
  protected final String TEXT_1214 = " ";
  protected final String TEXT_1215 = " = (";
  protected final String TEXT_1216 = ")eVirtualGet(";
  protected final String TEXT_1217 = ");";
  protected final String TEXT_1218 = NL + "\t\tif (";
  protected final String TEXT_1219 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1220 = " msgs = null;";
  protected final String TEXT_1221 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1222 = ")";
  protected final String TEXT_1223 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_1224 = ", null, msgs);";
  protected final String TEXT_1225 = NL + "\t\t\tmsgs = ((";
  protected final String TEXT_1226 = ")";
  protected final String TEXT_1227 = ").eInverseRemove(this, ";
  protected final String TEXT_1228 = ", ";
  protected final String TEXT_1229 = ".class, msgs);";
  protected final String TEXT_1230 = NL + "\t\t\tmsgs = basicUnset";
  protected final String TEXT_1231 = "(msgs);" + NL + "\t\t\tif (msgs != null) msgs.dispatch();" + NL + "\t\t}" + NL + "\t\telse" + NL + "\t\t{";
  protected final String TEXT_1232 = NL + "\t\t\tboolean old";
  protected final String TEXT_1233 = "ESet = eVirtualIsSet(";
  protected final String TEXT_1234 = ");";
  protected final String TEXT_1235 = NL + "\t\t\tboolean old";
  protected final String TEXT_1236 = "ESet = (";
  protected final String TEXT_1237 = " & ";
  protected final String TEXT_1238 = "_ESETFLAG) != 0;";
  protected final String TEXT_1239 = NL + "\t\t\t";
  protected final String TEXT_1240 = " &= ~";
  protected final String TEXT_1241 = "_ESETFLAG;";
  protected final String TEXT_1242 = NL + "\t\t\tboolean old";
  protected final String TEXT_1243 = "ESet = ";
  protected final String TEXT_1244 = "ESet;";
  protected final String TEXT_1245 = NL + "\t\t\t";
  protected final String TEXT_1246 = "ESet = false;";
  protected final String TEXT_1247 = NL + "\t\t\tif (eNotificationRequired())" + NL + "\t\t\t\teNotify(new ";
  protected final String TEXT_1248 = "(this, ";
  protected final String TEXT_1249 = ".UNSET, ";
  protected final String TEXT_1250 = ", null, null, old";
  protected final String TEXT_1251 = "ESet));";
  protected final String TEXT_1252 = NL + "\t\t}";
  protected final String TEXT_1253 = NL + "\t\t";
  protected final String TEXT_1254 = " old";
  protected final String TEXT_1255 = " = (";
  protected final String TEXT_1256 = " & ";
  protected final String TEXT_1257 = "_EFLAG) != 0;";
  protected final String TEXT_1258 = NL + "\t\t";
  protected final String TEXT_1259 = " old";
  protected final String TEXT_1260 = " = ";
  protected final String TEXT_1261 = "_EFLAG_VALUES[(";
  protected final String TEXT_1262 = " & ";
  protected final String TEXT_1263 = "_EFLAG) >>> ";
  protected final String TEXT_1264 = "_EFLAG_OFFSET];";
  protected final String TEXT_1265 = NL + "\t\tObject old";
  protected final String TEXT_1266 = " = eVirtualUnset(";
  protected final String TEXT_1267 = ");";
  protected final String TEXT_1268 = NL + "\t\t";
  protected final String TEXT_1269 = " old";
  protected final String TEXT_1270 = " = ";
  protected final String TEXT_1271 = ";";
  protected final String TEXT_1272 = NL + "\t\tboolean isSetChange = old";
  protected final String TEXT_1273 = " != EVIRTUAL_NO_VALUE;";
  protected final String TEXT_1274 = NL + "\t\tboolean old";
  protected final String TEXT_1275 = "ESet = (";
  protected final String TEXT_1276 = " & ";
  protected final String TEXT_1277 = "_ESETFLAG) != 0;";
  protected final String TEXT_1278 = NL + "\t\tboolean old";
  protected final String TEXT_1279 = "ESet = ";
  protected final String TEXT_1280 = "ESet;";
  protected final String TEXT_1281 = NL + "\t\t";
  protected final String TEXT_1282 = " = null;";
  protected final String TEXT_1283 = NL + "\t\t";
  protected final String TEXT_1284 = " &= ~";
  protected final String TEXT_1285 = "_ESETFLAG;";
  protected final String TEXT_1286 = NL + "\t\t";
  protected final String TEXT_1287 = "ESet = false;";
  protected final String TEXT_1288 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1289 = "(this, ";
  protected final String TEXT_1290 = ".UNSET, ";
  protected final String TEXT_1291 = ", ";
  protected final String TEXT_1292 = "isSetChange ? old";
  protected final String TEXT_1293 = " : null";
  protected final String TEXT_1294 = "old";
  protected final String TEXT_1295 = ", null, ";
  protected final String TEXT_1296 = "isSetChange";
  protected final String TEXT_1297 = "old";
  protected final String TEXT_1298 = "ESet";
  protected final String TEXT_1299 = "));";
  protected final String TEXT_1300 = NL + "\t\tif (";
  protected final String TEXT_1301 = ") ";
  protected final String TEXT_1302 = " |= ";
  protected final String TEXT_1303 = "_EFLAG; else ";
  protected final String TEXT_1304 = " &= ~";
  protected final String TEXT_1305 = "_EFLAG;";
  protected final String TEXT_1306 = NL + "\t\t";
  protected final String TEXT_1307 = " = ";
  protected final String TEXT_1308 = " & ~";
  protected final String TEXT_1309 = "_EFLAG | ";
  protected final String TEXT_1310 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1311 = NL + "\t\t";
  protected final String TEXT_1312 = " = ";
  protected final String TEXT_1313 = ";";
  protected final String TEXT_1314 = NL + "\t\t";
  protected final String TEXT_1315 = " &= ~";
  protected final String TEXT_1316 = "_ESETFLAG;";
  protected final String TEXT_1317 = NL + "\t\t";
  protected final String TEXT_1318 = "ESet = false;";
  protected final String TEXT_1319 = NL + "\t\tif (eNotificationRequired())" + NL + "\t\t\teNotify(new ";
  protected final String TEXT_1320 = "(this, ";
  protected final String TEXT_1321 = ".UNSET, ";
  protected final String TEXT_1322 = ", ";
  protected final String TEXT_1323 = "isSetChange ? old";
  protected final String TEXT_1324 = " : ";
  protected final String TEXT_1325 = "old";
  protected final String TEXT_1326 = ", ";
  protected final String TEXT_1327 = ", ";
  protected final String TEXT_1328 = "isSetChange";
  protected final String TEXT_1329 = "old";
  protected final String TEXT_1330 = "ESet";
  protected final String TEXT_1331 = "));";
  protected final String TEXT_1332 = NL + "\t\t((";
  protected final String TEXT_1333 = ".Internal)((";
  protected final String TEXT_1334 = ".Internal.Wrapper)get";
  protected final String TEXT_1335 = "()).featureMap()).clear(";
  protected final String TEXT_1336 = ");";
  protected final String TEXT_1337 = NL + "\t\t((";
  protected final String TEXT_1338 = ".Internal)get";
  protected final String TEXT_1339 = "()).clear(";
  protected final String TEXT_1340 = ");";
  protected final String TEXT_1341 = NL + "\t\t";
  protected final String TEXT_1342 = NL + "\t\t";
  protected final String TEXT_1343 = ".";
  protected final String TEXT_1344 = "(this);";
  protected final String TEXT_1345 = NL + "\t\t// TODO: implement this method to unset the '";
  protected final String TEXT_1346 = "' ";
  protected final String TEXT_1347 = NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1348 = NL + "\t}" + NL;
  protected final String TEXT_1349 = NL + "\t/**" + NL + "\t * Returns whether the value of the '{@link ";
  protected final String TEXT_1350 = "#";
  protected final String TEXT_1351 = " <em>";
  protected final String TEXT_1352 = "</em>}' ";
  protected final String TEXT_1353 = " is set.";
  protected final String TEXT_1354 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return whether the value of the '<em>";
  protected final String TEXT_1355 = "</em>' ";
  protected final String TEXT_1356 = " is set.";
  protected final String TEXT_1357 = NL + "\t * @see #unset";
  protected final String TEXT_1358 = "()";
  protected final String TEXT_1359 = NL + "\t * @see #";
  protected final String TEXT_1360 = "()";
  protected final String TEXT_1361 = NL + "\t * @see #set";
  protected final String TEXT_1362 = "(";
  protected final String TEXT_1363 = ")";
  protected final String TEXT_1364 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1365 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1366 = NL + "\t@Override";
  protected final String TEXT_1367 = NL + "\tboolean isSet";
  protected final String TEXT_1368 = "();" + NL;
  protected final String TEXT_1369 = NL + "\tpublic boolean isSet";
  protected final String TEXT_1370 = "_";
  protected final String TEXT_1371 = "()" + NL + "\t{";
  protected final String TEXT_1372 = NL + "\t\treturn eDynamicIsSet(";
  protected final String TEXT_1373 = ", ";
  protected final String TEXT_1374 = ");";
  protected final String TEXT_1375 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1376 = ");";
  protected final String TEXT_1377 = NL + "\t\t";
  protected final String TEXT_1378 = " ";
  protected final String TEXT_1379 = " = (";
  protected final String TEXT_1380 = ")eVirtualGet(";
  protected final String TEXT_1381 = ");";
  protected final String TEXT_1382 = NL + "\t\treturn ";
  protected final String TEXT_1383 = " != null && ((";
  protected final String TEXT_1384 = ".Unsettable";
  protected final String TEXT_1385 = ")";
  protected final String TEXT_1386 = ").isSet();";
  protected final String TEXT_1387 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1388 = ");";
  protected final String TEXT_1389 = NL + "\t\treturn (";
  protected final String TEXT_1390 = " & ";
  protected final String TEXT_1391 = "_ESETFLAG) != 0;";
  protected final String TEXT_1392 = NL + "\t\treturn ";
  protected final String TEXT_1393 = "ESet;";
  protected final String TEXT_1394 = NL + "\t\treturn !((";
  protected final String TEXT_1395 = ".Internal)((";
  protected final String TEXT_1396 = ".Internal.Wrapper)get";
  protected final String TEXT_1397 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1398 = ");";
  protected final String TEXT_1399 = NL + "\t\treturn !((";
  protected final String TEXT_1400 = ".Internal)get";
  protected final String TEXT_1401 = "()).isEmpty(";
  protected final String TEXT_1402 = ");";
  protected final String TEXT_1403 = NL + "\t\t";
  protected final String TEXT_1404 = NL + "\t\treturn ";
  protected final String TEXT_1405 = ".";
  protected final String TEXT_1406 = "(this);";
  protected final String TEXT_1407 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1408 = "' ";
  protected final String TEXT_1409 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1410 = NL + "\t}" + NL;
  protected final String TEXT_1411 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_1412 = "() <em>";
  protected final String TEXT_1413 = "</em>}' ";
  protected final String TEXT_1414 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1415 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1416 = "_ESUBSETS = ";
  protected final String TEXT_1417 = ";" + NL;
  protected final String TEXT_1418 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_1419 = "() <em>";
  protected final String TEXT_1420 = "</em>}' ";
  protected final String TEXT_1421 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1422 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_1423 = "_ESUPERSETS = ";
  protected final String TEXT_1424 = ";" + NL;
  protected final String TEXT_1425 = NL + "\t/**";
  protected final String TEXT_1426 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1427 = "}, with the specified ";
  protected final String TEXT_1428 = ", and appends it to the '<em><b>";
  protected final String TEXT_1429 = "</b></em>' ";
  protected final String TEXT_1430 = ".";
  protected final String TEXT_1431 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1432 = "}, with the specified ";
  protected final String TEXT_1433 = ", and sets the '<em><b>";
  protected final String TEXT_1434 = "</b></em>' ";
  protected final String TEXT_1435 = ".";
  protected final String TEXT_1436 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1437 = "} and appends it to the '<em><b>";
  protected final String TEXT_1438 = "</b></em>' ";
  protected final String TEXT_1439 = ".";
  protected final String TEXT_1440 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1441 = "} and sets the '<em><b>";
  protected final String TEXT_1442 = "</b></em>' ";
  protected final String TEXT_1443 = ".";
  protected final String TEXT_1444 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1445 = NL + "\t * @param ";
  protected final String TEXT_1446 = " The ";
  protected final String TEXT_1447 = " for the new {@link ";
  protected final String TEXT_1448 = "}, or <code>null</code>.";
  protected final String TEXT_1449 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1450 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_1451 = "}." + NL + "\t * @see #";
  protected final String TEXT_1452 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1453 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1454 = NL + "\t";
  protected final String TEXT_1455 = " create";
  protected final String TEXT_1456 = "(";
  protected final String TEXT_1457 = ", ";
  protected final String TEXT_1458 = " eClass);" + NL;
  protected final String TEXT_1459 = NL + "\t@Override";
  protected final String TEXT_1460 = NL + "\tpublic ";
  protected final String TEXT_1461 = " create";
  protected final String TEXT_1462 = "(";
  protected final String TEXT_1463 = ", ";
  protected final String TEXT_1464 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_1465 = " new";
  protected final String TEXT_1466 = " = (";
  protected final String TEXT_1467 = ") create(eClass);";
  protected final String TEXT_1468 = NL + "\t\t";
  protected final String TEXT_1469 = "().add(new";
  protected final String TEXT_1470 = ");";
  protected final String TEXT_1471 = NL + "\t\tset";
  protected final String TEXT_1472 = "(new";
  protected final String TEXT_1473 = ");";
  protected final String TEXT_1474 = NL + "\t\tint ";
  protected final String TEXT_1475 = "ListSize = 0;";
  protected final String TEXT_1476 = NL + "\t\tint ";
  protected final String TEXT_1477 = "Size = ";
  protected final String TEXT_1478 = " == null ? 0 : ";
  protected final String TEXT_1479 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1480 = "Size > ";
  protected final String TEXT_1481 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1482 = "ListSize = ";
  protected final String TEXT_1483 = "Size;";
  protected final String TEXT_1484 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1485 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1486 = ".create";
  protected final String TEXT_1487 = "(";
  protected final String TEXT_1488 = ", ";
  protected final String TEXT_1489 = "i < ";
  protected final String TEXT_1490 = "Size ? (";
  protected final String TEXT_1491 = ") ";
  protected final String TEXT_1492 = ".get(i) : null";
  protected final String TEXT_1493 = ");" + NL + "\t\t}";
  protected final String TEXT_1494 = NL + "\t\tnew";
  protected final String TEXT_1495 = ".create";
  protected final String TEXT_1496 = "(";
  protected final String TEXT_1497 = ", ";
  protected final String TEXT_1498 = ");";
  protected final String TEXT_1499 = NL + "\t\tif (";
  protected final String TEXT_1500 = " != null)";
  protected final String TEXT_1501 = NL + "\t\t\tnew";
  protected final String TEXT_1502 = ".";
  protected final String TEXT_1503 = "().addAll(";
  protected final String TEXT_1504 = ");";
  protected final String TEXT_1505 = NL + "\t\t\tnew";
  protected final String TEXT_1506 = ".set";
  protected final String TEXT_1507 = "(";
  protected final String TEXT_1508 = ");";
  protected final String TEXT_1509 = NL + "\t\treturn new";
  protected final String TEXT_1510 = ";" + NL + "\t}" + NL;
  protected final String TEXT_1511 = NL + "\t/**";
  protected final String TEXT_1512 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1513 = "}, with the specified ";
  protected final String TEXT_1514 = ", and appends it to the '<em><b>";
  protected final String TEXT_1515 = "</b></em>' ";
  protected final String TEXT_1516 = ".";
  protected final String TEXT_1517 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1518 = "},with the specified ";
  protected final String TEXT_1519 = ", and sets the '<em><b>";
  protected final String TEXT_1520 = "</b></em>' ";
  protected final String TEXT_1521 = ".";
  protected final String TEXT_1522 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1523 = "} and appends it to the '<em><b>";
  protected final String TEXT_1524 = "</b></em>' ";
  protected final String TEXT_1525 = ".";
  protected final String TEXT_1526 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_1527 = "} and sets the '<em><b>";
  protected final String TEXT_1528 = "</b></em>' ";
  protected final String TEXT_1529 = ".";
  protected final String TEXT_1530 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1531 = NL + "\t * @param ";
  protected final String TEXT_1532 = " The ";
  protected final String TEXT_1533 = " for the new {@link ";
  protected final String TEXT_1534 = "}, or <code>null</code>.";
  protected final String TEXT_1535 = NL + "\t * @return The new {@link ";
  protected final String TEXT_1536 = "}." + NL + "\t * @see #";
  protected final String TEXT_1537 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1538 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1539 = NL + "\t";
  protected final String TEXT_1540 = " create";
  protected final String TEXT_1541 = "(";
  protected final String TEXT_1542 = ");" + NL;
  protected final String TEXT_1543 = NL + "\t@Override";
  protected final String TEXT_1544 = NL + "\tpublic ";
  protected final String TEXT_1545 = " create";
  protected final String TEXT_1546 = "(";
  protected final String TEXT_1547 = ")" + NL + "\t{";
  protected final String TEXT_1548 = NL + "\t\treturn create";
  protected final String TEXT_1549 = "(";
  protected final String TEXT_1550 = ", ";
  protected final String TEXT_1551 = ");";
  protected final String TEXT_1552 = NL + "\t\t";
  protected final String TEXT_1553 = " new";
  protected final String TEXT_1554 = " = (";
  protected final String TEXT_1555 = ") create(";
  protected final String TEXT_1556 = ");";
  protected final String TEXT_1557 = NL + "\t\t";
  protected final String TEXT_1558 = "().add(new";
  protected final String TEXT_1559 = ");";
  protected final String TEXT_1560 = NL + "\t\tset";
  protected final String TEXT_1561 = "(new";
  protected final String TEXT_1562 = ");";
  protected final String TEXT_1563 = NL + "\t\tint ";
  protected final String TEXT_1564 = "ListSize = 0;";
  protected final String TEXT_1565 = NL + "\t\tint ";
  protected final String TEXT_1566 = "Size = ";
  protected final String TEXT_1567 = " == null ? 0 : ";
  protected final String TEXT_1568 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_1569 = "Size > ";
  protected final String TEXT_1570 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_1571 = "ListSize = ";
  protected final String TEXT_1572 = "Size;";
  protected final String TEXT_1573 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_1574 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_1575 = ".create";
  protected final String TEXT_1576 = "(";
  protected final String TEXT_1577 = ", ";
  protected final String TEXT_1578 = "i < ";
  protected final String TEXT_1579 = "Size ? (";
  protected final String TEXT_1580 = ") ";
  protected final String TEXT_1581 = ".get(i) : null";
  protected final String TEXT_1582 = ");" + NL + "\t\t}";
  protected final String TEXT_1583 = NL + "\t\tnew";
  protected final String TEXT_1584 = ".create";
  protected final String TEXT_1585 = "(";
  protected final String TEXT_1586 = ", ";
  protected final String TEXT_1587 = ");";
  protected final String TEXT_1588 = NL + "\t\tif (";
  protected final String TEXT_1589 = " != null)";
  protected final String TEXT_1590 = NL + "\t\t\tnew";
  protected final String TEXT_1591 = ".";
  protected final String TEXT_1592 = "().addAll(";
  protected final String TEXT_1593 = ");";
  protected final String TEXT_1594 = NL + "\t\t\tnew";
  protected final String TEXT_1595 = ".set";
  protected final String TEXT_1596 = "(";
  protected final String TEXT_1597 = ");";
  protected final String TEXT_1598 = NL + "\t\treturn new";
  protected final String TEXT_1599 = ";";
  protected final String TEXT_1600 = NL + "\t}" + NL;
  protected final String TEXT_1601 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1602 = "} with the specified ";
  protected final String TEXT_1603 = " from the '<em><b>";
  protected final String TEXT_1604 = "</b></em>' ";
  protected final String TEXT_1605 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1606 = NL + "\t * @param ";
  protected final String TEXT_1607 = " The ";
  protected final String TEXT_1608 = " of the {@link ";
  protected final String TEXT_1609 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1610 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1611 = "} with the specified ";
  protected final String TEXT_1612 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1613 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1614 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1615 = NL + "\t";
  protected final String TEXT_1616 = " get";
  protected final String TEXT_1617 = "(";
  protected final String TEXT_1618 = ");" + NL;
  protected final String TEXT_1619 = NL + "\t@Override";
  protected final String TEXT_1620 = NL + "\tpublic ";
  protected final String TEXT_1621 = " get";
  protected final String TEXT_1622 = "(";
  protected final String TEXT_1623 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_1624 = "(";
  protected final String TEXT_1625 = ", false";
  protected final String TEXT_1626 = ", null";
  protected final String TEXT_1627 = ", false";
  protected final String TEXT_1628 = ");" + NL + "\t}" + NL;
  protected final String TEXT_1629 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_1630 = "} with the specified ";
  protected final String TEXT_1631 = " from the '<em><b>";
  protected final String TEXT_1632 = "</b></em>' ";
  protected final String TEXT_1633 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1634 = NL + "\t * @param ";
  protected final String TEXT_1635 = " The ";
  protected final String TEXT_1636 = " of the {@link ";
  protected final String TEXT_1637 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1638 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_1639 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_1640 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_1641 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_1642 = "} on demand if not found.";
  protected final String TEXT_1643 = NL + "\t * @return The first {@link ";
  protected final String TEXT_1644 = "} with the specified ";
  protected final String TEXT_1645 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_1646 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1647 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1648 = NL + "\t";
  protected final String TEXT_1649 = " get";
  protected final String TEXT_1650 = "(";
  protected final String TEXT_1651 = ", boolean ignoreCase";
  protected final String TEXT_1652 = ", ";
  protected final String TEXT_1653 = " eClass";
  protected final String TEXT_1654 = ", boolean createOnDemand";
  protected final String TEXT_1655 = ");" + NL;
  protected final String TEXT_1656 = NL + "\t@Override";
  protected final String TEXT_1657 = NL + "\tpublic ";
  protected final String TEXT_1658 = " get";
  protected final String TEXT_1659 = "(";
  protected final String TEXT_1660 = ", boolean ignoreCase";
  protected final String TEXT_1661 = ", ";
  protected final String TEXT_1662 = " eClass";
  protected final String TEXT_1663 = ", boolean createOnDemand";
  protected final String TEXT_1664 = ")" + NL + "\t{";
  protected final String TEXT_1665 = NL + "\t\t";
  protected final String TEXT_1666 = "Loop: for (";
  protected final String TEXT_1667 = " ";
  protected final String TEXT_1668 = " : ";
  protected final String TEXT_1669 = "())" + NL + "\t\t{";
  protected final String TEXT_1670 = NL + "\t\t";
  protected final String TEXT_1671 = "Loop: for (";
  protected final String TEXT_1672 = " i = ";
  protected final String TEXT_1673 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1674 = " ";
  protected final String TEXT_1675 = " = (";
  protected final String TEXT_1676 = ") i.next();";
  protected final String TEXT_1677 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_1678 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1679 = "Loop;";
  protected final String TEXT_1680 = NL + "\t\t\t";
  protected final String TEXT_1681 = " ";
  protected final String TEXT_1682 = "List = ";
  protected final String TEXT_1683 = ".";
  protected final String TEXT_1684 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_1685 = "ListSize = ";
  protected final String TEXT_1686 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_1687 = " || (";
  protected final String TEXT_1688 = " != null && ";
  protected final String TEXT_1689 = ".size() != ";
  protected final String TEXT_1690 = "ListSize";
  protected final String TEXT_1691 = ")";
  protected final String TEXT_1692 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_1693 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_1694 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1695 = " ";
  protected final String TEXT_1696 = " = ";
  protected final String TEXT_1697 = "(";
  protected final String TEXT_1698 = ") ";
  protected final String TEXT_1699 = "List.get(j);";
  protected final String TEXT_1700 = NL + "\t\t\t\tif (";
  protected final String TEXT_1701 = " != null && !(ignoreCase ? (";
  protected final String TEXT_1702 = "(";
  protected final String TEXT_1703 = ")";
  protected final String TEXT_1704 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_1705 = ".";
  protected final String TEXT_1706 = "()) : ";
  protected final String TEXT_1707 = ".get(j).equals(";
  protected final String TEXT_1708 = ".";
  protected final String TEXT_1709 = "())))";
  protected final String TEXT_1710 = NL + "\t\t\t\tif (";
  protected final String TEXT_1711 = " != null && !";
  protected final String TEXT_1712 = ".get(j).equals(";
  protected final String TEXT_1713 = ".";
  protected final String TEXT_1714 = "()))";
  protected final String TEXT_1715 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_1716 = "Loop;";
  protected final String TEXT_1717 = NL + "\t\t\t}";
  protected final String TEXT_1718 = NL + "\t\t\t";
  protected final String TEXT_1719 = " ";
  protected final String TEXT_1720 = " = ";
  protected final String TEXT_1721 = ".";
  protected final String TEXT_1722 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_1723 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1724 = "Loop;";
  protected final String TEXT_1725 = NL + "\t\t\tif (";
  protected final String TEXT_1726 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1727 = ".equalsIgnoreCase(";
  protected final String TEXT_1728 = ".";
  protected final String TEXT_1729 = "()) : ";
  protected final String TEXT_1730 = ".equals(";
  protected final String TEXT_1731 = ".";
  protected final String TEXT_1732 = "())))";
  protected final String TEXT_1733 = NL + "\t\t\tif (";
  protected final String TEXT_1734 = " != null && !";
  protected final String TEXT_1735 = ".equals(";
  protected final String TEXT_1736 = ".";
  protected final String TEXT_1737 = "()))";
  protected final String TEXT_1738 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1739 = "Loop;";
  protected final String TEXT_1740 = NL + "\t\t\tif (";
  protected final String TEXT_1741 = " != null && !(ignoreCase ? ";
  protected final String TEXT_1742 = ".equalsIgnoreCase(";
  protected final String TEXT_1743 = ".";
  protected final String TEXT_1744 = "()) : ";
  protected final String TEXT_1745 = ".equals(";
  protected final String TEXT_1746 = ".";
  protected final String TEXT_1747 = "())))";
  protected final String TEXT_1748 = NL + "\t\t\tif (";
  protected final String TEXT_1749 = " != null && !";
  protected final String TEXT_1750 = ".equals(";
  protected final String TEXT_1751 = ".";
  protected final String TEXT_1752 = "()))";
  protected final String TEXT_1753 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_1754 = "Loop;";
  protected final String TEXT_1755 = NL + "\t\t\treturn ";
  protected final String TEXT_1756 = ";" + NL + "\t\t}";
  protected final String TEXT_1757 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_1758 = " && eClass != null";
  protected final String TEXT_1759 = " ? create";
  protected final String TEXT_1760 = "(";
  protected final String TEXT_1761 = ", eClass";
  protected final String TEXT_1762 = ") : null;";
  protected final String TEXT_1763 = NL + "\t\treturn null;";
  protected final String TEXT_1764 = NL + "\t}" + NL;
  protected final String TEXT_1765 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_1766 = "()" + NL + "\t{";
  protected final String TEXT_1767 = NL + "  \t\treturn false;";
  protected final String TEXT_1768 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1769 = ");";
  protected final String TEXT_1770 = NL + "\t\treturn !((";
  protected final String TEXT_1771 = ".Internal.Wrapper)";
  protected final String TEXT_1772 = "()).featureMap().isEmpty();";
  protected final String TEXT_1773 = NL + "\t\treturn ";
  protected final String TEXT_1774 = " != null && !";
  protected final String TEXT_1775 = ".featureMap().isEmpty();";
  protected final String TEXT_1776 = NL + "\t\treturn ";
  protected final String TEXT_1777 = " != null && !";
  protected final String TEXT_1778 = ".isEmpty();";
  protected final String TEXT_1779 = NL + "\t\t";
  protected final String TEXT_1780 = " ";
  protected final String TEXT_1781 = " = (";
  protected final String TEXT_1782 = ")eVirtualGet(";
  protected final String TEXT_1783 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1784 = " != null && !";
  protected final String TEXT_1785 = ".isEmpty();";
  protected final String TEXT_1786 = NL + "\t\treturn !";
  protected final String TEXT_1787 = "().isEmpty();";
  protected final String TEXT_1788 = NL + "\t\treturn ";
  protected final String TEXT_1789 = " != null;";
  protected final String TEXT_1790 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1791 = ") != null;";
  protected final String TEXT_1792 = NL + "\t\treturn basicGet";
  protected final String TEXT_1793 = "() != null;";
  protected final String TEXT_1794 = NL + "\t\treturn ";
  protected final String TEXT_1795 = " != null;";
  protected final String TEXT_1796 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1797 = ") != null;";
  protected final String TEXT_1798 = NL + "\t\treturn ";
  protected final String TEXT_1799 = "() != null;";
  protected final String TEXT_1800 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_1801 = " & ";
  protected final String TEXT_1802 = "_EFLAG) != 0) != ";
  protected final String TEXT_1803 = ";";
  protected final String TEXT_1804 = NL + "\t\t\t\treturn (";
  protected final String TEXT_1805 = " & ";
  protected final String TEXT_1806 = "_EFLAG) != ";
  protected final String TEXT_1807 = "_EFLAG_DEFAULT;";
  protected final String TEXT_1808 = NL + "\t\treturn ";
  protected final String TEXT_1809 = " != ";
  protected final String TEXT_1810 = ";";
  protected final String TEXT_1811 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_1812 = ", ";
  protected final String TEXT_1813 = ") != ";
  protected final String TEXT_1814 = ";";
  protected final String TEXT_1815 = NL + "\t\treturn ";
  protected final String TEXT_1816 = "() != ";
  protected final String TEXT_1817 = ";";
  protected final String TEXT_1818 = NL + "\t\treturn ";
  protected final String TEXT_1819 = " == null ? ";
  protected final String TEXT_1820 = " != null : !";
  protected final String TEXT_1821 = ".equals(";
  protected final String TEXT_1822 = ");";
  protected final String TEXT_1823 = NL + "\t\t";
  protected final String TEXT_1824 = " ";
  protected final String TEXT_1825 = " = (";
  protected final String TEXT_1826 = ")eVirtualGet(";
  protected final String TEXT_1827 = ", ";
  protected final String TEXT_1828 = ");" + NL + "\t\treturn ";
  protected final String TEXT_1829 = " == null ? ";
  protected final String TEXT_1830 = " != null : !";
  protected final String TEXT_1831 = ".equals(";
  protected final String TEXT_1832 = ");";
  protected final String TEXT_1833 = NL + "\t\treturn ";
  protected final String TEXT_1834 = " == null ? ";
  protected final String TEXT_1835 = "() != null : !";
  protected final String TEXT_1836 = ".equals(";
  protected final String TEXT_1837 = "());";
  protected final String TEXT_1838 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_1839 = ");";
  protected final String TEXT_1840 = NL + "\t\t";
  protected final String TEXT_1841 = " ";
  protected final String TEXT_1842 = " = (";
  protected final String TEXT_1843 = ")eVirtualGet(";
  protected final String TEXT_1844 = ");";
  protected final String TEXT_1845 = NL + "\t\treturn ";
  protected final String TEXT_1846 = " != null && ((";
  protected final String TEXT_1847 = ".Unsettable";
  protected final String TEXT_1848 = ")";
  protected final String TEXT_1849 = ").isSet();";
  protected final String TEXT_1850 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_1851 = ");";
  protected final String TEXT_1852 = NL + "\t\treturn (";
  protected final String TEXT_1853 = " & ";
  protected final String TEXT_1854 = "_ESETFLAG) != 0;";
  protected final String TEXT_1855 = NL + "\t\treturn ";
  protected final String TEXT_1856 = "ESet;";
  protected final String TEXT_1857 = NL + "\t\treturn !((";
  protected final String TEXT_1858 = ".Internal)((";
  protected final String TEXT_1859 = ".Internal.Wrapper)get";
  protected final String TEXT_1860 = "()).featureMap()).isEmpty(";
  protected final String TEXT_1861 = ");";
  protected final String TEXT_1862 = NL + "\t\treturn !((";
  protected final String TEXT_1863 = ".Internal)get";
  protected final String TEXT_1864 = "()).isEmpty(";
  protected final String TEXT_1865 = ");";
  protected final String TEXT_1866 = NL + "\t\treturn ";
  protected final String TEXT_1867 = ".";
  protected final String TEXT_1868 = "(this);";
  protected final String TEXT_1869 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_1870 = "' ";
  protected final String TEXT_1871 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_1872 = NL + "\t}" + NL;
  protected final String TEXT_1873 = NL + "\t/**" + NL + "\t * The cached OCL expression body for the '{@link #";
  protected final String TEXT_1874 = "(";
  protected final String TEXT_1875 = ") <em>";
  protected final String TEXT_1876 = "</em>}' operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1877 = "(";
  protected final String TEXT_1878 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_1879 = " ";
  protected final String TEXT_1880 = "__EOCL_EXP = \"";
  protected final String TEXT_1881 = "\";";
  protected final String TEXT_1882 = NL;
  protected final String TEXT_1883 = NL + "\t/**" + NL + "\t * The cached OCL invariant for the '{@link #";
  protected final String TEXT_1884 = "(";
  protected final String TEXT_1885 = ") <em>";
  protected final String TEXT_1886 = "</em>}' invariant operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1887 = "(";
  protected final String TEXT_1888 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_1889 = " ";
  protected final String TEXT_1890 = "__EOCL_INV;" + NL;
  protected final String TEXT_1891 = NL + "\t/**" + NL + "\t * The cached OCL query for the '{@link #";
  protected final String TEXT_1892 = "(";
  protected final String TEXT_1893 = ") <em>";
  protected final String TEXT_1894 = "</em>}' query operation." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_1895 = "(";
  protected final String TEXT_1896 = ")" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static ";
  protected final String TEXT_1897 = "<";
  protected final String TEXT_1898 = ">";
  protected final String TEXT_1899 = " ";
  protected final String TEXT_1900 = "__EOCL_QRY;" + NL;
  protected final String TEXT_1901 = NL + "\t/**";
  protected final String TEXT_1902 = NL + "\t * <p>" + NL + "\t * This operation redefines the following operations:" + NL + "\t * <ul>";
  protected final String TEXT_1903 = NL + "\t *   <li>'{@link ";
  protected final String TEXT_1904 = "#";
  protected final String TEXT_1905 = "(";
  protected final String TEXT_1906 = ") <em>";
  protected final String TEXT_1907 = "</em>}' </li>";
  protected final String TEXT_1908 = NL + "\t * </ul>" + NL + "\t * </p>";
  protected final String TEXT_1909 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_1910 = NL + "\t * <!-- begin-model-doc -->";
  protected final String TEXT_1911 = NL + "\t * ";
  protected final String TEXT_1912 = NL + "\t * @param ";
  protected final String TEXT_1913 = NL + "\t *   ";
  protected final String TEXT_1914 = NL + "\t * @param ";
  protected final String TEXT_1915 = " ";
  protected final String TEXT_1916 = NL + "\t * <!-- end-model-doc -->";
  protected final String TEXT_1917 = NL + "\t * @model ";
  protected final String TEXT_1918 = NL + "\t *        ";
  protected final String TEXT_1919 = NL + "\t * @model";
  protected final String TEXT_1920 = NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1921 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_1922 = NL + "\t@Override";
  protected final String TEXT_1923 = NL + "\t";
  protected final String TEXT_1924 = " ";
  protected final String TEXT_1925 = "(";
  protected final String TEXT_1926 = ")";
  protected final String TEXT_1927 = ";" + NL;
  protected final String TEXT_1928 = NL + "\tpublic ";
  protected final String TEXT_1929 = " ";
  protected final String TEXT_1930 = "(";
  protected final String TEXT_1931 = ")";
  protected final String TEXT_1932 = NL + "\t{";
  protected final String TEXT_1933 = NL + "\t\t";
  protected final String TEXT_1934 = NL + "\t\treturn ";
  protected final String TEXT_1935 = ".";
  protected final String TEXT_1936 = "(this, ";
  protected final String TEXT_1937 = ", ";
  protected final String TEXT_1938 = ");";
  protected final String TEXT_1939 = NL + "\t\tif (";
  protected final String TEXT_1940 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1941 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setContext(";
  protected final String TEXT_1942 = ");" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1943 = " = helper.createInvariant(";
  protected final String TEXT_1944 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_1945 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\tif (!EOCL_ENV.createQuery(";
  protected final String TEXT_1946 = ").check(this))";
  protected final String TEXT_1947 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// -> specify the condition that violates the invariant" + NL + "\t\t// -> verify the details of the diagnostic, including severity and message" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tif (false)";
  protected final String TEXT_1948 = NL + "\t\t{" + NL + "\t\t\tif (";
  protected final String TEXT_1949 = " != null)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_1950 = ".add" + NL + "\t\t\t\t\t(new ";
  protected final String TEXT_1951 = NL + "\t\t\t\t\t\t(";
  protected final String TEXT_1952 = ".ERROR," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1953 = ".DIAGNOSTIC_SOURCE," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1954 = ".";
  protected final String TEXT_1955 = "," + NL + "\t\t\t\t\t\t ";
  protected final String TEXT_1956 = ".INSTANCE.getString(\"_UI_GenericInvariant_diagnostic\", new Object[] { \"";
  protected final String TEXT_1957 = "\", ";
  protected final String TEXT_1958 = ".getObjectLabel(this, ";
  protected final String TEXT_1959 = ") }),";
  protected final String TEXT_1960 = NL + "\t\t\t\t\t\t new Object [] { this }));" + NL + "\t\t\t}" + NL + "\t\t\treturn false;" + NL + "\t\t}" + NL + "\t\treturn true;";
  protected final String TEXT_1961 = NL + "\t\t";
  protected final String TEXT_1962 = ".";
  protected final String TEXT_1963 = "(this";
  protected final String TEXT_1964 = ", ";
  protected final String TEXT_1965 = ");";
  protected final String TEXT_1966 = NL + "\t\t";
  protected final String TEXT_1967 = " cache = getCacheAdapter();" + NL + "\t\tif (cache != null)" + NL + "\t\t{";
  protected final String TEXT_1968 = NL + "\t\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_1969 = NL + "\t\t\t";
  protected final String TEXT_1970 = " result = (";
  protected final String TEXT_1971 = ") cache.get(";
  protected final String TEXT_1972 = "eResource(), ";
  protected final String TEXT_1973 = "this, ";
  protected final String TEXT_1974 = ".getEOperations().get(";
  protected final String TEXT_1975 = "));" + NL + "\t\t\tif (result == null)" + NL + "\t\t\t{" + NL + "\t\t\t\tcache.put(";
  protected final String TEXT_1976 = "eResource(), ";
  protected final String TEXT_1977 = "this, ";
  protected final String TEXT_1978 = ".getEOperations().get(";
  protected final String TEXT_1979 = "), result = ";
  protected final String TEXT_1980 = "new ";
  protected final String TEXT_1981 = "(";
  protected final String TEXT_1982 = ".";
  protected final String TEXT_1983 = "(this";
  protected final String TEXT_1984 = ", ";
  protected final String TEXT_1985 = ")";
  protected final String TEXT_1986 = ")";
  protected final String TEXT_1987 = ");" + NL + "\t\t\t}" + NL + "\t\t\treturn result";
  protected final String TEXT_1988 = ".";
  protected final String TEXT_1989 = "()";
  protected final String TEXT_1990 = ";" + NL + "\t\t}";
  protected final String TEXT_1991 = NL + "\t\treturn ";
  protected final String TEXT_1992 = ".";
  protected final String TEXT_1993 = "(this";
  protected final String TEXT_1994 = ", ";
  protected final String TEXT_1995 = ");";
  protected final String TEXT_1996 = NL + "\t\tif (";
  protected final String TEXT_1997 = " == null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_1998 = ".Helper helper = EOCL_ENV.createOCLHelper();" + NL + "\t\t\thelper.setOperationContext(";
  protected final String TEXT_1999 = ", ";
  protected final String TEXT_2000 = ".getEAllOperations().get(";
  protected final String TEXT_2001 = "));" + NL + "\t\t\ttry" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2002 = " = helper.createQuery(";
  protected final String TEXT_2003 = "__EOCL_EXP);" + NL + "\t\t\t}" + NL + "\t\t\tcatch (";
  protected final String TEXT_2004 = " pe)" + NL + "\t\t\t{" + NL + "\t\t\t\tthrow new UnsupportedOperationException(pe.getLocalizedMessage());" + NL + "\t\t\t}" + NL + "\t\t}" + NL + "\t\t";
  protected final String TEXT_2005 = ".Query query = EOCL_ENV.createQuery(";
  protected final String TEXT_2006 = ");";
  protected final String TEXT_2007 = NL + "\t\t";
  protected final String TEXT_2008 = "<?, ?, ?, ?, ?>";
  protected final String TEXT_2009 = " environment = query.getEvaluationEnvironment();";
  protected final String TEXT_2010 = NL + "\t\tenvironment.add(\"";
  protected final String TEXT_2011 = "\", ";
  protected final String TEXT_2012 = ");";
  protected final String TEXT_2013 = NL + "\t\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2014 = NL + "\t\t";
  protected final String TEXT_2015 = "<";
  protected final String TEXT_2016 = "> result = (";
  protected final String TEXT_2017 = "<";
  protected final String TEXT_2018 = ">) query.evaluate(this);" + NL + "\t\treturn new ";
  protected final String TEXT_2019 = ".UnmodifiableEList<";
  protected final String TEXT_2020 = ">(result.size(), result.toArray());";
  protected final String TEXT_2021 = NL + "\t\treturn ((";
  protected final String TEXT_2022 = ") query.evaluate(this)).";
  protected final String TEXT_2023 = "();";
  protected final String TEXT_2024 = NL + "\t\treturn (";
  protected final String TEXT_2025 = ") query.evaluate(this);";
  protected final String TEXT_2026 = NL + "\t\t// TODO: implement this method" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2027 = NL + "\t}" + NL;
  protected final String TEXT_2028 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2029 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2030 = NL + "\t@Override";
  protected final String TEXT_2031 = NL + "\tpublic ";
  protected final String TEXT_2032 = " eInverseAdd(";
  protected final String TEXT_2033 = " otherEnd, int featureID, ";
  protected final String TEXT_2034 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2035 = ")" + NL + "\t\t{";
  protected final String TEXT_2036 = NL + "\t\t\tcase ";
  protected final String TEXT_2037 = ":";
  protected final String TEXT_2038 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2039 = "(";
  protected final String TEXT_2040 = ".InternalMapView";
  protected final String TEXT_2041 = ")";
  protected final String TEXT_2042 = "()).eMap()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_2043 = NL + "\t\t\t\treturn (";
  protected final String TEXT_2044 = "()).basicAdd(otherEnd, msgs);";
  protected final String TEXT_2045 = NL + "\t\t\t\tif (eInternalContainer() != null)" + NL + "\t\t\t\t\tmsgs = eBasicRemoveFromContainer(msgs);";
  protected final String TEXT_2046 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2047 = "((";
  protected final String TEXT_2048 = ")otherEnd, msgs);";
  protected final String TEXT_2049 = NL + "\t\t\t\treturn eBasicSetContainer(otherEnd, ";
  protected final String TEXT_2050 = ", msgs);";
  protected final String TEXT_2051 = NL + "\t\t\t\t";
  protected final String TEXT_2052 = " ";
  protected final String TEXT_2053 = " = (";
  protected final String TEXT_2054 = ")eVirtualGet(";
  protected final String TEXT_2055 = ");";
  protected final String TEXT_2056 = NL + "\t\t\t\t";
  protected final String TEXT_2057 = " ";
  protected final String TEXT_2058 = " = ";
  protected final String TEXT_2059 = "basicGet";
  protected final String TEXT_2060 = "();";
  protected final String TEXT_2061 = NL + "\t\t\t\tif (";
  protected final String TEXT_2062 = " != null)";
  protected final String TEXT_2063 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_2064 = ")";
  protected final String TEXT_2065 = ").eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ";
  protected final String TEXT_2066 = ", null, msgs);";
  protected final String TEXT_2067 = NL + "\t\t\t\t\tmsgs = ((";
  protected final String TEXT_2068 = ")";
  protected final String TEXT_2069 = ").eInverseRemove(this, ";
  protected final String TEXT_2070 = ", ";
  protected final String TEXT_2071 = ".class, msgs);";
  protected final String TEXT_2072 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2073 = "((";
  protected final String TEXT_2074 = ")otherEnd, msgs);";
  protected final String TEXT_2075 = NL + "\t\t}";
  protected final String TEXT_2076 = NL + "\t\treturn super.eInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_2077 = NL + "\t\treturn eDynamicInverseAdd(otherEnd, featureID, msgs);";
  protected final String TEXT_2078 = NL + "\t}" + NL;
  protected final String TEXT_2079 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2080 = NL + "\t@Override";
  protected final String TEXT_2081 = NL + "\tpublic ";
  protected final String TEXT_2082 = " eInverseRemove(";
  protected final String TEXT_2083 = " otherEnd, int featureID, ";
  protected final String TEXT_2084 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2085 = ")" + NL + "\t\t{";
  protected final String TEXT_2086 = NL + "\t\t\tcase ";
  protected final String TEXT_2087 = ":";
  protected final String TEXT_2088 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2089 = ")((";
  protected final String TEXT_2090 = ".InternalMapView";
  protected final String TEXT_2091 = ")";
  protected final String TEXT_2092 = "()).eMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2093 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2094 = ")((";
  protected final String TEXT_2095 = ".Internal.Wrapper)";
  protected final String TEXT_2096 = "()).featureMap()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2097 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2098 = ")";
  protected final String TEXT_2099 = "()).basicRemove(otherEnd, msgs);";
  protected final String TEXT_2100 = NL + "\t\t\t\treturn eBasicSetContainer(null, ";
  protected final String TEXT_2101 = ", msgs);";
  protected final String TEXT_2102 = NL + "\t\t\t\treturn basicUnset";
  protected final String TEXT_2103 = "(msgs);";
  protected final String TEXT_2104 = NL + "\t\t\t\treturn basicSet";
  protected final String TEXT_2105 = "(null, msgs);";
  protected final String TEXT_2106 = NL + "\t\t}";
  protected final String TEXT_2107 = NL + "\t\treturn super.eInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_2108 = NL + "\t\treturn eDynamicInverseRemove(otherEnd, featureID, msgs);";
  protected final String TEXT_2109 = NL + "\t}" + NL;
  protected final String TEXT_2110 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2111 = NL + "\t@Override";
  protected final String TEXT_2112 = NL + "\tpublic ";
  protected final String TEXT_2113 = " eBasicRemoveFromContainerFeature(";
  protected final String TEXT_2114 = " msgs)" + NL + "\t{" + NL + "\t\tswitch (eContainerFeatureID()";
  protected final String TEXT_2115 = ")" + NL + "\t\t{";
  protected final String TEXT_2116 = NL + "\t\t\tcase ";
  protected final String TEXT_2117 = ":" + NL + "\t\t\t\treturn eInternalContainer().eInverseRemove(this, ";
  protected final String TEXT_2118 = ", ";
  protected final String TEXT_2119 = ".class, msgs);";
  protected final String TEXT_2120 = NL + "\t\t}";
  protected final String TEXT_2121 = NL + "\t\treturn super.eBasicRemoveFromContainerFeature(msgs);";
  protected final String TEXT_2122 = NL + "\t\treturn eDynamicBasicRemoveFromContainer(msgs);";
  protected final String TEXT_2123 = NL + "\t}" + NL;
  protected final String TEXT_2124 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2125 = NL + "\t@Override";
  protected final String TEXT_2126 = NL + "\tpublic Object eGet(int featureID, boolean resolve, boolean coreType)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2127 = ")" + NL + "\t\t{";
  protected final String TEXT_2128 = NL + "\t\t\tcase ";
  protected final String TEXT_2129 = ":";
  protected final String TEXT_2130 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2131 = "();";
  protected final String TEXT_2132 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2133 = "() ? Boolean.TRUE : Boolean.FALSE;";
  protected final String TEXT_2134 = NL + "\t\t\t\treturn new ";
  protected final String TEXT_2135 = "(";
  protected final String TEXT_2136 = "());";
  protected final String TEXT_2137 = NL + "\t\t\t\tif (resolve) return ";
  protected final String TEXT_2138 = "();" + NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_2139 = "();";
  protected final String TEXT_2140 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_2141 = ".InternalMapView";
  protected final String TEXT_2142 = ")";
  protected final String TEXT_2143 = "()).eMap();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_2144 = "();";
  protected final String TEXT_2145 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_2146 = "();" + NL + "\t\t\t\telse return ";
  protected final String TEXT_2147 = "().map();";
  protected final String TEXT_2148 = NL + "\t\t\t\tif (coreType) return ((";
  protected final String TEXT_2149 = ".Internal.Wrapper)";
  protected final String TEXT_2150 = "()).featureMap();" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2151 = "();";
  protected final String TEXT_2152 = NL + "\t\t\t\tif (coreType) return ";
  protected final String TEXT_2153 = "();" + NL + "\t\t\t\treturn ((";
  protected final String TEXT_2154 = ".Internal)";
  protected final String TEXT_2155 = "()).getWrapper();";
  protected final String TEXT_2156 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2157 = "();";
  protected final String TEXT_2158 = NL + "\t\t}";
  protected final String TEXT_2159 = NL + "\t\treturn super.eGet(featureID, resolve, coreType);";
  protected final String TEXT_2160 = NL + "\t\treturn eDynamicGet(featureID, resolve, coreType);";
  protected final String TEXT_2161 = NL + "\t}" + NL;
  protected final String TEXT_2162 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2163 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2164 = NL + "\t@Override";
  protected final String TEXT_2165 = NL + "\tpublic void eSet(int featureID, Object newValue)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2166 = ")" + NL + "\t\t{";
  protected final String TEXT_2167 = NL + "\t\t\tcase ";
  protected final String TEXT_2168 = ":";
  protected final String TEXT_2169 = NL + "\t\t\t\t((";
  protected final String TEXT_2170 = ".Internal)((";
  protected final String TEXT_2171 = ".Internal.Wrapper)";
  protected final String TEXT_2172 = "()).featureMap()).set(newValue);";
  protected final String TEXT_2173 = NL + "\t\t\t\t((";
  protected final String TEXT_2174 = ".Internal)";
  protected final String TEXT_2175 = "()).set(newValue);";
  protected final String TEXT_2176 = NL + "\t\t\t\t((";
  protected final String TEXT_2177 = ".Setting)((";
  protected final String TEXT_2178 = ".InternalMapView";
  protected final String TEXT_2179 = ")";
  protected final String TEXT_2180 = "()).eMap()).set(newValue);";
  protected final String TEXT_2181 = NL + "\t\t\t\t((";
  protected final String TEXT_2182 = ".Setting)";
  protected final String TEXT_2183 = "()).set(newValue);";
  protected final String TEXT_2184 = NL + "\t\t\t\t";
  protected final String TEXT_2185 = "().clear();" + NL + "\t\t\t\t";
  protected final String TEXT_2186 = "().addAll((";
  protected final String TEXT_2187 = "<? extends ";
  protected final String TEXT_2188 = ">";
  protected final String TEXT_2189 = ")newValue);";
  protected final String TEXT_2190 = NL + "\t\t\t\tset";
  protected final String TEXT_2191 = "(((";
  protected final String TEXT_2192 = ")newValue).";
  protected final String TEXT_2193 = "());";
  protected final String TEXT_2194 = NL + "\t\t\t\tset";
  protected final String TEXT_2195 = "(";
  protected final String TEXT_2196 = "(";
  protected final String TEXT_2197 = ")";
  protected final String TEXT_2198 = "newValue);";
  protected final String TEXT_2199 = NL + "\t\t\t\treturn;";
  protected final String TEXT_2200 = NL + "\t\t}";
  protected final String TEXT_2201 = NL + "\t\tsuper.eSet(featureID, newValue);";
  protected final String TEXT_2202 = NL + "\t\teDynamicSet(featureID, newValue);";
  protected final String TEXT_2203 = NL + "\t}" + NL;
  protected final String TEXT_2204 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2205 = NL + "\t@Override";
  protected final String TEXT_2206 = NL + "\tpublic void eUnset(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID";
  protected final String TEXT_2207 = ")" + NL + "\t\t{";
  protected final String TEXT_2208 = NL + "\t\t\tcase ";
  protected final String TEXT_2209 = ":";
  protected final String TEXT_2210 = NL + "\t\t\t\t((";
  protected final String TEXT_2211 = ".Internal.Wrapper)";
  protected final String TEXT_2212 = "()).featureMap().clear();";
  protected final String TEXT_2213 = NL + "\t\t\t\t";
  protected final String TEXT_2214 = "().clear();";
  protected final String TEXT_2215 = NL + "\t\t\t\tunset";
  protected final String TEXT_2216 = "();";
  protected final String TEXT_2217 = NL + "\t\t\t\tset";
  protected final String TEXT_2218 = "((";
  protected final String TEXT_2219 = ")null);";
  protected final String TEXT_2220 = NL + "\t\t\t\tset";
  protected final String TEXT_2221 = "(";
  protected final String TEXT_2222 = ");";
  protected final String TEXT_2223 = NL + "\t\t\t\treturn;";
  protected final String TEXT_2224 = NL + "\t\t}";
  protected final String TEXT_2225 = NL + "\t\tsuper.eUnset(featureID);";
  protected final String TEXT_2226 = NL + "\t\teDynamicUnset(featureID);";
  protected final String TEXT_2227 = NL + "\t}" + NL;
  protected final String TEXT_2228 = NL;
  protected final String TEXT_2229 = "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2230 = NL + "\t@Override";
  protected final String TEXT_2231 = NL + "\tpublic boolean eIsSet(int featureID)" + NL + "\t{" + NL + "\t\tswitch (featureID)" + NL + "\t\t{";
  protected final String TEXT_2232 = NL + "\t\t\tcase ";
  protected final String TEXT_2233 = ":";
  protected final String TEXT_2234 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2235 = "();";
  protected final String TEXT_2236 = NL + "\t\t\t\treturn !((";
  protected final String TEXT_2237 = ".Internal.Wrapper)";
  protected final String TEXT_2238 = "()).featureMap().isEmpty();";
  protected final String TEXT_2239 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2240 = " != null && !";
  protected final String TEXT_2241 = ".featureMap().isEmpty();";
  protected final String TEXT_2242 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2243 = " != null && !";
  protected final String TEXT_2244 = ".isEmpty();";
  protected final String TEXT_2245 = NL + "\t\t\t\t";
  protected final String TEXT_2246 = " ";
  protected final String TEXT_2247 = " = (";
  protected final String TEXT_2248 = ")eVirtualGet(";
  protected final String TEXT_2249 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2250 = " != null && !";
  protected final String TEXT_2251 = ".isEmpty();";
  protected final String TEXT_2252 = NL + "\t\t\t\treturn !";
  protected final String TEXT_2253 = "().isEmpty();";
  protected final String TEXT_2254 = NL + "\t\t\t\treturn isSet";
  protected final String TEXT_2255 = "();";
  protected final String TEXT_2256 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2257 = " != null;";
  protected final String TEXT_2258 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2259 = ") != null;";
  protected final String TEXT_2260 = NL + "\t\t\t\treturn basicGet";
  protected final String TEXT_2261 = "() != null;";
  protected final String TEXT_2262 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2263 = " != null;";
  protected final String TEXT_2264 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2265 = ") != null;";
  protected final String TEXT_2266 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2267 = "() != null;";
  protected final String TEXT_2268 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_2269 = " & ";
  protected final String TEXT_2270 = "_EFLAG) != 0) != ";
  protected final String TEXT_2271 = ";";
  protected final String TEXT_2272 = NL + "\t\t\t\treturn (";
  protected final String TEXT_2273 = " & ";
  protected final String TEXT_2274 = "_EFLAG) != ";
  protected final String TEXT_2275 = "_EFLAG_DEFAULT;";
  protected final String TEXT_2276 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2277 = " != ";
  protected final String TEXT_2278 = ";";
  protected final String TEXT_2279 = NL + "\t\t\t\treturn eVirtualGet(";
  protected final String TEXT_2280 = ", ";
  protected final String TEXT_2281 = ") != ";
  protected final String TEXT_2282 = ";";
  protected final String TEXT_2283 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2284 = "() != ";
  protected final String TEXT_2285 = ";";
  protected final String TEXT_2286 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2287 = " == null ? ";
  protected final String TEXT_2288 = " != null : !";
  protected final String TEXT_2289 = ".equals(";
  protected final String TEXT_2290 = ");";
  protected final String TEXT_2291 = NL + "\t\t\t\t";
  protected final String TEXT_2292 = " ";
  protected final String TEXT_2293 = " = (";
  protected final String TEXT_2294 = ")eVirtualGet(";
  protected final String TEXT_2295 = ", ";
  protected final String TEXT_2296 = ");" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2297 = " == null ? ";
  protected final String TEXT_2298 = " != null : !";
  protected final String TEXT_2299 = ".equals(";
  protected final String TEXT_2300 = ");";
  protected final String TEXT_2301 = NL + "\t\t\t\treturn ";
  protected final String TEXT_2302 = " == null ? ";
  protected final String TEXT_2303 = "() != null : !";
  protected final String TEXT_2304 = ".equals(";
  protected final String TEXT_2305 = "());";
  protected final String TEXT_2306 = NL + "\t\t}";
  protected final String TEXT_2307 = NL + "\t\treturn super.eIsSet(featureID);";
  protected final String TEXT_2308 = NL + "\t\treturn eDynamicIsSet(featureID);";
  protected final String TEXT_2309 = NL + "\t}" + NL;
  protected final String TEXT_2310 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2311 = NL + "\t@Override";
  protected final String TEXT_2312 = NL + "\tpublic int eBaseStructuralFeatureID(int derivedFeatureID, Class";
  protected final String TEXT_2313 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2314 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2315 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (derivedFeatureID";
  protected final String TEXT_2316 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2317 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2318 = ": return ";
  protected final String TEXT_2319 = ";";
  protected final String TEXT_2320 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2321 = NL + "\t\treturn super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);" + NL + "\t}";
  protected final String TEXT_2322 = NL + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2323 = NL + "\t@Override";
  protected final String TEXT_2324 = NL + "\tpublic int eDerivedStructuralFeatureID(int baseFeatureID, Class";
  protected final String TEXT_2325 = " baseClass)" + NL + "\t{";
  protected final String TEXT_2326 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2327 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID)" + NL + "\t\t\t{";
  protected final String TEXT_2328 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2329 = ": return ";
  protected final String TEXT_2330 = ";";
  protected final String TEXT_2331 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2332 = NL + "\t\tif (baseClass == ";
  protected final String TEXT_2333 = ".class)" + NL + "\t\t{" + NL + "\t\t\tswitch (baseFeatureID";
  protected final String TEXT_2334 = ")" + NL + "\t\t\t{";
  protected final String TEXT_2335 = NL + "\t\t\t\tcase ";
  protected final String TEXT_2336 = ": return ";
  protected final String TEXT_2337 = ";";
  protected final String TEXT_2338 = NL + "\t\t\t\tdefault: return -1;" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2339 = NL + "\t\treturn super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);" + NL + "\t}" + NL;
  protected final String TEXT_2340 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2341 = NL + "\t@Override";
  protected final String TEXT_2342 = NL + "\tprotected Object[] eVirtualValues()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2343 = ";" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2344 = NL + "\t@Override";
  protected final String TEXT_2345 = NL + "\tprotected void eSetVirtualValues(Object[] newValues)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2346 = " = newValues;" + NL + "\t}" + NL;
  protected final String TEXT_2347 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2348 = NL + "\t@Override";
  protected final String TEXT_2349 = NL + "\tprotected int eVirtualIndexBits(int offset)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2350 = NL + "\t\t\tcase ";
  protected final String TEXT_2351 = " :" + NL + "\t\t\t\treturn ";
  protected final String TEXT_2352 = ";";
  protected final String TEXT_2353 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2354 = NL + "\t@Override";
  protected final String TEXT_2355 = NL + "\tprotected void eSetVirtualIndexBits(int offset, int newIndexBits)" + NL + "\t{" + NL + "\t\tswitch (offset)" + NL + "\t\t{";
  protected final String TEXT_2356 = NL + "\t\t\tcase ";
  protected final String TEXT_2357 = " :" + NL + "\t\t\t\t";
  protected final String TEXT_2358 = " = newIndexBits;" + NL + "\t\t\t\tbreak;";
  protected final String TEXT_2359 = NL + "\t\t\tdefault :" + NL + "\t\t\t\tthrow new IndexOutOfBoundsException();" + NL + "\t\t}" + NL + "\t}" + NL;
  protected final String TEXT_2360 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2361 = NL + "\t@Override";
  protected final String TEXT_2362 = NL + "\tpublic String toString()" + NL + "\t{" + NL + "\t\tif (eIsProxy()) return super.toString();" + NL + "" + NL + "\t\tStringBuffer result = new StringBuffer(super.toString());";
  protected final String TEXT_2363 = NL + "\t\tresult.append(\" (";
  protected final String TEXT_2364 = ": \");";
  protected final String TEXT_2365 = NL + "\t\tresult.append(\", ";
  protected final String TEXT_2366 = ": \");";
  protected final String TEXT_2367 = NL + "\t\tif (eVirtualIsSet(";
  protected final String TEXT_2368 = ")) result.append(eVirtualGet(";
  protected final String TEXT_2369 = ")); else result.append(\"<unset>\");";
  protected final String TEXT_2370 = NL + "\t\tif (";
  protected final String TEXT_2371 = "(";
  protected final String TEXT_2372 = " & ";
  protected final String TEXT_2373 = "_ESETFLAG) != 0";
  protected final String TEXT_2374 = "ESet";
  protected final String TEXT_2375 = ") result.append((";
  protected final String TEXT_2376 = " & ";
  protected final String TEXT_2377 = "_EFLAG) != 0); else result.append(\"<unset>\");";
  protected final String TEXT_2378 = NL + "\t\tif (";
  protected final String TEXT_2379 = "(";
  protected final String TEXT_2380 = " & ";
  protected final String TEXT_2381 = "_ESETFLAG) != 0";
  protected final String TEXT_2382 = "ESet";
  protected final String TEXT_2383 = ") result.append(";
  protected final String TEXT_2384 = "_EFLAG_VALUES[(";
  protected final String TEXT_2385 = " & ";
  protected final String TEXT_2386 = "_EFLAG) >>> ";
  protected final String TEXT_2387 = "_EFLAG_OFFSET]); else result.append(\"<unset>\");";
  protected final String TEXT_2388 = NL + "\t\tif (";
  protected final String TEXT_2389 = "(";
  protected final String TEXT_2390 = " & ";
  protected final String TEXT_2391 = "_ESETFLAG) != 0";
  protected final String TEXT_2392 = "ESet";
  protected final String TEXT_2393 = ") result.append(";
  protected final String TEXT_2394 = "); else result.append(\"<unset>\");";
  protected final String TEXT_2395 = NL + "\t\tresult.append(eVirtualGet(";
  protected final String TEXT_2396 = ", ";
  protected final String TEXT_2397 = "));";
  protected final String TEXT_2398 = NL + "\t\tresult.append((";
  protected final String TEXT_2399 = " & ";
  protected final String TEXT_2400 = "_EFLAG) != 0);";
  protected final String TEXT_2401 = NL + "\t\tresult.append(";
  protected final String TEXT_2402 = "_EFLAG_VALUES[(";
  protected final String TEXT_2403 = " & ";
  protected final String TEXT_2404 = "_EFLAG) >>> ";
  protected final String TEXT_2405 = "_EFLAG_OFFSET]);";
  protected final String TEXT_2406 = NL + "\t\tresult.append(";
  protected final String TEXT_2407 = ");";
  protected final String TEXT_2408 = NL + "\t\tresult.append(')');" + NL + "\t\treturn result.toString();" + NL + "\t}" + NL;
  protected final String TEXT_2409 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected int hash = -1;" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic int getHash()" + NL + "\t{" + NL + "\t\tif (hash == -1)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2410 = " theKey = getKey();" + NL + "\t\t\thash = (theKey == null ? 0 : theKey.hashCode());" + NL + "\t\t}" + NL + "\t\treturn hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setHash(int hash)" + NL + "\t{" + NL + "\t\tthis.hash = hash;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2411 = " getKey()" + NL + "\t{";
  protected final String TEXT_2412 = NL + "\t\treturn new ";
  protected final String TEXT_2413 = "(getTypedKey());";
  protected final String TEXT_2414 = NL + "\t\treturn getTypedKey();";
  protected final String TEXT_2415 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic void setKey(";
  protected final String TEXT_2416 = " key)" + NL + "\t{";
  protected final String TEXT_2417 = NL + "\t\tgetTypedKey().addAll(";
  protected final String TEXT_2418 = "(";
  protected final String TEXT_2419 = ")";
  protected final String TEXT_2420 = "key);";
  protected final String TEXT_2421 = NL + "\t\tsetTypedKey(key);";
  protected final String TEXT_2422 = NL + "\t\tsetTypedKey(((";
  protected final String TEXT_2423 = ")key).";
  protected final String TEXT_2424 = "());";
  protected final String TEXT_2425 = NL + "\t\tsetTypedKey((";
  protected final String TEXT_2426 = ")key);";
  protected final String TEXT_2427 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2428 = " getValue()" + NL + "\t{";
  protected final String TEXT_2429 = NL + "\t\treturn new ";
  protected final String TEXT_2430 = "(getTypedValue());";
  protected final String TEXT_2431 = NL + "\t\treturn getTypedValue();";
  protected final String TEXT_2432 = NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic ";
  protected final String TEXT_2433 = " setValue(";
  protected final String TEXT_2434 = " value)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2435 = " oldValue = getValue();";
  protected final String TEXT_2436 = NL + "\t\tgetTypedValue().clear();" + NL + "\t\tgetTypedValue().addAll(";
  protected final String TEXT_2437 = "(";
  protected final String TEXT_2438 = ")";
  protected final String TEXT_2439 = "value);";
  protected final String TEXT_2440 = NL + "\t\tsetTypedValue(value);";
  protected final String TEXT_2441 = NL + "\t\tsetTypedValue(((";
  protected final String TEXT_2442 = ")value).";
  protected final String TEXT_2443 = "());";
  protected final String TEXT_2444 = NL + "\t\tsetTypedValue((";
  protected final String TEXT_2445 = ")value);";
  protected final String TEXT_2446 = NL + "\t\treturn oldValue;" + NL + "\t}" + NL + "" + NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2447 = NL + "\t@SuppressWarnings(\"unchecked\")";
  protected final String TEXT_2448 = NL + "\tpublic ";
  protected final String TEXT_2449 = " getEMap()" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2450 = " container = eContainer();" + NL + "\t\treturn container == null ? null : (";
  protected final String TEXT_2451 = ")container.eGet(eContainmentFeature());" + NL + "\t}" + NL;
  protected final String TEXT_2452 = NL + "\t/**" + NL + "\t * The cached environment for evaluating OCL expressions." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final ";
  protected final String TEXT_2453 = " EOCL_ENV = ";
  protected final String TEXT_2454 = ".newInstance();" + NL;
  protected final String TEXT_2455 = NL + "\t/**" + NL + "\t * Creates a new instance of the specified Ecore class." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @param eClass The Ecore class of the instance to create." + NL + "\t * @return The new instance." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2456 = " create(";
  protected final String TEXT_2457 = " eClass)" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2458 = ".create(eClass);" + NL + "\t}" + NL;
  protected final String TEXT_2459 = NL + "\t/**" + NL + "\t * Retrieves the cache adapter for this '<em><b>";
  protected final String TEXT_2460 = "</b></em>'." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @return The cache adapter for this '<em><b>";
  protected final String TEXT_2461 = "</b></em>'." + NL + "\t * @generated" + NL + "\t */" + NL + "\tprotected ";
  protected final String TEXT_2462 = " getCacheAdapter()" + NL + "\t{" + NL + "\t\treturn ";
  protected final String TEXT_2463 = ".getCacheAdapter(this);" + NL + "\t}" + NL;
  protected final String TEXT_2464 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2465 = NL + "\t@Override";
  protected final String TEXT_2466 = NL + "\tprotected ";
  protected final String TEXT_2467 = " ";
  protected final String TEXT_2468 = "Helper(";
  protected final String TEXT_2469 = " ";
  protected final String TEXT_2470 = ")" + NL + "\t{";
  protected final String TEXT_2471 = NL + "\t\t";
  protected final String TEXT_2472 = ".addAll(super.";
  protected final String TEXT_2473 = "());";
  protected final String TEXT_2474 = NL + "\t\tsuper.";
  protected final String TEXT_2475 = "Helper(";
  protected final String TEXT_2476 = ");";
  protected final String TEXT_2477 = NL + "\t\tif (isSet";
  protected final String TEXT_2478 = "())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2479 = "<";
  protected final String TEXT_2480 = ">";
  protected final String TEXT_2481 = " i = ((";
  protected final String TEXT_2482 = ") ";
  protected final String TEXT_2483 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2484 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2485 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2486 = "))" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2487 = "<";
  protected final String TEXT_2488 = ">";
  protected final String TEXT_2489 = " i = ((";
  protected final String TEXT_2490 = ") ";
  protected final String TEXT_2491 = "()).basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2492 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2493 = NL + "\t\t";
  protected final String TEXT_2494 = " ";
  protected final String TEXT_2495 = " = ";
  protected final String TEXT_2496 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2497 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\tfor (";
  protected final String TEXT_2498 = "<";
  protected final String TEXT_2499 = ">";
  protected final String TEXT_2500 = " i = ((";
  protected final String TEXT_2501 = ") ";
  protected final String TEXT_2502 = ").basicIterator(); i.hasNext(); )" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2503 = ".add(i.next());" + NL + "\t\t\t}" + NL + "\t\t}";
  protected final String TEXT_2504 = NL + "\t\tif (isSet";
  protected final String TEXT_2505 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2506 = ".addAll(";
  protected final String TEXT_2507 = "());" + NL + "\t\t}";
  protected final String TEXT_2508 = NL + "\t\tif (eIsSet(";
  protected final String TEXT_2509 = "))" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2510 = ".addAll(";
  protected final String TEXT_2511 = "());" + NL + "\t\t}";
  protected final String TEXT_2512 = NL + "\t\t";
  protected final String TEXT_2513 = " ";
  protected final String TEXT_2514 = " = ";
  protected final String TEXT_2515 = "();" + NL + "\t\tif (!";
  protected final String TEXT_2516 = ".isEmpty())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2517 = ".addAll(";
  protected final String TEXT_2518 = ");" + NL + "\t\t}";
  protected final String TEXT_2519 = NL + "\t\tif (isSet";
  protected final String TEXT_2520 = "())" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2521 = ".add(";
  protected final String TEXT_2522 = "basicGet";
  protected final String TEXT_2523 = "());" + NL + "\t\t}";
  protected final String TEXT_2524 = NL + "\t\t";
  protected final String TEXT_2525 = " ";
  protected final String TEXT_2526 = " = ";
  protected final String TEXT_2527 = "basicGet";
  protected final String TEXT_2528 = "();" + NL + "\t\tif (";
  protected final String TEXT_2529 = " != null)" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2530 = ".add(";
  protected final String TEXT_2531 = ");" + NL + "\t\t}";
  protected final String TEXT_2532 = NL + "\t\treturn ";
  protected final String TEXT_2533 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2534 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2535 = NL + "\t@Override";
  protected final String TEXT_2536 = NL + "\tpublic boolean isSet";
  protected final String TEXT_2537 = "()" + NL + "\t{";
  protected final String TEXT_2538 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2539 = "()";
  protected final String TEXT_2540 = NL + "\t\treturn isSet";
  protected final String TEXT_2541 = "()";
  protected final String TEXT_2542 = ";";
  protected final String TEXT_2543 = NL + "\t\treturn !";
  protected final String TEXT_2544 = "().isEmpty()";
  protected final String TEXT_2545 = ";";
  protected final String TEXT_2546 = NL + "\t\treturn ";
  protected final String TEXT_2547 = "basicGet";
  protected final String TEXT_2548 = "() != null";
  protected final String TEXT_2549 = ";";
  protected final String TEXT_2550 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_2551 = ")";
  protected final String TEXT_2552 = ";";
  protected final String TEXT_2553 = NL + "\t\t\t|| isSet";
  protected final String TEXT_2554 = "()";
  protected final String TEXT_2555 = ";";
  protected final String TEXT_2556 = NL + "\t\t\t|| !";
  protected final String TEXT_2557 = "().isEmpty()";
  protected final String TEXT_2558 = ";";
  protected final String TEXT_2559 = NL + "\t\t\t|| ";
  protected final String TEXT_2560 = "basicGet";
  protected final String TEXT_2561 = "() != null";
  protected final String TEXT_2562 = ";";
  protected final String TEXT_2563 = NL + "\t\t\t|| eIsSet(";
  protected final String TEXT_2564 = ")";
  protected final String TEXT_2565 = ";";
  protected final String TEXT_2566 = NL + "\t\treturn super.isSet";
  protected final String TEXT_2567 = "();";
  protected final String TEXT_2568 = NL + "\t\treturn false;";
  protected final String TEXT_2569 = NL + "\t}" + NL;
  protected final String TEXT_2570 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2571 = NL + "\t@Override";
  protected final String TEXT_2572 = NL + "\tpublic ";
  protected final String TEXT_2573 = " ";
  protected final String TEXT_2574 = "()" + NL + "\t{";
  protected final String TEXT_2575 = NL + "\t\t@SuppressWarnings(\"unchecked\")" + NL + "\t\t";
  protected final String TEXT_2576 = " ";
  protected final String TEXT_2577 = " = (";
  protected final String TEXT_2578 = ")((";
  protected final String TEXT_2579 = ")";
  protected final String TEXT_2580 = "());" + NL + "\t\treturn ";
  protected final String TEXT_2581 = ";";
  protected final String TEXT_2582 = NL + "\t\treturn ";
  protected final String TEXT_2583 = "();";
  protected final String TEXT_2584 = NL + "\t\treturn new ";
  protected final String TEXT_2585 = ".UnmodifiableEList";
  protected final String TEXT_2586 = "(this, ";
  protected final String TEXT_2587 = "null";
  protected final String TEXT_2588 = ", 0, ";
  protected final String TEXT_2589 = ".EMPTY_LIST.toArray());";
  protected final String TEXT_2590 = NL + "\t\treturn null;";
  protected final String TEXT_2591 = NL + "\t\treturn ";
  protected final String TEXT_2592 = "();";
  protected final String TEXT_2593 = NL + "\t}" + NL;
  protected final String TEXT_2594 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2595 = NL + "\t@Override";
  protected final String TEXT_2596 = NL + "\tpublic ";
  protected final String TEXT_2597 = " basicGet";
  protected final String TEXT_2598 = "()" + NL + "\t{";
  protected final String TEXT_2599 = NL + "\t\treturn null;";
  protected final String TEXT_2600 = NL + "\t\treturn ";
  protected final String TEXT_2601 = "basicGet";
  protected final String TEXT_2602 = "();";
  protected final String TEXT_2603 = NL + "\t}" + NL;
  protected final String TEXT_2604 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2605 = NL + "\t@Override";
  protected final String TEXT_2606 = NL + "\tpublic ";
  protected final String TEXT_2607 = " basicSet";
  protected final String TEXT_2608 = "(";
  protected final String TEXT_2609 = " new";
  protected final String TEXT_2610 = ", ";
  protected final String TEXT_2611 = " msgs)" + NL + "\t{";
  protected final String TEXT_2612 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2613 = NL + "\t\tif (new";
  protected final String TEXT_2614 = " != null && !(new";
  protected final String TEXT_2615 = " instanceof ";
  protected final String TEXT_2616 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2617 = "));" + NL + "\t\t}";
  protected final String TEXT_2618 = NL + "\t\treturn basicSet";
  protected final String TEXT_2619 = "(";
  protected final String TEXT_2620 = "(";
  protected final String TEXT_2621 = ") ";
  protected final String TEXT_2622 = "new";
  protected final String TEXT_2623 = ", msgs);";
  protected final String TEXT_2624 = NL + "\t\tset";
  protected final String TEXT_2625 = "(";
  protected final String TEXT_2626 = "(";
  protected final String TEXT_2627 = ") ";
  protected final String TEXT_2628 = "new";
  protected final String TEXT_2629 = ");" + NL + "\t\treturn msgs;";
  protected final String TEXT_2630 = NL + "\t}" + NL;
  protected final String TEXT_2631 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2632 = NL + "\t@Override";
  protected final String TEXT_2633 = NL + "\tpublic void set";
  protected final String TEXT_2634 = "(";
  protected final String TEXT_2635 = " new";
  protected final String TEXT_2636 = ")" + NL + "\t{";
  protected final String TEXT_2637 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_2638 = NL + "\t\tif (new";
  protected final String TEXT_2639 = " != null && !(new";
  protected final String TEXT_2640 = " instanceof ";
  protected final String TEXT_2641 = "))" + NL + "\t\t{" + NL + "\t\t\tthrow new IllegalArgumentException(String.valueOf(new";
  protected final String TEXT_2642 = "));" + NL + "\t\t}";
  protected final String TEXT_2643 = NL + "\t\tset";
  protected final String TEXT_2644 = "(";
  protected final String TEXT_2645 = "(";
  protected final String TEXT_2646 = ") ";
  protected final String TEXT_2647 = "new";
  protected final String TEXT_2648 = ");";
  protected final String TEXT_2649 = NL + "\t}" + NL;
  protected final String TEXT_2650 = NL + "\t/**" + NL + "\t * The array of subset feature identifiers for the '{@link #";
  protected final String TEXT_2651 = "() <em>";
  protected final String TEXT_2652 = "</em>}' ";
  protected final String TEXT_2653 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2654 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2655 = "_ESUBSETS = ";
  protected final String TEXT_2656 = ";" + NL;
  protected final String TEXT_2657 = NL + "\t/**" + NL + "\t * The array of superset feature identifiers for the '{@link #";
  protected final String TEXT_2658 = "() <em>";
  protected final String TEXT_2659 = "</em>}' ";
  protected final String TEXT_2660 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @see #";
  protected final String TEXT_2661 = "()" + NL + "\t * @generated" + NL + "\t * @ordered" + NL + "\t */" + NL + "\tprotected static final int[] ";
  protected final String TEXT_2662 = "_ESUPERSETS = ";
  protected final String TEXT_2663 = ";" + NL;
  protected final String TEXT_2664 = NL + "\t/**";
  protected final String TEXT_2665 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2666 = "}, with the specified ";
  protected final String TEXT_2667 = ", and appends it to the '<em><b>";
  protected final String TEXT_2668 = "</b></em>' ";
  protected final String TEXT_2669 = ".";
  protected final String TEXT_2670 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2671 = "}, with the specified ";
  protected final String TEXT_2672 = ", and sets the '<em><b>";
  protected final String TEXT_2673 = "</b></em>' ";
  protected final String TEXT_2674 = ".";
  protected final String TEXT_2675 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2676 = "} and appends it to the '<em><b>";
  protected final String TEXT_2677 = "</b></em>' ";
  protected final String TEXT_2678 = ".";
  protected final String TEXT_2679 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2680 = "} and sets the '<em><b>";
  protected final String TEXT_2681 = "</b></em>' ";
  protected final String TEXT_2682 = ".";
  protected final String TEXT_2683 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2684 = NL + "\t * @param ";
  protected final String TEXT_2685 = " The ";
  protected final String TEXT_2686 = " for the new {@link ";
  protected final String TEXT_2687 = "}, or <code>null</code>.";
  protected final String TEXT_2688 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2689 = "} to create." + NL + "\t * @return The new {@link ";
  protected final String TEXT_2690 = "}." + NL + "\t * @see #";
  protected final String TEXT_2691 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2692 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2693 = NL + "\t";
  protected final String TEXT_2694 = " create";
  protected final String TEXT_2695 = "(";
  protected final String TEXT_2696 = ", ";
  protected final String TEXT_2697 = " eClass);" + NL;
  protected final String TEXT_2698 = NL + "\t@Override";
  protected final String TEXT_2699 = NL + "\tpublic ";
  protected final String TEXT_2700 = " create";
  protected final String TEXT_2701 = "(";
  protected final String TEXT_2702 = ", ";
  protected final String TEXT_2703 = " eClass)" + NL + "\t{" + NL + "\t\t";
  protected final String TEXT_2704 = " new";
  protected final String TEXT_2705 = " = (";
  protected final String TEXT_2706 = ") create(eClass);";
  protected final String TEXT_2707 = NL + "\t\t";
  protected final String TEXT_2708 = "().add(new";
  protected final String TEXT_2709 = ");";
  protected final String TEXT_2710 = NL + "\t\tset";
  protected final String TEXT_2711 = "(new";
  protected final String TEXT_2712 = ");";
  protected final String TEXT_2713 = NL + "\t\tint ";
  protected final String TEXT_2714 = "ListSize = 0;";
  protected final String TEXT_2715 = NL + "\t\tint ";
  protected final String TEXT_2716 = "Size = ";
  protected final String TEXT_2717 = " == null ? 0 : ";
  protected final String TEXT_2718 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2719 = "Size > ";
  protected final String TEXT_2720 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2721 = "ListSize = ";
  protected final String TEXT_2722 = "Size;";
  protected final String TEXT_2723 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2724 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2725 = ".create";
  protected final String TEXT_2726 = "(";
  protected final String TEXT_2727 = ", ";
  protected final String TEXT_2728 = "i < ";
  protected final String TEXT_2729 = "Size ? (";
  protected final String TEXT_2730 = ") ";
  protected final String TEXT_2731 = ".get(i) : null";
  protected final String TEXT_2732 = ");" + NL + "\t\t}";
  protected final String TEXT_2733 = NL + "\t\tnew";
  protected final String TEXT_2734 = ".create";
  protected final String TEXT_2735 = "(";
  protected final String TEXT_2736 = ", ";
  protected final String TEXT_2737 = ");";
  protected final String TEXT_2738 = NL + "\t\tif (";
  protected final String TEXT_2739 = " != null)";
  protected final String TEXT_2740 = NL + "\t\t\tnew";
  protected final String TEXT_2741 = ".";
  protected final String TEXT_2742 = "().addAll(";
  protected final String TEXT_2743 = ");";
  protected final String TEXT_2744 = NL + "\t\t\tnew";
  protected final String TEXT_2745 = ".set";
  protected final String TEXT_2746 = "(";
  protected final String TEXT_2747 = ");";
  protected final String TEXT_2748 = NL + "\t\treturn new";
  protected final String TEXT_2749 = ";" + NL + "\t}" + NL;
  protected final String TEXT_2750 = NL + "\t/**";
  protected final String TEXT_2751 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2752 = "}, with the specified ";
  protected final String TEXT_2753 = ", and appends it to the '<em><b>";
  protected final String TEXT_2754 = "</b></em>' ";
  protected final String TEXT_2755 = ".";
  protected final String TEXT_2756 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2757 = "},with the specified ";
  protected final String TEXT_2758 = ", and sets the '<em><b>";
  protected final String TEXT_2759 = "</b></em>' ";
  protected final String TEXT_2760 = ".";
  protected final String TEXT_2761 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2762 = "} and appends it to the '<em><b>";
  protected final String TEXT_2763 = "</b></em>' ";
  protected final String TEXT_2764 = ".";
  protected final String TEXT_2765 = NL + "\t * Creates a new {@link ";
  protected final String TEXT_2766 = "} and sets the '<em><b>";
  protected final String TEXT_2767 = "</b></em>' ";
  protected final String TEXT_2768 = ".";
  protected final String TEXT_2769 = NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2770 = NL + "\t * @param ";
  protected final String TEXT_2771 = " The ";
  protected final String TEXT_2772 = " for the new {@link ";
  protected final String TEXT_2773 = "}, or <code>null</code>.";
  protected final String TEXT_2774 = NL + "\t * @return The new {@link ";
  protected final String TEXT_2775 = "}." + NL + "\t * @see #";
  protected final String TEXT_2776 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2777 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2778 = NL + "\t";
  protected final String TEXT_2779 = " create";
  protected final String TEXT_2780 = "(";
  protected final String TEXT_2781 = ");" + NL;
  protected final String TEXT_2782 = NL + "\t@Override";
  protected final String TEXT_2783 = NL + "\tpublic ";
  protected final String TEXT_2784 = " create";
  protected final String TEXT_2785 = "(";
  protected final String TEXT_2786 = ")" + NL + "\t{";
  protected final String TEXT_2787 = NL + "\t\treturn create";
  protected final String TEXT_2788 = "(";
  protected final String TEXT_2789 = ", ";
  protected final String TEXT_2790 = ");";
  protected final String TEXT_2791 = NL + "\t\t";
  protected final String TEXT_2792 = " new";
  protected final String TEXT_2793 = " = (";
  protected final String TEXT_2794 = ") create(";
  protected final String TEXT_2795 = ");";
  protected final String TEXT_2796 = NL + "\t\t";
  protected final String TEXT_2797 = "().add(new";
  protected final String TEXT_2798 = ");";
  protected final String TEXT_2799 = NL + "\t\tset";
  protected final String TEXT_2800 = "(new";
  protected final String TEXT_2801 = ");";
  protected final String TEXT_2802 = NL + "\t\tint ";
  protected final String TEXT_2803 = "ListSize = 0;";
  protected final String TEXT_2804 = NL + "\t\tint ";
  protected final String TEXT_2805 = "Size = ";
  protected final String TEXT_2806 = " == null ? 0 : ";
  protected final String TEXT_2807 = ".size();" + NL + "\t\tif (";
  protected final String TEXT_2808 = "Size > ";
  protected final String TEXT_2809 = "ListSize)" + NL + "\t\t\t";
  protected final String TEXT_2810 = "ListSize = ";
  protected final String TEXT_2811 = "Size;";
  protected final String TEXT_2812 = NL + "\t\tfor (int i = 0; i < ";
  protected final String TEXT_2813 = "ListSize; i++) {" + NL + "\t\t\tnew";
  protected final String TEXT_2814 = ".create";
  protected final String TEXT_2815 = "(";
  protected final String TEXT_2816 = ", ";
  protected final String TEXT_2817 = "i < ";
  protected final String TEXT_2818 = "Size ? (";
  protected final String TEXT_2819 = ") ";
  protected final String TEXT_2820 = ".get(i) : null";
  protected final String TEXT_2821 = ");" + NL + "\t\t}";
  protected final String TEXT_2822 = NL + "\t\tnew";
  protected final String TEXT_2823 = ".create";
  protected final String TEXT_2824 = "(";
  protected final String TEXT_2825 = ", ";
  protected final String TEXT_2826 = ");";
  protected final String TEXT_2827 = NL + "\t\tif (";
  protected final String TEXT_2828 = " != null)";
  protected final String TEXT_2829 = NL + "\t\t\tnew";
  protected final String TEXT_2830 = ".";
  protected final String TEXT_2831 = "().addAll(";
  protected final String TEXT_2832 = ");";
  protected final String TEXT_2833 = NL + "\t\t\tnew";
  protected final String TEXT_2834 = ".set";
  protected final String TEXT_2835 = "(";
  protected final String TEXT_2836 = ");";
  protected final String TEXT_2837 = NL + "\t\treturn new";
  protected final String TEXT_2838 = ";";
  protected final String TEXT_2839 = NL + "\t}" + NL;
  protected final String TEXT_2840 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2841 = "} with the specified ";
  protected final String TEXT_2842 = " from the '<em><b>";
  protected final String TEXT_2843 = "</b></em>' ";
  protected final String TEXT_2844 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2845 = NL + "\t * @param ";
  protected final String TEXT_2846 = " The ";
  protected final String TEXT_2847 = " of the {@link ";
  protected final String TEXT_2848 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2849 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2850 = "} with the specified ";
  protected final String TEXT_2851 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2852 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2853 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2854 = NL + "\t";
  protected final String TEXT_2855 = " get";
  protected final String TEXT_2856 = "(";
  protected final String TEXT_2857 = ");" + NL;
  protected final String TEXT_2858 = NL + "\t@Override";
  protected final String TEXT_2859 = NL + "\tpublic ";
  protected final String TEXT_2860 = " get";
  protected final String TEXT_2861 = "(";
  protected final String TEXT_2862 = ")" + NL + "\t{" + NL + "\t\treturn get";
  protected final String TEXT_2863 = "(";
  protected final String TEXT_2864 = ", false";
  protected final String TEXT_2865 = ", null";
  protected final String TEXT_2866 = ", false";
  protected final String TEXT_2867 = ");" + NL + "\t}" + NL;
  protected final String TEXT_2868 = NL + "\t/**" + NL + "\t * Retrieves the first {@link ";
  protected final String TEXT_2869 = "} with the specified ";
  protected final String TEXT_2870 = " from the '<em><b>";
  protected final String TEXT_2871 = "</b></em>' ";
  protected final String TEXT_2872 = "." + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->";
  protected final String TEXT_2873 = NL + "\t * @param ";
  protected final String TEXT_2874 = " The ";
  protected final String TEXT_2875 = " of the {@link ";
  protected final String TEXT_2876 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2877 = NL + "\t * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.";
  protected final String TEXT_2878 = NL + "\t * @param eClass The Ecore class of the {@link ";
  protected final String TEXT_2879 = "} to retrieve, or <code>null</code>.";
  protected final String TEXT_2880 = NL + "\t * @param createOnDemand Whether to create a {@link ";
  protected final String TEXT_2881 = "} on demand if not found.";
  protected final String TEXT_2882 = NL + "\t * @return The first {@link ";
  protected final String TEXT_2883 = "} with the specified ";
  protected final String TEXT_2884 = ", or <code>null</code>." + NL + "\t * @see #";
  protected final String TEXT_2885 = "()" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2886 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_2887 = NL + "\t";
  protected final String TEXT_2888 = " get";
  protected final String TEXT_2889 = "(";
  protected final String TEXT_2890 = ", boolean ignoreCase";
  protected final String TEXT_2891 = ", ";
  protected final String TEXT_2892 = " eClass";
  protected final String TEXT_2893 = ", boolean createOnDemand";
  protected final String TEXT_2894 = ");" + NL;
  protected final String TEXT_2895 = NL + "\t@Override";
  protected final String TEXT_2896 = NL + "\tpublic ";
  protected final String TEXT_2897 = " get";
  protected final String TEXT_2898 = "(";
  protected final String TEXT_2899 = ", boolean ignoreCase";
  protected final String TEXT_2900 = ", ";
  protected final String TEXT_2901 = " eClass";
  protected final String TEXT_2902 = ", boolean createOnDemand";
  protected final String TEXT_2903 = ")" + NL + "\t{";
  protected final String TEXT_2904 = NL + "\t\t";
  protected final String TEXT_2905 = "Loop: for (";
  protected final String TEXT_2906 = " ";
  protected final String TEXT_2907 = " : ";
  protected final String TEXT_2908 = "())" + NL + "\t\t{";
  protected final String TEXT_2909 = NL + "\t\t";
  protected final String TEXT_2910 = "Loop: for (";
  protected final String TEXT_2911 = " i = ";
  protected final String TEXT_2912 = "().iterator(); i.hasNext(); )" + NL + "\t\t{" + NL + "\t\t\t";
  protected final String TEXT_2913 = " ";
  protected final String TEXT_2914 = " = (";
  protected final String TEXT_2915 = ") i.next();";
  protected final String TEXT_2916 = NL + "\t\t\tif (eClass != null && !eClass.isInstance(";
  protected final String TEXT_2917 = "))" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2918 = "Loop;";
  protected final String TEXT_2919 = NL + "\t\t\t";
  protected final String TEXT_2920 = " ";
  protected final String TEXT_2921 = "List = ";
  protected final String TEXT_2922 = ".";
  protected final String TEXT_2923 = "();" + NL + "\t\t\tint ";
  protected final String TEXT_2924 = "ListSize = ";
  protected final String TEXT_2925 = "List.size();" + NL + "\t\t\tif (";
  protected final String TEXT_2926 = " || (";
  protected final String TEXT_2927 = " != null && ";
  protected final String TEXT_2928 = ".size() != ";
  protected final String TEXT_2929 = "ListSize";
  protected final String TEXT_2930 = ")";
  protected final String TEXT_2931 = ")" + NL + "\t\t\t\tcontinue  ";
  protected final String TEXT_2932 = "Loop;" + NL + "\t\t\tfor (int j = 0; j < ";
  protected final String TEXT_2933 = "ListSize; j++)" + NL + "\t\t\t{" + NL + "\t\t\t\t";
  protected final String TEXT_2934 = " ";
  protected final String TEXT_2935 = " = ";
  protected final String TEXT_2936 = "(";
  protected final String TEXT_2937 = ") ";
  protected final String TEXT_2938 = "List.get(j);";
  protected final String TEXT_2939 = NL + "\t\t\t\tif (";
  protected final String TEXT_2940 = " != null && !(ignoreCase ? (";
  protected final String TEXT_2941 = "(";
  protected final String TEXT_2942 = ")";
  protected final String TEXT_2943 = ".get(j)).equalsIgnoreCase(";
  protected final String TEXT_2944 = ".";
  protected final String TEXT_2945 = "()) : ";
  protected final String TEXT_2946 = ".get(j).equals(";
  protected final String TEXT_2947 = ".";
  protected final String TEXT_2948 = "())))";
  protected final String TEXT_2949 = NL + "\t\t\t\tif (";
  protected final String TEXT_2950 = " != null && !";
  protected final String TEXT_2951 = ".get(j).equals(";
  protected final String TEXT_2952 = ".";
  protected final String TEXT_2953 = "()))";
  protected final String TEXT_2954 = NL + "\t\t\t\t\tcontinue ";
  protected final String TEXT_2955 = "Loop;";
  protected final String TEXT_2956 = NL + "\t\t\t}";
  protected final String TEXT_2957 = NL + "\t\t\t";
  protected final String TEXT_2958 = " ";
  protected final String TEXT_2959 = " = ";
  protected final String TEXT_2960 = ".";
  protected final String TEXT_2961 = "();" + NL + "\t\t\tif (";
  protected final String TEXT_2962 = " == null)" + NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2963 = "Loop;";
  protected final String TEXT_2964 = NL + "\t\t\tif (";
  protected final String TEXT_2965 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2966 = ".equalsIgnoreCase(";
  protected final String TEXT_2967 = ".";
  protected final String TEXT_2968 = "()) : ";
  protected final String TEXT_2969 = ".equals(";
  protected final String TEXT_2970 = ".";
  protected final String TEXT_2971 = "())))";
  protected final String TEXT_2972 = NL + "\t\t\tif (";
  protected final String TEXT_2973 = " != null && !";
  protected final String TEXT_2974 = ".equals(";
  protected final String TEXT_2975 = ".";
  protected final String TEXT_2976 = "()))";
  protected final String TEXT_2977 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2978 = "Loop;";
  protected final String TEXT_2979 = NL + "\t\t\tif (";
  protected final String TEXT_2980 = " != null && !(ignoreCase ? ";
  protected final String TEXT_2981 = ".equalsIgnoreCase(";
  protected final String TEXT_2982 = ".";
  protected final String TEXT_2983 = "()) : ";
  protected final String TEXT_2984 = ".equals(";
  protected final String TEXT_2985 = ".";
  protected final String TEXT_2986 = "())))";
  protected final String TEXT_2987 = NL + "\t\t\tif (";
  protected final String TEXT_2988 = " != null && !";
  protected final String TEXT_2989 = ".equals(";
  protected final String TEXT_2990 = ".";
  protected final String TEXT_2991 = "()))";
  protected final String TEXT_2992 = NL + "\t\t\t\tcontinue ";
  protected final String TEXT_2993 = "Loop;";
  protected final String TEXT_2994 = NL + "\t\t\treturn ";
  protected final String TEXT_2995 = ";" + NL + "\t\t}";
  protected final String TEXT_2996 = NL + "\t\treturn createOnDemand";
  protected final String TEXT_2997 = " && eClass != null";
  protected final String TEXT_2998 = " ? create";
  protected final String TEXT_2999 = "(";
  protected final String TEXT_3000 = ", eClass";
  protected final String TEXT_3001 = ") : null;";
  protected final String TEXT_3002 = NL + "\t\treturn null;";
  protected final String TEXT_3003 = NL + "\t}" + NL;
  protected final String TEXT_3004 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */" + NL + "\tpublic boolean isSet";
  protected final String TEXT_3005 = "()" + NL + "\t{";
  protected final String TEXT_3006 = NL + "  \t\treturn false;";
  protected final String TEXT_3007 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_3008 = ");";
  protected final String TEXT_3009 = NL + "\t\treturn !((";
  protected final String TEXT_3010 = ".Internal.Wrapper)";
  protected final String TEXT_3011 = "()).featureMap().isEmpty();";
  protected final String TEXT_3012 = NL + "\t\treturn ";
  protected final String TEXT_3013 = " != null && !";
  protected final String TEXT_3014 = ".featureMap().isEmpty();";
  protected final String TEXT_3015 = NL + "\t\treturn ";
  protected final String TEXT_3016 = " != null && !";
  protected final String TEXT_3017 = ".isEmpty();";
  protected final String TEXT_3018 = NL + "\t\t";
  protected final String TEXT_3019 = " ";
  protected final String TEXT_3020 = " = (";
  protected final String TEXT_3021 = ")eVirtualGet(";
  protected final String TEXT_3022 = ");" + NL + "\t\treturn ";
  protected final String TEXT_3023 = " != null && !";
  protected final String TEXT_3024 = ".isEmpty();";
  protected final String TEXT_3025 = NL + "\t\treturn !";
  protected final String TEXT_3026 = "().isEmpty();";
  protected final String TEXT_3027 = NL + "\t\treturn ";
  protected final String TEXT_3028 = " != null;";
  protected final String TEXT_3029 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3030 = ") != null;";
  protected final String TEXT_3031 = NL + "\t\treturn basicGet";
  protected final String TEXT_3032 = "() != null;";
  protected final String TEXT_3033 = NL + "\t\treturn ";
  protected final String TEXT_3034 = " != null;";
  protected final String TEXT_3035 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3036 = ") != null;";
  protected final String TEXT_3037 = NL + "\t\treturn ";
  protected final String TEXT_3038 = "() != null;";
  protected final String TEXT_3039 = NL + "\t\t\t\treturn ((";
  protected final String TEXT_3040 = " & ";
  protected final String TEXT_3041 = "_EFLAG) != 0) != ";
  protected final String TEXT_3042 = ";";
  protected final String TEXT_3043 = NL + "\t\t\t\treturn (";
  protected final String TEXT_3044 = " & ";
  protected final String TEXT_3045 = "_EFLAG) != ";
  protected final String TEXT_3046 = "_EFLAG_DEFAULT;";
  protected final String TEXT_3047 = NL + "\t\treturn ";
  protected final String TEXT_3048 = " != ";
  protected final String TEXT_3049 = ";";
  protected final String TEXT_3050 = NL + "\t\treturn eVirtualGet(";
  protected final String TEXT_3051 = ", ";
  protected final String TEXT_3052 = ") != ";
  protected final String TEXT_3053 = ";";
  protected final String TEXT_3054 = NL + "\t\treturn ";
  protected final String TEXT_3055 = "() != ";
  protected final String TEXT_3056 = ";";
  protected final String TEXT_3057 = NL + "\t\treturn ";
  protected final String TEXT_3058 = " == null ? ";
  protected final String TEXT_3059 = " != null : !";
  protected final String TEXT_3060 = ".equals(";
  protected final String TEXT_3061 = ");";
  protected final String TEXT_3062 = NL + "\t\t";
  protected final String TEXT_3063 = " ";
  protected final String TEXT_3064 = " = (";
  protected final String TEXT_3065 = ")eVirtualGet(";
  protected final String TEXT_3066 = ", ";
  protected final String TEXT_3067 = ");" + NL + "\t\treturn ";
  protected final String TEXT_3068 = " == null ? ";
  protected final String TEXT_3069 = " != null : !";
  protected final String TEXT_3070 = ".equals(";
  protected final String TEXT_3071 = ");";
  protected final String TEXT_3072 = NL + "\t\treturn ";
  protected final String TEXT_3073 = " == null ? ";
  protected final String TEXT_3074 = "() != null : !";
  protected final String TEXT_3075 = ".equals(";
  protected final String TEXT_3076 = "());";
  protected final String TEXT_3077 = NL + "\t\treturn eIsSet(";
  protected final String TEXT_3078 = ");";
  protected final String TEXT_3079 = NL + "\t\t";
  protected final String TEXT_3080 = " ";
  protected final String TEXT_3081 = " = (";
  protected final String TEXT_3082 = ")eVirtualGet(";
  protected final String TEXT_3083 = ");";
  protected final String TEXT_3084 = NL + "\t\treturn ";
  protected final String TEXT_3085 = " != null && ((";
  protected final String TEXT_3086 = ".Unsettable";
  protected final String TEXT_3087 = ")";
  protected final String TEXT_3088 = ").isSet();";
  protected final String TEXT_3089 = NL + "\t\treturn eVirtualIsSet(";
  protected final String TEXT_3090 = ");";
  protected final String TEXT_3091 = NL + "\t\treturn (";
  protected final String TEXT_3092 = " & ";
  protected final String TEXT_3093 = "_ESETFLAG) != 0;";
  protected final String TEXT_3094 = NL + "\t\treturn ";
  protected final String TEXT_3095 = "ESet;";
  protected final String TEXT_3096 = NL + "\t\treturn !((";
  protected final String TEXT_3097 = ".Internal)((";
  protected final String TEXT_3098 = ".Internal.Wrapper)get";
  protected final String TEXT_3099 = "()).featureMap()).isEmpty(";
  protected final String TEXT_3100 = ");";
  protected final String TEXT_3101 = NL + "\t\treturn !((";
  protected final String TEXT_3102 = ".Internal)get";
  protected final String TEXT_3103 = "()).isEmpty(";
  protected final String TEXT_3104 = ");";
  protected final String TEXT_3105 = NL + "\t\treturn ";
  protected final String TEXT_3106 = ".";
  protected final String TEXT_3107 = "(this);";
  protected final String TEXT_3108 = NL + "\t\t// TODO: implement this method to return whether the '";
  protected final String TEXT_3109 = "' ";
  protected final String TEXT_3110 = " is set" + NL + "\t\t// Ensure that you remove @generated or mark it @generated NOT" + NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_3111 = NL + "\t}" + NL;
  protected final String TEXT_3112 = NL + "\t/**" + NL + "\t * <!-- begin-user-doc -->" + NL + "\t * <!-- end-user-doc -->" + NL + "\t * @generated" + NL + "\t */";
  protected final String TEXT_3113 = NL + "\t@Override";
  protected final String TEXT_3114 = NL + "\tpublic ";
  protected final String TEXT_3115 = " ";
  protected final String TEXT_3116 = "(";
  protected final String TEXT_3117 = ")";
  protected final String TEXT_3118 = NL + "\t{";
  protected final String TEXT_3119 = NL + "\t\t";
  protected final String TEXT_3120 = "(";
  protected final String TEXT_3121 = ");";
  protected final String TEXT_3122 = NL + "\t\tthrow new UnsupportedOperationException();";
  protected final String TEXT_3123 = NL + "\t\treturn ";
  protected final String TEXT_3124 = "(";
  protected final String TEXT_3125 = ");";
  protected final String TEXT_3126 = NL + "\t}" + NL;
  protected final String TEXT_3127 = NL + "} //";
  protected final String TEXT_3128 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
    
/**
 * <copyright>
 *
 * Copyright (c) 2002-2007 IBM Corporation and others.
 * All rights reserved.   This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *   IBM - Initial API and implementation
 *
 * </copyright>
 */

    final GenClass genClass = (GenClass)((Object[])argument)[0]; final GenPackage genPackage = genClass.getGenPackage(); final GenModel genModel=genPackage.getGenModel();
    final boolean isJDK50 = genModel.getComplianceLevel().getValue() >= GenJDKLevel.JDK50;
    final boolean isInterface = Boolean.TRUE.equals(((Object[])argument)[1]); final boolean isImplementation = Boolean.TRUE.equals(((Object[])argument)[2]);
    final String publicStaticFinalFlag = isImplementation ? "public static final " : "";
    final String singleWildcard = isJDK50 ? "<?>" : "";
    final String negativeOffsetCorrection = genClass.hasOffsetCorrection() ? " - " + genClass.getOffsetCorrectionField(null) : "";
    final String positiveOffsetCorrection = genClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(null) : "";
    stringBuffer.append(TEXT_1);
    stringBuffer.append(TEXT_2);
    {GenBase copyrightHolder = argument instanceof GenBase ? (GenBase)argument : argument instanceof Object[] && ((Object[])argument)[0] instanceof GenBase ? (GenBase)((Object[])argument)[0] : null;
    if (copyrightHolder != null && copyrightHolder.hasCopyright()) {
    stringBuffer.append(TEXT_3);
    stringBuffer.append(copyrightHolder.getCopyright(copyrightHolder.getGenModel().getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_4);
    stringBuffer.append("$");
    stringBuffer.append(TEXT_5);
    stringBuffer.append("$");
    }}
    stringBuffer.append(TEXT_6);
    if (isInterface) {
    stringBuffer.append(TEXT_7);
    stringBuffer.append(genPackage.getInterfacePackageName());
    stringBuffer.append(TEXT_8);
    } else {
    stringBuffer.append(TEXT_9);
    stringBuffer.append(genPackage.getClassPackageName());
    stringBuffer.append(TEXT_10);
    }
    stringBuffer.append(TEXT_11);
    genModel.markImportLocation(stringBuffer, genPackage);
    if (isImplementation) { genClass.addClassPsuedoImports(); }
    stringBuffer.append(TEXT_12);
    if (isInterface) {
    stringBuffer.append(TEXT_13);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_14);
    if (genClass.hasDocumentation()) {
    stringBuffer.append(TEXT_15);
    stringBuffer.append(genClass.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_16);
    }
    stringBuffer.append(TEXT_17);
    if (!genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_18);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    if (!genFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_19);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_20);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_21);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_22);
    }
    }
    stringBuffer.append(TEXT_23);
    }
    stringBuffer.append(TEXT_24);
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_25);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_26);
    stringBuffer.append(genClass.getClassifierAccessorName());
    stringBuffer.append(TEXT_27);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genClass.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_28);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_29);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_30);
    }}
    if (genClass.needsRootExtendsInterfaceExtendsTag()) {
    stringBuffer.append(TEXT_31);
    stringBuffer.append(genModel.getImportedName(genModel.getRootExtendsInterface()));
    }
    stringBuffer.append(TEXT_32);
    } else {
    stringBuffer.append(TEXT_33);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_34);
    if (!genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_35);
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) {
    stringBuffer.append(TEXT_36);
    stringBuffer.append(genClass.getQualifiedClassName());
    stringBuffer.append(TEXT_37);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_38);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_39);
    }
    stringBuffer.append(TEXT_40);
    }
    stringBuffer.append(TEXT_41);
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_42);
    if (genClass.isAbstract()) {
    stringBuffer.append(TEXT_43);
    }
    stringBuffer.append(TEXT_44);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(genClass.getTypeParameters().trim());
    stringBuffer.append(genClass.getClassExtends());
    stringBuffer.append(genClass.getClassImplements());
    } else {
    stringBuffer.append(TEXT_45);
    stringBuffer.append(genClass.getInterfaceName());
    stringBuffer.append(genClass.getTypeParameters().trim());
    stringBuffer.append(genClass.getInterfaceExtends());
    }
    stringBuffer.append(TEXT_46);
    if (genModel.hasCopyrightField()) {
    stringBuffer.append(TEXT_47);
    stringBuffer.append(publicStaticFinalFlag);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_48);
    stringBuffer.append(genModel.getCopyrightFieldLiteral());
    stringBuffer.append(TEXT_49);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_50);
    }
    if (isImplementation && genModel.getDriverNumber() != null) {
    stringBuffer.append(TEXT_51);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_52);
    stringBuffer.append(genModel.getDriverNumber());
    stringBuffer.append(TEXT_53);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_54);
    }
    if (isImplementation && genClass.isJavaIOSerializable()) {
    stringBuffer.append(TEXT_55);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_56);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_57);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) {
    for (String eVirtualIndexBitField : eVirtualIndexBitFields) {
    stringBuffer.append(TEXT_58);
    stringBuffer.append(eVirtualIndexBitField);
    stringBuffer.append(TEXT_59);
    }
    }
    }
    }
    if (isImplementation && genClass.isModelRoot() && genModel.isBooleanFlagsEnabled() && genModel.getBooleanFlagsReservedBits() == -1) {
    stringBuffer.append(TEXT_60);
    stringBuffer.append(genModel.getBooleanFlagsField());
    stringBuffer.append(TEXT_61);
    }
    if (isImplementation && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getDeclaredFieldGenFeatures()) {
    if (genFeature.isListType() || genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_62);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_63);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_64);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_65);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_66);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_67);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_68);
    }
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) { String rawListItemType = genFeature.getRawListItemType(); int index = rawListItemType.indexOf('['); String head = rawListItemType; String tail = ""; if (index != -1) { head = rawListItemType.substring(0, index); tail = rawListItemType.substring(index); } 
    stringBuffer.append(TEXT_69);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_70);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_71);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_72);
    if (genFeature.getQualifiedListItemType(genClass).contains("<")) {
    stringBuffer.append(TEXT_73);
    }
    stringBuffer.append(TEXT_74);
    stringBuffer.append(rawListItemType);
    stringBuffer.append(TEXT_75);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_76);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_77);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_78);
    }
    } else {
    if (genFeature.hasEDefault() && (!genFeature.isVolatile() || !genModel.isReflectiveDelegation() && (!genFeature.hasDelegateFeature() || !genFeature.isUnsettable()))) { String staticDefaultValue = genFeature.getStaticDefaultValue();
    stringBuffer.append(TEXT_79);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_80);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_81);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_82);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_83);
    if (genModel.useGenerics() && genFeature.isListDataType() && genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_84);
    }
    stringBuffer.append(TEXT_85);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_86);
    stringBuffer.append(genFeature.getEDefault());
    if ("".equals(staticDefaultValue)) {
    stringBuffer.append(TEXT_87);
    stringBuffer.append(genFeature.getEcoreFeature().getDefaultValueLiteral());
    stringBuffer.append(TEXT_88);
    } else {
    stringBuffer.append(TEXT_89);
    stringBuffer.append(staticDefaultValue);
    stringBuffer.append(TEXT_90);
    stringBuffer.append(genModel.getNonNLS(staticDefaultValue));
    }
    stringBuffer.append(TEXT_91);
    }
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) { int flagIndex = genClass.getFlagIndex(genFeature);
    if (flagIndex > 31 && flagIndex % 32 == 0) {
    stringBuffer.append(TEXT_92);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_93);
    }
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_94);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_95);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_96);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_97);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_98);
    stringBuffer.append(flagIndex % 32);
    stringBuffer.append(TEXT_99);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_100);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_101);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_102);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_103);
    if (isJDK50) {
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_104);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_105);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_106);
    }
    stringBuffer.append(TEXT_107);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_108);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_109);
    stringBuffer.append(genFeature.getTypeGenClassifier().getFormattedName());
    stringBuffer.append(TEXT_110);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_111);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_112);
    if (isJDK50) {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_113);
    } else {
    stringBuffer.append(TEXT_114);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_115);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_116);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_117);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_118);
    }
    stringBuffer.append(TEXT_119);
    }
    stringBuffer.append(TEXT_120);
    stringBuffer.append(genClass.getFlagSize(genFeature) > 1 ? "s" : "");
    stringBuffer.append(TEXT_121);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_122);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_123);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_124);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_125);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_126);
    stringBuffer.append(genClass.getFlagMask(genFeature));
    stringBuffer.append(TEXT_127);
    if (genFeature.isEnumType()) {
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_128);
    } else {
    stringBuffer.append(flagIndex % 32);
    }
    stringBuffer.append(TEXT_129);
    } else {
    stringBuffer.append(TEXT_130);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_131);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_132);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_133);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_134);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_135);
    stringBuffer.append(genFeature.getSafeName());
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_136);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_137);
    }
    }
    }
    if (genClass.isESetField(genFeature)) {
    if (genClass.isESetFlag(genFeature)) { int flagIndex = genClass.getESetFlagIndex(genFeature);
    if (flagIndex > 31 && flagIndex % 32 == 0) {
    stringBuffer.append(TEXT_138);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_139);
    }
    stringBuffer.append(TEXT_140);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_141);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_142);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_143);
    stringBuffer.append(flagIndex % 32 );
    stringBuffer.append(TEXT_144);
    } else {
    stringBuffer.append(TEXT_145);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_146);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_147);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_148);
    }
    }
    //Class/declaredFieldGenFeature.override.javajetinc
    }
    }
    if (isImplementation && genClass.hasOffsetCorrection() && !genClass.getImplementedGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_149);
    stringBuffer.append(genClass.getOffsetCorrectionField(null));
    stringBuffer.append(TEXT_150);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_151);
    stringBuffer.append(genClass.getImplementedGenFeatures().get(0).getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_152);
    stringBuffer.append(genClass.getQualifiedFeatureID(genClass.getImplementedGenFeatures().get(0)));
    stringBuffer.append(TEXT_153);
    }
    if (isImplementation && genClass.hasOffsetCorrection() && !genModel.isReflectiveDelegation()) {
    for (GenFeature genFeature : genClass.getImplementedGenFeatures()) { GenFeature reverseFeature = genFeature.getReverse();
    if (reverseFeature != null && reverseFeature.getGenClass().hasOffsetCorrection()) {
    stringBuffer.append(TEXT_154);
    stringBuffer.append(genClass.getOffsetCorrectionField(genFeature));
    stringBuffer.append(TEXT_155);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_156);
    stringBuffer.append(reverseFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_157);
    stringBuffer.append(reverseFeature.getGenClass().getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(TEXT_158);
    }
    }
    }
    if (isImplementation) {
    stringBuffer.append(TEXT_159);
    if (genModel.isPublicConstructors()) {
    stringBuffer.append(TEXT_160);
    } else {
    stringBuffer.append(TEXT_161);
    }
    stringBuffer.append(TEXT_162);
    stringBuffer.append(genClass.getClassName());
    stringBuffer.append(TEXT_163);
    for (GenFeature genFeature : genClass.getFlagGenFeaturesWithDefault()) {
    stringBuffer.append(TEXT_164);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_165);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_166);
    if (!genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_167);
    }
    stringBuffer.append(TEXT_168);
    }
    stringBuffer.append(TEXT_169);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_170);
    }
    stringBuffer.append(TEXT_171);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_172);
    stringBuffer.append(genClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_173);
    }
    if (isImplementation && (genModel.getFeatureDelegation() == GenDelegationKind.REFLECTIVE_LITERAL || genModel.isDynamicDelegation()) && (genClass.getClassExtendsGenClass() == null || (genClass.getClassExtendsGenClass().getGenModel().getFeatureDelegation() != GenDelegationKind.REFLECTIVE_LITERAL && !genClass.getClassExtendsGenClass().getGenModel().isDynamicDelegation()))) {
    stringBuffer.append(TEXT_174);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_175);
    }
    stringBuffer.append(TEXT_176);
    stringBuffer.append(genClass.getClassExtendsGenClass() == null ? 0 : genClass.getClassExtendsGenClass().getAllGenFeatures().size());
    stringBuffer.append(TEXT_177);
    }
    //Class/reflectiveDelegation.override.javajetinc
    new Runnable() { public void run() {
    for (GenFeature genFeature : (isImplementation ? genClass.getImplementedGenFeatures() : genClass.getDeclaredGenFeatures())) {
    if (genModel.isArrayAccessors() && genFeature.isListType() && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_178);
    if (!isImplementation) {
    stringBuffer.append(TEXT_179);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_180);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_181);
    } else {
    stringBuffer.append(TEXT_182);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_183);
    stringBuffer.append(genFeature.getGetArrayAccessor());
    stringBuffer.append(TEXT_184);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_185);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_186);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_187);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_188);
    if (genModel.useGenerics() && !genFeature.getListItemType(genClass).contains("<") && !genFeature.getListItemType(null).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_189);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_190);
    }
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_191);
    } else {
    stringBuffer.append(TEXT_192);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_193);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_194);
    if (genModel.useGenerics() && !genFeature.getListItemType(genClass).contains("<") && !genFeature.getListItemType(null).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_195);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_196);
    }
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_197);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_198);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_199);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_200);
    }
    stringBuffer.append(TEXT_201);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_202);
    }
    stringBuffer.append(TEXT_203);
    if (!isImplementation) {
    stringBuffer.append(TEXT_204);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_205);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_206);
    } else {
    stringBuffer.append(TEXT_207);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_208);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_209);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_210);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_211);
    }
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_212);
    }
    stringBuffer.append(TEXT_213);
    if (!isImplementation) {
    stringBuffer.append(TEXT_214);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_215);
    } else {
    stringBuffer.append(TEXT_216);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_217);
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_218);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_219);
    } else {
    stringBuffer.append(TEXT_220);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_221);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_222);
    }
    stringBuffer.append(TEXT_223);
    }
    stringBuffer.append(TEXT_224);
    if (!isImplementation) {
    stringBuffer.append(TEXT_225);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_226);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_227);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_228);
    } else {
    stringBuffer.append(TEXT_229);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_230);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_231);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_232);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(genFeature.getListTemplateArguments(genClass));
    stringBuffer.append(TEXT_233);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_234);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_235);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_236);
    }
    stringBuffer.append(TEXT_237);
    if (!isImplementation) {
    stringBuffer.append(TEXT_238);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_239);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_240);
    } else {
    stringBuffer.append(TEXT_241);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_242);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_243);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_244);
    }
    }
    if (genFeature.isGet() && (isImplementation || !genFeature.isSuppressedGetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_245);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_246);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_247);
    if (genFeature.isListType()) {
    if (genFeature.isMapType()) { GenFeature keyFeature = genFeature.getMapEntryTypeGenClass().getMapEntryKeyFeature(); GenFeature valueFeature = genFeature.getMapEntryTypeGenClass().getMapEntryValueFeature(); 
    stringBuffer.append(TEXT_248);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_249);
    stringBuffer.append(keyFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_250);
    } else {
    stringBuffer.append(TEXT_251);
    stringBuffer.append(keyFeature.getType(genClass));
    stringBuffer.append(TEXT_252);
    }
    stringBuffer.append(TEXT_253);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_254);
    stringBuffer.append(valueFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_255);
    } else {
    stringBuffer.append(TEXT_256);
    stringBuffer.append(valueFeature.getType(genClass));
    stringBuffer.append(TEXT_257);
    }
    stringBuffer.append(TEXT_258);
    } else if (!genFeature.isWrappedFeatureMapType() && !(genModel.isSuppressEMFMetaData() && "org.eclipse.emf.ecore.EObject".equals(genFeature.getQualifiedListItemType(genClass)))) {
String typeName = genFeature.getQualifiedListItemType(genClass); String head = typeName; String tail = ""; int index = typeName.indexOf('<'); if (index == -1) { index = typeName.indexOf('['); } 
if (index != -1) { head = typeName.substring(0, index); tail = typeName.substring(index).replaceAll("<", "&lt;"); }

    stringBuffer.append(TEXT_259);
    stringBuffer.append(head);
    stringBuffer.append(TEXT_260);
    stringBuffer.append(tail);
    stringBuffer.append(TEXT_261);
    }
    } else if (genFeature.isSetDefaultValue()) {
    stringBuffer.append(TEXT_262);
    stringBuffer.append(genFeature.getDefaultValue());
    stringBuffer.append(TEXT_263);
    }
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_264);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    stringBuffer.append(TEXT_265);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_266);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_267);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_268);
    stringBuffer.append(reverseGenFeature.getFormattedName());
    stringBuffer.append(TEXT_269);
    }
    }
    if (!UML2GenModelUtil.getSubsettedGenFeatures(genFeature).isEmpty()) {
    stringBuffer.append(TEXT_270);
    for (GenFeature subsettedGenFeature : UML2GenModelUtil.getSubsettedGenFeatures(genFeature)) {
    stringBuffer.append(TEXT_271);
    stringBuffer.append(subsettedGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_272);
    stringBuffer.append(subsettedGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_273);
    stringBuffer.append(subsettedGenFeature.getFormattedName());
    stringBuffer.append(TEXT_274);
    }
    stringBuffer.append(TEXT_275);
    }if (UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_276);
    for (GenFeature redefinedGenFeature : UML2GenModelUtil.getRedefinedGenFeatures(genFeature)) {
    stringBuffer.append(TEXT_277);
    stringBuffer.append(redefinedGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_278);
    stringBuffer.append(redefinedGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_279);
    stringBuffer.append(redefinedGenFeature.getFormattedName());
    stringBuffer.append(TEXT_280);
    }
    stringBuffer.append(TEXT_281);
    }if(genFeature.isDerived() && UML2GenModelUtil.isUnion(genFeature)){
    stringBuffer.append(TEXT_282);
    }
    stringBuffer.append(TEXT_283);
    if (!genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_284);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_285);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_286);
    }
    stringBuffer.append(TEXT_287);
    if (genFeature.hasDocumentation()) {
    stringBuffer.append(TEXT_288);
    stringBuffer.append(genFeature.getDocumentation(genModel.getIndentation(stringBuffer)));
    stringBuffer.append(TEXT_289);
    }
    stringBuffer.append(TEXT_290);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_291);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_292);
    if (genFeature.getTypeGenEnum() != null) {
    stringBuffer.append(TEXT_293);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_294);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_295);
    }
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_296);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_297);
    }
    }
    if (genFeature.isChangeable() && !genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_298);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_299);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_300);
    }
    if (!genModel.isSuppressEMFMetaData()) {
    stringBuffer.append(TEXT_301);
    stringBuffer.append(genPackage.getQualifiedPackageInterfaceName());
    stringBuffer.append(TEXT_302);
    stringBuffer.append(genFeature.getFeatureAccessorName());
    stringBuffer.append(TEXT_303);
    }
    if (genFeature.isBidirectional() && !genFeature.getReverse().getGenClass().isMapEntry()) { GenFeature reverseGenFeature = genFeature.getReverse(); 
    if (!reverseGenFeature.isSuppressedGetVisibility()) {
    stringBuffer.append(TEXT_304);
    stringBuffer.append(reverseGenFeature.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_305);
    stringBuffer.append(reverseGenFeature.getGetAccessor());
    }
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genFeature.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_306);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_307);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_308);
    }}
    stringBuffer.append(TEXT_309);
    //Class/getGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_310);
    if (isJDK50) { //Class/getGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_311);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_312);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_313);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_314);
    } else {
    if (genModel.useGenerics() && ((genFeature.isContainer() || genFeature.isResolveProxies()) && !genFeature.isListType() && !(genModel.isReflectiveDelegation() && genModel.isDynamicDelegation()) && genFeature.isUncheckedCast(genClass) || genFeature.isListType() && !genFeature.isFeatureMapType() && (genModel.isReflectiveDelegation() || genModel.isVirtualDelegation() || genModel.isDynamicDelegation()) || genFeature.isListDataType() && genFeature.hasDelegateFeature())) {
    stringBuffer.append(TEXT_315);
    }
    stringBuffer.append(TEXT_316);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_317);
    stringBuffer.append(genFeature.getGetAccessor());
    if (genClass.hasCollidingGetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_318);
    }
    stringBuffer.append(TEXT_319);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_320);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_321);
    }
    stringBuffer.append(TEXT_322);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_323);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_324);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_325);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_326);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_327);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_328);
    }
    stringBuffer.append(TEXT_329);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_330);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_331);
    }
    stringBuffer.append(TEXT_332);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_333);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_334);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_335);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_336);
    }
    stringBuffer.append(TEXT_337);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_338);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_339);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_340);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_341);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_342);
    }
    stringBuffer.append(TEXT_343);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_344);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_345);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_346);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_347);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_348);
    } else {
    stringBuffer.append(TEXT_349);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_350);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_351);
    }
    stringBuffer.append(TEXT_352);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes() ? ".map()" : "");
    stringBuffer.append(TEXT_353);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_354);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_355);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_356);
    } else {
    if (genFeature.isResolveProxies()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_357);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_358);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_359);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_360);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_361);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_362);
    }
    stringBuffer.append(TEXT_363);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_364);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_365);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_366);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_367);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_368);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_369);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_370);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_371);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_372);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_373);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_374);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_375);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_376);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_377);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_378);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_379);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_380);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_381);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_382);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_383);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_384);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_385);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_386);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_387);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_388);
    }
    stringBuffer.append(TEXT_389);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_390);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_391);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_392);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_393);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_394);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_395);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_396);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_397);
    }
    stringBuffer.append(TEXT_398);
    } else if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_399);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_400);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_401);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_402);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_403);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_404);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_405);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_406);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_407);
    }
    stringBuffer.append(TEXT_408);
    }
    if (!genFeature.isResolveProxies() && genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_409);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_410);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_411);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_412);
    } else if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_413);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_414);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_415);
    } else {
    stringBuffer.append(TEXT_416);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_417);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_418);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_419);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_420);
    }
    } else {
    stringBuffer.append(TEXT_421);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_422);
    }
    }
    } else {//volatile
    if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_423);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_424);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_425);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_426);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_427);
    stringBuffer.append(genFeature.getSafeNameAsEObject());
    stringBuffer.append(TEXT_428);
    stringBuffer.append(genFeature.getNonEObjectInternalTypeCast(genClass));
    stringBuffer.append(TEXT_429);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_430);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_431);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_432);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (genFeature.isFeatureMapType()) {
    String featureMapEntryTemplateArgument = isJDK50 ? "<" + genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap") + ".Entry>" : "";
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_433);
    stringBuffer.append(genFeature.getImportedEffectiveFeatureMapWrapperClass());
    stringBuffer.append(TEXT_434);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_435);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_436);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_437);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_438);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_439);
    } else {
    stringBuffer.append(TEXT_440);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_441);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_442);
    stringBuffer.append(featureMapEntryTemplateArgument);
    stringBuffer.append(TEXT_443);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_444);
    }
    } else if (genFeature.isListType()) {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_445);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_446);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_447);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_448);
    } else {
    stringBuffer.append(TEXT_449);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_450);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_451);
    }
    } else {
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_452);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_453);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_454);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_455);
    }
    stringBuffer.append(TEXT_456);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_457);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_458);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_459);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_460);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_461);
    }
    stringBuffer.append(TEXT_462);
    } else {
    stringBuffer.append(TEXT_463);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_464);
    }
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType()) {
    stringBuffer.append(TEXT_465);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_466);
    }
    stringBuffer.append(TEXT_467);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_468);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_469);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_470);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_471);
    }
    stringBuffer.append(TEXT_472);
    }
    }
    } else if (genClass.getGetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_473);
    stringBuffer.append(genClass.getGetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_474);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_475);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_476);
    }
    stringBuffer.append(TEXT_477);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_478);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_479);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_480);
    }
    stringBuffer.append(TEXT_481);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_482);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_483);
    }
    stringBuffer.append(TEXT_484);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_485);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_486);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_487);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_488);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_489);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_490);
    }
    stringBuffer.append(TEXT_491);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_492);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_493);
    }
    stringBuffer.append(TEXT_494);
    }
    stringBuffer.append(TEXT_495);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_496);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_497);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    if (genFeature.isListType()) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_498);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_499);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_500);
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_501);
    }
    stringBuffer.append(TEXT_502);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_503);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_504);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_505);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_506);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_507);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_508);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_509);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_510);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_511);
    }
    stringBuffer.append(TEXT_512);
    stringBuffer.append(genClass.getListConstructor(genFeature));
    stringBuffer.append(TEXT_513);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genFeature)) {
    stringBuffer.append(TEXT_514);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_515);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_516);
    stringBuffer.append(genModel.getImportedName("java.lang.reflect.Method"));
    stringBuffer.append(TEXT_517);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_518);
    stringBuffer.append(genModel.getNonNLS());
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_519);
    }
    stringBuffer.append(TEXT_520);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_521);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_522);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_523);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_524);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_525);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_526);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_527);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_528);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_529);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_530);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_531);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_532);
    stringBuffer.append(genModel.getImportedName("java.lang.NoSuchMethodException"));
    stringBuffer.append(TEXT_533);
    } else {
    if (genModel.useGenerics() && genFeature.isUncheckedCast()) {
    stringBuffer.append(TEXT_534);
    }
    stringBuffer.append(TEXT_535);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_536);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_537);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_538);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_539);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_540);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_541);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_542);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_543);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_544);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_545);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_546);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_547);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_548);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_549);
    }
    stringBuffer.append(TEXT_550);
    }
    stringBuffer.append(TEXT_551);
    stringBuffer.append(genModel.getImportedName("java.util.List"));
    stringBuffer.append(TEXT_552);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_553);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.UniqueEList"));
    stringBuffer.append(TEXT_554);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.UnionEObjectEList"));
    stringBuffer.append(TEXT_555);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_556);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_557);
    }
    } else {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_558);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_559);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_560);
    } else {
    if (genClass.isField(subsetGenFeature) && !subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_561);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_562);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_563);
    } else {
    stringBuffer.append(TEXT_564);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_565);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_566);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_567);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_568);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_569);
    }
    }
    }
    }
    stringBuffer.append(TEXT_570);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_571);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_572);
    } else {
    stringBuffer.append(TEXT_573);
    }
    stringBuffer.append(TEXT_574);
    }
    } else {
    stringBuffer.append(TEXT_575);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_576);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_577);
    }
    }
    //Class/getGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_578);
    }
    //Class/getGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_579);
    if (isJDK50) { //Class/basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_580);
    }
    }
    stringBuffer.append(TEXT_581);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_582);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_583);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_584);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_585);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_586);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_587);
    stringBuffer.append(!genFeature.isEffectiveSuppressEMFTypes());
    stringBuffer.append(TEXT_588);
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_589);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_590);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_591);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_592);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_593);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_594);
    } else {
    stringBuffer.append(TEXT_595);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_596);
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_597);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_598);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_599);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_600);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_601);
    } else {
    stringBuffer.append(TEXT_602);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_603);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_604);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_605);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingGetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_606);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_607);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_608);
    } else if (UML2GenModelUtil.getImplementedUnionGenFeatures(genClass).contains(genFeature)) {
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_609);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_610);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_611);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_612);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_613);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_614);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_615);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_616);
    } else {
    stringBuffer.append(TEXT_617);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_618);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_619);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_620);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_621);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_622);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_623);
    }
    }
    }
    }
    stringBuffer.append(TEXT_624);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_625);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_626);
    } else {
    stringBuffer.append(TEXT_627);
    }
    stringBuffer.append(TEXT_628);
    } else {
    stringBuffer.append(TEXT_629);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_630);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_631);
    }
    }
    //Class/basicGetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_632);
    //Class/basicGetGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_633);
    if (isJDK50) { //Class/basicSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_634);
    }
    }
    stringBuffer.append(TEXT_635);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_636);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_637);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_638);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_639);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_640);
    if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_641);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_642);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_643);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_644);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_645);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_646);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_647);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_648);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_649);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_650);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_651);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_652);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_653);
    }
    stringBuffer.append(TEXT_654);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_655);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_656);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_657);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_658);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_659);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_660);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_661);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_662);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_663);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_664);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_665);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_666);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_667);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_668);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_669);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_670);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_671);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_672);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_673);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_674);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_675);
    }
    stringBuffer.append(TEXT_676);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_677);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_678);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_679);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_680);
    }
    stringBuffer.append(TEXT_681);
    }
    stringBuffer.append(TEXT_682);
    }
    stringBuffer.append(TEXT_683);
    } else if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_684);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_685);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_686);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_687);
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_688);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_689);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_690);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_691);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_692);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_693);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_694);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_695);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_696);
    }
    stringBuffer.append(TEXT_697);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_698);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_699);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_700);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_701);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_702);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_703);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_704);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_705);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_706);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_707);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_708);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_709);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_710);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_711);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_712);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_713);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_714);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_715);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_716);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_717);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_718);
    }
    stringBuffer.append(TEXT_719);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_720);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_721);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_722);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_723);
    }
    stringBuffer.append(TEXT_724);
    }
    stringBuffer.append(TEXT_725);
    }
    stringBuffer.append(TEXT_726);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_727);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_728);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_729);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_730);
    } else {
    stringBuffer.append(TEXT_731);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_732);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_733);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_734);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_735);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_736);
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_737);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_738);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_739);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_740);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_741);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_742);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_743);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_744);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_745);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_746);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_747);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_748);
    }
    stringBuffer.append(TEXT_749);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_750);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_751);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_752);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_753);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_754);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_755);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_756);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_757);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_758);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_759);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_760);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_761);
    } else {
    stringBuffer.append(TEXT_762);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_763);
    }
    stringBuffer.append(TEXT_764);
    } else {
    stringBuffer.append(TEXT_765);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_766);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_767);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_768);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_769);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_770);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_771);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_772);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_773);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_774);
    }
    stringBuffer.append(TEXT_775);
    }
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_776);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_777);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_778);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_779);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_780);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_781);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_782);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_783);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_784);
    }
    stringBuffer.append(TEXT_785);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_786);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_787);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_788);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_789);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_790);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_791);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_792);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_793);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_794);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_795);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_796);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_797);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_798);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_799);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_800);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_801);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_802);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_803);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_804);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_805);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_806);
    }
    stringBuffer.append(TEXT_807);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_808);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_809);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_810);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_811);
    }
    stringBuffer.append(TEXT_812);
    }
    stringBuffer.append(TEXT_813);
    }
    stringBuffer.append(TEXT_814);
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_815);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_816);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_817);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_818);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_819);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_820);
    } else {
    stringBuffer.append(TEXT_821);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_822);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_823);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_824);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_825);
    }
    } else {
    stringBuffer.append(TEXT_826);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_827);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_828);
    //Class/basicSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_829);
    //Class/basicSetGenFeature.override.javajetinc
    }
    if (genFeature.isSet() && (isImplementation || !genFeature.isSuppressedSetVisibility())) {
    if (isInterface) { 
    stringBuffer.append(TEXT_830);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_831);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_832);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_833);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_834);
    stringBuffer.append(TEXT_835);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_836);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_837);
    if (genFeature.isEnumType()) {
    stringBuffer.append(TEXT_838);
    stringBuffer.append(genFeature.getTypeGenEnum().getQualifiedName());
    }
    if (genFeature.isUnsettable()) {
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_839);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_840);
    }
    if (!genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_841);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_842);
    }
    }
    stringBuffer.append(TEXT_843);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_844);
    //Class/setGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_845);
    if (isJDK50) { //Class/setGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_846);
    }
    }
    }
    if (!isImplementation) { 
    stringBuffer.append(TEXT_847);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_848);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_849);
    } else { GenOperation setAccessorOperation = genClass.getSetAccessorOperation(genFeature);
    stringBuffer.append(TEXT_850);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_851);
    }
    stringBuffer.append(TEXT_852);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_853);
    stringBuffer.append(setAccessorOperation == null ? "new" + genFeature.getCapName() : setAccessorOperation.getGenParameters().get(0).getName());
    stringBuffer.append(TEXT_854);
    if (genFeature.isStringType() && UML2GenModelUtil.isSafeStrings(genModel)) {
    stringBuffer.append(TEXT_855);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_856);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_857);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_858);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_859);
    }
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_860);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_861);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_862);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_863);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_864);
    }
    stringBuffer.append(TEXT_865);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_866);
    }
    stringBuffer.append(TEXT_867);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_868);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_869);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_870);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_871);
    }
    stringBuffer.append(TEXT_872);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_873);
    }
    stringBuffer.append(TEXT_874);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isContainer()) { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_875);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_876);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_877);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_878);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_879);
    stringBuffer.append(genFeature.getEObjectCast());
    stringBuffer.append(TEXT_880);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_881);
    stringBuffer.append(genModel.getImportedName("java.lang.IllegalArgumentException"));
    stringBuffer.append(TEXT_882);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_883);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_884);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_885);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_886);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_887);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_888);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_889);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_890);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_891);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_892);
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_893);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_894);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_895);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_896);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_897);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_898);
    }
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_899);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_900);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_901);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_902);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_903);
    }
    stringBuffer.append(TEXT_904);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_905);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_906);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_907);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_908);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_909);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_910);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_911);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_912);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_913);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_914);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_915);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_916);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_917);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_918);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_919);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_920);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_921);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_922);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_923);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_924);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_925);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_926);
    }
    stringBuffer.append(TEXT_927);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_928);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_929);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_930);
    if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_931);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_932);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_933);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_934);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_935);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_936);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_937);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_938);
    }
    stringBuffer.append(TEXT_939);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_940);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_941);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_942);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_943);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_944);
    }
    stringBuffer.append(TEXT_945);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_946);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_947);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_948);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_949);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_950);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_951);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_952);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_953);
    }
    stringBuffer.append(TEXT_954);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_955);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_956);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_957);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_958);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_959);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_960);
    }
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_961);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_962);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_963);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_964);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_965);
    } else {
    stringBuffer.append(TEXT_966);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_967);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_968);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_969);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_970);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_971);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_972);
    }
    }
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_973);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_974);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_975);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_976);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_977);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_978);
    } else {
    stringBuffer.append(TEXT_979);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_980);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_981);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_982);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_983);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_984);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_985);
    if (isJDK50) {
    stringBuffer.append(TEXT_986);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_987);
    } else {
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_988);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_989);
    }
    stringBuffer.append(TEXT_990);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_991);
    }
    } else {
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_992);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_993);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_994);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_995);
    }
    }
    if (genFeature.isEnumType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_996);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_997);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_998);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_999);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1000);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1001);
    } else {
    stringBuffer.append(TEXT_1002);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1003);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1004);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1005);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1006);
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1007);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1008);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1009);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_1010);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1011);
    } else {
    stringBuffer.append(TEXT_1012);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1013);
    stringBuffer.append(genFeature.getInternalTypeCast());
    stringBuffer.append(TEXT_1014);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1015);
    }
    }
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1016);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1017);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1018);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1019);
    }
    }
    if (genFeature.isUnsettable()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1020);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1021);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1022);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1023);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1024);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1025);
    }
    stringBuffer.append(TEXT_1026);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1027);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1028);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1029);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1030);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1031);
    }
    stringBuffer.append(TEXT_1032);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1033);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1034);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1035);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1036);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1037);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1038);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1039);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_1040);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1041);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1042);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_1043);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1044);
    } else {
    stringBuffer.append(TEXT_1045);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1046);
    }
    stringBuffer.append(TEXT_1047);
    }
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1048);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1049);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1050);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1051);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1052);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1053);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1054);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(TEXT_1055);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1056);
    if (genClass.isFlag(genFeature)) {
    stringBuffer.append(TEXT_1057);
    stringBuffer.append(genFeature.getCapName());
    } else {
    stringBuffer.append(genFeature.getSafeName());
    }
    stringBuffer.append(TEXT_1058);
    }
    }
    }
    if (!genFeature.isBasicSet()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false).isEmpty() || !UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true).isEmpty()) {
    stringBuffer.append(TEXT_1059);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.resource.Resource"));
    stringBuffer.append(TEXT_1060);
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, false, false)) {
    if (subsetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_1061);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1062);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1063);
    stringBuffer.append(subsetGenFeature.isBasicGet() ? "basicGet" + subsetGenFeature.getAccessorName() : subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1064);
    } else if (genClass.getImplementingGenModel(subsetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1065);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1066);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_1067);
    }
    stringBuffer.append(TEXT_1068);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1069);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1070);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1071);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1072);
    }
    for (GenFeature supersetGenFeature : UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false, true)) {
    stringBuffer.append(TEXT_1073);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1074);
    if (supersetGenFeature.isListType()) {
    stringBuffer.append(TEXT_1075);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1076);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1077);
    stringBuffer.append(supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1078);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1079);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1080);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1081);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1082);
    } else {
    if (supersetGenFeature.isContainer()) {
    stringBuffer.append(TEXT_1083);
    stringBuffer.append(supersetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1084);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1085);
    stringBuffer.append(supersetGenFeature.isBasicGet() ? "basicGet" + supersetGenFeature.getAccessorName() : supersetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1086);
    } else if (genClass.getImplementingGenModel(supersetGenFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1087);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1088);
    stringBuffer.append(genClass.getQualifiedFeatureID(supersetGenFeature));
    stringBuffer.append(TEXT_1089);
    }
    stringBuffer.append(TEXT_1090);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1091);
    stringBuffer.append(supersetGenFeature.getSafeName());
    stringBuffer.append(TEXT_1092);
    stringBuffer.append(supersetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1093);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1094);
    }
    stringBuffer.append(TEXT_1095);
    }
    stringBuffer.append(TEXT_1096);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1097);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1098);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1099);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1100);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1101);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1102);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1103);
    }
    stringBuffer.append(TEXT_1104);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1105);
    }
    stringBuffer.append(TEXT_1106);
    } else {
    stringBuffer.append(TEXT_1107);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1108);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1109);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1110);
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1111);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_1112);
    }
    stringBuffer.append(TEXT_1113);
    stringBuffer.append(genFeature.getCapName());
    if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1114);
    }
    stringBuffer.append(TEXT_1115);
    }
    } else if (setAccessorOperation != null) {
    stringBuffer.append(TEXT_1116);
    stringBuffer.append(setAccessorOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingSetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1117);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1118);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1119);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_1120);
    } else {
    stringBuffer.append(TEXT_1121);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1122);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1123);
    }
    }
    //Class/setGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1124);
    }
    //Class/setGenFeature.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genFeature.isBasicUnset()) {
    stringBuffer.append(TEXT_1125);
    if (isJDK50) { //Class/basicUnsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1126);
    }
    }
    stringBuffer.append(TEXT_1127);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1128);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1129);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1130);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1131);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1132);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_1133);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_1134);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1135);
    } else if (!genFeature.isVolatile()) {
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1136);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1137);
    }
    stringBuffer.append(TEXT_1138);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1139);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1140);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1141);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1142);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1143);
    }
    stringBuffer.append(TEXT_1144);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1145);
    }
    if (genModel.isVirtualDelegation()) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1146);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1147);
    }
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1148);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1149);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1150);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1151);
    }
    stringBuffer.append(TEXT_1152);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1153);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1154);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1155);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1156);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1157);
    }
    stringBuffer.append(TEXT_1158);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1159);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1160);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1161);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1162);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1163);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1164);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1165);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1166);
    } else {
    stringBuffer.append(TEXT_1167);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1168);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1169);
    } else {
    stringBuffer.append(TEXT_1170);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1171);
    }
    stringBuffer.append(TEXT_1172);
    }
    } else {
    stringBuffer.append(TEXT_1173);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1174);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1175);
    //Class/basicUnsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1176);
    //Class.basicUnsetGenFeature.override.javajetinc
    }
    if (genFeature.isUnset() && (isImplementation || !genFeature.isSuppressedUnsetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1177);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1178);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1179);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1180);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1181);
    stringBuffer.append(TEXT_1182);
    if (!genFeature.isSuppressedIsSetVisibility()) {
    stringBuffer.append(TEXT_1183);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1184);
    }
    stringBuffer.append(TEXT_1185);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1186);
    if (!genFeature.isListType() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1187);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1188);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1189);
    }
    stringBuffer.append(TEXT_1190);
    //Class/unsetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1191);
    if (isJDK50) { //Class/unsetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1192);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1193);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1194);
    } else {
    stringBuffer.append(TEXT_1195);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingUnsetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1196);
    }
    stringBuffer.append(TEXT_1197);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1198);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1199);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1200);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1201);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1202);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1203);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1204);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1205);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1206);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1207);
    }
    stringBuffer.append(TEXT_1208);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1209);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1210);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1211);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1212);
    } else if (genFeature.isBidirectional() || genFeature.isEffectiveContains()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1213);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1214);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1215);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1216);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1217);
    }
    stringBuffer.append(TEXT_1218);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1219);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_1220);
    if (!genFeature.isBidirectional()) {
    stringBuffer.append(TEXT_1221);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1222);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1223);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_1224);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_1225);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_1226);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1227);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_1228);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_1229);
    }
    stringBuffer.append(TEXT_1230);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1231);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1232);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1233);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1234);
    } else if (genClass.isESetFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1235);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1236);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1237);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1238);
    }
    stringBuffer.append(TEXT_1239);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1240);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1241);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1242);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1243);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1244);
    }
    stringBuffer.append(TEXT_1245);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1246);
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1247);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1248);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1249);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1250);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1251);
    }
    stringBuffer.append(TEXT_1252);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (!genModel.isSuppressNotification()) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1253);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1254);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1255);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1256);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1257);
    } else {
    stringBuffer.append(TEXT_1258);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1259);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1260);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1261);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1262);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1263);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1264);
    }
    }
    } else if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1265);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1266);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1267);
    } else {
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1268);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1269);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1270);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1271);
    }
    }
    if (!genModel.isSuppressNotification()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1272);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1273);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1274);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1275);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1276);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1277);
    } else {
    stringBuffer.append(TEXT_1278);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1279);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1280);
    }
    }
    if (genFeature.isReferenceType()) {
    stringBuffer.append(TEXT_1281);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1282);
    if (!genModel.isVirtualDelegation()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1283);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1284);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1285);
    } else {
    stringBuffer.append(TEXT_1286);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1287);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1288);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1289);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1290);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1291);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1292);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1293);
    } else {
    stringBuffer.append(TEXT_1294);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1295);
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1296);
    } else {
    stringBuffer.append(TEXT_1297);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1298);
    }
    stringBuffer.append(TEXT_1299);
    }
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1300);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1301);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1302);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1303);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1304);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1305);
    } else {
    stringBuffer.append(TEXT_1306);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1307);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1308);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1309);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1310);
    }
    } else if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1311);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1312);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1313);
    }
    if (!genModel.isVirtualDelegation() || genFeature.isPrimitiveType()) {
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1314);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1315);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1316);
    } else {
    stringBuffer.append(TEXT_1317);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1318);
    }
    }
    if (!genModel.isSuppressNotification()) {
    stringBuffer.append(TEXT_1319);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.impl.ENotificationImpl"));
    stringBuffer.append(TEXT_1320);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.Notification"));
    stringBuffer.append(TEXT_1321);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1322);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1323);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1324);
    stringBuffer.append(genFeature.getEDefault());
    } else {
    stringBuffer.append(TEXT_1325);
    stringBuffer.append(genFeature.getCapName());
    }
    stringBuffer.append(TEXT_1326);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1327);
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1328);
    } else {
    stringBuffer.append(TEXT_1329);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1330);
    }
    stringBuffer.append(TEXT_1331);
    }
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1332);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1333);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1334);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1335);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1336);
    } else {
    stringBuffer.append(TEXT_1337);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1338);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1339);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1340);
    }
    } else if (genClass.getUnsetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1341);
    stringBuffer.append(genClass.getUnsetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingUnsetGenOperation(genClass, genFeature);
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1342);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1343);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1344);
    } else {
    stringBuffer.append(TEXT_1345);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1346);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1347);
    }
    }
    //Class/unsetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1348);
    }
    //Class/unsetGenFeature.override.javajetinc
    }
    if (genFeature.isIsSet() && (isImplementation || !genFeature.isSuppressedIsSetVisibility())) {
    if (isInterface) {
    stringBuffer.append(TEXT_1349);
    stringBuffer.append(genClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1350);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1351);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1352);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1353);
    stringBuffer.append(TEXT_1354);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1355);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1356);
    if (genFeature.isChangeable() && !genFeature.isSuppressedUnsetVisibility()) {
    stringBuffer.append(TEXT_1357);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1358);
    }
    stringBuffer.append(TEXT_1359);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1360);
    if (!genFeature.isListType() && genFeature.isChangeable() && !genFeature.isSuppressedSetVisibility()) {
    stringBuffer.append(TEXT_1361);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1362);
    stringBuffer.append(genFeature.getRawImportedBoundType());
    stringBuffer.append(TEXT_1363);
    }
    stringBuffer.append(TEXT_1364);
    //Class/isSetGenFeature.javadoc.override.javajetinc
    } else {
    stringBuffer.append(TEXT_1365);
    if (isJDK50) { //Class/isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_1366);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1367);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1368);
    } else {
    stringBuffer.append(TEXT_1369);
    stringBuffer.append(genFeature.getAccessorName());
    if (genClass.hasCollidingIsSetAccessorOperation(genFeature)) {
    stringBuffer.append(TEXT_1370);
    }
    stringBuffer.append(TEXT_1371);
    if (genModel.isDynamicDelegation()) {
    stringBuffer.append(TEXT_1372);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1373);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1374);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1375);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1376);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1377);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1378);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1379);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1380);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1381);
    }
    stringBuffer.append(TEXT_1382);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1383);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1384);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1385);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1386);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1387);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_1388);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1389);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1390);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1391);
    } else {
    stringBuffer.append(TEXT_1392);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1393);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1394);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1395);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1396);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1397);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1398);
    } else {
    stringBuffer.append(TEXT_1399);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1400);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1401);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1402);
    }
    } else if (genClass.getIsSetAccessorOperation(genFeature) != null) {
    stringBuffer.append(TEXT_1403);
    stringBuffer.append(genClass.getIsSetAccessorOperation(genFeature).getBody(genModel.getIndentation(stringBuffer)));
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1404);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1405);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1406);
    } else {
    stringBuffer.append(TEXT_1407);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1408);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1409);
    }
    }
    //Class/isSetGenFeature.todo.override.javajetinc
    }
    stringBuffer.append(TEXT_1410);
    }
    //Class/isSetGenFeature.override.javajetinc
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_1411);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1412);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1413);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1414);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1415);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1416);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_1417);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_1418);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1419);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1420);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1421);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1422);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1423);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_1424);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_1425);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1426);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1427);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1428);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1429);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1430);
    } else {
    stringBuffer.append(TEXT_1431);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_1432);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1433);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1434);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1435);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1436);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1437);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1438);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1439);
    } else {
    stringBuffer.append(TEXT_1440);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_1441);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1442);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1443);
    }
    }
    stringBuffer.append(TEXT_1444);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1445);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1446);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1447);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1448);
    }
    stringBuffer.append(TEXT_1449);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1450);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1451);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1452);
    } else {
    stringBuffer.append(TEXT_1453);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1454);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1455);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1456);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1457);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1458);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1459);
    }
    stringBuffer.append(TEXT_1460);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1461);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1462);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1463);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1464);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1465);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1466);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1467);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1468);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1469);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1470);
    } else {
    stringBuffer.append(TEXT_1471);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1472);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1473);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1474);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1475);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1476);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1477);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1478);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1479);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1480);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1481);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1482);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1483);
    index++;}
    stringBuffer.append(TEXT_1484);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1485);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1486);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1487);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1488);
    }
    stringBuffer.append(TEXT_1489);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1490);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1491);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1492);
    }
    stringBuffer.append(TEXT_1493);
    } else {
    stringBuffer.append(TEXT_1494);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1495);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1496);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1497);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1498);
    }
    } else {
    stringBuffer.append(TEXT_1499);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1500);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1501);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1502);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1503);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1504);
    } else {
    stringBuffer.append(TEXT_1505);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1506);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1507);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1508);
    }
    index++;}
    }
    stringBuffer.append(TEXT_1509);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1510);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_1511);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1512);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1513);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1514);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1515);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1516);
    } else {
    stringBuffer.append(TEXT_1517);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1518);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1519);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1520);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1521);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1522);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1523);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1524);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1525);
    } else {
    stringBuffer.append(TEXT_1526);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1527);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1528);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1529);
    }
    }
    stringBuffer.append(TEXT_1530);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1531);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1532);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1533);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1534);
    }
    stringBuffer.append(TEXT_1535);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1536);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1537);
    } else {
    stringBuffer.append(TEXT_1538);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1539);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1540);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1541);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1542);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1543);
    }
    stringBuffer.append(TEXT_1544);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1545);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1546);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1547);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1548);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1549);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_1550);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1551);
    } else {
    stringBuffer.append(TEXT_1552);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1553);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1554);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1555);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1556);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_1557);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1558);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1559);
    } else {
    stringBuffer.append(TEXT_1560);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1561);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1562);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1563);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1564);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_1565);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1566);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1567);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1568);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1569);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1570);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1571);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1572);
    index++;}
    stringBuffer.append(TEXT_1573);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1574);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1575);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1576);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1577);
    }
    stringBuffer.append(TEXT_1578);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1579);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1580);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_1581);
    }
    stringBuffer.append(TEXT_1582);
    } else {
    stringBuffer.append(TEXT_1583);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1584);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_1585);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_1586);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_1587);
    }
    } else {
    stringBuffer.append(TEXT_1588);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1589);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1590);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1591);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1592);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1593);
    } else {
    stringBuffer.append(TEXT_1594);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1595);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_1596);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1597);
    }
    index++;}
    }
    stringBuffer.append(TEXT_1598);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1599);
    }
    stringBuffer.append(TEXT_1600);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_1601);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1602);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1603);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1604);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1605);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1606);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1607);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1608);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1609);
    }
    stringBuffer.append(TEXT_1610);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1611);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1612);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1613);
    } else {
    stringBuffer.append(TEXT_1614);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1615);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1616);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1617);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1618);
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1619);
    }
    stringBuffer.append(TEXT_1620);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1621);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1622);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_1623);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1624);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1625);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1626);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1627);
    }
    stringBuffer.append(TEXT_1628);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1629);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1630);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1631);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1632);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1633);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_1634);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1635);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_1636);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1637);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1638);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1639);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1640);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1641);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1642);
    }
    stringBuffer.append(TEXT_1643);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_1644);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_1645);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1646);
    } else {
    stringBuffer.append(TEXT_1647);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1648);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1649);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1650);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1651);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1652);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1653);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1654);
    }
    stringBuffer.append(TEXT_1655);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_1656);
    }
    stringBuffer.append(TEXT_1657);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_1658);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1659);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_1660);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1661);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_1662);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1663);
    }
    stringBuffer.append(TEXT_1664);
    if (isJDK50) {
    stringBuffer.append(TEXT_1665);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1666);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_1667);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1668);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1669);
    } else {
    stringBuffer.append(TEXT_1670);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1671);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_1672);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1673);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1674);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1675);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1676);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1677);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1678);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1679);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_1680);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1681);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1682);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1683);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1684);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1685);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1686);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_1687);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_1688);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_1689);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1690);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_1691);
    }
    }
    stringBuffer.append(TEXT_1692);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1693);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1694);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1695);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1696);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1697);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_1698);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1699);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1700);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1701);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_1702);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1703);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1704);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1705);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1706);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1707);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1708);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1709);
    } else {
    stringBuffer.append(TEXT_1710);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1711);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1712);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1713);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1714);
    }
    stringBuffer.append(TEXT_1715);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1716);
    index++;}
    stringBuffer.append(TEXT_1717);
    } else {
    stringBuffer.append(TEXT_1718);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1719);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1720);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1721);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1722);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1723);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1724);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1725);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1726);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1727);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1728);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1729);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1730);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1731);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1732);
    } else {
    stringBuffer.append(TEXT_1733);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1734);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1735);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_1736);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1737);
    }
    stringBuffer.append(TEXT_1738);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1739);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_1740);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1741);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1742);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1743);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1744);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1745);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1746);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1747);
    } else {
    stringBuffer.append(TEXT_1748);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1749);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_1750);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1751);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_1752);
    }
    stringBuffer.append(TEXT_1753);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1754);
    index++;}
    }
    stringBuffer.append(TEXT_1755);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1756);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_1757);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1758);
    }
    stringBuffer.append(TEXT_1759);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_1760);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_1761);
    }
    stringBuffer.append(TEXT_1762);
    } else {
    stringBuffer.append(TEXT_1763);
    }
    stringBuffer.append(TEXT_1764);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_1765);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1766);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_1767);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1768);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1769);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_1770);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1771);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1772);
    } else {
    stringBuffer.append(TEXT_1773);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1774);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1775);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1776);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1777);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1778);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1779);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1780);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1781);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1782);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1783);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1784);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1785);
    } else {
    stringBuffer.append(TEXT_1786);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1787);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1788);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1789);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1790);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1791);
    } else {
    stringBuffer.append(TEXT_1792);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_1793);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1794);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1795);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1796);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1797);
    } else {
    stringBuffer.append(TEXT_1798);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1799);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_1800);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1801);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1802);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1803);
    } else {
    stringBuffer.append(TEXT_1804);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_1805);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1806);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1807);
    }
    } else {
    stringBuffer.append(TEXT_1808);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1809);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1810);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1811);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1812);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1813);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1814);
    } else {
    stringBuffer.append(TEXT_1815);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1816);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1817);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_1818);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1819);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1820);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1821);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1822);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_1823);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1824);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1825);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1826);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1827);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1828);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1829);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1830);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1831);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1832);
    } else {
    stringBuffer.append(TEXT_1833);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1834);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1835);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_1836);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_1837);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_1838);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1839);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_1840);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1841);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1842);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_1843);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1844);
    }
    stringBuffer.append(TEXT_1845);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1846);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_1847);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_1848);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_1849);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_1850);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_1851);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_1852);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_1853);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_1854);
    } else {
    stringBuffer.append(TEXT_1855);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_1856);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_1857);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1858);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1859);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1860);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1861);
    } else {
    stringBuffer.append(TEXT_1862);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_1863);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_1864);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_1865);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1866);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1867);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1868);
    } else {
    stringBuffer.append(TEXT_1869);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_1870);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_1871);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_1872);
    }
    //Class/genFeature.override.javajetinc
    }//for
    }}.run();
    for (GenOperation genOperation : (isImplementation ? genClass.getImplementedGenOperations() : genClass.getDeclaredGenOperations())) {
    if (isImplementation && !UML2GenModelUtil.hasOperationsClass(genClass, genOperation) && UML2GenModelUtil.hasOCLBody(genOperation)) {
    stringBuffer.append(TEXT_1873);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1874);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1875);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1876);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1877);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1878);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_1879);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1880);
    stringBuffer.append(UML2GenModelUtil.getOCLBody(genOperation));
    stringBuffer.append(TEXT_1881);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(TEXT_1882);
    if (genOperation.isInvariant()) {
    stringBuffer.append(TEXT_1883);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1884);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1885);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1886);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1887);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1888);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.Constraint"));
    stringBuffer.append(TEXT_1889);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1890);
    } else {
    stringBuffer.append(TEXT_1891);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1892);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1893);
    stringBuffer.append(genOperation.getFormattedName());
    stringBuffer.append(TEXT_1894);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1895);
    stringBuffer.append(genOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1896);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.expressions.OCLExpression"));
    if (isJDK50) {
    stringBuffer.append(TEXT_1897);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClassifier"));
    stringBuffer.append(TEXT_1898);
    }
    stringBuffer.append(TEXT_1899);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1900);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_1901);
    if (UML2GenModelUtil.isRedefinition(genOperation)) {
    stringBuffer.append(TEXT_1902);
    for (GenOperation redefinedGenOperation : UML2GenModelUtil.getRedefinedGenOperations(genOperation)) {
    stringBuffer.append(TEXT_1903);
    stringBuffer.append(redefinedGenOperation.getGenClass().getQualifiedInterfaceName());
    stringBuffer.append(TEXT_1904);
    stringBuffer.append(redefinedGenOperation.getName());
    stringBuffer.append(TEXT_1905);
    stringBuffer.append(redefinedGenOperation.getParameterTypes(", "));
    stringBuffer.append(TEXT_1906);
    stringBuffer.append(redefinedGenOperation.getFormattedName());
    stringBuffer.append(TEXT_1907);
    }
    stringBuffer.append(TEXT_1908);
    }
    stringBuffer.append(TEXT_1909);
    if (genOperation.hasDocumentation() || genOperation.hasParameterDocumentation()) {
    stringBuffer.append(TEXT_1910);
    if (genOperation.hasDocumentation()) {
    stringBuffer.append(TEXT_1911);
    stringBuffer.append(genOperation.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    if (genParameter.hasDocumentation()) { String documentation = genParameter.getDocumentation("");
    if (documentation.contains("\n") || documentation.contains("\r")) {
    stringBuffer.append(TEXT_1912);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1913);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    } else {
    stringBuffer.append(TEXT_1914);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_1915);
    stringBuffer.append(genParameter.getDocumentation(genModel.getIndentation(stringBuffer)));
    }
    }
    }
    stringBuffer.append(TEXT_1916);
    }
    if (!genModel.isSuppressEMFModelTags()) { boolean first = true; for (StringTokenizer stringTokenizer = new StringTokenizer(genOperation.getModelInfo(), "\n\r"); stringTokenizer.hasMoreTokens(); ) { String modelInfo = stringTokenizer.nextToken(); if (first) { first = false;
    stringBuffer.append(TEXT_1917);
    stringBuffer.append(modelInfo);
    } else {
    stringBuffer.append(TEXT_1918);
    stringBuffer.append(modelInfo);
    }} if (first) {
    stringBuffer.append(TEXT_1919);
    }}
    stringBuffer.append(TEXT_1920);
    } else {
    stringBuffer.append(TEXT_1921);
    if (isJDK50) {
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_1922);
    }
    }
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_1923);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_1924);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1925);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_1926);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_1927);
    } else {
    stringBuffer.append(TEXT_1928);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_1929);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1930);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_1931);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_1932);
    if (genOperation.hasBody()) {
    stringBuffer.append(TEXT_1933);
    stringBuffer.append(genOperation.getBody(genModel.getIndentation(stringBuffer)));
    } else if (genOperation.isInvariant()) {GenClass opClass = genOperation.getGenClass(); String diagnostics = genOperation.getGenParameters().get(0).getName(); String context = genOperation.getGenParameters().get(1).getName();
    if (UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_1934);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1935);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1936);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1937);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1938);
    } else {
    if (UML2GenModelUtil.hasOCLBody(genOperation)) { String oclInv = UML2GenModelUtil.getUpperName(genOperation.getName()) + (genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false))) + "__EOCL_INV";
    stringBuffer.append(TEXT_1939);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_1940);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_1941);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1942);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_1943);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_1944);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_1945);
    stringBuffer.append(oclInv);
    stringBuffer.append(TEXT_1946);
    } else {
    stringBuffer.append(TEXT_1947);
    }
    stringBuffer.append(TEXT_1948);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1949);
    stringBuffer.append(diagnostics);
    stringBuffer.append(TEXT_1950);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicDiagnostic"));
    stringBuffer.append(TEXT_1951);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.Diagnostic"));
    stringBuffer.append(TEXT_1952);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1953);
    stringBuffer.append(opClass.getGenPackage().getImportedValidatorClassName());
    stringBuffer.append(TEXT_1954);
    stringBuffer.append(opClass.getOperationID(genOperation));
    stringBuffer.append(TEXT_1955);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.plugin.EcorePlugin"));
    stringBuffer.append(TEXT_1956);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1957);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EObjectValidator"));
    stringBuffer.append(TEXT_1958);
    stringBuffer.append(context);
    stringBuffer.append(TEXT_1959);
    stringBuffer.append(genModel.getNonNLS());
    stringBuffer.append(genModel.getNonNLS(2));
    stringBuffer.append(TEXT_1960);
    }
    } else { GenClass opClass = genOperation.getGenClass();
    if (UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_1961);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1962);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1963);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1964);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1965);
    } else {
    if (UML2GenModelUtil.isCacheAdapterSupport(genModel) && UML2GenModelUtil.isCached(genOperation)) {
    stringBuffer.append(TEXT_1966);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_1967);
    if (genModel.useGenerics() && genOperation.isUncheckedCast()) {
    stringBuffer.append(TEXT_1968);
    }
    stringBuffer.append(TEXT_1969);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_1970);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_1971);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1972);
    }
    stringBuffer.append(TEXT_1973);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1974);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1975);
    if (UML2GenModelUtil.isResourceCacheAdapterScope(genOperation)) {
    stringBuffer.append(TEXT_1976);
    }
    stringBuffer.append(TEXT_1977);
    stringBuffer.append(opClass.getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1978);
    stringBuffer.append(opClass.getEcoreClass().getEOperations().indexOf(genOperation.getEcoreOperation()));
    stringBuffer.append(TEXT_1979);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1980);
    stringBuffer.append(genOperation.getObjectType(genClass));
    stringBuffer.append(TEXT_1981);
    }
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1982);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1983);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1984);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1985);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1986);
    }
    stringBuffer.append(TEXT_1987);
    if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_1988);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_1989);
    }
    stringBuffer.append(TEXT_1990);
    }
    stringBuffer.append(TEXT_1991);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_1992);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_1993);
    if (genOperation.getGenParameters().size() > 0) {
    stringBuffer.append(TEXT_1994);
    stringBuffer.append(genOperation.getParameterNames(", "));
    }
    stringBuffer.append(TEXT_1995);
    }
    } else if (UML2GenModelUtil.hasOCLBody(genOperation)) { String oclQry = UML2GenModelUtil.getUpperName(genOperation.getName()) + (genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false))) + "__EOCL_QRY";
		GenOperation redefinedGenOperation = genOperation;
		while (UML2GenModelUtil.isDuplicate(redefinedGenOperation)) {
			java.util.List<GenOperation> redefinedGenOperations = UML2GenModelUtil.getRedefinedGenOperations(redefinedGenOperation);
			if (redefinedGenOperations.size() > 0) {
				redefinedGenOperation = redefinedGenOperations.get(0);
			} else {
			break;
			}
		}
		int index = genOperation.getGenClass().getAllGenOperations().indexOf(redefinedGenOperation);
    stringBuffer.append(TEXT_1996);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_1997);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_1998);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_1999);
    stringBuffer.append(genOperation.getGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2000);
    stringBuffer.append(index);
    stringBuffer.append(TEXT_2001);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_2002);
    stringBuffer.append(UML2GenModelUtil.getUpperName(genOperation.getName()));
    stringBuffer.append(genOperation.getGenParameters().size() == 0 ? "" : "__" + UML2GenModelUtil.getUpperName(genOperation.getParameterTypes("_", false)));
    stringBuffer.append(TEXT_2003);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ParserException"));
    stringBuffer.append(TEXT_2004);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2005);
    stringBuffer.append(oclQry);
    stringBuffer.append(TEXT_2006);
    if (!genOperation.getGenParameters().isEmpty()) {
    stringBuffer.append(TEXT_2007);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.EvaluationEnvironment"));
    if (isJDK50) {
    stringBuffer.append(TEXT_2008);
    }
    stringBuffer.append(TEXT_2009);
    for (GenParameter genParameter : genOperation.getGenParameters()) {
    stringBuffer.append(TEXT_2010);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_2011);
    stringBuffer.append(genParameter.getName());
    stringBuffer.append(TEXT_2012);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    if (genOperation.isListType()) {
    if (isJDK50) {
    stringBuffer.append(TEXT_2013);
    }
    stringBuffer.append(TEXT_2014);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2015);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_2016);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2017);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_2018);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.BasicEList"));
    stringBuffer.append(TEXT_2019);
    stringBuffer.append(genOperation.getListItemType(null));
    stringBuffer.append(TEXT_2020);
    } else if (genOperation.isPrimitiveType()) {
    stringBuffer.append(TEXT_2021);
    stringBuffer.append(genOperation.getObjectType(null));
    stringBuffer.append(TEXT_2022);
    stringBuffer.append(genOperation.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2023);
    } else {
    stringBuffer.append(TEXT_2024);
    stringBuffer.append(genOperation.getImportedType(null));
    stringBuffer.append(TEXT_2025);
    }
    } else {
    stringBuffer.append(TEXT_2026);
    }
    }
    stringBuffer.append(TEXT_2027);
    }
    //Class/implementedGenOperation.override.javajetinc
    }//for
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseAddGenFeatures())) {
    stringBuffer.append(TEXT_2028);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass)) {
    stringBuffer.append(TEXT_2029);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2030);
    }
    stringBuffer.append(TEXT_2031);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2032);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2033);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2034);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2035);
    for (GenFeature genFeature : genClass.getEInverseAddGenFeatures()) {
    stringBuffer.append(TEXT_2036);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2037);
    if (genFeature.isListType()) { String cast = "("  + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + (!genModel.useGenerics() ? ")" : "<" + genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject") + ">)(" + genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList") + "<?>)");
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2038);
    stringBuffer.append(cast);
    stringBuffer.append(TEXT_2039);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2040);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2041);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2042);
    } else {
    stringBuffer.append(TEXT_2043);
    stringBuffer.append(cast);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2044);
    }
    } else if (genFeature.isContainer()) {
    stringBuffer.append(TEXT_2045);
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2046);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2047);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2048);
    } else {
    stringBuffer.append(TEXT_2049);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2050);
    }
    } else {
    if (genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2051);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2052);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2053);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2054);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2055);
    } else if (genFeature.isVolatile() || genClass.getImplementingGenModel(genFeature).isDynamicDelegation()) {
    stringBuffer.append(TEXT_2056);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2057);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2058);
    if (genFeature.isResolveProxies()) {
    stringBuffer.append(TEXT_2059);
    stringBuffer.append(genFeature.getAccessorName());
    } else {
    stringBuffer.append(genFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2060);
    }
    stringBuffer.append(TEXT_2061);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2062);
    if (genFeature.isEffectiveContains()) {
    stringBuffer.append(TEXT_2063);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2064);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2065);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2066);
    } else { GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_2067);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2068);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2069);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_2070);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2071);
    }
    stringBuffer.append(TEXT_2072);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2073);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2074);
    }
    }
    stringBuffer.append(TEXT_2075);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2076);
    } else {
    stringBuffer.append(TEXT_2077);
    }
    stringBuffer.append(TEXT_2078);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEInverseRemoveGenFeatures())) {
    stringBuffer.append(TEXT_2079);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2080);
    }
    stringBuffer.append(TEXT_2081);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2082);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.InternalEObject"));
    stringBuffer.append(TEXT_2083);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2084);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2085);
    for (GenFeature genFeature : genClass.getEInverseRemoveGenFeatures()) {
    stringBuffer.append(TEXT_2086);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2087);
    if (genFeature.isListType()) {
    if (genFeature.isMapType() && genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2088);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2089);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2090);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2091);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2092);
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2093);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2094);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2095);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2096);
    } else {
    stringBuffer.append(TEXT_2097);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2098);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2099);
    }
    } else if (genFeature.isContainer() && !genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2100);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2101);
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2102);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2103);
    } else {
    stringBuffer.append(TEXT_2104);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2105);
    }
    }
    stringBuffer.append(TEXT_2106);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2107);
    } else {
    stringBuffer.append(TEXT_2108);
    }
    stringBuffer.append(TEXT_2109);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEBasicRemoveFromContainerGenFeatures())) {
    stringBuffer.append(TEXT_2110);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2111);
    }
    stringBuffer.append(TEXT_2112);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2113);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2114);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2115);
    for (GenFeature genFeature : genClass.getEBasicRemoveFromContainerGenFeatures()) {
    GenFeature reverseFeature = genFeature.getReverse(); GenClass targetClass = reverseFeature.getGenClass(); String reverseOffsetCorrection = targetClass.hasOffsetCorrection() ? " + " + genClass.getOffsetCorrectionField(reverseFeature) : "";
    stringBuffer.append(TEXT_2116);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2117);
    stringBuffer.append(targetClass.getQualifiedFeatureID(reverseFeature));
    stringBuffer.append(reverseOffsetCorrection);
    stringBuffer.append(TEXT_2118);
    stringBuffer.append(targetClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2119);
    }
    stringBuffer.append(TEXT_2120);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2121);
    } else {
    stringBuffer.append(TEXT_2122);
    }
    stringBuffer.append(TEXT_2123);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEGetGenFeatures())) {
    stringBuffer.append(TEXT_2124);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2125);
    }
    stringBuffer.append(TEXT_2126);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2127);
    for (GenFeature genFeature : genClass.getEGetGenFeatures()) {
    stringBuffer.append(TEXT_2128);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2129);
    if (genFeature.isPrimitiveType()) {
    if (isJDK50) {
    stringBuffer.append(TEXT_2130);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2131);
    } else if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2132);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2133);
    } else {
    stringBuffer.append(TEXT_2134);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2135);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2136);
    }
    } else if (genFeature.isResolveProxies() && !genFeature.isListType()) {
    stringBuffer.append(TEXT_2137);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2138);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2139);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2140);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2141);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2142);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2143);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2144);
    } else {
    stringBuffer.append(TEXT_2145);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2146);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2147);
    }
    } else if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2148);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2149);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2150);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2151);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_2152);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2153);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2154);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2155);
    } else {
    stringBuffer.append(TEXT_2156);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2157);
    }
    }
    stringBuffer.append(TEXT_2158);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2159);
    } else {
    stringBuffer.append(TEXT_2160);
    }
    stringBuffer.append(TEXT_2161);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getESetGenFeatures())) {
    stringBuffer.append(TEXT_2162);
    if (genModel.useGenerics()) {
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    if (genFeature.isUncheckedCast(genClass) && !genFeature.isFeatureMapType() && !genFeature.isMapType()) {
    stringBuffer.append(TEXT_2163);
    break; }
    }
    }
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2164);
    }
    stringBuffer.append(TEXT_2165);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2166);
    for (GenFeature genFeature : genClass.getESetGenFeatures()) {
    stringBuffer.append(TEXT_2167);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2168);
    if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2169);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2170);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2171);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2172);
    } else if (genFeature.isFeatureMapType()) {
    stringBuffer.append(TEXT_2173);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2174);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2175);
    } else if (genFeature.isMapType()) {
    if (genFeature.isEffectiveSuppressEMFTypes()) {
    stringBuffer.append(TEXT_2176);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_2177);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EMap"));
    stringBuffer.append(TEXT_2178);
    stringBuffer.append(genFeature.getImportedMapTemplateArguments(genClass));
    stringBuffer.append(TEXT_2179);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2180);
    } else {
    stringBuffer.append(TEXT_2181);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EStructuralFeature"));
    stringBuffer.append(TEXT_2182);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2183);
    }
    } else {
    stringBuffer.append(TEXT_2184);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2185);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2186);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    if (isJDK50) {
    stringBuffer.append(TEXT_2187);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2188);
    }
    stringBuffer.append(TEXT_2189);
    }
    } else if (!isJDK50 && genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2190);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2191);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2192);
    stringBuffer.append(genFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2193);
    } else {
    stringBuffer.append(TEXT_2194);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2195);
    if (genFeature.getTypeGenDataType() == null || !genFeature.getTypeGenDataType().isObjectType() || !genFeature.getRawType().equals(genFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2196);
    stringBuffer.append(genFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2197);
    }
    stringBuffer.append(TEXT_2198);
    }
    stringBuffer.append(TEXT_2199);
    }
    stringBuffer.append(TEXT_2200);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2201);
    } else {
    stringBuffer.append(TEXT_2202);
    }
    stringBuffer.append(TEXT_2203);
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEUnsetGenFeatures())) {
    stringBuffer.append(TEXT_2204);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2205);
    }
    stringBuffer.append(TEXT_2206);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2207);
    for (GenFeature genFeature : genClass.getEUnsetGenFeatures()) {
    stringBuffer.append(TEXT_2208);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2209);
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_2210);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2211);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2212);
    } else {
    stringBuffer.append(TEXT_2213);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2214);
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2215);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2216);
    } else if (!genFeature.hasEDefault()) {
    stringBuffer.append(TEXT_2217);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2218);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2219);
    } else {
    stringBuffer.append(TEXT_2220);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2221);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2222);
    }
    stringBuffer.append(TEXT_2223);
    }
    stringBuffer.append(TEXT_2224);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2225);
    } else {
    stringBuffer.append(TEXT_2226);
    }
    stringBuffer.append(TEXT_2227);
    //Class/eUnset.override.javajetinc
    }
    if (isImplementation && !genModel.isReflectiveDelegation() && genClass.implementsAny(genClass.getEIsSetGenFeatures())) {
    stringBuffer.append(TEXT_2228);
    stringBuffer.append(TEXT_2229);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2230);
    }
    stringBuffer.append(TEXT_2231);
    for (GenFeature genFeature : genClass.getEIsSetGenFeatures()) { String safeNameAccessor = genFeature.getSafeName(); if ("featureID".equals(safeNameAccessor)) { safeNameAccessor = "this." + safeNameAccessor; }
    stringBuffer.append(TEXT_2232);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2233);
    if (UML2GenModelUtil.isUnion(genFeature) || UML2GenModelUtil.isRedefinition(genFeature) || UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_2234);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2235);
    } else {
    if (genFeature.isListType() && !genFeature.isUnsettable()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_2236);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_2237);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2238);
    } else {
    stringBuffer.append(TEXT_2239);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2240);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2241);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2242);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2243);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2244);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2245);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2246);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2247);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2248);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2249);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2250);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2251);
    } else {
    stringBuffer.append(TEXT_2252);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2253);
    }
    }
    }
    } else if (genFeature.isUnsettable()) {
    stringBuffer.append(TEXT_2254);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2255);
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2256);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2257);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2258);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2259);
    } else {
    stringBuffer.append(TEXT_2260);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2261);
    }
    }
    } else if (!genFeature.hasEDefault()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2262);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2263);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2264);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2265);
    } else {
    stringBuffer.append(TEXT_2266);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2267);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2268);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2269);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2270);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2271);
    } else {
    stringBuffer.append(TEXT_2272);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2273);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2274);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2275);
    }
    } else {
    stringBuffer.append(TEXT_2276);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2277);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2278);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2279);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2280);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2281);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2282);
    } else {
    stringBuffer.append(TEXT_2283);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2284);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2285);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_2286);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2287);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2288);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2289);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2290);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_2291);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2292);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2293);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2294);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2295);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2296);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2297);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2298);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2299);
    stringBuffer.append(safeNameAccessor);
    stringBuffer.append(TEXT_2300);
    } else {
    stringBuffer.append(TEXT_2301);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2302);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2303);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_2304);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2305);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2306);
    if (genModel.isMinimalReflectiveMethods()) {
    stringBuffer.append(TEXT_2307);
    } else {
    stringBuffer.append(TEXT_2308);
    }
    stringBuffer.append(TEXT_2309);
    //Class/eIsSet.override.javajetinc
    }
    if (isImplementation && (!genClass.getMixinGenFeatures().isEmpty() || genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty())) {
    if (!genClass.getMixinGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2310);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2311);
    }
    stringBuffer.append(TEXT_2312);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2313);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2314);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2315);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2316);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2317);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2318);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2319);
    }
    stringBuffer.append(TEXT_2320);
    }
    stringBuffer.append(TEXT_2321);
    }
    stringBuffer.append(TEXT_2322);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2323);
    }
    stringBuffer.append(TEXT_2324);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_2325);
    for (GenClass mixinGenClass : genClass.getMixinGenClasses()) {
    stringBuffer.append(TEXT_2326);
    stringBuffer.append(mixinGenClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2327);
    for (GenFeature genFeature : mixinGenClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2328);
    stringBuffer.append(mixinGenClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2329);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2330);
    }
    stringBuffer.append(TEXT_2331);
    }
    if (genClass.hasOffsetCorrection() && !genClass.getGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2332);
    stringBuffer.append(genClass.getRawImportedInterfaceName());
    stringBuffer.append(TEXT_2333);
    stringBuffer.append(negativeOffsetCorrection);
    stringBuffer.append(TEXT_2334);
    for (GenFeature genFeature : genClass.getGenFeatures()) {
    stringBuffer.append(TEXT_2335);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_2336);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2337);
    }
    stringBuffer.append(TEXT_2338);
    }
    stringBuffer.append(TEXT_2339);
    }
    if (isImplementation && genModel.isVirtualDelegation()) { String eVirtualValuesField = genClass.getEVirtualValuesField();
    if (eVirtualValuesField != null) {
    stringBuffer.append(TEXT_2340);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2341);
    }
    stringBuffer.append(TEXT_2342);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2343);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2344);
    }
    stringBuffer.append(TEXT_2345);
    stringBuffer.append(eVirtualValuesField);
    stringBuffer.append(TEXT_2346);
    }
    { List<String> eVirtualIndexBitFields = genClass.getEVirtualIndexBitFields(new ArrayList<String>());
    if (!eVirtualIndexBitFields.isEmpty()) { List<String> allEVirtualIndexBitFields = genClass.getAllEVirtualIndexBitFields(new ArrayList<String>());
    stringBuffer.append(TEXT_2347);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2348);
    }
    stringBuffer.append(TEXT_2349);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2350);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2351);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2352);
    }
    stringBuffer.append(TEXT_2353);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2354);
    }
    stringBuffer.append(TEXT_2355);
    for (int i = 0; i < allEVirtualIndexBitFields.size(); i++) {
    stringBuffer.append(TEXT_2356);
    stringBuffer.append(i);
    stringBuffer.append(TEXT_2357);
    stringBuffer.append(allEVirtualIndexBitFields.get(i));
    stringBuffer.append(TEXT_2358);
    }
    stringBuffer.append(TEXT_2359);
    }
    }
    }
    if (!genClass.hasImplementedToStringGenOperation() && isImplementation && !genModel.isReflectiveDelegation() && !genModel.isDynamicDelegation() && !genClass.getToStringGenFeatures().isEmpty()) {
    stringBuffer.append(TEXT_2360);
    if (genModel.useClassOverrideAnnotation()) {
    stringBuffer.append(TEXT_2361);
    }
    stringBuffer.append(TEXT_2362);
    { boolean first = true;
    for (GenFeature genFeature : genClass.getToStringGenFeatures()) {
    if (first) { first = false;
    stringBuffer.append(TEXT_2363);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2364);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2365);
    stringBuffer.append(genFeature.getName());
    stringBuffer.append(TEXT_2366);
    stringBuffer.append(genModel.getNonNLS());
    }
    if (genFeature.isUnsettable() && !genFeature.isListType()) {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2367);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2368);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    stringBuffer.append(TEXT_2369);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2370);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2371);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2372);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2373);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2374);
    }
    stringBuffer.append(TEXT_2375);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2376);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2377);
    stringBuffer.append(genModel.getNonNLS());
    } else {
    stringBuffer.append(TEXT_2378);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2379);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2380);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2381);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2382);
    }
    stringBuffer.append(TEXT_2383);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2384);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2385);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2386);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2387);
    stringBuffer.append(genModel.getNonNLS());
    }
    } else {
    stringBuffer.append(TEXT_2388);
    if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_2389);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_2390);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2391);
    } else {
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2392);
    }
    stringBuffer.append(TEXT_2393);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2394);
    stringBuffer.append(genModel.getNonNLS());
    }
    }
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2395);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(positiveOffsetCorrection);
    if (!genFeature.isListType() && !genFeature.isReferenceType()){
    stringBuffer.append(TEXT_2396);
    stringBuffer.append(genFeature.getEDefault());
    }
    stringBuffer.append(TEXT_2397);
    } else {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_2398);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2399);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2400);
    } else {
    stringBuffer.append(TEXT_2401);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2402);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_2403);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2404);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2405);
    }
    } else {
    stringBuffer.append(TEXT_2406);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2407);
    }
    }
    }
    }
    }
    stringBuffer.append(TEXT_2408);
    }
    if (isImplementation && genClass.isMapEntry()) { GenFeature keyFeature = genClass.getMapEntryKeyFeature(); GenFeature valueFeature = genClass.getMapEntryValueFeature();
    String objectType = genModel.getImportedName("java.lang.Object");
    String keyType = isJDK50 ? keyFeature.getObjectType(genClass) : objectType;
    String valueType = isJDK50 ? valueFeature.getObjectType(genClass) : objectType;
    String eMapType = genModel.getImportedName("org.eclipse.emf.common.util.EMap") + (isJDK50 ? "<" + keyType + ", " + valueType + ">" : "");
    stringBuffer.append(TEXT_2409);
    stringBuffer.append(objectType);
    stringBuffer.append(TEXT_2410);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2411);
    if (!isJDK50 && keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2412);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2413);
    } else {
    stringBuffer.append(TEXT_2414);
    }
    stringBuffer.append(TEXT_2415);
    stringBuffer.append(keyType);
    stringBuffer.append(TEXT_2416);
    if (keyFeature.isListType()) {
    stringBuffer.append(TEXT_2417);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2418);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2419);
    }
    stringBuffer.append(TEXT_2420);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_2421);
    } else if (keyFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2422);
    stringBuffer.append(keyFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2423);
    stringBuffer.append(keyFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2424);
    } else {
    stringBuffer.append(TEXT_2425);
    stringBuffer.append(keyFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2426);
    }
    stringBuffer.append(TEXT_2427);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2428);
    if (!isJDK50 && valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2429);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2430);
    } else {
    stringBuffer.append(TEXT_2431);
    }
    stringBuffer.append(TEXT_2432);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2433);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2434);
    stringBuffer.append(valueType);
    stringBuffer.append(TEXT_2435);
    if (valueFeature.isListType()) {
    stringBuffer.append(TEXT_2436);
    if (!genModel.useGenerics()) {
    stringBuffer.append(TEXT_2437);
    stringBuffer.append(genModel.getImportedName("java.util.Collection"));
    stringBuffer.append(TEXT_2438);
    }
    stringBuffer.append(TEXT_2439);
    } else if (isJDK50) {
    stringBuffer.append(TEXT_2440);
    } else if (valueFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_2441);
    stringBuffer.append(valueFeature.getObjectType(genClass));
    stringBuffer.append(TEXT_2442);
    stringBuffer.append(valueFeature.getPrimitiveValueFunction());
    stringBuffer.append(TEXT_2443);
    } else {
    stringBuffer.append(TEXT_2444);
    stringBuffer.append(valueFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2445);
    }
    stringBuffer.append(TEXT_2446);
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2447);
    }
    stringBuffer.append(TEXT_2448);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2449);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2450);
    stringBuffer.append(eMapType);
    stringBuffer.append(TEXT_2451);
    }
    if (isImplementation) {
    if (!UML2GenModelUtil.isOperationsClasses(genPackage) && UML2GenModelUtil.hasOCLOperationBodies(genClass) && !UML2GenModelUtil.hasOCLOperationBodies(genClass.getClassExtendsGenClass())) {
    stringBuffer.append(TEXT_2452);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2453);
    stringBuffer.append(genModel.getImportedName("org.eclipse.ocl.ecore.OCL"));
    stringBuffer.append(TEXT_2454);
    }
    if (genClass.isModelRoot()) {
    if (UML2GenModelUtil.isFactoryMethods(genClass)) {
    stringBuffer.append(TEXT_2455);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EObject"));
    stringBuffer.append(TEXT_2456);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2457);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreUtil"));
    stringBuffer.append(TEXT_2458);
    }
    if (UML2GenModelUtil.isCacheAdapterSupport(genClass)) {
    stringBuffer.append(TEXT_2459);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2460);
    stringBuffer.append(genClass.getFormattedName());
    stringBuffer.append(TEXT_2461);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2462);
    stringBuffer.append(genModel.getImportedName("org.eclipse.uml2.common.util.CacheAdapter"));
    stringBuffer.append(TEXT_2463);
    }
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedUnionGenFeatures(genClass)) {
    if (genFeature.isGet()) {
    if (genFeature.isListType()) {
    if (!UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)) {
    stringBuffer.append(TEXT_2464);
    if (genModel.useClassOverrideAnnotation() && genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2465);
    }
    stringBuffer.append(TEXT_2466);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2467);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2468);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2469);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2470);
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    if (UML2GenModelUtil.isDerivedUnionListType(genClass.getClassExtendsGenClass(), genFeature)) {
    stringBuffer.append(TEXT_2471);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2472);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2473);
    } else {
    stringBuffer.append(TEXT_2474);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2475);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2476);
    }
    }
    for (GenFeature subsetGenFeature : UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature)) {
    if (!genClass.getExtendedGenFeatures().contains(subsetGenFeature)) {
    if (subsetGenFeature.isListType()) {
    if (subsetGenFeature.isResolveProxies() || UML2GenModelUtil.isUnion(subsetGenFeature)) {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2477);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2478);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2479);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2480);
    }
    stringBuffer.append(TEXT_2481);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2482);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2483);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2484);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2485);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2486);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2487);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2488);
    }
    stringBuffer.append(TEXT_2489);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2490);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2491);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2492);
    } else {
    stringBuffer.append(TEXT_2493);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2494);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2495);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2496);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2497);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    if (genModel.useGenerics()) {
    stringBuffer.append(TEXT_2498);
    stringBuffer.append(genModel.getImportedName(subsetGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2499);
    }
    stringBuffer.append(TEXT_2500);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_2501);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2502);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2503);
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2504);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2505);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2506);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2507);
    } else {
    if (genClass.isField(subsetGenFeature)) {
    stringBuffer.append(TEXT_2508);
    stringBuffer.append(genClass.getQualifiedFeatureID(subsetGenFeature));
    stringBuffer.append(TEXT_2509);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2510);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2511);
    } else {
    stringBuffer.append(TEXT_2512);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2513);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2514);
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2515);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2516);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2517);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2518);
    }
    }
    }
    } else {
    if (subsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(subsetGenFeature) || UML2GenModelUtil.isRedefinition(subsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, subsetGenFeature)) {
    stringBuffer.append(TEXT_2519);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2520);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2521);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2522);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2523);
    } else {
    stringBuffer.append(TEXT_2524);
    stringBuffer.append(subsetGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2525);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2526);
    if (subsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2527);
    stringBuffer.append(subsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(subsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2528);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2529);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2530);
    stringBuffer.append(subsetGenFeature.getSafeName());
    stringBuffer.append(TEXT_2531);
    }
    }
    }
    }
    stringBuffer.append(TEXT_2532);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_2533);
    }
    }
    }
    stringBuffer.append(TEXT_2534);
    if (isJDK50) { //isSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2535);
    }
    }
    stringBuffer.append(TEXT_2536);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2537);
    if (!UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).isEmpty()) { boolean first = true;
    if (first && genClass.getExtendedGenFeatures().contains(genFeature)) { first = false;
    stringBuffer.append(TEXT_2538);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2539);
    }
    for (Iterator<GenFeature> isSetSubsetGenFeatures = UML2GenModelUtil.getIsSetSubsetGenFeatures(genClass, genFeature).iterator(); isSetSubsetGenFeatures.hasNext();) { GenFeature isSetSubsetGenFeature = isSetSubsetGenFeatures.next();
    if (first) { first = false;
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2540);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2541);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2542);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2543);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2544);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2545);
    }
    } else {
    stringBuffer.append(TEXT_2546);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2547);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2548);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2549);
    }
    }
    } else {
    stringBuffer.append(TEXT_2550);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2551);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2552);
    }
    }
    } else {
    if (isSetSubsetGenFeature.isIsSet() || UML2GenModelUtil.isUnion(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature) || UML2GenModelUtil.isRedefined(genClass, isSetSubsetGenFeature)) {
    stringBuffer.append(TEXT_2553);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2554);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2555);
    }
    } else if (UML2GenModelUtil.isDuplicate(isSetSubsetGenFeature) && !UML2GenModelUtil.isRedefinition(isSetSubsetGenFeature)) {
    if (isSetSubsetGenFeature.isListType()) {
    stringBuffer.append(TEXT_2556);
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2557);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2558);
    }
    } else {
    stringBuffer.append(TEXT_2559);
    if (isSetSubsetGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2560);
    stringBuffer.append(isSetSubsetGenFeature.getAccessorName());
    } else {
    stringBuffer.append(isSetSubsetGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2561);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2562);
    }
    }
    } else {
    stringBuffer.append(TEXT_2563);
    stringBuffer.append(genClass.getQualifiedFeatureID(isSetSubsetGenFeature));
    stringBuffer.append(TEXT_2564);
    if (!isSetSubsetGenFeatures.hasNext()) {
    stringBuffer.append(TEXT_2565);
    }
    }
    }
    }
    } else {
    if (genClass.getExtendedGenFeatures().contains(genFeature)) {
    stringBuffer.append(TEXT_2566);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2567);
    } else {
    stringBuffer.append(TEXT_2568);
    }
    }
    stringBuffer.append(TEXT_2569);
    }
    for (GenFeature genFeature : UML2GenModelUtil.getImplementedRedefinedGenFeatures(genClass)) { GenFeature redefinitionGenFeature = UML2GenModelUtil.getRedefinitionGenFeatures(genClass, genFeature).iterator().next();
    if (genFeature.isGet()) {
    stringBuffer.append(TEXT_2570);
    if (isJDK50) { //getGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2571);
    }
    }
    stringBuffer.append(TEXT_2572);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2573);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2574);
    if (genFeature.isListType()) {
    if (redefinitionGenFeature.isListType()) {
    if (genModel.useGenerics() && !redefinitionGenFeature.getListItemType(genClass).equals(genFeature.getListItemType(genClass))) {
    stringBuffer.append(TEXT_2575);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2576);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2577);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2578);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.util.EList") + "<?>");
    stringBuffer.append(TEXT_2579);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2580);
    stringBuffer.append(redefinitionGenFeature.getUncapName());
    stringBuffer.append(TEXT_2581);
    } else {
    stringBuffer.append(TEXT_2582);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2583);
    }
    } else {
    stringBuffer.append(TEXT_2584);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.EcoreEList"));
    stringBuffer.append(TEXT_2585);
    if (genModel.useGenerics()) {
    stringBuffer.append("<" + genFeature.getListItemType(genClass) + ">");
    }
    stringBuffer.append(TEXT_2586);
    if (UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2587);
    } else {
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    }
    stringBuffer.append(TEXT_2588);
    stringBuffer.append(genModel.getImportedName("java.util.Collections"));
    stringBuffer.append(TEXT_2589);
    }
    } else {
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2590);
    } else {
    stringBuffer.append(TEXT_2591);
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2592);
    }
    }
    stringBuffer.append(TEXT_2593);
    }
    if (genFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2594);
    if (isJDK50) { //basicGetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2595);
    }
    }
    stringBuffer.append(TEXT_2596);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2597);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2598);
    if (redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2599);
    } else {
    stringBuffer.append(TEXT_2600);
    if (redefinitionGenFeature.isBasicGet()) {
    stringBuffer.append(TEXT_2601);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    } else {
    stringBuffer.append(redefinitionGenFeature.getGetAccessor());
    }
    stringBuffer.append(TEXT_2602);
    }
    stringBuffer.append(TEXT_2603);
    }
    if (genFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2604);
    if (isJDK50) { //basicSetGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2605);
    }
    }
    stringBuffer.append(TEXT_2606);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2607);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2608);
    stringBuffer.append(genFeature.getImportedInternalType(genClass));
    stringBuffer.append(TEXT_2609);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2610);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.common.notify.NotificationChain"));
    stringBuffer.append(TEXT_2611);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2612);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2613);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2614);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2615);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2616);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2617);
    }
    if (redefinitionGenFeature.isBasicSet()) {
    stringBuffer.append(TEXT_2618);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2619);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2620);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2621);
    }
    stringBuffer.append(TEXT_2622);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2623);
    } else {
    stringBuffer.append(TEXT_2624);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2625);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2626);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2627);
    }
    stringBuffer.append(TEXT_2628);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2629);
    }
    }
    stringBuffer.append(TEXT_2630);
    }
    if (genFeature.isSet()) {
    stringBuffer.append(TEXT_2631);
    if (isJDK50) { //setGenFeature.annotations.insert.javajetinc
    if (genClass.getExtendedGenFeatures().contains(genFeature) || (UML2GenModelUtil.isDuplicate(genFeature) && (!UML2GenModelUtil.isRedefinition(genFeature) || genClass.getExtendedGenFeatures().contains(UML2GenModelUtil.getRedefinedGenFeatures(genFeature).iterator().next())))) {
    stringBuffer.append(TEXT_2632);
    }
    }
    stringBuffer.append(TEXT_2633);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2634);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2635);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2636);
    if (!redefinitionGenFeature.isSet() || redefinitionGenFeature.isListType()) {
    stringBuffer.append(TEXT_2637);
    } else {
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2638);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2639);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2640);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2641);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2642);
    }
    stringBuffer.append(TEXT_2643);
    stringBuffer.append(redefinitionGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2644);
    if (!genFeature.getType(genClass).equals(redefinitionGenFeature.getType(genClass))) {
    stringBuffer.append(TEXT_2645);
    stringBuffer.append(redefinitionGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2646);
    }
    stringBuffer.append(TEXT_2647);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2648);
    }
    stringBuffer.append(TEXT_2649);
    }
    if (isImplementation && genFeature.isListType()) {
    if (!UML2GenModelUtil.getSubsetGenFeatures(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)).isEmpty()) {
    stringBuffer.append(TEXT_2650);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2651);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2652);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2653);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2654);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2655);
    stringBuffer.append(UML2GenModelUtil.getSubsetFeatureIDArray(genClass, genFeature, UML2GenModelUtil.isDerivedUnionListType(genClass, genFeature)));
    stringBuffer.append(TEXT_2656);
    }
    if (!UML2GenModelUtil.getSupersetGenFeatures(genClass, genFeature, false).isEmpty()) {
    stringBuffer.append(TEXT_2657);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2658);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2659);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2660);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2661);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_2662);
    stringBuffer.append(UML2GenModelUtil.getSupersetFeatureIDArray(genClass, genFeature));
    stringBuffer.append(TEXT_2663);
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    if (isInterface) {
    stringBuffer.append(TEXT_2664);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2665);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2666);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2667);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2668);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2669);
    } else {
    stringBuffer.append(TEXT_2670);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_2671);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2672);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2673);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2674);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2675);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2676);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2677);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2678);
    } else {
    stringBuffer.append(TEXT_2679);
    stringBuffer.append(genFeature.getType(genClass));
    stringBuffer.append(TEXT_2680);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2681);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2682);
    }
    }
    stringBuffer.append(TEXT_2683);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2684);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2685);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2686);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2687);
    }
    stringBuffer.append(TEXT_2688);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2689);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2690);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2691);
    } else {
    stringBuffer.append(TEXT_2692);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2693);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2694);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2695);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2696);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2697);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2698);
    }
    stringBuffer.append(TEXT_2699);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2700);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2701);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2702);
    }
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2703);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2704);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2705);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2706);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2707);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2708);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2709);
    } else {
    stringBuffer.append(TEXT_2710);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2711);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2712);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2713);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2714);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2715);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2716);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2717);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2718);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2719);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2720);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2721);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2722);
    index++;}
    stringBuffer.append(TEXT_2723);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2724);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2725);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2726);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2727);
    }
    stringBuffer.append(TEXT_2728);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2729);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2730);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2731);
    }
    stringBuffer.append(TEXT_2732);
    } else {
    stringBuffer.append(TEXT_2733);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2734);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2735);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2736);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_2737);
    }
    } else {
    stringBuffer.append(TEXT_2738);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2739);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2740);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2741);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2742);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2743);
    } else {
    stringBuffer.append(TEXT_2744);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2745);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2746);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2747);
    }
    index++;}
    }
    stringBuffer.append(TEXT_2748);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2749);
    }
    }
    if (genClass.getChildrenClasses(genFeature).size() == 1 || !genFeature.getTypeGenClass().isAbstract()) { GenClass childGenClass = genClass.getChildrenClasses(genFeature).get(0);
    if (isInterface) {
    stringBuffer.append(TEXT_2750);
    if (!keyGenFeatures.isEmpty()) {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2751);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2752);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2753);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2754);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2755);
    } else {
    stringBuffer.append(TEXT_2756);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2757);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2758);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2759);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2760);
    }
    } else {
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2761);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2762);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2763);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2764);
    } else {
    stringBuffer.append(TEXT_2765);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2766);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2767);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2768);
    }
    }
    stringBuffer.append(TEXT_2769);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2770);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2771);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2772);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2773);
    }
    stringBuffer.append(TEXT_2774);
    stringBuffer.append(childGenClass.getQualifiedInterfaceName());
    stringBuffer.append(TEXT_2775);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2776);
    } else {
    stringBuffer.append(TEXT_2777);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2778);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2779);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2780);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2781);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2782);
    }
    stringBuffer.append(TEXT_2783);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2784);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2785);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2786);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2787);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2788);
    if (!keyGenFeatures.isEmpty()) {
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    stringBuffer.append(TEXT_2789);
    }
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2790);
    } else {
    stringBuffer.append(TEXT_2791);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2792);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2793);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2794);
    stringBuffer.append(genFeature.getTypeGenClass().getQualifiedClassifierAccessor());
    stringBuffer.append(TEXT_2795);
    if (genFeature.isListType()) {
    stringBuffer.append(TEXT_2796);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2797);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2798);
    } else {
    stringBuffer.append(TEXT_2799);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_2800);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2801);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2802);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2803);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    stringBuffer.append(TEXT_2804);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2805);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2806);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2807);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2808);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2809);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2810);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2811);
    index++;}
    stringBuffer.append(TEXT_2812);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2813);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2814);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2815);
    for (int n = nestedKeyGenFeatures.size(); n > 0; n--) { GenFeature nestedKeyGenFeature = nestedKeyGenFeatures.get(nestedKeyGenFeatures.size() - n);
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2816);
    }
    stringBuffer.append(TEXT_2817);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2818);
    stringBuffer.append(nestedKeyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2819);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index - n, false));
    stringBuffer.append(TEXT_2820);
    }
    stringBuffer.append(TEXT_2821);
    } else {
    stringBuffer.append(TEXT_2822);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2823);
    stringBuffer.append(keyGenFeature.getCapName());
    stringBuffer.append(TEXT_2824);
    for (int n = 0; n < nestedKeyGenFeatures.size(); n++) {
    if (first) { first = false; } else {
    stringBuffer.append(TEXT_2825);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    index++;}
    stringBuffer.append(TEXT_2826);
    }
    } else {
    stringBuffer.append(TEXT_2827);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2828);
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2829);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2830);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2831);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2832);
    } else {
    stringBuffer.append(TEXT_2833);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2834);
    stringBuffer.append(keyGenFeature.getAccessorName());
    stringBuffer.append(TEXT_2835);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2836);
    }
    index++;}
    }
    stringBuffer.append(TEXT_2837);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2838);
    }
    stringBuffer.append(TEXT_2839);
    }
    }
    }
    if (!genClass.getExtendedGenFeatures().contains(genFeature) && genFeature.isListType() && genFeature.isReferenceType()) { List<GenFeature> keyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(genFeature);
    if (!keyGenFeatures.isEmpty()) {
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature) || UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    if (isInterface) {
    stringBuffer.append(TEXT_2840);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2841);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2842);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2843);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2844);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2845);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2846);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2847);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2848);
    }
    stringBuffer.append(TEXT_2849);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2850);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2851);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2852);
    } else {
    stringBuffer.append(TEXT_2853);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2854);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2855);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2856);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2857);
    } else {
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2858);
    }
    stringBuffer.append(TEXT_2859);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2860);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2861);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    stringBuffer.append(TEXT_2862);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2863);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2864);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2865);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2866);
    }
    stringBuffer.append(TEXT_2867);
    }
    }
    if (isInterface) {
    stringBuffer.append(TEXT_2868);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2869);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2870);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_2871);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_2872);
    for (int index = 0, size = keyGenFeatures.size(); index < size; index++) {
    stringBuffer.append(TEXT_2873);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2874);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureName(genFeature, index));
    stringBuffer.append(TEXT_2875);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2876);
    }
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2877);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2878);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2879);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2880);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2881);
    }
    stringBuffer.append(TEXT_2882);
    stringBuffer.append(genFeature.getQualifiedListItemType(genClass));
    stringBuffer.append(TEXT_2883);
    stringBuffer.append(UML2GenModelUtil.getFormattedKeyFeatureNames(genFeature));
    stringBuffer.append(TEXT_2884);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2885);
    } else {
    stringBuffer.append(TEXT_2886);
    }
    if (!isImplementation) {
    stringBuffer.append(TEXT_2887);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2888);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2889);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2890);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2891);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2892);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2893);
    }
    stringBuffer.append(TEXT_2894);
    } else { int index = 0;
    if (genModel.useClassOverrideAnnotation() && UML2GenModelUtil.isDuplicate(genFeature) && !UML2GenModelUtil.isRedefinition(genFeature)) {
    stringBuffer.append(TEXT_2895);
    }
    stringBuffer.append(TEXT_2896);
    stringBuffer.append(genFeature.getListItemType(genClass));
    stringBuffer.append(TEXT_2897);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2898);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature));
    if (UML2GenModelUtil.hasStringTypeKeyGenFeature(genFeature)) {
    stringBuffer.append(TEXT_2899);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2900);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.EClass"));
    stringBuffer.append(TEXT_2901);
    }
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2902);
    }
    stringBuffer.append(TEXT_2903);
    if (isJDK50) {
    stringBuffer.append(TEXT_2904);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2905);
    stringBuffer.append(genModel.getImportedName(genFeature.getListItemType(genClass)));
    stringBuffer.append(TEXT_2906);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2907);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2908);
    } else {
    stringBuffer.append(TEXT_2909);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2910);
    stringBuffer.append(genModel.getImportedName("java.util.Iterator"));
    stringBuffer.append(TEXT_2911);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_2912);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2913);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2914);
    stringBuffer.append(genModel.getImportedName(genFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2915);
    }
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2916);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2917);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2918);
    }
    for (GenFeature keyGenFeature : UML2GenModelUtil.getKeyGenFeatures(genFeature.getTypeGenClass())) {
    if (keyGenFeature.isContains()) { List<GenFeature> nestedKeyGenFeatures = UML2GenModelUtil.getKeyGenFeatures(keyGenFeature.getTypeGenClass(), false); boolean first = true;
    if (keyGenFeature.isListType()) {
    stringBuffer.append(TEXT_2919);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2920);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2921);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2922);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2923);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2924);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2925);
    for (int n = 0, size = nestedKeyGenFeatures.size(); n < size; n++) {
    if (!first) {
    stringBuffer.append(TEXT_2926);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_2927);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index + n, false));
    stringBuffer.append(TEXT_2928);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2929);
    if (first) {first = false;
    } else {
    stringBuffer.append(TEXT_2930);
    }
    }
    stringBuffer.append(TEXT_2931);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2932);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2933);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2934);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2935);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2936);
    stringBuffer.append(genModel.getImportedName(keyGenFeature.getQualifiedListItemType(genClass)));
    stringBuffer.append(TEXT_2937);
    }
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2938);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2939);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2940);
    if (genModel.getComplianceLevel().getValue() < GenJDKLevel.JDK50) {
    stringBuffer.append(TEXT_2941);
    stringBuffer.append(genModel.getImportedName("java.lang.String"));
    stringBuffer.append(TEXT_2942);
    }
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2943);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2944);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2945);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2946);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2947);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2948);
    } else {
    stringBuffer.append(TEXT_2949);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2950);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2951);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2952);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2953);
    }
    stringBuffer.append(TEXT_2954);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2955);
    index++;}
    stringBuffer.append(TEXT_2956);
    } else {
    stringBuffer.append(TEXT_2957);
    stringBuffer.append(keyGenFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_2958);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2959);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2960);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2961);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2962);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2963);
    for (GenFeature nestedKeyGenFeature : nestedKeyGenFeatures) {
    if (nestedKeyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2964);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2965);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2966);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2967);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2968);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2969);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2970);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2971);
    } else {
    stringBuffer.append(TEXT_2972);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2973);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2974);
    stringBuffer.append(keyGenFeature.getUncapName());
    stringBuffer.append(TEXT_2975);
    stringBuffer.append(nestedKeyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2976);
    }
    stringBuffer.append(TEXT_2977);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2978);
    index++;}
    }
    } else {
    if (keyGenFeature.isStringType()) {
    stringBuffer.append(TEXT_2979);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2980);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2981);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2982);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2983);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2984);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2985);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2986);
    } else {
    stringBuffer.append(TEXT_2987);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2988);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameter(genClass, genFeature, index, false));
    stringBuffer.append(TEXT_2989);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2990);
    stringBuffer.append(keyGenFeature.getGetAccessor());
    stringBuffer.append(TEXT_2991);
    }
    stringBuffer.append(TEXT_2992);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2993);
    index++;}
    }
    stringBuffer.append(TEXT_2994);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_2995);
    if (UML2GenModelUtil.isFactoryMethods(genClass, genFeature)) {
    stringBuffer.append(TEXT_2996);
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_2997);
    }
    stringBuffer.append(TEXT_2998);
    stringBuffer.append(genFeature.getCapName());
    stringBuffer.append(TEXT_2999);
    stringBuffer.append(UML2GenModelUtil.getKeyFeatureParameters(genClass, genFeature, false));
    if (genClass.getChildrenClasses(genFeature).size() > 1 || genFeature.getTypeGenClass().isAbstract()) {
    stringBuffer.append(TEXT_3000);
    }
    stringBuffer.append(TEXT_3001);
    } else {
    stringBuffer.append(TEXT_3002);
    }
    stringBuffer.append(TEXT_3003);
    }
    }
    }
    if (isImplementation && ((UML2GenModelUtil.isRedefinition(genFeature) && !genFeature.isIsSet()) || UML2GenModelUtil.isRedefined(genClass, genFeature))) {
    stringBuffer.append(TEXT_3004);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_3005);
    if (!genFeature.isUnsettable()) {
    if (UML2GenModelUtil.isRedefined(genClass, genFeature)) {
    stringBuffer.append(TEXT_3006);
    } else if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_3007);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3008);
    } else if (genFeature.isListType()) {
    if (genFeature.isWrappedFeatureMapType()) {
    if (genFeature.isVolatile()) {
    stringBuffer.append(TEXT_3009);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3010);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3011);
    } else {
    stringBuffer.append(TEXT_3012);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3013);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3014);
    }
    } else {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3015);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3016);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3017);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3018);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3019);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3020);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3021);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3022);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3023);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3024);
    } else {
    stringBuffer.append(TEXT_3025);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3026);
    }
    }
    }
    } else if (genFeature.isResolveProxies()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3027);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3028);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3029);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3030);
    } else {
    stringBuffer.append(TEXT_3031);
    stringBuffer.append(genFeature.getAccessorName());
    stringBuffer.append(TEXT_3032);
    }
    }
    } else if (genFeature.isReferenceType()) {
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3033);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3034);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3035);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3036);
    } else {
    stringBuffer.append(TEXT_3037);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3038);
    }
    }
    } else if (genFeature.isPrimitiveType() || genFeature.isEnumType()) {
    if (genClass.isField(genFeature)) {
    if (genClass.isFlag(genFeature)) {
    if (genFeature.isBooleanType()) {
    stringBuffer.append(TEXT_3039);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_3040);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3041);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3042);
    } else {
    stringBuffer.append(TEXT_3043);
    stringBuffer.append(genClass.getFlagsField(genFeature));
    stringBuffer.append(TEXT_3044);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3045);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3046);
    }
    } else {
    stringBuffer.append(TEXT_3047);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3048);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3049);
    }
    } else {
    if (genFeature.isEnumType() && genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3050);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3051);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3052);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3053);
    } else {
    stringBuffer.append(TEXT_3054);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3055);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3056);
    }
    }
    } else {//datatype
    if (genClass.isField(genFeature)) {
    stringBuffer.append(TEXT_3057);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3058);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3059);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3060);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3061);
    } else {
    if (genFeature.isField() && genClass.getImplementingGenModel(genFeature).isVirtualDelegation()) {
    stringBuffer.append(TEXT_3062);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3063);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3064);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3065);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3066);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3067);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3068);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3069);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3070);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3071);
    } else {
    stringBuffer.append(TEXT_3072);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3073);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3074);
    stringBuffer.append(genFeature.getEDefault());
    stringBuffer.append(TEXT_3075);
    stringBuffer.append(genFeature.getGetAccessor());
    stringBuffer.append(TEXT_3076);
    }
    }
    }
    } else {
    if (genModel.isReflectiveDelegation()) {
    stringBuffer.append(TEXT_3077);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3078);
    } else if (!genFeature.isVolatile()) {
    if (genFeature.isListType()) {
    if (genModel.isVirtualDelegation()) {
    stringBuffer.append(TEXT_3079);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3080);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3081);
    stringBuffer.append(genFeature.getImportedType(genClass));
    stringBuffer.append(TEXT_3082);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3083);
    }
    stringBuffer.append(TEXT_3084);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3085);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.InternalEList"));
    stringBuffer.append(TEXT_3086);
    stringBuffer.append(singleWildcard);
    stringBuffer.append(TEXT_3087);
    stringBuffer.append(genFeature.getSafeName());
    stringBuffer.append(TEXT_3088);
    } else {
    if (genModel.isVirtualDelegation() && !genFeature.isPrimitiveType()) {
    stringBuffer.append(TEXT_3089);
    stringBuffer.append(genClass.getQualifiedFeatureID(genFeature));
    stringBuffer.append(TEXT_3090);
    } else if (genClass.isESetFlag(genFeature)) {
    stringBuffer.append(TEXT_3091);
    stringBuffer.append(genClass.getESetFlagsField(genFeature));
    stringBuffer.append(TEXT_3092);
    stringBuffer.append(genFeature.getUpperName());
    stringBuffer.append(TEXT_3093);
    } else {
    stringBuffer.append(TEXT_3094);
    stringBuffer.append(genFeature.getUncapName());
    stringBuffer.append(TEXT_3095);
    }
    }
    } else if (genFeature.hasDelegateFeature()) { GenFeature delegateFeature = genFeature.getDelegateFeature();
    if (delegateFeature.isWrappedFeatureMapType()) {
    stringBuffer.append(TEXT_3096);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3097);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3098);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_3099);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3100);
    } else {
    stringBuffer.append(TEXT_3101);
    stringBuffer.append(genModel.getImportedName("org.eclipse.emf.ecore.util.FeatureMap"));
    stringBuffer.append(TEXT_3102);
    stringBuffer.append(delegateFeature.getAccessorName());
    stringBuffer.append(TEXT_3103);
    stringBuffer.append(genFeature.getQualifiedFeatureAccessor());
    stringBuffer.append(TEXT_3104);
    }
    } else {
    { GenOperation genOperation = UML2GenModelUtil.getImplementedCollidingIsSetGenOperation(genClass, genFeature); 
    if (genOperation != null && UML2GenModelUtil.hasOperationsClass(genClass, genOperation)) {
    stringBuffer.append(TEXT_3105);
    stringBuffer.append(UML2GenModelUtil.getImportedOperationsClassName(genClass, genOperation));
    stringBuffer.append(TEXT_3106);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_3107);
    } else {
    stringBuffer.append(TEXT_3108);
    stringBuffer.append(genFeature.getFormattedName());
    stringBuffer.append(TEXT_3109);
    stringBuffer.append(genFeature.getFeatureKind());
    stringBuffer.append(TEXT_3110);
    }
    }
    //isSetGenFeature.todo.override.javajetinc
    }
    }
    stringBuffer.append(TEXT_3111);
    }
    }
    for (GenOperation genOperation : UML2GenModelUtil.getImplementedRedefinedGenOperations(genClass)) { GenOperation redefinitionGenOperation = UML2GenModelUtil.getRedefinitionGenOperations(genClass, genOperation).iterator().next();
    stringBuffer.append(TEXT_3112);
    if (isJDK50) { //genOperation.annotations.insert.javajetinc
    if (genClass.getExtendedGenOperations().contains(genOperation) || (UML2GenModelUtil.isDuplicate(genOperation) && (!UML2GenModelUtil.isRedefinition(genOperation) || genClass.getExtendedGenOperations().contains(UML2GenModelUtil.getRedefinedGenOperations(genOperation).iterator().next())))) {
    stringBuffer.append(TEXT_3113);
    }
    }
    stringBuffer.append(TEXT_3114);
    stringBuffer.append(genOperation.getTypeParameters(genClass));
    stringBuffer.append(genOperation.getImportedType(genClass));
    stringBuffer.append(TEXT_3115);
    stringBuffer.append(genOperation.getName());
    stringBuffer.append(TEXT_3116);
    stringBuffer.append(genOperation.getParameters(genClass));
    stringBuffer.append(TEXT_3117);
    stringBuffer.append(genOperation.getThrows(genClass));
    stringBuffer.append(TEXT_3118);
    if (genOperation.isVoid()) {
    stringBuffer.append(TEXT_3119);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_3120);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_3121);
    } else {
    if (redefinitionGenOperation.isVoid()) {
    stringBuffer.append(TEXT_3122);
    } else {
    stringBuffer.append(TEXT_3123);
    stringBuffer.append(redefinitionGenOperation.getName());
    stringBuffer.append(TEXT_3124);
    stringBuffer.append(genOperation.getParameterNames(", "));
    stringBuffer.append(TEXT_3125);
    }
    }
    stringBuffer.append(TEXT_3126);
    }
    }
    stringBuffer.append(TEXT_3127);
    stringBuffer.append(isInterface ? " " + genClass.getInterfaceName() : genClass.getClassName());
    // TODO fix the space above
    genModel.emitSortedImports();
    stringBuffer.append(TEXT_3128);
    return stringBuffer.toString();
  }
}
